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

import Busca.BuscaGenerica;
import entidade.Fazenda;
import entidade.Lote;
import entidade.LoteVacinado;
import entidade.TipodeSanidade;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboFazenda;
import model.ComboLote;
import model.ComboTipoSanidade;
import model.TableModelLoteVacinado;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class Vacinado  extends javax.swing.JDialog {

    private LoteVacinado lotevacinado;
    private Fazenda fazenda;
    private Lote lote;
    private TipodeSanidade tpsanidade;

    public Vacinado(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }



    public void setEntidade(LoteVacinado est) {
        lotevacinado = est;
        combofaz.setModel(new ComboFazenda());
       combolote.setModel(new ComboLote());
       combosanidade.setModel(new ComboTipoSanidade());
       TFdata.setDate(est.getData());
       TFobs.setText(est.getObservacao());
    }

    private void consultar() {
        this.setVisible(false);

        BuscaGenerica bg = new BuscaGenerica();
        bg.setTitle("Busca de Lotes Imunes");
        bg.tabela.setModel(new TableModelLoteVacinado());
        bg.setModal(true);
        bg.setVisible(true);
        if (bg.tabela.getSelectedRow() != -1) {

        } else {

        }
        this.setVisible(true);
    }


    private boolean validarCampos() {
        boolean valid = true;
        if (this.TFdata.getDate() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Data está em Branco.",
                                  "Validar Data", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
         if (this.combofaz.getSelectedItem() == null) {
           JOptionPane.showMessageDialog(null, "O Campo Fazenda está em Branco",
                                             "Validadar Fazenda", JOptionPane.WARNING_MESSAGE);
            valid = false;
             }
 if (this.combolote.getSelectedItem() == null) {
           JOptionPane.showMessageDialog(null, "O Campo Lote está em Branco",
                                             "Validadar Lote", JOptionPane.WARNING_MESSAGE);
            valid = false;
             }
 if (this.combosanidade.getSelectedItem() == null) {
           JOptionPane.showMessageDialog(null, "O Campo Sanidade está em Branco",
                                             "Validadar Sanidade", JOptionPane.WARNING_MESSAGE);
            valid = false;
             }

        return valid;
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
        jLabel4 = new javax.swing.JLabel();
        Btconfirma = new javax.swing.JButton();
        BtCancela = new javax.swing.JButton();
        Btconsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TFobs = new javax.swing.JTextArea();
        TFdata = new com.toedter.calendar.JDateChooser();
        combosanidade = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sanidade"));

        combofaz.setModel(new ComboFazenda());

        JLfazenda.setText("Fazenda");

        JLlote.setText("Lote");

        JLobservacao.setText("Observação");

        combolote.setModel(new ComboLote());

        jLabel4.setText("Sanidade");

        Btconfirma.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        Btconfirma.setText("Confirmar");
        Btconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtconfirmaActionPerformed(evt);
            }
        });

        BtCancela.setIcon(new ImageIcon("src/icones/fecha.png"));
        BtCancela.setText("Cancelar");
        BtCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelaActionPerformed(evt);
            }
        });

        Btconsulta.setIcon(new ImageIcon("src/icones/lupa.png"));
        Btconsulta.setText("Consultar");
        Btconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtconsultaActionPerformed(evt);
            }
        });

        TFobs.setColumns(20);
        TFobs.setRows(5);
        jScrollPane1.setViewportView(TFobs);

        combosanidade.setModel(new ComboTipoSanidade());

        jLabel1.setText("Vacina em");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(JLfazenda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JLobservacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(JLlote))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(combosanidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(combolote, javax.swing.GroupLayout.Alignment.LEADING, 0, 332, Short.MAX_VALUE)
                                        .addComponent(combofaz, javax.swing.GroupLayout.Alignment.LEADING, 0, 332, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(TFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLfazenda)
                    .addComponent(combofaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(JLlote))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(combolote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(combosanidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLobservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btconfirma)
                    .addComponent(Btconsulta)
                    .addComponent(BtCancela))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(jPanel1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-466)/2, (screenSize.height-335)/2, 466, 335);
    }// </editor-fold>//GEN-END:initComponents

    private void BtconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtconfirmaActionPerformed
  DAOGenerico<LoteVacinado> dao = new DAOGenerico<LoteVacinado>(LoteVacinado.class);
if (validarCampos()){
        if (lotevacinado == null) {
             if(validarCampos()){
            LoteVacinado cid = new LoteVacinado();
            cid.setFazenda((Fazenda) combofaz.getSelectedItem());
            cid.setData(TFdata.getDate());
            cid.setLote((Lote) combolote.getSelectedItem());
            cid.setTipodeSanidade((TipodeSanidade) combosanidade.getSelectedItem());
            cid.setObservacao(TFobs.getText());
            dao.insert(cid);

        } else {
            validarCampos();
           lotevacinado.setFazenda((Fazenda) combofaz.getSelectedItem());
            lotevacinado.setData(TFdata.getDate());
            lotevacinado.setLote((Lote) combolote.getSelectedItem());
            lotevacinado.setTipodeSanidade((TipodeSanidade) combosanidade.getSelectedItem());
            lotevacinado.setObservacao(TFobs.getText());
            dao.update(lotevacinado);
        }

        setVisible(false);
         JOptionPane.showMessageDialog(null," Imunização inserida com Sucesso");
        } else {

        limparcampos();

    }
    }
    }//GEN-LAST:event_BtconfirmaActionPerformed

    private void BtconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtconsultaActionPerformed
 consultar();

    }//GEN-LAST:event_BtconsultaActionPerformed

    private void BtCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelaActionPerformed
  if (evt.getSource() == BtCancela) {
            dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BtCancelaActionPerformed

        public void run() {
        Vacinado dialogVacinado = new Vacinado(new javax.swing.JFrame(), true);
        dialogVacinado.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialogVacinado.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancela;
    private javax.swing.JButton Btconfirma;
    private javax.swing.JButton Btconsulta;
    private javax.swing.JLabel JLfazenda;
    private javax.swing.JLabel JLlote;
    private javax.swing.JLabel JLobservacao;
    private com.toedter.calendar.JDateChooser TFdata;
    private javax.swing.JTextArea TFobs;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combofaz;
    private javax.swing.JComboBox combolote;
    private javax.swing.JComboBox combosanidade;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void limparcampos() {
            JLobservacao.setText("");
            TFdata.setDateFormatString("");
            combolote.setSelectedItem("");
        combofaz.setSelectedItem("");
        combosanidade.setSelectedItem("");


    }
}
