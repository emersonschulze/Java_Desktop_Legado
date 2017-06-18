/**
 *
 * @author Emerson
 */
package Telas.cadastro;

import entidade.Cultura;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelCultura;
import util.DAOGenerico;

public class TMcadastroCultura extends javax.swing.JFrame {

    private DAOGenerico<Cultura> dao;
    
     
    public TMcadastroCultura() {
        dao = new DAOGenerico<Cultura>(Cultura.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTCultura = new javax.swing.JTable();
        btexcluir = new javax.swing.JButton();
        btnovo = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tmclbotaoconsultar = new javax.swing.JButton();
        tfconsulta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cultura");
        setName(""); // NOI18N

        JTCultura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTCultura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JTCultura.setModel(new TableModelCultura());
        JTCultura.setToolTipText("");
        JTCultura.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTCultura);

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

        jLabel1.setText("Tabela Cultura");

        tmclbotaoconsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        tmclbotaoconsultar.setText("Consultar");
        tmclbotaoconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmclbotaoconsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cultura/Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfconsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tmclbotaoconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(19, 19, 19))
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
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        int selecionado = JTCultura.getSelectedRow();
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTCultura.setModel(new TableModelCultura());
                JTCultura.updateUI();
                     JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");
       
             }      
        }    
}//GEN-LAST:event_btexcluirActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        CadastroCultura vc = new CadastroCultura(this, true);
        vc.setVisible(true);
        JTCultura.setModel(new TableModelCultura());
        JTCultura.updateUI();
}//GEN-LAST:event_btnovoActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
        int selecionado = JTCultura.getSelectedRow();
        if (selecionado != -1) {
            Cultura cid = dao.list().get(selecionado);
            CadastroCultura vc = new CadastroCultura(this, true);
            vc.setEntidade(cid);
            vc.setVisible(true);
            JTCultura.setModel(new TableModelCultura());
            JTCultura.updateUI();
        } 
}//GEN-LAST:event_btalterarActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        if (evt.getSource() == btsair) {
            dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void tmclbotaoconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmclbotaoconsultarActionPerformed
        JTCultura.setModel(new TableModelCultura());
        JTCultura.updateUI();
        String consultar = tfconsulta.getText();
        JTCultura.setModel(new TableModelCultura(consultar));
        JTCultura.updateUI();  // TODO add your handling code here:
}//GEN-LAST:event_tmclbotaoconsultarActionPerformed

            public void run() {
                new TMcadastroCultura().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTCultura;
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
