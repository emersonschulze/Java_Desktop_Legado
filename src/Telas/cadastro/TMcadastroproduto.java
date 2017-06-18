/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TMcadastroproduto.java
 *
 * Created on 31/05/2010, 20:05:54
 */

package Telas.cadastro;

import entidade.Produto;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelProduto;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TMcadastroproduto extends javax.swing.JFrame {

    /** Creates new form TMcadastroproduto */

private DAOGenerico<Produto> dao;
    private List<Produto> lista;

       public TMcadastroproduto() {
         dao = new DAOGenerico<Produto>(Produto.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelproduto1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaproduto = new javax.swing.JTable();
        btnovo = new javax.swing.JButton();
        btconsultar = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        lbconsulta = new javax.swing.JLabel();
        consulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelproduto1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tabelaproduto.setModel(new TableModelProduto());
        jScrollPane1.setViewportView(tabelaproduto);

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

        btexcluir.setIcon(new ImageIcon("src/imagens/JBExcluir3.png"));
        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        lbconsulta.setText("Produto/Consultar");

        javax.swing.GroupLayout painelproduto1Layout = new javax.swing.GroupLayout(painelproduto1);
        painelproduto1.setLayout(painelproduto1Layout);
        painelproduto1Layout.setHorizontalGroup(
            painelproduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelproduto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelproduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelproduto1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(painelproduto1Layout.createSequentialGroup()
                        .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelproduto1Layout.createSequentialGroup()
                        .addComponent(lbconsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        painelproduto1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btalterar, btconsultar, btexcluir, btnovo, btsair});

        painelproduto1Layout.setVerticalGroup(
            painelproduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelproduto1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelproduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbconsulta)
                    .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelproduto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnovo)
                    .addComponent(btconsultar)
                    .addComponent(btsair)
                    .addComponent(btexcluir)
                    .addComponent(btalterar))
                .addContainerGap())
        );

        painelproduto1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btalterar, btconsultar, btnovo, btsair});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelproduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelproduto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
        int selecionado = tabelaproduto.getSelectedRow();
        if (selecionado != -1) {
            Produto cid = dao.list().get(selecionado);
            CadastroProduto vc = new CadastroProduto(this, true);
            vc.setEntidade(cid);
            vc.setVisible(true);
            tabelaproduto.setModel(new TableModelProduto());
            tabelaproduto.updateUI();
        }
    }//GEN-LAST:event_btalterarActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
   CadastroProduto vc = new  CadastroProduto(this, true);
        vc.setVisible(true);
       tabelaproduto.setModel(new TableModelProduto());
       tabelaproduto.updateUI();
    }//GEN-LAST:event_btnovoActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
if (evt.getSource() == btsair) {
        dispose();  }         // TODO add your handling code here:
    }//GEN-LAST:event_btsairActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        int selecionado = tabelaproduto.getSelectedRow();
        if (selecionado != -1) {
            Object[] botoes = {"Sim", "Não"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {
                dao.delete(dao.list().get(selecionado));
                tabelaproduto.setModel(new TableModelProduto());
                tabelaproduto.updateUI();
                     JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");
       
             }
        }
    }//GEN-LAST:event_btexcluirActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
       tabelaproduto.setModel(new TableModelProduto());
        tabelaproduto.updateUI();
        String consultar = consulta.getText();
        tabelaproduto.setModel(new TableModelProduto(consultar));
        tabelaproduto.updateUI();
    }//GEN-LAST:event_btconsultarActionPerformed

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMcadastroproduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btalterar;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btsair;
    private javax.swing.JTextField consulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbconsulta;
    private javax.swing.JPanel painelproduto1;
    private javax.swing.JTable tabelaproduto;
    // End of variables declaration//GEN-END:variables

}
