/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TMcadastrofazenda.java
 *
 * Created on 15/06/2010, 21:58:05
 */

package Telas.cadastro;

import entidade.Fazenda;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelFazenda;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TMcadastrofazenda extends javax.swing.JFrame {

    /** Creates new form TMcadastrofazenda */
  private DAOGenerico<Fazenda> dao;

 public TMcadastrofazenda() {
        dao = new DAOGenerico<Fazenda>(Fazenda.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineltmfaz = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelafaz = new javax.swing.JTable();
        btnovo = new javax.swing.JButton();
        btconsultar = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfconsultar = new javax.swing.JTextField();
        btexcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paineltmfaz.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Fazenda"));

        tabelafaz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelafaz.setModel(new TableModelFazenda());
        jScrollPane1.setViewportView(tabelafaz);

        btnovo.setIcon(new ImageIcon("src/icones/novo.png"));
        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btconsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        btconsultar.setText("Consultar");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
            }
        });

        btalterar.setIcon(new ImageIcon("src/imagens/JBAlterar1.png"));
        btalterar.setText("Alterar");
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        btsair.setIcon(new ImageIcon("src/icones/fecha.png"));
        btsair.setText("Fechar");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        jLabel1.setText("Proprietario/Consultar");

        tfconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfconsultarActionPerformed(evt);
            }
        });

        btexcluir.setIcon(new ImageIcon("src/imagens/JBExcluir3.png"));
        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paineltmfazLayout = new javax.swing.GroupLayout(paineltmfaz);
        paineltmfaz.setLayout(paineltmfazLayout);
        paineltmfazLayout.setHorizontalGroup(
            paineltmfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineltmfazLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineltmfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(paineltmfazLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineltmfazLayout.createSequentialGroup()
                        .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        paineltmfazLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btalterar, btconsultar, btexcluir, btnovo, btsair});

        paineltmfazLayout.setVerticalGroup(
            paineltmfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineltmfazLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(paineltmfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(paineltmfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btsair)
                    .addComponent(btnovo)
                    .addComponent(btalterar)
                    .addComponent(btconsultar)
                    .addComponent(btexcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineltmfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineltmfaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
       int selecionado = tabelafaz.getSelectedRow();
        if (selecionado != -1) {
            Fazenda faz = dao.list().get(selecionado);
            CadastroFazenda vc = new CadastroFazenda(this, true);
            vc.setEntidade(faz);
            vc.setVisible(true);
            tabelafaz.setModel(new TableModelFazenda());
            tabelafaz.updateUI();
        }
    }//GEN-LAST:event_btalterarActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
if (evt.getSource() == btsair) {
            dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
            CadastroFazenda vc = new CadastroFazenda(this, true);
        vc.setVisible(true);
        tabelafaz.setModel(new TableModelFazenda());
        tabelafaz.updateUI();
    }//GEN-LAST:event_btnovoActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
 tabelafaz.setModel(new TableModelFazenda());
        tabelafaz.updateUI();  
        String consultar = tfconsultar.getText();
        tabelafaz.setModel(new TableModelFazenda(consultar));
        tabelafaz.updateUI();          // TODO add your handling code here:
    }//GEN-LAST:event_btconsultarActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
       int selecionado = tabelafaz.getSelectedRow();
        if (selecionado != -1) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {
                dao.delete(dao.list().get(selecionado));
                tabelafaz.setModel(new TableModelFazenda());
                tabelafaz.updateUI();
                     JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");
       
             }
        }      
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfconsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfconsultarActionPerformed

     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMcadastrofazenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btalterar;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paineltmfaz;
    private javax.swing.JTable tabelafaz;
    private javax.swing.JTextField tfconsultar;
    // End of variables declaration//GEN-END:variables

}
