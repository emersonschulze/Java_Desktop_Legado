/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Transferencia.java
 *
 * Created on 18/09/2010, 14:10:51
 */
package Telas.movimento;

import Busca.BuscaGenerica;
import Dao.TransferenciasDao;
import entidade.Fazenda;
import entidade.Lote;
import entidade.Pasto;
import entidade.Transferencias;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import model.FazendaCombo;
import model.LoteCombo;
import model.PastoCombo;
import model.TableModelTransferencias;
import util.DAOGenerico;

/**
 *
 * @author altitdb
 */
public class Transferencia extends javax.swing.JDialog {

    private Transferencias transferencias;
    private List<Fazenda> listaFazenda = new ArrayList<Fazenda>();
    private List<Lote> listaLote = new ArrayList<Lote>();
    private List<Pasto> listaPasto = new ArrayList<Pasto>();

    /** Creates new form Transferencia */
    public Transferencia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    public Transferencia() {
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        cbFazenda();
        cbPastoDestino.setEnabled(true);
        cbLoteDestino.setEnabled(false);
        habilita(false);
    }

    private void habilita(Boolean b) {
        cbFazendaOrigem.setEnabled(b);
        cbFazendaDestino.setEnabled(b);
        cbLoteOrigem.setEnabled(b);
        cbLoteDestino.setEnabled(b);
        cbPastoDestino.setEnabled(b);
        cbPastoLote.setEnabled(b);
        tfData.setEnabled(b);
        tfQtdAnimaisLoteDestino.setEditable(b);
        tfQtdAnimaisLoteOrigem.setEditable(b);
        tfQuantidade.setEditable(b);
    }

    public Transferencias getTransferencias() {
        return transferencias;
    }

    public void setTransferencias(Transferencias transferencias) {
        this.transferencias = transferencias;
    }

    private void novo() {
        cbFazenda();
        cbFazendaOrigem.setEnabled(true);
        cbFazendaDestino.setEnabled(true);
        cbPastoLote.setSelectedIndex(0);
        cbPastoDestino.setEnabled(false);
        cbPastoLote.setEnabled(true);
        tfData.setEnabled(true);
        tfQuantidade.setEditable(true);
    }

    private void cbFazenda() {
        TransferenciasDao t = new TransferenciasDao();
        listaFazenda = t.consultaFazenda();
        cbFazendaOrigem.setModel(new FazendaCombo(listaFazenda));
        cbFazendaDestino.setModel(new FazendaCombo(listaFazenda));
    }

    private void transferePasto() {
        Transferencias t = new Transferencias();
        t.setDataTransferencia(tfData.getDate());
        t.setFazendaDestino((Fazenda) cbFazendaDestino.getSelectedItem());
        t.setFazendaOrigem((Fazenda) cbFazendaOrigem.getSelectedItem());
        t.setLoteOrigem((Lote) cbLoteOrigem.getSelectedItem());
        t.setPasto((Pasto) cbPastoDestino.getSelectedItem());
        t.setEstornado(false);
        DAOGenerico<Transferencias> d = new DAOGenerico<Transferencias>(Transferencias.class);
        d.insert(t);
        DAOGenerico<Lote> l = new DAOGenerico<Lote>(Lote.class);
        Lote lote = (Lote) cbLoteOrigem.getSelectedItem();
        lote.setFazenda((Fazenda) cbFazendaDestino.getSelectedItem());
        lote.setPasto((Pasto) cbPastoDestino.getSelectedItem());
        l.update(lote);
        cbFazenda();
        cbLoteOrigem.setModel(new LoteCombo());
        cbLoteDestino.setModel(new LoteCombo());
        cbPastoDestino.setModel(new PastoCombo());
        tfData.setDate(null);
        tfQtdAnimaisLoteDestino.setText("");
        tfQtdAnimaisLoteOrigem.setText("");
        tfQuantidade.setText("");
    }

