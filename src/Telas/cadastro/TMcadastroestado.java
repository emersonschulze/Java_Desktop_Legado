/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TMcadastroestado.java
 *
 * Created on 05/07/2010, 18:43:41
 */

package Telas.cadastro;

import entidade.Estado;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelEstado;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TMcadastroestado extends javax.swing.JFrame {

private DAOGenerico<Estado> dao;
    private List<Estado> lista;
    /** Creates new form TMcadastroestado */
    public TMcadastroestado() {
         dao = new DAOGenerico<Estado>(Estado.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaestado = new javax.swing.JTable();
        btnovo = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jltabestado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfconsultar = new javax.swing.JTextField();
        btconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaestado.setModel(new TableModelEstado());
        jScrollPane1.setViewportView(tabelaestado);

        btnovo.setIcon(new ImageIcon("src/icones/novo.png"));
        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btalterar.setIcon(new ImageIcon("src/imagens/JBAlterar1.png"));
        btalterar.setText("Alterar");
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        btexcluir.setIcon(new ImageIcon("src/imagens/JBExcluir3.png"));
        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btsair.setIcon(new ImageIcon("src/icones/fecha.png"));
        btsair.setText("Fechar");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        jltabestado.setText("Tabela Estados");

        jLabel1.setText("Estado/Consultar");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jltabestado)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btalterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btconsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsair, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfconsultar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btalterar, btconsultar, btexcluir, btnovo, btsair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jltabestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconsultar)
                    .addComponent(btnovo)
                    .addComponent(btexcluir)
                    .addComponent(btsair)
                    .addComponent(btalterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        int selecionado = tabelaestado.getSelectedRow(); 
        if (selecionado != -1) {             
            Object[] botoes = {"Sim", "Não", "Cancelar"};
             int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                     "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                     null, botoes, botoes[0]);
             if (ev == JOptionPane.YES_OPTION) {         
                dao.delete(dao.list().get(selecionado));
                tabelaestado.setModel(new TableModelEstado());
                tabelaestado.updateUI();
                     JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");
       
             }      
        }    
    }//GEN-LAST:event_btexcluirActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
if (evt.getSource() == btsair) {
        dispose();  }      // TODO add your handling code here:
    }//GEN-LAST:event_btsairActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
        int selecionado = tabelaestado.getSelectedRow();
        if (selecionado != -1) {
            Estado est = dao.list().get(selecionado);
            CadastroEstado vc = new CadastroEstado(this, true);
            vc.setEntidade(est);
            vc.setVisible(true);
            tabelaestado.setModel(new TableModelEstado());
            tabelaestado.updateUI();
        } 
    }//GEN-LAST:event_btalterarActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
  CadastroEstado vc = new  CadastroEstado(this, true);
        vc.setVisible(true);
       tabelaestado.setModel(new TableModelEstado());
        tabelaestado.updateUI();        // TODO add your handling code here:
    }//GEN-LAST:event_btnovoActionPerformed

    private void tfconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfconsultarActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfconsultarActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        tabelaestado.setModel(new TableModelEstado());
        tabelaestado.updateUI();
        String consultar = tfconsultar.getText();
        tabelaestado.setModel(new TableModelEstado(consultar));
        tabelaestado.updateUI();          // TODO add your handling code here:
}//GEN-LAST:event_btconsultarActionPerformed

    public void run() {
                new TMcadastroestado().setVisible(true);
            }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMcadastroestado().setVisible(true);
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
    private javax.swing.JLabel jltabestado;
    private javax.swing.JTable tabelaestado;
    private javax.swing.JTextField tfconsultar;
    // End of variables declaration//GEN-END:variables

}
