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
import Dao.VendaDao;
import entidade.Fazenda;
import entidade.Fisica;
import entidade.Juridica;
import entidade.Lote;
import entidade.Venda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboFazenda;
import model.ComboLote;
import model.FazendaCombo;
import model.LoteCombo;
import model.TableModelEmitente;
import model.TableModelVenda;
import util.DAOGenerico;

/**
 *
 * @author altitdb
 */
public class VendaForm extends javax.swing.JDialog {

    private Venda venda = new Venda();
    private VendaDao dao = new VendaDao();
    private List<Lote> listaLote = new ArrayList<Lote>();

    public VendaForm() {
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        cbFazenda();
        cbLote.setModel(new LoteCombo());
    }

    public VendaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
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
                getVenda().setEmitente(new Fisica());
            } else {
                getVenda().setEmitente(new Juridica());
            }
            getVenda().setEmitente(bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow()) instanceof Fisica
                    ? (Fisica) bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow())
                    : (Juridica) bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow()));
            tfFornecedor.setText(getVenda().getEmitente().getNome());
        } else {
//            botoes(true, false, false, false);
        }
        this.setVisible(true);
    }

    private void salvarVenda() {
        getVenda().setEstornado(false);
        getVenda().setDataVenda(tfDtVenda.getDate());
        getVenda().setFazenda((Fazenda) cbFazenda.getSelectedItem());
        getVenda().setLote((Lote) cbLote.getSelectedItem());
        getVenda().setQuantidade(Integer.valueOf(tfQtd.getText()));
        getVenda().setValorTotal(Double.parseDouble(tfTotal.getText().replace(",", ".")));
        DAOGenerico<Venda> d = new DAOGenerico<Venda>(Venda.class);
        d.insert(getVenda());
         JOptionPane.showMessageDialog(null, "Saída realizado com sucesso!");
        DAOGenerico<Lote> d2 = new DAOGenerico<Lote>(Lote.class);
        Lote lote = (Lote) cbLote.getSelectedItem();
        lote.setQuantidadeTotal(String.valueOf(Integer.valueOf(lote.getQuantidadeTotal()) - getVenda().getQuantidade()));
        d2.update(lote);
    }

    private void consultar() {
        this.setVisible(false);

        BuscaGenerica bg = new BuscaGenerica();
        bg.setTitle("Busca de Venda");
        bg.tabela.setModel(new TableModelVenda());
        bg.setModal(true);
        bg.setVisible(true);
        if (bg.tabela.getSelectedRow() != -1) {
//            botoes(true, true, false, true);
            setVenda(bg.tmVenda.getLista().get(bg.tabela.getSelectedRow()));
            tfFornecedor.setText(getVenda().getEmitente().getNome());
            tfDtVenda.setDate(getVenda().getDataVenda());
            tfQtd.setText(getVenda().getQuantidade().toString());
            tfTotal.setText(getVenda().getValorTotal().toString());
            tfDtEstono.setDate(getVenda().getDataEstorno());
            cbEstornado.setSelected(getVenda().getEstornado());
            cbFazenda();
            cbFazenda.setSelectedItem(getVenda().getFazenda());
            cbLote();
            cbLote.setSelectedItem(getVenda().getLote());
        } else {
//            botoes(true, false, false, false);
        }
        this.setVisible(true);
    }

    private void estornar() {
        Lote lote = getVenda().getLote();
        Integer teste = Integer.valueOf(lote.getQuantidadeTotal()) + getVenda().getQuantidade();
        if (teste >= 0) {
            DAOGenerico<Venda> d = new DAOGenerico<Venda>(Venda.class);
            getVenda().setDataEstorno(new Date());
            getVenda().setEstornado(true);
           d.update(getVenda());
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
        tfDtVenda = new com.toedter.calendar.JDateChooser();
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

        tfTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        cbEstornado.setText("Estornado");

        lbDtEstorno.setText("Data:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbEstornado)
                        .addGap(6, 6, 6)
                        .addComponent(lbDtEstorno)
                        .addGap(4, 4, 4)
                        .addComponent(tfDtEstono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbFornecedor)
                        .addGap(4, 4, 4)
                        .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbQtd)
                        .addGap(4, 4, 4)
                        .addComponent(tfQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbTotal)
                        .addGap(4, 4, 4)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(tfDtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btEstornar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEstornado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbDtEstorno))
                    .addComponent(tfDtEstono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbFornecedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPesquisar))
                .addGap(6, 6, 6)
                .addComponent(jpDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbQtd))
                    .addComponent(tfQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbTotal))
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConfirmar)
                    .addComponent(btConsultar)
                    .addComponent(btEstornar)
                    .addComponent(btCancelar)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
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
        salvarVenda();
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
    private com.toedter.calendar.JDateChooser tfDtEstono;
    private com.toedter.calendar.JDateChooser tfDtVenda;
    private javax.swing.JTextField tfFornecedor;
    private javax.swing.JTextField tfQtd;
    private javax.swing.JFormattedTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
