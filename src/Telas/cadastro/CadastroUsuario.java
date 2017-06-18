
package Telas.cadastro;

import entidade.Colaborador;
import entidade.Usuario;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboColaborador;
import util.DAOGenerico;
import util.EncriptaSenha;

/**
 *
 * @author Emerson
 */
public class CadastroUsuario extends javax.swing.JDialog {

    private Usuario usuario;
    private ComboBoxModel ComboColaborador;

    public CadastroUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

  

  

    public void setEntidade(Usuario est) {
        usuario = est;
        TFusuario.setText(est.getLogin());
       TFsenha.setText(est.getSenha());
       comboColaborador.setSelectedItem(est.getColaborador().getEmitente().getNome());
    }

    private boolean validarCampos() {
        boolean valid = true;
        return valid;
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelgrup = new javax.swing.JPanel();
        jlgrupo = new javax.swing.JLabel();
        TFusuario = new javax.swing.JTextField();
        btconfirma = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TFsenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        campoobrigatorio25 = new javax.swing.JLabel();
        campoobrigatorio26 = new javax.swing.JLabel();
        campoobrigatorio28 = new javax.swing.JLabel();
        comboColaborador = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelgrup.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionario"));

        jlgrupo.setText("Usuario");

        TFusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFusuarioActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Campo Obrigatorio");

        campoobrigatorio24.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio24.setText("*");

        jLabel1.setText("Senha");

        TFsenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFsenhaFocusLost(evt);
            }
        });
        TFsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsenhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        campoobrigatorio25.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio25.setText("*");

        campoobrigatorio26.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio26.setText("*");

        campoobrigatorio28.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio28.setText("*");

        comboColaborador.setModel(ComboColaborador
        );

        javax.swing.GroupLayout painelgrupLayout = new javax.swing.GroupLayout(painelgrup);
        painelgrup.setLayout(painelgrupLayout);
        painelgrupLayout.setHorizontalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoobrigatorio25, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(campoobrigatorio24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(painelgrupLayout.createSequentialGroup()
                                .addComponent(btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelgrupLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFsenha))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelgrupLayout.createSequentialGroup()
                                .addComponent(jlgrupo)
                                .addGap(1, 1, 1)
                                .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelgrupLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoobrigatorio28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelgrupLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(campoobrigatorio26)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        painelgrupLayout.setVerticalGroup(
            painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelgrupLayout.createSequentialGroup()
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelgrupLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(campoobrigatorio25))
                .addGap(7, 7, 7)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlgrupo)
                    .addComponent(TFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio26))
                .addGap(18, 18, 18)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoobrigatorio24))
                .addGap(55, 55, 55)
                .addGroup(painelgrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btconfirma)
                    .addComponent(btcancelar)))
        );

        painelgrupLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TFsenha, TFusuario});

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

        painelgrup.getAccessibleContext().setAccessibleName("Usuario");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFsenhaActionPerformed

    private void TFsenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFsenhaFocusLost
        TFsenha.setText(EncriptaSenha.encripta(TFsenha.getText()));
    }//GEN-LAST:event_TFsenhaFocusLost

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        if (evt.getSource() == btcancelar) {
            dispose();
        }
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
        DAOGenerico<Usuario> dao = new DAOGenerico<Usuario>(Usuario.class);
        if (validarCampos()){
            if (usuario == null) {
                Usuario est = new Usuario();
                est.setColaborador((Colaborador) comboColaborador.getSelectedItem());
                est.setLogin(TFusuario.getText());
                est.setSenha(TFsenha.getText());

                dao.insert(est);

            } else {
                validarCampos();
                usuario.setLogin(TFusuario.getText());
                usuario.setSenha(TFsenha.getText());
                usuario.setColaborador((Colaborador) comboColaborador.getSelectedItem());
                dao.update(usuario);
            }
            setVisible(false);
            JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        } else {

            limparcampos();
        }
    }//GEN-LAST:event_btconfirmaActionPerformed

    private void TFusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFusuarioActionPerformed
   public void run() {
               CadastroUsuario dialogUsuario  = new CadastroUsuario (new javax.swing.JFrame(), true);
                dialogUsuario.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogUsuario.setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TFsenha;
    private javax.swing.JTextField TFusuario;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirma;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel campoobrigatorio25;
    private javax.swing.JLabel campoobrigatorio26;
    private javax.swing.JLabel campoobrigatorio28;
    private javax.swing.JComboBox comboColaborador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlgrupo;
    private javax.swing.JPanel painelgrup;
    // End of variables declaration//GEN-END:variables
private void limparcampos() {
            TFsenha.setText("");
            TFusuario.setText("");
            
    }
}
