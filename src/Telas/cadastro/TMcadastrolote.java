/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TMcadastrolote.java
 *
 * Created on 17/05/2010, 19:39:19
 */

package Telas.cadastro;

import entidade.Lote;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelLote;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TMcadastrolote extends javax.swing.JFrame {

private DAOGenerico<Lote> dao;
    /** Creates new form TMcadastrolote */
    public TMcadastrolote() {
        dao = new DAOGenerico<Lote>(Lote.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
 
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelalote = new javax.swing.JTable();
        tmclbotaonovo = new javax.swing.JButton();
        tmclbotaoeditar = new javax.swing.JButton();
        tmclbotaoconsultar = new javax.swing.JButton();
        tmclexcluir = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfconsulta = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lotes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 153))); // NOI18N

        tabelalote.setModel(new TableModelLote());
        jScrollPane2.setViewportView(tabelalote);

        tmclbotaonovo.setIcon(new ImageIcon("src/icones/novo.png"));
        tmclbotaonovo.setText("Novo");
        tmclbotaonovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmclbotaonovoActionPerformed(evt);
            }
        });

        tmclbotaoeditar.setIcon(new ImageIcon("src/imagens/JBAlterar1.png"));
        tmclbotaoeditar.setText("Alterar");
        tmclbotaoeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmclbotaoeditarActionPerformed(evt);
            }
        });

        tmclbotaoconsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        tmclbotaoconsultar.setText("Consultar");
        tmclbotaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmclbotaoconsultarActionPerformed(evt);
            }
        });

        tmclexcluir.setIcon(new ImageIcon("src/imagens/JBExcluir3.png"));
        tmclexcluir.setText("Excluir");
        tmclexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmclexcluirActionPerformed(evt);
            }
        });

        btsair.setIcon(new ImageIcon("src/icones/fecha.png"));
        btsair.setText("Fechar");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero do Lote/Consultar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tmclbotaonovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmclbotaoeditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmclbotaoconsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmclexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btsair, tmclbotaoconsultar, tmclbotaoeditar, tmclbotaonovo, tmclexcluir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmclbotaonovo)
                    .addComponent(tmclbotaoeditar)
                    .addComponent(tmclbotaoconsultar)
                    .addComponent(tmclexcluir)
                    .addComponent(btsair)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btsair, tmclbotaoconsultar, tmclbotaoeditar, tmclbotaonovo, tmclexcluir});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmclbotaonovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclbotaonovoActionPerformed
      CadastroLote vc = new CadastroLote(this, true);
        vc.setVisible(true);
        tabelalote.setModel(new TableModelLote());
        tabelalote.updateUI();
    }//GEN-LAST:event_tmclbotaonovoActionPerformed

    private void tmclbotaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclbotaoconsultarActionPerformed
         tabelalote.setModel(new TableModelLote());
        tabelalote.updateUI();  
        String consultar = tfconsulta.getText();
        tabelalote.setModel(new TableModelLote(consultar));
        tabelalote.updateUI();  // TODO add your handling code here:
    }//GEN-LAST:event_tmclbotaoconsultarActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        if (evt.getSource() == btsair) {
            dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void tmclexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclexcluirActionPerformed
 int selecionado = tabelalote.getSelectedRow();
        if (selecionado != -1) {
            Object[] botoes = {"Sim", "Não"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {
                dao.delete(dao.list().get(selecionado));
                tabelalote.setModel(new TableModelLote());
                tabelalote.updateUI();
                 JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");

             }
         }
 // TODO add your handling code here:
    }//GEN-LAST:event_tmclexcluirActionPerformed

    private void tmclbotaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclbotaoeditarActionPerformed
 int selecionado = tabelalote.getSelectedRow();
        if (selecionado != -1) {
            Lote lot = dao.list().get(selecionado);
            CadastroLote vc = new CadastroLote(this, true);
            vc.setEntidade(lot);
            vc.setVisible(true);
            tabelalote.setModel(new TableModelLote());
            tabelalote.updateUI();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_tmclbotaoeditarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMcadastrolote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsair;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelalote;
    private javax.swing.JTextField tfconsulta;
    private javax.swing.JButton tmclbotaoconsultar;
    private javax.swing.JButton tmclbotaoeditar;
    private javax.swing.JButton tmclbotaonovo;
    private javax.swing.JButton tmclexcluir;
    // End of variables declaration//GEN-END:variables

}
