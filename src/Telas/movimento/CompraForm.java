/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 
 *
 * Created on 06/10/2010, 00:31:34
 */
package Telas.movimento;

import Busca.BuscaGenerica;
import Dao.CompraDao;
import entidade.Compra;
import entidade.Fazenda;
import entidade.Fisica;
import entidade.Juridica;
import entidade.Lote;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboFazenda;
import model.ComboLote;
import model.FazendaCombo;
import model.LoteCombo;
import model.TableModelCompra;
import model.TableModelEmitente;
import util.DAOGenerico;

/**
 *
 * @author altitdb
 */
public class CompraForm extends javax.swing.JDialog {

    private Compra compra = new Compra();
    private CompraDao dao = new CompraDao();
    private List<Lote> listaLote = new ArrayList<Lote>();

    public CompraForm() {
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        cbFazenda();
        cbLote.setModel(new LoteCombo());
    }

    public CompraForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    private void cbFazenda() {
        List<Fazenda> fazenda = new ArrayList<Fazenda>();
        fazenda = dao.consultaFazenda();
        if (fazenda != null) {
            cbFazenda.setModel(new FazendaCombo(fazenda));
        }
    }

    private void cbLote() {
        List<Lote> lista = new ArrayList<Lote>();
        lista = dao.consultaLote((Fazenda) cbFazenda.getSelectedItem());
        cbLote.setModel(new LoteCombo(lista));
    }

