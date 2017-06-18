
package Telas.cadastro;

import entidade.ClassificacaoLote;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroClassificacaoLote extends javax.swing.JDialog {

    private ClassificacaoLote classificacaolote;

    public CadastroClassificacaoLote(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

      public void setEntidade(ClassificacaoLote est) {
        classificacaolote = est;
        TFfase.setText(est.getDescricao());
        TFperiodo.setText(est.getPeriodo());
      
    }

      private void limparcampos() {
            TFfase.setText("");
        TFperiodo.setText("");

    }
    private boolean validarCampos() {
        boolean valid = true;
        if (this.TFfase.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Fase está em Branco.",
                                  "Validar Fase", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        if (this.TFperiodo.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Periodo está em Branco.",
                                  "Validar Periodo", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        return valid;
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelgrup = new javax.swing.JPanel();
        jlgrupo = new javax.swing.JLabel();
        TFfase = new javax.swing.JTextField();
        btconfirma = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        campoobrigatorio23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();
        TFperiodo = new javax.swing.JTextField();
        jlgrupo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelgrup.setBorder(javax.swing.BorderFactory.createTitledBorder("Classificação Lote"));

        jlgrupo.setText("Fase");

        TFfase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFfaseActionPerformed(evt);
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

        TFperiodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFperiodoActionPerformed(evt);
            }
        });

        jlgrupo1.setText("Periodo");

        javax.swing.GroupLayout painelgrupLayout = new javax.swing.GroupLayout(painelgrup);
        painelgrup.setLayout(painelgrupLayout);
        painelgrupLayout.setHorizontalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlgrupo)
                        .addGap(18, 18, 18)
                        .addComponent(TFfase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio23))
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelgrupLayout.createSequentialGroup()
                                .addComponent(btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelgrupLayout.createSequentialGroup()
                                .addComponent(campoobrigatorio24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))))
                .addGap(16, 16, 16))
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlgrupo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFperiodo, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        painelgrupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btcancelar, btconfirma});

        painelgrupLayout.setVerticalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlgrupo)
                    .addComponent(TFfase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio23))
                .addGap(5, 5, 5)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlgrupo1)
                    .addComponent(TFperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void TFfaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFfaseActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_TFfaseActionPerformed

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
        DAOGenerico<ClassificacaoLote> dao = new DAOGenerico<ClassificacaoLote>(ClassificacaoLote.class);
 if (validarCampos()){
        if (classificacaolote == null) {
            
           ClassificacaoLote est = new ClassificacaoLote();
            est.setDescricao(TFfase.getText());
            est.setPeriodo(TFperiodo.getText());
             dao.insert(est);
        } else {
            validarCampos();
            classificacaolote.setDescricao(TFfase.getText());
            classificacaolote.setPeriodo(TFperiodo.getText());
             dao.update(classificacaolote);
        }

        setVisible(false);
         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");

    }
    else{

        limparcampos();
    TFfase.requestFocus();


        }

}//GEN-LAST:event_btconfirmaActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        if (evt.getSource() == btcancelar) {
                 dispose();
        }
    }//GEN-LAST:event_btcancelarActionPerformed

    private void TFperiodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFperiodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFperiodoActionPerformed
   public void run() {
               CadastroClassificacaoLote dialogClassificacaoLote  = new CadastroClassificacaoLote (new javax.swing.JFrame(), true);
                dialogClassificacaoLote .addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogClassificacaoLote .setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFfase;
    private javax.swing.JTextField TFperiodo;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirma;
    private javax.swing.JLabel campoobrigatorio23;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlgrupo;
    private javax.swing.JLabel jlgrupo1;
    private javax.swing.JPanel painelgrup;
    // End of variables declaration//GEN-END:variables

}
