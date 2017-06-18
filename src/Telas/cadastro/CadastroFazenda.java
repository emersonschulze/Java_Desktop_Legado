
package Telas.cadastro;

import entidade.Cidade;
import entidade.Fazenda;
import entidade.UnidadeMedida;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboCidade;
import model.ComboUnidadeMedida;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class CadastroFazenda extends javax.swing.JDialog {
 private Fazenda fazenda;
    private Object tfporcetagemPropriedade;
   
    public CadastroFazenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
public void setEntidade(Fazenda cid) {
        fazenda = cid;
        tfarea.setText(cid.getArea());
        tfbairro.setText(cid.getBairro());
        tfcgc.setColumns(cid.getCgc());
        tfemail.setText(cid.getEmail());
        tfendereco.setText(cid.getEndereco());
        tffone.setText(cid.getTelefone());
        tfincra.setColumns(cid.getNumeroIncra());
        tfnomefan.setText(cid.getNomeFantasia());
        tfproprietario.setText(cid.getProprietario().getPessoa().getNome());
        tfrazao.setText(cid.getRazaoSocial());
     
    }
     private boolean validarCampos() {
        boolean valid = true;
        if (this.tfproprietario.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Proprietario está em Branco.",
                                       "Validar Proprietario", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

        if (this.tfcgc.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo CGC está em Branco.",
                                       "Validar CGC", JOptionPane.WARNING_MESSAGE);

            valid = false;
        }
 if (this.tfincra.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Numero do Incra está em Branco.",
                                       "Validar Incra", JOptionPane.WARNING_MESSAGE);

            valid = false;
        }

         if (this.tfnomefan.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Fantasia está em Branco.",
                                       "Validar Fantasia", JOptionPane.WARNING_MESSAGE);

            valid = false;
        }

         if (this.tfrazao.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Razão Social está em Branco.",
                                       "Validar Razão", JOptionPane.WARNING_MESSAGE);

            valid = false;
        }

         if (this.tfendereco.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Endereço está em Branco.",
                                       "Validar Endereço", JOptionPane.WARNING_MESSAGE);

            valid = false;
        }

         if (this.tfarea.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Area está em Branco.",
                                       "Validar Area", JOptionPane.WARNING_MESSAGE);

            valid = false;
        }
        
        return valid;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnfaz = new javax.swing.JPanel();
        cadfaznomefantas = new javax.swing.JLabel();
        cadfazrazao = new javax.swing.JLabel();
        cadfazcgc = new javax.swing.JLabel();
        cadfaznincra = new javax.swing.JLabel();
        cadfazender = new javax.swing.JLabel();
        cadfazbairr = new javax.swing.JLabel();
        cadfazfone = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfnomefan = new javax.swing.JTextField();
        tfrazao = new javax.swing.JTextField();
        tfcgc = new javax.swing.JTextField();
        tfincra = new javax.swing.JTextField();
        tfendereco = new javax.swing.JTextField();
        tfbairro = new javax.swing.JTextField();
        tffone = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        Obrigatorio11 = new javax.swing.JLabel();
        Obrigatorio12 = new javax.swing.JLabel();
        Obrigatorio13 = new javax.swing.JLabel();
        Obrigatorio14 = new javax.swing.JLabel();
        Obrigatorio15 = new javax.swing.JLabel();
        cadfaznomeproprie = new javax.swing.JLabel();
        tfproprietario = new javax.swing.JTextField();
        Obrigatorio17 = new javax.swing.JLabel();
        cadfazbotaoconfirma = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        area = new javax.swing.JLabel();
        tfarea = new javax.swing.JTextField();
        Obrigatorio18 = new javax.swing.JLabel();
        jlcidade = new javax.swing.JLabel();
        combocidade = new javax.swing.JComboBox();
        Obrigatorio19 = new javax.swing.JLabel();
        Obrigatorio20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Obrigatorio21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combounimedida = new javax.swing.JComboBox();
        tfPorcentagem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnfaz.setBorder(javax.swing.BorderFactory.createTitledBorder("Fazenda"));

        cadfaznomefantas.setText("Nome Fantasia");

        cadfazrazao.setText("Razao Social");

        cadfazcgc.setText("C.G.C");

        cadfaznincra.setText("Nº Incra");

        cadfazender.setText("Endereço");

        cadfazbairr.setText("Bairro");

        cadfazfone.setText("Fone");

        jLabel8.setText("E-Mail");

        tfcgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcgcActionPerformed(evt);
            }
        });

        tfincra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfincraActionPerformed(evt);
            }
        });

        Obrigatorio11.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio11.setText("*");

        Obrigatorio12.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio12.setText("*");

        Obrigatorio13.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio13.setText("*");

        Obrigatorio14.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio14.setText("*");

        Obrigatorio15.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio15.setText("*");

        cadfaznomeproprie.setText("Proprietario");

        Obrigatorio17.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio17.setText("*");

        cadfazbotaoconfirma.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        cadfazbotaoconfirma.setText("Salvar");
        cadfazbotaoconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadfazbotaoconfirmaActionPerformed(evt);
            }
        });

        btsair.setIcon(new ImageIcon("src/icones/fecha.png"));
        btsair.setText("Cancelar");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        area.setText("Area");

        Obrigatorio18.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio18.setText("*");

        jlcidade.setText("Cidade");

        combocidade.setModel(new ComboCidade());

        Obrigatorio19.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio19.setText("*");

        Obrigatorio20.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio20.setText("*");

        jLabel1.setText("Campo Obrigatório");

        Obrigatorio21.setForeground(new java.awt.Color(255, 0, 0));
        Obrigatorio21.setText("*");

        jLabel2.setText("U. Medida");

        combounimedida.setModel(new ComboUnidadeMedida());

        jLabel3.setText("Porcentagem");

        javax.swing.GroupLayout pnfazLayout = new javax.swing.GroupLayout(pnfaz);
        pnfaz.setLayout(pnfazLayout);
        pnfazLayout.setHorizontalGroup(
            pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnfazLayout.createSequentialGroup()
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addComponent(cadfaznomefantas)
                        .addGap(4, 4, 4)
                        .addComponent(tfnomefan, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Obrigatorio11))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadfazrazao)
                            .addComponent(cadfazcgc))
                        .addGap(15, 15, 15)
                        .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfrazao, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnfazLayout.createSequentialGroup()
                                .addComponent(tfcgc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(Obrigatorio13)
                                .addGap(6, 6, 6)
                                .addComponent(cadfaznincra)
                                .addGap(4, 4, 4)
                                .addComponent(tfincra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Obrigatorio12)
                            .addComponent(Obrigatorio14)
                            .addComponent(Obrigatorio15)))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addComponent(cadfazender)
                        .addGap(30, 30, 30)
                        .addComponent(tfendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Obrigatorio21))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addComponent(cadfazbairr)
                        .addGap(46, 46, 46)
                        .addComponent(tfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addGap(42, 42, 42)
                        .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(cadfazbotaoconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnfazLayout.createSequentialGroup()
                                .addComponent(area)
                                .addGap(49, 49, 49)
                                .addComponent(tfarea, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Obrigatorio18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combounimedida, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadfazfone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tffone))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnfazLayout.createSequentialGroup()
                                .addComponent(jlcidade)
                                .addGap(39, 39, 39)
                                .addComponent(combocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(Obrigatorio19))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnfazLayout.createSequentialGroup()
                                .addComponent(Obrigatorio20)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnfazLayout.createSequentialGroup()
                                .addComponent(cadfaznomeproprie)
                                .addGap(14, 14, 14)
                                .addComponent(tfproprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(Obrigatorio17)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnfazLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btsair, cadfazbotaoconfirma});

        pnfazLayout.setVerticalGroup(
            pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnfazLayout.createSequentialGroup()
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cadfaznomefantas))
                    .addComponent(tfnomefan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Obrigatorio11))
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cadfazrazao)
                        .addGap(12, 12, 12)
                        .addComponent(cadfazcgc))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tfrazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcgc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfincra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnfazLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Obrigatorio13)
                                    .addComponent(cadfaznincra)))))
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addComponent(Obrigatorio12)
                        .addGap(6, 6, 6)
                        .addComponent(Obrigatorio14)
                        .addGap(6, 6, 6)
                        .addComponent(Obrigatorio15)))
                .addGap(4, 4, 4)
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cadfazender))
                    .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Obrigatorio21)))
                .addGap(6, 6, 6)
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cadfazbairr))
                    .addComponent(tfbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(area))
                    .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tffone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cadfazfone))
                    .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Obrigatorio18)
                        .addComponent(jLabel2)
                        .addComponent(combounimedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlcidade)
                            .addComponent(Obrigatorio19))))
                .addGap(11, 11, 11)
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfproprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnfazLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadfaznomeproprie)
                            .addComponent(Obrigatorio17))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Obrigatorio20)
                        .addComponent(jLabel1))
                    .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadfazbotaoconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btsair.getAccessibleContext().setAccessibleParent(this);
        combocidade.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfcgcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcgcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcgcActionPerformed

    private void tfincraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfincraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfincraActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