    private void transfereLote() {
        Transferencias t = new Transferencias();
        t.setDataTransferencia(tfData.getDate());
        t.setFazendaDestino((Fazenda) cbFazendaDestino.getSelectedItem());
        t.setFazendaOrigem((Fazenda) cbFazendaOrigem.getSelectedItem());
        t.setLoteDestino((Lote) cbLoteDestino.getSelectedItem());
        t.setLoteOrigem((Lote) cbLoteOrigem.getSelectedItem());
        t.setQuantidade(Integer.valueOf(tfQuantidade.getText()));
        t.setEstornado(false);
        DAOGenerico<Transferencias> d = new DAOGenerico<Transferencias>(Transferencias.class);
        d.insert(t);
        DAOGenerico<Lote> lo = new DAOGenerico<Lote>(Lote.class);
        Lote loteOrigem = (Lote) cbLoteOrigem.getSelectedItem();
        loteOrigem.setQuantidadeTotal(String.valueOf(Integer.valueOf(tfQtdAnimaisLoteOrigem.getText()) - Integer.valueOf(tfQuantidade.getText())));
        lo.update(loteOrigem);
        DAOGenerico<Lote> ld = new DAOGenerico<Lote>(Lote.class);
        Lote loteDestino = (Lote) cbLoteDestino.getSelectedItem();
        loteDestino.setQuantidadeTotal(String.valueOf(Integer.valueOf(tfQtdAnimaisLoteDestino.getText()) + Integer.valueOf(tfQuantidade.getText())));
        ld.update(loteDestino);
        cbFazenda();
        cbLoteOrigem.setModel(new LoteCombo());
        cbLoteDestino.setModel(new LoteCombo());
        cbPastoDestino.setModel(new PastoCombo());
        tfData.setDate(null);
        tfQtdAnimaisLoteDestino.setText("");
        tfQtdAnimaisLoteOrigem.setText("");
        tfQuantidade.setText("");
    }

    private void estornaPasto() {
        Transferencias t = new Transferencias();
        t.setDataTransferencia(tfData.getDate());
        t.setFazendaDestino(getTransferencias().getFazendaOrigem());
        t.setFazendaOrigem(getTransferencias().getFazendaDestino());
        t.setLoteDestino(getTransferencias().getLoteOrigem());
        t.setLoteOrigem(getTransferencias().getLoteDestino());
        t.setQuantidade(getTransferencias().getQuantidade());
        t.setEstornado(true);
        DAOGenerico<Transferencias> d = new DAOGenerico<Transferencias>(Transferencias.class);
        d.insert(t);
        DAOGenerico<Lote> l = new DAOGenerico<Lote>(Lote.class);
        Lote lote = getTransferencias().getLoteOrigem();
        lote.setFazenda(getTransferencias().getFazendaOrigem());
        lote.setPasto(getTransferencias().getPasto());
        l.update(lote);
        cbFazenda();
        cbLoteOrigem.setModel(new LoteCombo());
        cbLoteDestino.setModel(new LoteCombo());
        cbPastoDestino.setModel(new PastoCombo());
        tfData.setDate(null);
        tfQtdAnimaisLoteDestino.setText("");
        tfQtdAnimaisLoteOrigem.setText("");
        tfQuantidade.setText("");
    }

    private void estornaLote() {
        Transferencias t = new Transferencias();
        t.setDataTransferencia(tfData.getDate());
        t.setFazendaDestino(getTransferencias().getFazendaOrigem());
        t.setFazendaOrigem(getTransferencias().getFazendaDestino());
        t.setLoteDestino(getTransferencias().getLoteOrigem());
        t.setLoteOrigem(getTransferencias().getLoteDestino());
        t.setQuantidade(getTransferencias().getQuantidade());
        t.setEstornado(true);
        DAOGenerico<Transferencias> d = new DAOGenerico<Transferencias>(Transferencias.class);
        d.insert(t);
        DAOGenerico<Lote> lo = new DAOGenerico<Lote>(Lote.class);
        Lote loteOrigem = (Lote) cbLoteOrigem.getSelectedItem();
        loteOrigem.setQuantidadeTotal(String.valueOf(Integer.valueOf(tfQtdAnimaisLoteOrigem.getText()) + Integer.valueOf(tfQuantidade.getText())));
        lo.update(loteOrigem);
        DAOGenerico<Lote> ld = new DAOGenerico<Lote>(Lote.class);
        Lote loteDestino = (Lote) cbLoteDestino.getSelectedItem();
        loteDestino.setQuantidadeTotal(String.valueOf(Integer.valueOf(tfQtdAnimaisLoteDestino.getText()) - Integer.valueOf(tfQuantidade.getText())));
        ld.update(loteDestino);
        cbFazenda();
        cbLoteOrigem.setModel(new LoteCombo());
        cbLoteDestino.setModel(new LoteCombo());
        cbPastoDestino.setModel(new PastoCombo());
        tfData.setDate(null);
        tfQtdAnimaisLoteDestino.setText("");
        tfQtdAnimaisLoteOrigem.setText("");
        tfQuantidade.setText("");
    }

