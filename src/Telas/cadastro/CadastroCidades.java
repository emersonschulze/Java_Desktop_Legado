/**
 *
 * @author Emerson
 */
package Telas.cadastro;

import entidade.Cidade;
import entidade.Estado;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboEstado;
import util.AutoCompletion;
import util.DAOGenerico;

public class CadastroCidades extends javax.swing.JDialog {
    
    private Cidade cidade;

    public CadastroCidades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        preencheCombo();
    }
    
    public void setEntidade(Cidade cid) {
        cidade = cid;
        JTFCidNome.setText(cid.getNome());
        comboestado.setModel(new ComboEstado());
    }

    private void preencheCombo(){
    ComboEstado cbE=new ComboEstado();
    for (int x=0; x<cbE.getSize();x++){
        comboestado.addItem(cbE.getElementAt(x));
    }
    comboestado.updateUI();
    }
    
    private boolean validarCampos() {
        boolean valid = true;
        if (this.JTFCidNome.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Cidade está em Branco.",
                                       "Validar Cidade", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        if (this.comboestado.getSelectedItem()== null) {
           JOptionPane.showMessageDialog(null, "O campo Estado está em Branco",
                                             "Validar Estado", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        return valid;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btsalvar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        JLCidNome = new javax.swing.JLabel();
        JTFCidNome = new javax.swing.JTextField();
        JLCidEstado = new javax.swing.JLabel();
        comboestado = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoobrigatorio25 = new javax.swing.JLabel();
        campoobrigatorio26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("JFClientes"); // NOI18N

        btsalvar.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        btsalvar.setText("Salvar ");
        btsalvar.setToolTipText("Salvar Cidade");
        btsalvar.setPreferredSize(new java.awt.Dimension(141, 31));
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        btcancelar.setIcon(new ImageIcon("src/icones/fecha.png"));
        btcancelar.setText("Cancelar ");
        btcancelar.setToolTipText("Cancelar Cidade");
        btcancelar.setPreferredSize(new java.awt.Dimension(157, 31));
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        JLCidNome.setFont(new java.awt.Font("Tahoma", 0, 12));
        JLCidNome.setText("Nome:");

        JTFCidNome.setFont(new java.awt.Font("Arial", 0, 11));
        JTFCidNome.setToolTipText("Nome da Cidade");
        JTFCidNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFCidNomeFocusLost(evt);
            }
        });

        JLCidEstado.setFont(new java.awt.Font("Tahoma", 0, 12));
        JLCidEstado.setText("Estado:");

        comboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboestadoActionPerformed(evt);
            }
        });
        AutoCompletion.enable(comboestado);

        jLabel1.setText("Cadastro Cidade");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLCidEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboestado, 0, 210, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLCidNome)
                                .addGap(10, 10, 10)
                                .addComponent(JTFCidNome, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoobrigatorio26)
                            .addComponent(campoobrigatorio25)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoobrigatorio24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(JLCidNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFCidNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoobrigatorio26))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCidEstado)
                    .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoobrigatorio24)
                    .addComponent(jLabel3))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        DAOGenerico<Cidade> dao = new DAOGenerico<Cidade>(Cidade.class);
  if (validarCampos()){
        if (cidade == null) {
            
            Cidade cid = new Cidade();
                cid.setNome(JTFCidNome.getText());
                cid.setEstado((Estado) comboestado.getSelectedItem());
                dao.insert(cid);
        } else {
                validarCampos();
                cidade.setNome(JTFCidNome.getText());
                cidade.setEstado((Estado) comboestado.getSelectedItem());
                dao.update(cidade);
            }    
        setVisible(false);
         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
}//GEN-LAST:event_btsalvarActionPerformed

  else{
             
        limparcampos();
    JTFCidNome.requestFocus();
    }

    }
    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        if (evt.getSource() == btcancelar) {
                 dispose();
        }  
}//GEN-LAST:event_btcancelarActionPerformed

    private void JTFCidNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFCidNomeFocusLost
     /*   String txt = JTFCidNome.getText();
        if (JTFCidNome.getText().indexOf(txt) == -1) {
            JOptionPane.showMessageDialog(null,"O Nome está vazio.","Campo nome",JOptionPane.WARNING_MESSAGE);
            JTFCidNome.requestFocus();
        }*/
    }//GEN-LAST:event_JTFCidNomeFocusLost

    private void comboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboestadoActionPerformed
      
            public void run() {
               CadastroCidades dialogCidade = new CadastroCidades(new javax.swing.JFrame(), true);
                dialogCidade.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogCidade.setVisible(true);
             }  
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCidEstado;
    private javax.swing.JLabel JLCidNome;
    private javax.swing.JTextField JTFCidNome;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel campoobrigatorio25;
    private javax.swing.JLabel campoobrigatorio26;
    private javax.swing.JComboBox comboestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void limparcampos() {
            JTFCidNome.setText("");
        comboestado.setSelectedItem("");

    }


}