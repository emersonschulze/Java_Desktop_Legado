/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroDespesa.java
 *
 * Created on 29/05/2010, 09:53:55
 */
package Telas.cadastro;

import entidade.Despesa;
import entidade.DestinacaoDespesa;
import entidade.Fazenda;
import entidade.Produto;
import entidade.UnidadeMedida;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboFazenda;
import model.ComboProduto;
import model.ComboUnidadeMedida;
import model.ComboDestinacaoDespesa;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroDespesa extends javax.swing.JDialog {

    private Despesa despesa;

    public CadastroDespesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
//deletar linha abaixo teste

    public void setEntidade(Despesa cid) {
        despesa = cid;
        tfquant.setText(String.valueOf(cid.getQuantidade()));
       
        tfvalortotal.setText(String.valueOf(cid.getValorTotal()));
        combodesti.setModel(new ComboDestinacaoDespesa());
        combofaz.setModel(new ComboFazenda());
        comboprod.setModel(new ComboProduto());
        combounidade.setModel(new ComboUnidadeMedida());
        tfdati.setDate(cid.getDataDespesa());
    }

private void limparcampos() {
            tfquant.setText("");
            tfvalortotal.setText("");
           
        combodesti.setSelectedItem("");
        combofaz.setSelectedItem("");
        comboprod.setSelectedItem("");
        combounidade.setSelectedItem("");

    }
    private boolean validarCampos() {
        boolean valid = true;
        if (this.tfquant.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Quantidade está em Branco.",
                    "Validar Quantidade", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        if (this.tfvalortotal.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Valor Total está em Branco.",
                    "Validar Valor", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combodesti.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Destinação está em Branco",
                    "Validadar Destinação", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combounidade.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Unidade de Medida está em Branco",
                    "Validadar Unidade de Medida", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combofaz.getSelectedItem()== null) {
            JOptionPane.showMessageDialog(null, "O Campo Fazenda está em Branco",
                    "Validadar Fazenda ", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }


        if (this.comboprod.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Produto está em Branco",
                    "Validadar Produto", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
    if (this.tfdati.getDateFormatString().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Vencimento está em Branco.",
                    "Validar Vencimento", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        return valid;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tldespfaz = new javax.swing.JLabel();
        tldespdata = new javax.swing.JLabel();
        tldespprod = new javax.swing.JLabel();
        tldespquant = new javax.swing.JLabel();
        combofaz = new javax.swing.JComboBox();
        comboprod = new javax.swing.JComboBox();
        tfquant = new javax.swing.JTextField();
        tldespdestinaç = new javax.swing.JLabel();
        combodesti = new javax.swing.JComboBox();
        tldespbotaoconfirma = new javax.swing.JButton();
        tldespbotaocancelar = new javax.swing.JButton();
        campoobrigatorio13 = new javax.swing.JLabel();
        campoobrigatorio14 = new javax.swing.JLabel();
        campoobrigatorio15 = new javax.swing.JLabel();
        campoobrigatorio16 = new javax.swing.JLabel();
        campoobrigatorio17 = new javax.swing.JLabel();
        campoobrigatorio18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfdati = new com.toedter.calendar.JDateChooser();
        tldespvalor1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combounidade = new javax.swing.JComboBox();
        campoobrigatorio19 = new javax.swing.JLabel();
        campoobrigatorio20 = new javax.swing.JLabel();
        tfvalortotal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Despesas"));

        tldespfaz.setText("Fazenda");

        tldespdata.setText("Vencimento");

        tldespprod.setText("Produto");

        tldespquant.setText("Quantidade");

        combofaz.setModel(new ComboFazenda());
        combofaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combofazActionPerformed(evt);
            }
        });

        comboprod.setModel(new ComboProduto());

        tldespdestinaç.setText("Destinaçao");

        combodesti.setModel(new ComboDestinacaoDespesa());
        combodesti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodestiActionPerformed(evt);
            }
        });

        tldespbotaoconfirma.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        tldespbotaoconfirma.setText("Salvar");
        tldespbotaoconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tldespbotaoconfirmaActionPerformed(evt);
            }
        });

        tldespbotaocancelar.setIcon(new ImageIcon("src/icones/fecha.png"));
        tldespbotaocancelar.setText("Cancelar");
        tldespbotaocancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tldespbotaocancelarActionPerformed(evt);
            }
        });

        campoobrigatorio13.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio13.setText("*");

        campoobrigatorio14.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio14.setText("*");

        campoobrigatorio15.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio15.setText("*");

        campoobrigatorio16.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio16.setText("*");

        campoobrigatorio17.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio17.setText("*");

        campoobrigatorio18.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio18.setText("*");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel1.setText("Campo Obrigatorio");

        tldespvalor1.setText("Valor Total");

        jLabel2.setText("Uni. Medida");

        combounidade.setModel(new ComboUnidadeMedida());
        combounidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combounidadeActionPerformed(evt);
            }
        });

        campoobrigatorio19.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio19.setText("*");

        campoobrigatorio20.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio20.setText("*");

        tfvalortotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tldespfaz)
                        .addGap(18, 18, 18)
                        .addComponent(combofaz, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tldespprod)
                        .addGap(22, 22, 22)
                        .addComponent(comboprod, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tldespquant)
                        .addGap(4, 4, 4)
                        .addComponent(tfquant, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(campoobrigatorio15)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combounidade, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tldespdestinaç)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combodesti, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoobrigatorio18)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tldespdata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdati, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(tldespvalor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfvalortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoobrigatorio16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(tldespbotaoconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83)
                        .addComponent(tldespbotaocancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tldespbotaocancelar, tldespbotaoconfirma});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tldespfaz))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combofaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tldespprod))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoobrigatorio14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combounidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tldespquant))
                    .addComponent(tfquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(campoobrigatorio15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tldespdestinaç)
                    .addComponent(campoobrigatorio17)
                    .addComponent(combodesti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tldespvalor1)
                    .addComponent(tfvalortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tldespdata)
                    .addComponent(tfdati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoobrigatorio20))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoobrigatorio18)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tldespbotaoconfirma)
                    .addComponent(tldespbotaocancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combofazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combofazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combofazActionPerformed

    private void tldespbotaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tldespbotaocancelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_tldespbotaocancelarActionPerformed

    private void combodestiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodestiActionPerformed
      
    }//GEN-LAST:event_combodestiActionPerformed

    private void tldespbotaoconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tldespbotaoconfirmaActionPerformed
        DAOGenerico<Despesa> dao = new DAOGenerico<Despesa>(Despesa.class);
        if(validarCampos()){
        if (despesa == null) {
            Despesa cid = new Despesa();
            cid.setQuantidade(Double.valueOf(tfquant.getText()));
            cid.setValorTotal(Double.valueOf(tfvalortotal.getText()));
            cid.setDestinacaoDespesa((DestinacaoDespesa) combodesti.getSelectedItem());
            cid.setDataDespesa(tfdati.getDate());
            cid.setFazenda((Fazenda) combofaz.getSelectedItem());
            cid.setProduto((Produto) comboprod.getSelectedItem());
            cid.setUnidadeMedida((UnidadeMedida) combounidade.getSelectedItem());
            cid.setBaixaDespesa(false);
            dao.insert(cid);

        } else {
            validarCampos();
            despesa.setQuantidade(Double.valueOf(tfquant.getText()));
            despesa.setValorTotal(Double.valueOf(tfvalortotal.getText()));
            despesa.setDataDespesa(tfdati.getDate());
            despesa.setDestinacaoDespesa((DestinacaoDespesa) combodesti.getSelectedItem());
            despesa.setFazenda((Fazenda) combofaz.getSelectedItem());
            despesa.setProduto((Produto) comboprod.getSelectedItem());
            despesa.setUnidadeMedida((UnidadeMedida) combounidade.getSelectedItem());
            despesa.setBaixaDespesa(false);
            dao.update(despesa);
        }

        setVisible(false);
         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
        } else {
          
        limparcampos();

    }




    }//GEN-LAST:event_tldespbotaoconfirmaActionPerformed

    private void combounidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combounidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combounidadeActionPerformed

    public void run() {
        CadastroDespesa dialogDespesa = new CadastroDespesa(new javax.swing.JFrame(), true);
        dialogDespesa.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialogDespesa.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campoobrigatorio13;
    private javax.swing.JLabel campoobrigatorio14;
    private javax.swing.JLabel campoobrigatorio15;
    private javax.swing.JLabel campoobrigatorio16;
    private javax.swing.JLabel campoobrigatorio17;
    private javax.swing.JLabel campoobrigatorio18;
    private javax.swing.JLabel campoobrigatorio19;
    private javax.swing.JLabel campoobrigatorio20;
    private javax.swing.JComboBox combodesti;
    private javax.swing.JComboBox combofaz;
    private javax.swing.JComboBox comboprod;
    private javax.swing.JComboBox combounidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser tfdati;
    private javax.swing.JTextField tfquant;
    private javax.swing.JFormattedTextField tfvalortotal;
    private javax.swing.JButton tldespbotaocancelar;
    private javax.swing.JButton tldespbotaoconfirma;
    private javax.swing.JLabel tldespdata;
    private javax.swing.JLabel tldespdestinaç;
    private javax.swing.JLabel tldespfaz;
    private javax.swing.JLabel tldespprod;
    private javax.swing.JLabel tldespquant;
    private javax.swing.JLabel tldespvalor1;
    // End of variables declaration//GEN-END:variables
}