    void buscaTransferencia() {
        this.setVisible(false);
        BuscaGenerica bg = new BuscaGenerica();
        bg.setTitle("Busca de Transferências");
        bg.tabela.setModel(new TableModelTransferencias());
        bg.setModal(true);
        bg.setVisible(true);
        if (bg.tabela.getSelectedRow() != -1) {
            setTransferencias(bg.tmTransferencias.getLista().get(bg.tabela.getSelectedRow()));
            if(getTransferencias().getPasto() == null) {
                cbPastoLote.setSelectedIndex(1);
            } else {
                cbPastoLote.setSelectedIndex(0);
            }
            cbFazenda();
            cbFazendaOrigem.setSelectedItem(getTransferencias().getFazendaOrigem());
            cbFazendaDestino.setSelectedItem(getTransferencias().getFazendaDestino());
            TransferenciasDao t = new TransferenciasDao();
            cbLoteOrigem.setModel(new LoteCombo(t.consultaLote(getTransferencias().getFazendaOrigem())));
            cbLoteDestino.setModel(new LoteCombo(t.consultaLote(getTransferencias().getFazendaDestino())));
            cbPastoDestino.setModel(new PastoCombo(t.consultaPasto(getTransferencias().getFazendaDestino())));
            cbLoteOrigem.setSelectedItem(getTransferencias().getLoteOrigem());
            cbLoteDestino.setSelectedItem(getTransferencias().getLoteDestino() == null ? "" : getTransferencias().getLoteDestino());
            cbPastoDestino.setSelectedItem(getTransferencias().getPasto());
            tfData.setDate(getTransferencias().getDataTransferencia());
            tfQuantidade.setText(String.valueOf(getTransferencias().getQuantidade()));
        
            habilita(false);
        }
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btconfirma = new javax.swing.JButton();
        Btcancela = new javax.swing.JButton();
        btconsulta = new javax.swing.JButton();
        tfData = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        JLfazenda = new javax.swing.JLabel();
        cbFazendaOrigem = new javax.swing.JComboBox();
        JLlote = new javax.swing.JLabel();
        cbLoteOrigem = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        tfQtdAnimaisLoteOrigem = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cbLoteDestino = new javax.swing.JComboBox();
        JLlote1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbPastoDestino = new javax.swing.JComboBox();
        cbFazendaDestino = new javax.swing.JComboBox();
        JLfazenda1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfQtdAnimaisLoteDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JFormattedTextField();
        cbPastoLote = new javax.swing.JComboBox();
        btnovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Transferencia"));

        btconfirma.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        btconfirma.setText("Confirmar");
        btconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconfirmaActionPerformed(evt);
            }
        });

        Btcancela.setIcon(new ImageIcon("src/icones/fecha.png"));
        Btcancela.setText("Cancelar");
        Btcancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtcancelaActionPerformed(evt);
            }
        });

        btconsulta.setIcon(new ImageIcon("src/icones/lupa.png"));
        btconsulta.setText("Consultar");
        btconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Origem"));

        JLfazenda.setText("Fazenda");

        cbFazendaOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFazendaOrigemActionPerformed(evt);
            }
        });

        JLlote.setText("Lote");

        cbLoteOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoteOrigemActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade de Animais no Lote");

        tfQtdAnimaisLoteOrigem.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLfazenda)
                    .addComponent(JLlote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQtdAnimaisLoteOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbFazendaOrigem, 0, 370, Short.MAX_VALUE)
                    .addComponent(cbLoteOrigem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfazenda)
                    .addComponent(cbFazendaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoteOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLlote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfQtdAnimaisLoteOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(6, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Destino"));

        cbLoteDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoteDestinoActionPerformed(evt);
            }
        });

        JLlote1.setText("Lote");

        jLabel2.setText("Pasto");

        cbFazendaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFazendaDestinoActionPerformed(evt);
            }
        });

        JLfazenda1.setText("Fazenda");

        jLabel5.setText("Quantidade de Animais no Lote");

        tfQtdAnimaisLoteDestino.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JLfazenda1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFazendaDestino, 0, 376, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQtdAnimaisLoteDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JLlote1))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLoteDestino, 0, 378, Short.MAX_VALUE)
                            .addComponent(cbPastoDestino, 0, 378, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfazenda1)
                    .addComponent(cbFazendaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPastoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoteDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLlote1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfQtdAnimaisLoteDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Quantidade");

        tfQuantidade.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        cbPastoLote.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pasto", "Lote" }));
        cbPastoLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPastoLoteActionPerformed(evt);
            }
        });

        btnovo.setIcon(new ImageIcon("src/icones/novo.png"));
        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPastoLote, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btconfirma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btconsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btcancela, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Btcancela, btconfirma, btconsulta, btnovo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPastoLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconsulta)
                    .addComponent(btconfirma)
                    .addComponent(btnovo)
                    .addComponent(Btcancela))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFazendaOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFazendaOrigemActionPerformed
            if(!cbFazendaOrigem.getSelectedItem().equals("")) {
            TransferenciasDao t = new TransferenciasDao();
            listaLote = t.consultaLote((Fazenda) cbFazendaOrigem.getSelectedItem());
            cbLoteOrigem.setModel(new LoteCombo(listaLote));
            tfQtdAnimaisLoteOrigem.setText("");
            cbLoteOrigem.setEnabled(true);
        }
    }//GEN-LAST:event_cbFazendaOrigemActionPerformed

    private void cbLoteOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoteOrigemActionPerformed
        if(!cbLoteOrigem.getSelectedItem().equals("")) {
            tfQtdAnimaisLoteOrigem.setText(listaLote.get(cbLoteOrigem.getSelectedIndex()).getQuantidadeTotal());
        }
    }//GEN-LAST:event_cbLoteOrigemActionPerformed

    private void cbFazendaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFazendaDestinoActionPerformed
        if(cbPastoLote.getSelectedIndex() == 1) {
        if(!cbFazendaDestino.getSelectedItem().equals("")) {
            TransferenciasDao t = new TransferenciasDao();
            listaLote = t.consultaLote((Fazenda) cbFazendaDestino.getSelectedItem());
            cbLoteDestino.setModel(new LoteCombo(listaLote));
            tfQtdAnimaisLoteDestino.setText("");
            cbPastoDestino.setEnabled(false);
            cbLoteDestino.setEnabled(true);
        }
        } else {
        if(!cbFazendaDestino.getSelectedItem().equals("")) {
            TransferenciasDao t = new TransferenciasDao();
            listaPasto = t.consultaPasto((Fazenda) cbFazendaDestino.getSelectedItem());
            cbPastoDestino.setModel(new PastoCombo(listaPasto));
            cbPastoDestino.setEnabled(true);
            cbLoteDestino.setEnabled(false);
        }
        }
    }//GEN-LAST:event_cbFazendaDestinoActionPerformed

    private void cbLoteDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoteDestinoActionPerformed
        if(!cbLoteDestino.getSelectedItem().equals("")) {
            tfQtdAnimaisLoteDestino.setText(listaLote.get(cbLoteDestino.getSelectedIndex()).getQuantidadeTotal());
        }
    }//GEN-LAST:event_cbLoteDestinoActionPerformed

    private void cbPastoLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPastoLoteActionPerformed
        cbFazendaDestino.setModel(new FazendaCombo(listaFazenda));
        tfQtdAnimaisLoteDestino.setText("");
        if (cbPastoLote.getSelectedIndex() == 0) {
            tfQuantidade.setEditable(false);
        } else {
            tfQuantidade.setEditable(true);
        }
        cbPastoDestino.setEnabled(false);
        cbLoteDestino.setEnabled(false);
        cbPastoDestino.setModel(new PastoCombo());
        cbLoteDestino.setModel(new LoteCombo());
    }//GEN-LAST:event_cbPastoLoteActionPerformed

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
        if(cbPastoLote.getSelectedIndex() == 0) {
            transferePasto();
        } else {
            transfereLote();
        }
    }//GEN-LAST:event_btconfirmaActionPerformed

    private void btconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultaActionPerformed
        buscaTransferencia();
    }//GEN-LAST:event_btconsultaActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        novo();
    }//GEN-LAST:event_btnovoActionPerformed

    private void BtcancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtcancelaActionPerformed
  if (evt.getSource() == Btcancela) {
            dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtcancelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btcancela;
    private javax.swing.JLabel JLfazenda;
    private javax.swing.JLabel JLfazenda1;
    private javax.swing.JLabel JLlote;
    private javax.swing.JLabel JLlote1;
    private javax.swing.JButton btconfirma;
    private javax.swing.JButton btconsulta;
    private javax.swing.JButton btnovo;
    private javax.swing.JComboBox cbFazendaDestino;
    private javax.swing.JComboBox cbFazendaOrigem;
    private javax.swing.JComboBox cbLoteDestino;
    private javax.swing.JComboBox cbLoteOrigem;
    private javax.swing.JComboBox cbPastoDestino;
    private javax.swing.JComboBox cbPastoLote;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser tfData;
    private javax.swing.JTextField tfQtdAnimaisLoteDestino;
    private javax.swing.JTextField tfQtdAnimaisLoteOrigem;
    private javax.swing.JFormattedTextField tfQuantidade;
    // End of variables declaration//GEN-END:variables
}
