
package Telas.cadastro;

import entidade.ServicoDeManutencao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroServicodeManutencao extends javax.swing.JDialog {

    private ServicoDeManutencao servicodemanutencao;

    public CadastroServicodeManutencao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

      public void setEntidade(ServicoDeManutencao est) {
        servicodemanutencao = est;
        TFservico.setText(est.getDescricao());
       
      
    }

    private boolean validarCampos() {
        boolean valid = true;
        if (this.TFservico.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Serviço Fase está em Branco.",
                                  "Validar Serviço", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }


        return valid;
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelgrup = new javax.swing.JPanel();
        jlgrupo = new javax.swing.JLabel();
        TFservico = new javax.swing.JTextField();
        btconfirma = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        campoobrigatorio23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();
        campoobrigatorio25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelgrup.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviço de Manutenção"));

        jlgrupo.setText("Serviço");

        TFservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFservicoActionPerformed(evt);
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

        campoobrigatorio25.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout painelgrupLayout = new javax.swing.GroupLayout(painelgrup);
        painelgrup.setLayout(painelgrupLayout);
        painelgrupLayout.setHorizontalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelgrupLayout.createSequentialGroup()
                                .addComponent(jlgrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFservico, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addGap(4, 4, 4)
                                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoobrigatorio23)
                                    .addComponent(campoobrigatorio25))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelgrupLayout.createSequentialGroup()
                                .addComponent(btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btcancelar))))
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
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlgrupo)
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFservico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoobrigatorio23))
                        .addGap(5, 5, 5)
                        .addComponent(campoobrigatorio25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoobrigatorio24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcancelar)
                    .addComponent(btconfirma)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFservicoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_TFservicoActionPerformed

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
        DAOGenerico<ServicoDeManutencao> dao = new DAOGenerico<ServicoDeManutencao>(ServicoDeManutencao.class);
if(validarCampos()){
        if (servicodemanutencao == null) {
            
           ServicoDeManutencao est = new ServicoDeManutencao();
            est.setDescricao(TFservico.getText());
           
             dao.insert(est);
        } else {
            validarCampos();
            servicodemanutencao.setDescricao(TFservico.getText());
           
             dao.update(servicodemanutencao);
        }
        setVisible(false);
         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        } else {

        limparcampos();
TFservico.requestFocus();
    }

}//GEN-LAST:event_btconfirmaActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        if (evt.getSource() == btcancelar) {
                 dispose();
        }
    }//GEN-LAST:event_btcancelarActionPerformed
   public void run() {
               CadastroServicodeManutencao dialogServicodeManutencao  = new CadastroServicodeManutencao (new javax.swing.JFrame(), true);
                dialogServicodeManutencao .addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogServicodeManutencao .setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFservico;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirma;
    private javax.swing.JLabel campoobrigatorio23;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel campoobrigatorio25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlgrupo;
    private javax.swing.JPanel painelgrup;
    // End of variables declaration//GEN-END:variables

    

    private void limparcampos() {
         TFservico.setText("");


    }
}
