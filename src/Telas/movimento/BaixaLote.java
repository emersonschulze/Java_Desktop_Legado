/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BaixaLote.java
 *
 * Created on 28/08/2010, 14:21:16
 */
package Telas.movimento;

import entidade.Fazenda;
import entidade.Lote;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboFazenda;
import model.ComboLote;
import model.TableModelBaixaLote;
import model.TableModelDespesa;
import util.DAOGenerico;
import util.DocumentRightLeft;

/**
 *
 * @author Emerson
 */
public class BaixaLote extends javax.swing.JDialog {
private entidade.BaixaLote bxlote;
    /** Creates new form BaixaLote */
    public BaixaLote(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }
  private DAOGenerico<entidade.BaixaLote> dao;
    private TableModelBaixaLote tmbxlote;

          public BaixaLote() {
        dao = new DAOGenerico<entidade.BaixaLote>(entidade.BaixaLote.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        tmbxlote = new TableModelBaixaLote();
        tabelabxlote.setModel(tmbxlote);
        tfquant.setDocument(new DocumentRightLeft((5)));
    }
 public void setEntidade(entidade.BaixaLote cid) {
        bxlote = cid;
        tfquant.setText(String.valueOf(cid.getQuantidate()));
       combolote.setModel(new ComboLote());
        combofaz.setModel(new ComboFazenda());
        combomotivo.setModel(new DefaultComboBoxModel());
         Jdati.setDate(cid.getDataBaixa());
    }

private void limparcampos() {
            tfquant.setText("");
            tfquant.setText("");
            combolote.setSelectedItem("");
        combofaz.setSelectedItem("");
        combomotivo.setSelectedItem("");
        JTobservacao.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        combofaz = new javax.swing.JComboBox();
        JLfazenda = new javax.swing.JLabel();
        JLlote = new javax.swing.JLabel();
        JLobservacao = new javax.swing.JLabel();
        combolote = new javax.swing.JComboBox();
        combomotivo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        BTconfirma = new javax.swing.JButton();
        Btcancela = new javax.swing.JButton();
        BtConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTobservacao = new javax.swing.JTextArea();
        Jdati = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelabxlote = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfquant = new javax.swing.JTextField();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Baixa de Lotes"));

        combofaz.setModel(new ComboFazenda());

        JLfazenda.setText("Fazenda");

        JLlote.setText("Lote");

        JLobservacao.setText("Observação");

        combolote.setModel(new ComboLote());

        combomotivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nascimento", "Morte", "Doação" }));
        combomotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomotivoActionPerformed(evt);
            }
        });

        jLabel4.setText("Motivo");

        BTconfirma.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        BTconfirma.setText("Lançar");
        BTconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTconfirmaActionPerformed(evt);
            }
        });

        Btcancela.setIcon(new ImageIcon("src/icones/fecha.png"));
        Btcancela.setText("Cancelar");
        Btcancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtcancelaActionPerformed(evt);
            }
        });

        BtConsulta.setIcon(new ImageIcon("src/icones/lupa.png"));
        BtConsulta.setText("Consultar");

        JTobservacao.setColumns(20);
        JTobservacao.setRows(5);
        jScrollPane1.setViewportView(JTobservacao);

        tabelabxlote.setModel(new TableModelDespesa());
        jScrollPane2.setViewportView(tabelabxlote);

        jLabel1.setText("Quantidade");

        tfquant.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(JLfazenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combofaz, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JLlote)
                        .addGap(23, 23, 23)
                        .addComponent(combolote, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(combomotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jdati, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfquant, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                            .addComponent(BTconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(BtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(Btcancela, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLobservacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addGap(83, 83, 83)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BTconfirma, BtConsulta, Btcancela});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfazenda)
                    .addComponent(combofaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(JLlote))
                    .addComponent(combolote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(combomotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jdati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JLobservacao))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BTconfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btcancela)
                    .addComponent(BtConsulta))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(jPanel1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-543)/2, (screenSize.height-556)/2, 543, 556);
    }// </editor-fold>//GEN-END:initComponents

    private void BtcancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtcancelaActionPerformed
      this.dispose();
    }//GEN-LAST:event_BtcancelaActionPerformed

    private void BTconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTconfirmaActionPerformed
        DAOGenerico<entidade.BaixaLote> dao = new DAOGenerico<entidade.BaixaLote>(entidade.BaixaLote.class);
        if(validarCampos()){
                Lote lote = (Lote)combolote.getSelectedItem();
                entidade.BaixaLote cid = new entidade.BaixaLote();
                cid.setQuantidate(Integer.valueOf(tfquant.getText()));
                cid.setLote(lote);
                cid.setDataBaixa(Jdati.getDate());
                cid.setFazenda((Fazenda) combofaz.getSelectedItem());
                cid.setMotivo(combomotivo.getSelectedIndex());
                cid.setObs(JTobservacao.getText());
                dao.insert(cid);
                DAOGenerico<Lote> daolote = new DAOGenerico<Lote>(Lote.class);
                if(combomotivo.getSelectedIndex() == 0) {
                    lote.setQuantidadeTotal(String.valueOf(Integer.valueOf(lote.getQuantidadeTotal()) + Integer.valueOf(tfquant.getText())));
                } else if(combomotivo.getSelectedIndex() == 1 || combomotivo.getSelectedIndex() == 2) {
                    lote.setQuantidadeTotal(String.valueOf(Integer.valueOf(lote.getQuantidadeTotal()) - Integer.valueOf(tfquant.getText())));
                }
                 daolote.update(lote);
            setVisible(false);
            JOptionPane.showMessageDialog(null,"Baixa inserida com Sucesso");
        } else {

            limparcampos();

        }





    }//GEN-LAST:event_BTconfirmaActionPerformed

    private void combomotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomotivoActionPerformed

    public void run() {
        BaixaLote dialogBaixaLote = new BaixaLote(new javax.swing.JFrame(), true);
        dialogBaixaLote.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialogBaixaLote.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTconfirma;
    private javax.swing.JButton BtConsulta;
    private javax.swing.JButton Btcancela;
    private javax.swing.JLabel JLfazenda;
    private javax.swing.JLabel JLlote;
    private javax.swing.JLabel JLobservacao;
    private javax.swing.JTextArea JTobservacao;
    private com.toedter.calendar.JDateChooser Jdati;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combofaz;
    private javax.swing.JComboBox combolote;
    private javax.swing.JComboBox combomotivo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelabxlote;
    private javax.swing.JTextField tfquant;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
          boolean valid = true;
        if (this.tfquant.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Quantidade está em Branco.",
                    "Validar Quantidade", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }


        if (this.combomotivo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Motivo está em Branco",
                    "Validadar Motivo", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combolote.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Lote está em Branco",
                    "Validadar Lote", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combofaz.getSelectedItem()== null) {
            JOptionPane.showMessageDialog(null, "O Campo Fazenda está em Branco",
                    "Validadar Fazenda ", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }



        return valid;
    }

    }

