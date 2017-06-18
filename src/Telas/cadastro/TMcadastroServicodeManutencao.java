/**
 *
 * @author Emerson
 */
package Telas.cadastro;

import entidade.ServicoDeManutencao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelServicodeManutencao;
import util.DAOGenerico;

public class TMcadastroServicodeManutencao extends javax.swing.JFrame {

    private DAOGenerico<ServicoDeManutencao> dao;
    
    public TMcadastroServicodeManutencao() {
        dao = new DAOGenerico<ServicoDeManutencao>(ServicoDeManutencao.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTservicomanutencao = new javax.swing.JTable();
        btexcluir = new javax.swing.JButton();
        btnovo = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfconsultar = new javax.swing.JTextField();
        btconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setName(""); // NOI18N

        JTservicomanutencao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTservicomanutencao.setFont(new java.awt.Font("Tahoma", 1, 11));
        JTservicomanutencao.setModel(new TableModelServicodeManutencao());
        JTservicomanutencao.setToolTipText("Pesquise o nome da cidade");
        JTservicomanutencao.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(JTservicomanutencao);

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

        jLabel1.setText("Tabela Serviço de Manutenção Pasto");

        jLabel2.setText("Serviço de Manutenção/Consultar");

        tfconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfconsultarActionPerformed(evt);
            }
        });

        btconsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        btconsultar.setText("Consultar");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btconsultar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btalterar, btconsultar, btexcluir, btnovo, btsair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconsultar)
                    .addComponent(btnovo)
                    .addComponent(btalterar)
                    .addComponent(btexcluir)
                    .addComponent(btsair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btalterar, btexcluir, btnovo, btsair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        int selecionado = JTservicomanutencao.getSelectedRow();
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                JTservicomanutencao.setModel(new TableModelServicodeManutencao());
                JTservicomanutencao.updateUI();
                     JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");
       
             }      
        }    
}//GEN-LAST:event_btexcluirActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        CadastroServicodeManutencao vc = new CadastroServicodeManutencao(this, true);
        vc.setVisible(true);
        JTservicomanutencao.setModel(new TableModelServicodeManutencao());
        JTservicomanutencao.updateUI();
}//GEN-LAST:event_btnovoActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
        int selecionado = JTservicomanutencao.getSelectedRow();
        if (selecionado != -1) {
            ServicoDeManutencao cid = dao.list().get(selecionado);
            CadastroServicodeManutencao vc = new CadastroServicodeManutencao(this, true);
            vc.setEntidade(cid);
            vc.setVisible(true);
            JTservicomanutencao.setModel(new TableModelServicodeManutencao());
            JTservicomanutencao.updateUI();
        } 
}//GEN-LAST:event_btalterarActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        if (evt.getSource() == btsair) {
            dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void tfconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfconsultarActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfconsultarActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        JTservicomanutencao.setModel(new TableModelServicodeManutencao());
        JTservicomanutencao.updateUI();
        String consultar = tfconsultar.getText();
        JTservicomanutencao.setModel(new TableModelServicodeManutencao(consultar));
        JTservicomanutencao.updateUI();          // TODO add your handling code here:
}//GEN-LAST:event_btconsultarActionPerformed

            public void run() {
                new TMcadastroServicodeManutencao().setVisible(true);
            } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTservicomanutencao;
    private javax.swing.JButton btalterar;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfconsultar;
    // End of variables declaration//GEN-END:variables
    
}
