/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroProduto.java
 *
 * Created on 31/05/2010, 19:49:54
 */

package Telas.cadastro;

import entidade.Grupo;
import entidade.Produto;
import entidade.UnidadeMedida;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboGrupo;
import model.ComboUnidadeMedida;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroProduto extends javax.swing.JDialog {
 private Produto produto;
   private TMcadastroGrupo grupo;

    public CadastroProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
public void setEntidade(Produto cid) {
        produto = cid;
        tfproduto.setText(cid.getDescricao());
        combogrupo.setModel(new ComboGrupo());
        combomedida.setModel(new ComboUnidadeMedida());


    }


       private boolean validarCampos() {
        boolean valid = true;
        if (this.tfproduto.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Produto está em Branco.",
                                  "Validar Produto", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
             if (this.combogrupo.getSelectedItem() == null) {
           JOptionPane.showMessageDialog(null, "O Campo Grupo  está em Branco",
                                             "Validadar Grupo", JOptionPane.WARNING_MESSAGE);
            valid = false;
             }

       if (this.combomedida.getSelectedItem()== null) {
           JOptionPane.showMessageDialog(null, "O Campo Unidade de Medida está em Branco",
                                             "Validadar Unidade ", JOptionPane.WARNING_MESSAGE);
            valid = false;
             }
        return valid;
             }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelproduto2 = new javax.swing.JPanel();
        cadprodnome = new javax.swing.JLabel();
        cadproddescriçao = new javax.swing.JLabel();
        tfproduto = new javax.swing.JTextField();
        combogrupo = new javax.swing.JComboBox();
        cadprodbotaoconfirma = new javax.swing.JButton();
        btcancela = new javax.swing.JButton();
        campoobrigatorio1 = new javax.swing.JLabel();
        campoobrigatorio2 = new javax.swing.JLabel();
        campoobrigatorio3 = new javax.swing.JLabel();
        campoobrigatorio4 = new javax.swing.JLabel();
        campoobrig = new javax.swing.JLabel();
        unidadedemedida = new javax.swing.JLabel();
        combomedida = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelproduto2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        cadprodnome.setText("Produto");

        cadproddescriçao.setText("Grupo");

        tfproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprodutoActionPerformed(evt);
            }
        });

        combogrupo.setModel(new model.ComboGrupo());
        combogrupo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combogrupoItemStateChanged(evt);
            }
        });
        combogrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogrupoActionPerformed(evt);
            }
        });

        cadprodbotaoconfirma.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        cadprodbotaoconfirma.setText("Salvar");
        cadprodbotaoconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadprodbotaoconfirmaActionPerformed(evt);
            }
        });

        btcancela.setIcon(new ImageIcon("src/icones/fecha.png"));
        btcancela.setText("Cancelar");
        btcancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelaActionPerformed(evt);
            }
        });

        campoobrigatorio1.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio1.setText("*");

        campoobrigatorio2.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio2.setText("*");

        campoobrigatorio3.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio3.setText("*");

        campoobrigatorio4.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio4.setText("*");

        campoobrig.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        campoobrig.setText("Campo Obrigatorio");

        unidadedemedida.setText("Unidade de Medida");

        combomedida.setModel(new ComboUnidadeMedida());

        javax.swing.GroupLayout painelproduto2Layout = new javax.swing.GroupLayout(painelproduto2);
        painelproduto2.setLayout(painelproduto2Layout);
        painelproduto2Layout.setHorizontalGroup(
            painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelproduto2Layout.createSequentialGroup()
                .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelproduto2Layout.createSequentialGroup()
                        .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelproduto2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(unidadedemedida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combomedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelproduto2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cadprodnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelproduto2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(campoobrigatorio1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelproduto2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoobrigatorio2))))
                    .addGroup(painelproduto2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelproduto2Layout.createSequentialGroup()
                                .addComponent(cadproddescriçao)
                                .addGap(70, 70, 70)
                                .addComponent(combogrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelproduto2Layout.createSequentialGroup()
                                .addComponent(campoobrigatorio4)
                                .addGap(6, 6, 6)
                                .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelproduto2Layout.createSequentialGroup()
                                        .addComponent(cadprodbotaoconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btcancela, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoobrig))))
                        .addComponent(campoobrigatorio3)))
                .addContainerGap())
        );

        painelproduto2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btcancela, cadprodbotaoconfirma});

        painelproduto2Layout.setVerticalGroup(
            painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelproduto2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio1)
                    .addComponent(cadprodnome))
                .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelproduto2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(campoobrigatorio2))
                    .addGroup(painelproduto2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combomedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidadedemedida))))
                .addGap(5, 5, 5)
                .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelproduto2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cadproddescriçao))
                    .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelproduto2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(campoobrigatorio3))
                        .addComponent(combogrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoobrigatorio4)
                    .addGroup(painelproduto2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(campoobrig)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelproduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadprodbotaoconfirma)
                    .addComponent(btcancela))
                .addGap(11, 11, 11))
        );

        combogrupo.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelproduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelproduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combogrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combogrupoActionPerformed

    private void btcancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelaActionPerformed
