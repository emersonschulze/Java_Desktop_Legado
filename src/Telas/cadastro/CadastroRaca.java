/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroRaca.java
 *
 * Created on 28/05/2010, 21:42:25
 */

package Telas.cadastro;

import entidade.Raca;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroRaca extends javax.swing.JDialog {
 private Raca raca;
    /** Creates new form CadastroRaca */

     public CadastroRaca(java.awt.Frame parent, boolean modal) {
        super (parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }


  public void setEntidade(Raca rac) {
        raca = rac;
        tfnome.setText(rac.getDescricao());
        tfabrev.setText(rac.getAbreveatura());
    }

    private boolean validarCampos() {
        boolean valid = true;
        if (this.tfnome.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Estado está em Branco.",
                                  "Validar Raca", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        if (this.tfabrev.getText().trim().length() == 0) {
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
        cadraçanome = new javax.swing.JLabel();
        cadraçaabreveatura = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        tfabrev = new javax.swing.JTextField();
        btsalvar = new javax.swing.JButton();
        btcancela = new javax.swing.JButton();
        campoobrigatorio20 = new javax.swing.JLabel();
        campoobrigatorio21 = new javax.swing.JLabel();
        campoobrigatorio22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Raça"));

        cadraçanome.setText("Nome da Raça");

        cadraçaabreveatura.setText("Abreveatura");

        btsalvar.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        btcancela.setIcon(new ImageIcon("src/icones/fecha.png"));
        btcancela.setText("Cancelar");
        btcancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelaActionPerformed(evt);
            }
        });

        campoobrigatorio20.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio20.setText("*");

        campoobrigatorio21.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio21.setText("*");

        campoobrigatorio22.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio22.setText("*");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel1.setText("Campo Obrigatorio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadraçanome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadraçaabreveatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfabrev, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btsalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btcancela, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoobrigatorio20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btcancela, btsalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadraçanome)
                    .addComponent(campoobrigatorio22))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadraçaabreveatura)
                    .addComponent(tfabrev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio21))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoobrigatorio20)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalvar)
                    .addComponent(btcancela))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btcancela, btsalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelaActionPerformed
  if (evt.getSource() == btcancela) {
                 dispose();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btcancelaActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
       DAOGenerico<Raca> dao = new DAOGenerico<Raca>(Raca.class);
 if( validarCampos()){
        if (raca == null) {
          
            Raca est = new Raca();
            est.setDescricao(tfnome.getText());
            est.setAbreveatura(tfabrev.getText());
            dao.insert(est);
        } else {
            validarCampos();
            raca.setDescricao(tfnome.getText());
            raca.setAbreveatura(tfabrev.getText());
            dao.update(raca);
        }
        setVisible(false);
         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        } else {

        limparcampos();
tfnome.requestFocus();
    }

    }//GEN-LAST:event_btsalvarActionPerformed

    public void run() {
               CadastroRaca dialogRaca = new CadastroRaca(new javax.swing.JFrame(), true);
                dialogRaca.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogRaca.setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancela;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel cadraçaabreveatura;
    private javax.swing.JLabel cadraçanome;
    private javax.swing.JLabel campoobrigatorio20;
    private javax.swing.JLabel campoobrigatorio21;
    private javax.swing.JLabel campoobrigatorio22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfabrev;
    private javax.swing.JTextField tfnome;
    // End of variables declaration//GEN-END:variables

  

    private void limparcampos() {
       tfabrev.setText("");
       tfnome.setText("");
    }

}
