/*
 * CadastroPasto.java
 *
 * Created on 24/05/2010, 20:14:44
 */

package Telas.cadastro;

import entidade.Cultura;
import entidade.Fazenda;
import entidade.Pasto;
import entidade.UnidadeMedida;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboFazenda;
import model.ComboUnidadeMedida;
import model.Combocultura;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroPasto extends javax.swing.JDialog {
 private Pasto pasto;
    /** Creates new form CadastroPasto */
    public CadastroPasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void setEntidade(Pasto cid) {
        pasto = cid;
        tfnumeropasto.setText(cid.getNumero());
        combocultura.setSelectedItem(cid.getCultura());
        combofaz.setSelectedItem(cid.getFazenda());
        tfarea.setText(cid.getArea());
        combomedida.setSelectedItem(cid.getArea());
    }

    private boolean validarCampos() {
        boolean valid = true;
        if (this.tfarea.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Area está em Branco.",
                    "Validar Area", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        if (this.tfnumeropasto.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Numero do Pasto está em Branco.",
                    "Validar Numero Pasto", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combocultura.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Cultura está em Branco",
                    "Validadar Cultura", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combomedida.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Unidade de Medida está em Branco",
                    "Validadar Unidade de Medida", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combofaz.getSelectedItem()== null) {
            JOptionPane.showMessageDialog(null, "O Campo Fazenda está em Branco",
                    "Validadar Fazenda ", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
return valid;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadpastopainel = new javax.swing.JPanel();
        cadpastonumero = new javax.swing.JLabel();
        cadpastocultura = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btconfirma = new javax.swing.JButton();
        btcancela = new javax.swing.JButton();
        tfnumeropasto = new javax.swing.JTextField();
        campoobrigatorio18 = new javax.swing.JLabel();
        campoobrigatorio19 = new javax.swing.JLabel();
        campoobrigatorio20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combofaz = new javax.swing.JComboBox();
        combocultura = new javax.swing.JComboBox();
        campoobrigatorio21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfarea = new javax.swing.JTextField();
        combomedida = new javax.swing.JComboBox();
        campoobrigatorio22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cadpastopainel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pastos"));

        cadpastonumero.setText("Nº Pasto");

        cadpastocultura.setText("Cultura ");

        btconfirma.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        btconfirma.setText("Salvar");
        btconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconfirmaActionPerformed(evt);
            }
        });

        btcancela.setIcon(new ImageIcon("src/icones/fecha.png"));
        btcancela.setText("Cancelar");
        btcancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelaActionPerformed(evt);
            }
        });

        tfnumeropasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnumeropastoActionPerformed(evt);
            }
        });

        campoobrigatorio18.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio18.setText("*");

        campoobrigatorio19.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio19.setText("*");

        campoobrigatorio20.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio20.setText("*");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel1.setText("Campo Obrigatorio");

        jLabel2.setText("Fazenda");

        combofaz.setModel(new ComboFazenda());

        combocultura.setModel(new Combocultura());

        campoobrigatorio21.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio21.setText("*");

        jLabel3.setText("Area");

        combomedida.setModel(new ComboUnidadeMedida());

        campoobrigatorio22.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio22.setText("*");

        javax.swing.GroupLayout cadpastopainelLayout = new javax.swing.GroupLayout(cadpastopainel);
        cadpastopainel.setLayout(cadpastopainelLayout);
        cadpastopainelLayout.setHorizontalGroup(
            cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadpastopainelLayout.createSequentialGroup()
                .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addComponent(cadpastonumero)
                        .addGap(4, 4, 4)
                        .addComponent(tfnumeropasto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(campoobrigatorio18))
                    .addComponent(jLabel5)
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addComponent(campoobrigatorio20)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btcancela, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadpastopainelLayout.createSequentialGroup()
                        .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cadpastopainelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combofaz, 0, 201, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadpastopainelLayout.createSequentialGroup()
                                .addComponent(cadpastocultura)
                                .addGap(10, 10, 10)
                                .addComponent(combocultura, 0, 198, Short.MAX_VALUE))
                            .addGroup(cadpastopainelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(tfarea, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combomedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoobrigatorio19)
                                .addComponent(campoobrigatorio22))
                            .addComponent(campoobrigatorio21, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        cadpastopainelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btcancela, btconfirma});

        cadpastopainelLayout.setVerticalGroup(
            cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadpastopainelLayout.createSequentialGroup()
                .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cadpastonumero))
                    .addComponent(tfnumeropasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(campoobrigatorio18)))
                .addGap(6, 6, 6)
                .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(tfarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combomedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cadpastocultura))
                    .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combocultura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio19)))
                .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combofaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoobrigatorio21))))
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoobrigatorio20)
                    .addGroup(cadpastopainelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)))
                .addGap(11, 11, 11)
                .addGroup(cadpastopainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirma)
                    .addComponent(btcancela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        combofaz.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadpastopainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadpastopainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
       DAOGenerico<Pasto> dao = new DAOGenerico<Pasto>(Pasto.class);
if(validarCampos()){
        if (pasto == null) {
         
            Pasto est = new Pasto();
            est.setNumero(tfnumeropasto.getText());
             est.setArea(tfarea.getText());
            est.setCultura((Cultura) combocultura.getSelectedItem());
            est.setFazenda((Fazenda) combofaz.getSelectedItem());
            est.setUnidadeMedida((UnidadeMedida) combomedida.getSelectedItem());
            dao.insert(est);
        } else {
           
            pasto.setNumero(tfnumeropasto.getText());
             pasto.setArea(tfarea.getText());
            pasto.setCultura((Cultura) combocultura.getSelectedItem());
            pasto.setFazenda((Fazenda) combofaz.getSelectedItem());
            pasto.setUnidadeMedida((UnidadeMedida) combomedida.getSelectedItem());
            dao.update(pasto);
        }
        setVisible(false);
           JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        } else {

        limparcampos();
tfnumeropasto.requestFocus();
    }

    }//GEN-LAST:event_btconfirmaActionPerformed

    private void tfnumeropastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnumeropastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnumeropastoActionPerformed

    private void btcancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelaActionPerformed
  if (evt.getSource() == btcancela) {
                 dispose();
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btcancelaActionPerformed

    /**
    * @param args the command line arguments
    */
   public void run() {
               CadastroPasto dialogPasto = new CadastroPasto(new javax.swing.JFrame(), true);
                dialogPasto.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogPasto.setVisible(true);
             }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancela;
    private javax.swing.JButton btconfirma;
    private javax.swing.JLabel cadpastocultura;
    private javax.swing.JLabel cadpastonumero;
    private javax.swing.JPanel cadpastopainel;
    private javax.swing.JLabel campoobrigatorio18;
    private javax.swing.JLabel campoobrigatorio19;
    private javax.swing.JLabel campoobrigatorio20;
    private javax.swing.JLabel campoobrigatorio21;
    private javax.swing.JLabel campoobrigatorio22;
    private javax.swing.JComboBox combocultura;
    private javax.swing.JComboBox combofaz;
    private javax.swing.JComboBox combomedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfarea;
    private javax.swing.JTextField tfnumeropasto;
    // End of variables declaration//GEN-END:variables
private void limparcampos() {
            tfarea.setText("");
            tfnumeropasto.setText("");
             combocultura.setSelectedItem("");
        combofaz.setSelectedItem("");
        combomedida.setSelectedItem("");
    }
}