if (evt.getSource() == btsair) {
                 dispose();
}// TODO add your handling code here:
    }//GEN-LAST:event_btsairActionPerformed

    private void cadfazbotaoconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadfazbotaoconfirmaActionPerformed
      DAOGenerico<Fazenda> dao = new DAOGenerico<Fazenda>(Fazenda.class);
if (validarCampos()){
        if (fazenda == null) {
            
            Fazenda est = new Fazenda();
            est.setArea(tfarea.getText());
            est.setBairro(tfbairro.getText());
            est.setCgc(tfcgc.getColumns());
            est.setEmail(tfemail.getText());
            est.setEndereco(tfendereco.getText());
            est.setTelefone(tffone.getText());
            est.setNumeroIncra(tfincra.getColumns());
            est.setNomeFantasia(tfnomefan.getText());
            est.getProprietario().getPessoa().setNome(tfproprietario.getText());
            est.getProprietario().setPorcentagemPropriedade(tfPorcentagem.getText());
            est.setRazaoSocial(tfrazao.getText());
            est.setCidade((Cidade)combocidade.getSelectedItem());
            est.setUnidadedemedida((UnidadeMedida)combounimedida.getSelectedItem());
            dao.insert(est);

        } else {
            validarCampos();
            fazenda.setArea(tfarea.getText());
            fazenda.setBairro(tfbairro.getText());
            fazenda.setCgc(tfcgc.getColumns());
            fazenda.setEmail(tfemail.getText());
            fazenda.setEndereco(tfendereco.getText());
            fazenda.setTelefone(tffone.getText());
            fazenda.setNumeroIncra(tfincra.getColumns());
            fazenda.setNomeFantasia(tfnomefan.getText());
            fazenda.getProprietario().getPessoa().setNome(tfproprietario.getText());
            fazenda.getProprietario().setPorcentagemPropriedade(tfPorcentagem.getText());
            fazenda.setRazaoSocial(tfrazao.getText());
            fazenda.setCidade((Cidade)combocidade.getSelectedItem());
            fazenda.setUnidadedemedida((UnidadeMedida)combounimedida.getSelectedItem());
             dao.update(fazenda);
        }
        setVisible(false);
              JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");
}

  else{

        limparcampos();
    tfnomefan.requestFocus();
    }
    }//GEN-LAST:event_cadfazbotaoconfirmaActionPerformed

   public void run() {
               CadastroFazenda dialogFazenda = new CadastroFazenda(new javax.swing.JFrame(), true);
                dialogFazenda.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                    }
                });
                dialogFazenda.setVisible(true);
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Obrigatorio11;
    private javax.swing.JLabel Obrigatorio12;
    private javax.swing.JLabel Obrigatorio13;
    private javax.swing.JLabel Obrigatorio14;
    private javax.swing.JLabel Obrigatorio15;
    private javax.swing.JLabel Obrigatorio17;
    private javax.swing.JLabel Obrigatorio18;
    private javax.swing.JLabel Obrigatorio19;
    private javax.swing.JLabel Obrigatorio20;
    private javax.swing.JLabel Obrigatorio21;
    private javax.swing.JLabel area;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel cadfazbairr;
    private javax.swing.JButton cadfazbotaoconfirma;
    private javax.swing.JLabel cadfazcgc;
    private javax.swing.JLabel cadfazender;
    private javax.swing.JLabel cadfazfone;
    private javax.swing.JLabel cadfaznincra;
    private javax.swing.JLabel cadfaznomefantas;
    private javax.swing.JLabel cadfaznomeproprie;
    private javax.swing.JLabel cadfazrazao;
    private javax.swing.JComboBox combocidade;
    private javax.swing.JComboBox combounimedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlcidade;
    private javax.swing.JPanel pnfaz;
    private javax.swing.JTextField tfPorcentagem;
    private javax.swing.JTextField tfarea;
    private javax.swing.JTextField tfbairro;
    private javax.swing.JTextField tfcgc;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfendereco;
    private javax.swing.JTextField tffone;
    private javax.swing.JTextField tfincra;
    private javax.swing.JTextField tfnomefan;
    private javax.swing.JTextField tfproprietario;
    private javax.swing.JTextField tfrazao;
    // End of variables declaration//GEN-END:variables

   private void limparcampos() {
            tfarea.setText("");
            tfbairro.setText("");
            tfcgc.setText("");
            tfemail.setText("");
            tfendereco.setText("");
            tffone.setText("");
            tfincra.setText("");
            tfnomefan.setText("");
            tfnomefan.setText("");
            tfnomefan.setText("");
            tfproprietario.setText("");
            tfrazao.setText("");
        combocidade.setSelectedItem("");
        combounimedida.setSelectedItem("");

    }
}