    void buscarFornecedor() {
        this.setVisible(false);
       BuscaGenerica bg = new BuscaGenerica();
        bg.setTitle("Busca de Emitentes ");
        bg.tabela.setModel(new TableModelEmitente());
        bg.setModal(true);
        bg.setVisible(true);
        if (bg.tabela.getSelectedRow() != -1) {
//            botoes(true, true, false, true);
            if (bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow()) instanceof Fisica) {
                getCompra().setEmitente(new Fisica());
            } else {
                getCompra().setEmitente(new Juridica());
            }
            getCompra().setEmitente(bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow()) instanceof Fisica
                    ? (Fisica) bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow())
                    : (Juridica) bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow()));
            tfFornecedor.setText(getCompra().getEmitente().getNome());
        } else {
//            botoes(true, false, false, false);
        }
        this.setVisible(true);
    }

    private void salvarCompra() {
        getCompra().setEstornado(false);
        getCompra().setDataCompra(tfDtCompra.getDate());
        getCompra().setFazenda((Fazenda) cbFazenda.getSelectedItem());
        getCompra().setLote((Lote) cbLote.getSelectedItem());
        getCompra().setQuantidade(Integer.valueOf(tfQtd.getText()));
        getCompra().setTotal(Double.parseDouble(tfTotal.getText().replace(",", ".")));
        DAOGenerico<Compra> d = new DAOGenerico<Compra>(Compra.class);
        d.insert(getCompra());
        DAOGenerico<Lote> d2 = new DAOGenerico<Lote>(Lote.class);
        Lote lote = (Lote) cbLote.getSelectedItem();
        lote.setQuantidadeTotal(String.valueOf(Integer.valueOf(lote.getQuantidadeTotal()) + getCompra().getQuantidade()));
        d2.update(lote);
    }

    private void consultar() {
        this.setVisible(false);

        BuscaGenerica bg = new BuscaGenerica();
        bg.setTitle("Busca de Compras");
        bg.tabela.setModel(new TableModelCompra());
        bg.setModal(true);
        bg.setVisible(true);
        if (bg.tabela.getSelectedRow() != -1) {
//            botoes(true, true, false, true);
            setCompra(bg.tmCompra.getLista().get(bg.tabela.getSelectedRow()));
            tfFornecedor.setText(getCompra().getEmitente().getNome());
            tfDtCompra.setDate(getCompra().getDataCompra());
            tfQtd.setText(getCompra().getQuantidade().toString());
            tfTotal.setText(getCompra().getTotal().toString());
            tfDtEstono.setDate(getCompra().getDataEstorno());
            cbEstornado.setSelected(getCompra().getEstornado());
            cbFazenda();
            cbFazenda.setSelectedItem(getCompra().getFazenda());
            cbLote();
            cbLote.setSelectedItem(getCompra().getLote());
        } else {
//            botoes(true, false, false, false);
        }
        this.setVisible(true);
    }

    private void estornar() {
        Lote lote = getCompra().getLote();
        Integer teste = Integer.valueOf(lote.getQuantidadeTotal()) - getCompra().getQuantidade();
        if (teste >= 0) {
            DAOGenerico<Compra> d = new DAOGenerico<Compra>(Compra.class);
            getCompra().setDataEstorno(new Date());
            getCompra().setEstornado(true);
            d.update(getCompra());
            DAOGenerico<Lote> d2 = new DAOGenerico<Lote>(Lote.class);
            lote.setQuantidadeTotal(String.valueOf(teste));
            d2.update(lote);
            JOptionPane.showMessageDialog(null, "Estorno realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível fazer este estorno!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        btEstornar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        tfDtCompra = new com.toedter.calendar.JDateChooser();
        jpDestino = new javax.swing.JPanel();
        JLfazenda = new javax.swing.JLabel();
        cbFazenda = new javax.swing.JComboBox();
        JLlote = new javax.swing.JLabel();
        cbLote = new javax.swing.JComboBox();
        lbQtd = new javax.swing.JLabel();
        tfQtd = new javax.swing.JTextField();
        lbFornecedor = new javax.swing.JLabel();
        tfFornecedor = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        tfTotal = new javax.swing.JFormattedTextField();
        cbEstornado = new javax.swing.JCheckBox();
        tfDtEstono = new com.toedter.calendar.JDateChooser();
        lbDtEstorno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra de Bovino"));

        btConfirmar.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btEstornar.setIcon(new ImageIcon("src/imagens/JBExcluir3.png"));
        btEstornar.setText("Estornar");
        btEstornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstornarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new ImageIcon("src/icones/fecha.png"));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btConsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        jpDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("Destino"));

        JLfazenda.setText("Fazenda");

        cbFazenda.setModel(new ComboFazenda());
        cbFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFazendaActionPerformed(evt);
            }
        });

        JLlote.setText("Lote");

        cbLote.setModel(new ComboLote());

        javax.swing.GroupLayout jpDestinoLayout = new javax.swing.GroupLayout(jpDestino);
        jpDestino.setLayout(jpDestinoLayout);
        jpDestinoLayout.setHorizontalGroup(
            jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDestinoLayout.createSequentialGroup()
                .addGroup(jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLfazenda)
                    .addComponent(JLlote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbLote, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbFazenda, 0, 348, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpDestinoLayout.setVerticalGroup(
            jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDestinoLayout.createSequentialGroup()
                .addGroup(jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfazenda)
                    .addComponent(cbFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLlote)
                    .addComponent(cbLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbQtd.setText("Quantidade");

        lbFornecedor.setText("Fornecedor");

        btPesquisar.setIcon(new ImageIcon("src/imagens/lupas.png"));
        btPesquisar.setText("Pesquisa");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        lbTotal.setText("Total:");

        cbEstornado.setText("Estornado");

        lbDtEstorno.setText("Data:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btEstornar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbFornecedor)
                        .addGap(4, 4, 4)
                        .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbQtd)
                                .addGap(4, 4, 4)
                                .addComponent(tfQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(tfDtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbEstornado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDtEstorno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDtEstono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btConfirmar, btConsultar, btEstornar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbEstornado)
                        .addComponent(lbDtEstorno))
                    .addComponent(tfDtEstono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbFornecedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisar))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbQtd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTotal)
                                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConfirmar)
                    .addComponent(btConsultar)
                    .addComponent(btEstornar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        buscarFornecedor();
}//GEN-LAST:event_btPesquisarActionPerformed

    private void cbFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFazendaActionPerformed
        if (!cbFazenda.getSelectedItem().equals("")) {
            listaLote = dao.consultaLote((Fazenda) cbFazenda.getSelectedItem());
            cbLote.setModel(new LoteCombo(listaLote));
//            cbLote.setEnabled(true);
        }
    }//GEN-LAST:event_cbFazendaActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        salvarCompra();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEstornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstornarActionPerformed
        estornar();
    }//GEN-LAST:event_btEstornarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLfazenda;
    private javax.swing.JLabel JLlote;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEstornar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JCheckBox cbEstornado;
    private javax.swing.JComboBox cbFazenda;
    private javax.swing.JComboBox cbLote;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpDestino;
    private javax.swing.JLabel lbDtEstorno;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbQtd;
    private javax.swing.JLabel lbTotal;
    private com.toedter.calendar.JDateChooser tfDtCompra;
    private com.toedter.calendar.JDateChooser tfDtEstono;
    private javax.swing.JTextField tfFornecedor;
    private javax.swing.JTextField tfQtd;
    private javax.swing.JFormattedTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
