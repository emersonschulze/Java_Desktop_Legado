/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroUnidadedeMedida.java
 *
 * Created on 31/05/2010, 20:26:33
 */

package Telas.cadastro;

import entidade.UnidadeMedida;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroUnidadedeMedida  extends javax.swing.JDialog {

    private UnidadeMedida unidadedemedida;

    public CadastroUnidadedeMedida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

      }

     public void setEntidade(UnidadeMedida est) {
        unidadedemedida = est;
        tfnome.setText(est.getDescricao());
        tfsigla.setText(est.getSigla());
    }


    private boolean validarCampos() {
        boolean valid = true;
        if (this.tfnome.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome  está em Branco.",
                                  "Validar Nome", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        if (this.tfsigla.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Sigla está em Branco.",
                                  "Validar Sigla", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        return valid;
    }

    
 
  
  
  
  
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlnome = new javax.swing.JLabel();
        jlsigla = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        tfsigla = new javax.swing.JTextField();
        btconfirma = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        campoobrigatorio22 = new javax.swing.JLabel();
        campoobrigatorio23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidade de Medida"));

        jlnome.setText("Nome");

        jlsigla.setText("Sigla");

        tfnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomeActionPerformed(evt);
            }
        });

        btconfirma.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        btconfirma.setText("Salvar");
        btconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconfirmaActionPerformed(evt);
            }
        });

        btcancelar.setIcon(new ImageIcon("src/icones/fecha.png"));
        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        campoobrigatorio22.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio22.setText("*");

        campoobrigatorio23.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio23.setText("*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel3.setText("Campo Obrigatorio");

        campoobrigatorio24.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio24.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(campoobrigatorio24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btconfirma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlnome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlsigla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfsigla, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnome)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlsigla)
                    .addComponent(tfsigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio22))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoobrigatorio24)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirma)
                    .addComponent(btcancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomeActionPerformed
    
    }//GEN-LAST:event_tfnomeActionPerformed

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
 DAOGenerico<UnidadeMedida> dao = new DAOGenerico<UnidadeMedida>(UnidadeMedida.class);
       if( validarCampos()){
 if (unidadedemedida == null) {
           
            UnidadeMedida est = new UnidadeMedida();
            est.setDescricao(tfnome.getText());
            est.setSigla(tfsigla.getText());
            dao.insert(est);
        } else {
            validarCampos();
            unidadedemedida.setDescricao(tfnome.getText());
            unidadedemedida.setSigla(tfsigla.getText());
            dao.update(unidadedemedida);
        }
        setVisible(false);
         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        } else {

        limparcampos();
tfnome.requestFocus();
    }

    }//GEN-LAST:event_btconfirmaActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        if (evt.getSource() == btcancelar) {
                 dispose();
        }
    }//GEN-LAST:event_btcancelarActionPerformed

   
    public void run() {
               CadastroUnidadedeMedida dialogUnidadeMedida  = new CadastroUnidadedeMedida(new javax.swing.JFrame(), true);
                dialogUnidadeMedida .addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogUnidadeMedida .setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirma;
    private javax.swing.JLabel campoobrigatorio22;
    private javax.swing.JLabel campoobrigatorio23;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlnome;
    private javax.swing.JLabel jlsigla;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfsigla;
    // End of variables declaration//GEN-END:variables

    private void limparcampos() {
        tfnome.setText("");
    tfsigla.setText("");

    }

}
