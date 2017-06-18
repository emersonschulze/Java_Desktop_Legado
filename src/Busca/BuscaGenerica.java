/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BuscaGenerica.java
 *
 * Created on 11/09/2010, 13:05:48
 */

package Busca;

import java.awt.event.ActionEvent;
import model.TableModelCidade;
import model.TableModelCompra;
import model.TableModelEmitente;
import model.TableModelTransferencias;
import model.TableModelVenda;

/**
 *
 * @author altitdb
 */
public class BuscaGenerica extends javax.swing.JDialog {

    public TableModelCidade tmCidade;
    public TableModelEmitente tmEmitente;
    public TableModelTransferencias tmTransferencias;
    public TableModelCompra tmCompra;
    public TableModelVenda tmVenda;
    /** Creates new form BuscaGenerica */
    public BuscaGenerica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    public BuscaGenerica() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void consulta(String consulta) {
        if(this.getTitle().equals("Busca de Cidades")) {
            tmCidade = new TableModelCidade(consulta);
            tabela.setModel(tmCidade);
        } else if(this.getTitle().equals("Busca de Emitentes")) {
            tmEmitente = new TableModelEmitente(consulta);
            tabela.setModel(tmEmitente);
        } else if (this.getTitle().equals("Busca de Transferências")) {
            tmTransferencias = new TableModelTransferencias(consulta);
            tabela.setModel(tmTransferencias);
        } else if(this.getTitle().equals("Busca de Emitentes ")) { //fornecedor
            tmEmitente = new TableModelEmitente(consulta, true, false);
            tabela.setModel(tmEmitente);
        } else if(this.getTitle().equals("Busca de Compras")) {
            tmCompra = new TableModelCompra(consulta);
            tabela.setModel(tmCompra);
            } else if(this.getTitle().equals("Busca de Vendas")) {
            tmVenda = new TableModelVenda(consulta);
            tabela.setModel(tmVenda);
        } else if(this.getTitle().equals("Busca de Emitentes  ")) { //cliente
            tmEmitente = new TableModelEmitente(consulta, false, true);
            tabela.setModel(tmEmitente);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbConsulta = new javax.swing.JLabel();
        tfConsulta = new javax.swing.JTextField();
        btConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbConsulta.setText("Nome:");

        btConsulta.setText("...");
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
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
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btOk))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConsulta)
                    .addComponent(tfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        consulta(tfConsulta.getText().trim());
    }//GEN-LAST:event_btConsultaActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if(evt.getClickCount() == 2) {
            dispose();
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
      if(evt.getWhen()== 1) {
            dispose();
        }
    }//GEN-LAST:event_btOkActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscaGenerica dialog = new BuscaGenerica(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbConsulta;
    public javax.swing.JTable tabela;
    private javax.swing.JTextField tfConsulta;
    // End of variables declaration//GEN-END:variables

}