if (evt.getSource() == btcancela) {
                 dispose();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btcancelaActionPerformed

    private void cadprodbotaoconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadprodbotaoconfirmaActionPerformed
    DAOGenerico<Produto> dao = new DAOGenerico<Produto>(Produto.class);
if (validarCampos()){
        if (produto == null) {
            
            Produto est = new Produto();
            est.setDescricao(tfproduto.getText());
             est.setUnidadeMedida((UnidadeMedida) combomedida.getSelectedItem());
             est.setGrupo((Grupo) combogrupo.getSelectedItem());
            dao.insert(est);
        } else {
            validarCampos();
           produto.setDescricao(tfproduto.getText());
            produto.setGrupo((Grupo) combogrupo.getSelectedItem());
            produto.setUnidadeMedida((UnidadeMedida) combomedida.getSelectedItem());
            dao.update(produto);
        }
        setVisible(false);
         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        } else {

        limparcampos();
tfproduto.requestFocus();
    }



    }//GEN-LAST:event_cadprodbotaoconfirmaActionPerformed

    private void tfprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprodutoActionPerformed
         String txt = tfproduto.getText();
        if (tfproduto.getText().indexOf(txt) == -1) {
            JOptionPane.showMessageDialog(null,"O Nome está vazio.","Campo Produto",JOptionPane.WARNING_MESSAGE);
            tfproduto.requestFocus();
        }
    }//GEN-LAST:event_tfprodutoActionPerformed

    private void combogrupoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combogrupoItemStateChanged
  //combosubgrupo.setModel(new ComboSubGrupo((Grupo) combosubgrupo.getSelectedItem()));
    //    combosubgrupo.updateUI();

    }//GEN-LAST:event_combogrupoItemStateChanged


    public void run() {
               CadastroProduto dialogProduto = new CadastroProduto(new javax.swing.JFrame(), true);
                dialogProduto.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogProduto.setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancela;
    private javax.swing.JButton cadprodbotaoconfirma;
    private javax.swing.JLabel cadproddescriçao;
    private javax.swing.JLabel cadprodnome;
    private javax.swing.JLabel campoobrig;
    private javax.swing.JLabel campoobrigatorio1;
    private javax.swing.JLabel campoobrigatorio2;
    private javax.swing.JLabel campoobrigatorio3;
    private javax.swing.JLabel campoobrigatorio4;
    private javax.swing.JComboBox combogrupo;
    private javax.swing.JComboBox combomedida;
    private javax.swing.JPanel painelproduto2;
    private javax.swing.JTextField tfproduto;
    private javax.swing.JLabel unidadedemedida;
    // End of variables declaration//GEN-END:variables

    private void limparcampos() {
        tfproduto.setText("");
        combogrupo.setSelectedItem("");
        combomedida.setSelectedItem("");
        
    }

}
