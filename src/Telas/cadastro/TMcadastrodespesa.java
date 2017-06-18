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

import entidade.Despesa;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelDespesa;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TMcadastrodespesa extends javax.swing.JFrame {

    private DAOGenerico<Despesa> dao;
    private TableModelDespesa tmDespesa;

    /** Creates new form TMcadastrolote */
    public TMcadastrodespesa() {
        dao = new DAOGenerico<Despesa>(Despesa.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        tmDespesa = new TableModelDespesa("");
        tabeladespesa.setModel(tmDespesa);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeladespesa = new javax.swing.JTable();
        tmclbotaonovo = new javax.swing.JButton();
        tmclbotaoconsultar = new javax.swing.JButton();
        tmclexcluir = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfconsulta = new javax.swing.JTextField();
        BTbaixar = new javax.swing.JButton();
        BTestornar = new javax.swing.JButton();
        BTconsultar = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Despesas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 153))); // NOI18N

        tabeladespesa.setModel(new TableModelDespesa());
        jScrollPane2.setViewportView(tabeladespesa);

        tmclbotaonovo.setIcon(new ImageIcon("src/icones/novo.png"));
        tmclbotaonovo.setText("Novo");
        tmclbotaonovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmclbotaonovoActionPerformed(evt);
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

        jLabel1.setText("Despesa/Consultar");

        BTbaixar.setText("Baixar");
        BTbaixar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbaixarActionPerformed(evt);
            }
        });

        BTestornar.setText("Estornar");
        BTestornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTestornarActionPerformed(evt);
            }
        });

        BTconsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        BTconsultar.setText("Consultar");
        BTconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BTbaixar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BTestornar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BTconsultar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfconsulta))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tmclbotaonovo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tmclbotaoconsultar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tmclexcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btsair, tmclbotaoconsultar, tmclbotaonovo, tmclexcluir});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BTbaixar, BTconsultar, BTestornar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTbaixar)
                    .addComponent(BTestornar)
                    .addComponent(BTconsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmclbotaonovo)
                    .addComponent(tmclbotaoconsultar)
                    .addComponent(tmclexcluir)
                    .addComponent(btsair))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btsair, tmclbotaoconsultar, tmclbotaonovo, tmclexcluir});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BTbaixar, BTconsultar, BTestornar});

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmclbotaonovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclbotaonovoActionPerformed
        CadastroDespesa vc = new CadastroDespesa(this, true);
        vc.setVisible(true);
        tabeladespesa.setModel(new TableModelDespesa());
        tabeladespesa.updateUI();
    }//GEN-LAST:event_tmclbotaonovoActionPerformed

    private void tmclbotaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclbotaoconsultarActionPerformed

        String consultar = tfconsulta.getText();
        tmDespesa = new TableModelDespesa(consultar);
        tabeladespesa.setModel(tmDespesa);

    }//GEN-LAST:event_tmclbotaoconsultarActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        if (evt.getSource() == btsair) {
            dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void tmclexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclexcluirActionPerformed
        int selecionado = tabeladespesa.getSelectedRow();
        if (selecionado != -1) {
            Object[] botoes = {"Sim", "Não"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dao.delete(dao.list().get(selecionado));
                tabeladespesa.setModel(new TableModelDespesa());
                tabeladespesa.updateUI();
                tmDespesa = new TableModelDespesa("");
                tabeladespesa.setModel(tmDespesa);
                JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");

            }
        }            // TODO add your handling code here:
    }//GEN-LAST:event_tmclexcluirActionPerformed

    private void BTbaixarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbaixarActionPerformed
        int selecionado = tabeladespesa.getSelectedRow();
        if (selecionado != -1) {
            Object[] botoes = {"Sim", "Não"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Baixar?",
                    "Baixar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                Despesa d = tmDespesa.getLista().get(tabeladespesa.getSelectedRow());
                d.setBaixaDespesa(true);
                dao.update(d);
                tmDespesa = new TableModelDespesa("");
                tabeladespesa.setModel(tmDespesa);
                JOptionPane.showMessageDialog(null, " Registro Baixado com Sucesso");

            }
        }
    }//GEN-LAST:event_BTbaixarActionPerformed

    private void BTconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTconsultarActionPerformed
        tmDespesa = new TableModelDespesa();
        tabeladespesa.setModel(tmDespesa);

}//GEN-LAST:event_BTconsultarActionPerformed

    private void BTestornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTestornarActionPerformed
        int selecionado = tabeladespesa.getSelectedRow();
        if (selecionado != -1) {
            Object[] botoes = {"Sim", "Não"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Estornar?",
                    "Baixar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                Despesa d = tmDespesa.getLista().get(tabeladespesa.getSelectedRow());
                d.setBaixaDespesa(false);
                dao.update(d);
                tmDespesa = new TableModelDespesa("");
                tabeladespesa.setModel(tmDespesa);
                JOptionPane.showMessageDialog(null, " Registro Estornado com Sucesso");

            }
        }
    }//GEN-LAST:event_BTestornarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TMcadastrodespesa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTbaixar;
    private javax.swing.JButton BTconsultar;
    private javax.swing.JButton BTestornar;
    private javax.swing.JButton btsair;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabeladespesa;
    private javax.swing.JTextField tfconsulta;
    private javax.swing.JButton tmclbotaoconsultar;
    private javax.swing.JButton tmclbotaonovo;
    private javax.swing.JButton tmclexcluir;
    // End of variables declaration//GEN-END:variables
}
