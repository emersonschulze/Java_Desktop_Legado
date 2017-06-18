
package Telas.cadastro;

import entidade.TipodeSanidade;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroTipodeSanidade extends javax.swing.JDialog {

    private TipodeSanidade tpvacina;

    public CadastroTipodeSanidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

  

  

    public void setEntidade(TipodeSanidade est) {
        tpvacina = est;
        tfvacina.setText(est.getDescricao());
    }

    private boolean validarCampos() {
        boolean valid = true;
        if (this.tfvacina.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Vacina está em Branco.",
                                  "Validar Vacina", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

       

        return valid;
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelgrup = new javax.swing.JPanel();
        jlgrupo = new javax.swing.JLabel();
        tfvacina = new javax.swing.JTextField();
        btconfirma = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        campoobrigatorio23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TFimune = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelgrup.setBorder(javax.swing.BorderFactory.createTitledBorder("Sanidade"));

        jlgrupo.setText("Nome da Vacina");

        tfvacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfvacinaActionPerformed(evt);
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

        campoobrigatorio23.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio23.setText("*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel3.setText("Campo Obrigatorio");

        campoobrigatorio24.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio24.setText("*");

        jLabel1.setText("Imune - Dias");

        javax.swing.GroupLayout painelgrupLayout = new javax.swing.GroupLayout(painelgrup);
        painelgrup.setLayout(painelgrupLayout);
        painelgrupLayout.setHorizontalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlgrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFimune, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(tfvacina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoobrigatorio23))
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(campoobrigatorio24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btcancelar)))
                .addContainerGap())
        );

        painelgrupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btcancelar, btconfirma});

        painelgrupLayout.setVerticalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlgrupo)
                    .addComponent(tfvacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFimune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoobrigatorio24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirma)
                    .addComponent(btcancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelgrup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfvacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfvacinaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfvacinaActionPerformed

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
        DAOGenerico<TipodeSanidade> dao = new DAOGenerico<TipodeSanidade>(TipodeSanidade.class);
if (validarCampos()){
        if (tpvacina == null) {
            TipodeSanidade est = new TipodeSanidade();
            est.setDescricao(tfvacina.getText());
             dao.insert(est);
        } else {
            validarCampos();
            tpvacina.setDescricao(tfvacina.getText());
             dao.update(tpvacina);
        }
        setVisible(false);
           JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        } else {

        limparcampos();
TFimune.requestFocus();
    }
}//GEN-LAST:event_btconfirmaActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        if (evt.getSource() == btcancelar) {
                 dispose();
        }
    }//GEN-LAST:event_btcancelarActionPerformed
   public void run() {
               CadastroTipodeSanidade dialogCadastroTipodeSanidade  = new CadastroTipodeSanidade (new javax.swing.JFrame(), true);
                dialogCadastroTipodeSanidade .addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogCadastroTipodeSanidade .setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFimune;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirma;
    private javax.swing.JLabel campoobrigatorio23;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlgrupo;
    private javax.swing.JPanel painelgrup;
    private javax.swing.JTextField tfvacina;
    // End of variables declaration//GEN-END:variables
private void limparcampos() {
            TFimune.setText("");
            tfvacina.setText("");
    }
}
