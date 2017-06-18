
package Telas.cadastro;

import entidade.DestinacaoDespesa;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroDestinacaoDespesa extends javax.swing.JDialog {

    private DestinacaoDespesa destinacaodespesa;

    public CadastroDestinacaoDespesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

  

  

    public void setEntidade(DestinacaoDespesa est) {
        destinacaodespesa = est;
        tfdestinacaodespesa.setText(est.getDescricao());
      
    }

    private boolean validarCampos() {
        boolean valid = true;
        if (this.tfdestinacaodespesa.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Destinação Despesa está em Branco.",
                                  "Validar Destinação Despesa ", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

       

        return valid;
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelgrup = new javax.swing.JPanel();
        jlgrupo = new javax.swing.JLabel();
        tfdestinacaodespesa = new javax.swing.JTextField();
        btconfirma = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        campoobrigatorio23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelgrup.setBorder(javax.swing.BorderFactory.createTitledBorder("Destinação Despesa"));

        jlgrupo.setText("Destinação Despesa");

        tfdestinacaodespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdestinacaodespesaActionPerformed(evt);
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

        javax.swing.GroupLayout painelgrupLayout = new javax.swing.GroupLayout(painelgrup);
        painelgrup.setLayout(painelgrupLayout);
        painelgrupLayout.setHorizontalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelgrupLayout.createSequentialGroup()
                                .addComponent(jlgrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdestinacaodespesa))
                            .addGroup(painelgrupLayout.createSequentialGroup()
                                .addComponent(btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btcancelar)))
                        .addGap(4, 4, 4)
                        .addComponent(campoobrigatorio23))
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(campoobrigatorio24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        painelgrupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btcancelar, btconfirma});

        painelgrupLayout.setVerticalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlgrupo)
                    .addComponent(tfdestinacaodespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio23))
                .addGap(31, 31, 31)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoobrigatorio24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirma)
                    .addComponent(btcancelar)))
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

    private void tfdestinacaodespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdestinacaodespesaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfdestinacaodespesaActionPerformed

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
        DAOGenerico<DestinacaoDespesa> dao = new DAOGenerico<DestinacaoDespesa>(DestinacaoDespesa.class);
if(validarCampos()){
        if (destinacaodespesa == null) {
            DestinacaoDespesa est = new DestinacaoDespesa();
            est.setDescricao(tfdestinacaodespesa.getText());
             dao.insert(est);
        } else {
            validarCampos();
            destinacaodespesa.setDescricao(tfdestinacaodespesa.getText());
             dao.update(destinacaodespesa);
        }
        setVisible(false);
                JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        }else
{
  limparcampos();
    tfdestinacaodespesa.requestFocus();
    }
        

}//GEN-LAST:event_btconfirmaActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        if (evt.getSource() == btcancelar) {
                 dispose();
        }
    }//GEN-LAST:event_btcancelarActionPerformed
   public void run() {
               CadastroDestinacaoDespesa dialogDestinacaoDespesa  = new CadastroDestinacaoDespesa (new javax.swing.JFrame(), true);
                dialogDestinacaoDespesa .addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogDestinacaoDespesa .setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirma;
    private javax.swing.JLabel campoobrigatorio23;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlgrupo;
    private javax.swing.JPanel painelgrup;
    private javax.swing.JTextField tfdestinacaodespesa;
    // End of variables declaration//GEN-END:variables
private void limparcampos() {
           tfdestinacaodespesa.setText("");


    }
}
