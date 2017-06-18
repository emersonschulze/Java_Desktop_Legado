/**
 *
 * @author Emerson
 */
package Telas.cadastro;

import entidade.TipodeSanidade;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelTipoSanidade;
import util.DAOGenerico;

public class TMcadastroTipodeSanidade extends javax.swing.JFrame {

    private DAOGenerico<TipodeSanidade> dao;
    
     
    public TMcadastroTipodeSanidade() {
        dao = new DAOGenerico<TipodeSanidade>(TipodeSanidade.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTsanidade = new javax.swing.JTable();
        btexcluir = new javax.swing.JButton();
        btnovo = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tmclbotaoconsultar = new javax.swing.JButton();
        tfconsulta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName(""); // NOI18N

        JTsanidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTsanidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTsanidade.setModel(new TableModelTipoSanidade());
        JTsanidade.setToolTipText("");
        JTsanidade.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTsanidade);

        btexcluir.setIcon(new ImageIcon("src/imagens/JBExcluir3.png"));
        btexcluir.setText("Excluir");
        btexcluir.setToolTipText("Excluir Cidade");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btnovo.setIcon(new ImageIcon("src/icones/novo.png"));
        btnovo.setText("Novo");
        btnovo.setToolTipText("Inserir Cidade");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btalterar.setIcon(new ImageIcon("src/imagens/JBAlterar1.png"));
        btalterar.setText("Alterar");
        btalterar.setToolTipText("Alterar Cidade");
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        btsair.setIcon(new ImageIcon("src/imagens/JBFechar1.png"));
        btsair.setText("Fechar");
        btsair.setToolTipText("Fechar Tela");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        jLabel1.setText("Tabela Tipo de Vacinas");

        tmclbotaoconsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        tmclbotaoconsultar.setText("Consultar");
        tmclbotaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmclbotaoconsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Vacina/Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tmclbotaoconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btalterar, btexcluir, btnovo, btsair, tmclbotaoconsultar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnovo)
                    .addComponent(btalterar)
                    .addComponent(tmclbotaoconsultar)
                    .addComponent(btexcluir)
                    .addComponent(btsair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        int selecionado = JTsanidade.getSelectedRow();
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTsanidade.setModel(new TableModelTipoSanidade());
                JTsanidade.updateUI();
                     JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");
       
             }      
        }    
}//GEN-LAST:event_btexcluirActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        CadastroTipodeSanidade vc = new CadastroTipodeSanidade(this, true);
        vc.setVisible(true);
        JTsanidade.setModel(new TableModelTipoSanidade());
        JTsanidade.updateUI();
}//GEN-LAST:event_btnovoActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
        int selecionado = JTsanidade.getSelectedRow();
        if (selecionado != -1) {
            TipodeSanidade cid = dao.list().get(selecionado);
            CadastroTipodeSanidade vc = new CadastroTipodeSanidade(this, true);
            vc.setEntidade(cid);
            vc.setVisible(true);
            JTsanidade.setModel(new TableModelTipoSanidade());
            JTsanidade.updateUI();
        } 
}//GEN-LAST:event_btalterarActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        if (evt.getSource() == btsair) {
            dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void tmclbotaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclbotaoconsultarActionPerformed
        JTsanidade.setModel(new TableModelTipoSanidade());
        JTsanidade.updateUI();
        String consultar = tfconsulta.getText();
        JTsanidade.setModel(new TableModelTipoSanidade(consultar));
        JTsanidade.updateUI();  // TODO add your handling code here:
}//GEN-LAST:event_tmclbotaoconsultarActionPerformed

            public void run() {
                new TMcadastroTipodeSanidade().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTsanidade;
    private javax.swing.JButton btalterar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfconsulta;
    private javax.swing.JButton tmclbotaoconsultar;
    // End of variables declaration//GEN-END:variables
    
}
