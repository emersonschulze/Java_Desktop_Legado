/**
 *

 */
package Telas.cadastro;

import entidade.Estado;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.DAOGenerico;

public class CadastroEstado extends javax.swing.JDialog {
    
    private Estado estado;

    public CadastroEstado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);       
    }
    
    public void setEntidade(Estado est) {
        estado = est;
        tfestado.setText(est.getNome());
        tfsigla.setText(est.getSigla());
    }

    private boolean validarCampos() {
        boolean valid = true;
        if (this.tfestado.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Estado está em Branco.",
                                  "Validar Estado", JOptionPane.WARNING_MESSAGE);
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

        JBEstSalvar = new javax.swing.JButton();
        JBEstCancelar = new javax.swing.JButton();
        JLEstNome = new javax.swing.JLabel();
        tfestado = new javax.swing.JTextField();
        JLEstSigla = new javax.swing.JLabel();
        tfsigla = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoobrigatorio25 = new javax.swing.JLabel();
        campoobrigatorio26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        JBEstSalvar.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        JBEstSalvar.setText("Salvar ");
        JBEstSalvar.setToolTipText("Salvar Estado");
        JBEstSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstSalvarActionPerformed(evt);
            }
        });

        JBEstCancelar.setIcon(new ImageIcon("src/icones/fecha.png"));
        JBEstCancelar.setText("Cancelar ");
        JBEstCancelar.setToolTipText("Cancelar Estado");
        JBEstCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEstCancelarActionPerformed(evt);
            }
        });

        JLEstNome.setFont(new java.awt.Font("Tahoma", 0, 12));
        JLEstNome.setText("Nome:");

        tfestado.setFont(new java.awt.Font("Arial", 0, 11));
        tfestado.setToolTipText("Nome do Estado");

        JLEstSigla.setFont(new java.awt.Font("Tahoma", 0, 12));
        JLEstSigla.setText("Sigla:");

        tfsigla.setFont(new java.awt.Font("Arial", 0, 11));
        tfsigla.setToolTipText("Sigla do Estado");

        jLabel1.setText("Cadastro Estado");

        campoobrigatorio24.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio24.setText("*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel3.setText("Campo Obrigatorio");

        campoobrigatorio25.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio25.setText("*");

        campoobrigatorio26.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio26.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLEstNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfestado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio26))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JBEstSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(JLEstSigla)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfsigla))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(campoobrigatorio24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoobrigatorio25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBEstCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEstNome)
                    .addComponent(tfestado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEstSigla)
                    .addComponent(tfsigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio25))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoobrigatorio24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEstSalvar)
                    .addComponent(JBEstCancelar))
                .addGap(23, 23, 23))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-265)/2, (screenSize.height-169)/2, 265, 169);
    }// </editor-fold>//GEN-END:initComponents

    private void JBEstCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstCancelarActionPerformed
        if (evt.getSource() == JBEstCancelar) {                
                 dispose();
        }  
}//GEN-LAST:event_JBEstCancelarActionPerformed

    private void JBEstSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEstSalvarActionPerformed
        DAOGenerico<Estado> dao = new DAOGenerico<Estado>(Estado.class);
        if (validarCampos()){
        if (estado == null) {
            Estado est = new Estado();
            est.setNome(tfestado.getText());
            est.setSigla(tfsigla.getText());
            dao.insert(est);
        } else {
            validarCampos();
            estado.setNome(tfestado.getText());
            estado.setSigla(tfsigla.getText());
            dao.update(estado);
        }
        setVisible(false);
         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        }else{
            limparCampos();
            tfestado.requestFocus();

        }
}//GEN-LAST:event_JBEstSalvarActionPerformed
      
            public void run() {
               CadastroEstado dialogEstado = new CadastroEstado(new javax.swing.JFrame(), true);
                dialogEstado.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogEstado.setVisible(true);
             }  
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEstCancelar;
    private javax.swing.JButton JBEstSalvar;
    private javax.swing.JLabel JLEstNome;
    private javax.swing.JLabel JLEstSigla;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel campoobrigatorio25;
    private javax.swing.JLabel campoobrigatorio26;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfestado;
    private javax.swing.JTextField tfsigla;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        tfestado.setText("");
        tfsigla.setText("");
    }

    
    
}