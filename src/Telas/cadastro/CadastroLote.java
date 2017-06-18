/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroLote.java
 *
 * Created on 16/05/2010, 09:42:09
 */
package Telas.cadastro;

import entidade.ClassificacaoLote;
import entidade.Fazenda;
import entidade.Lote;
import entidade.Pasto;
import entidade.Raca;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ComboFazenda;
import model.ComboPasto;
import model.ComboRaca;
import model.ComboClassificacaoLote;
import util.DAOGenerico;


/*
 * @author Emerson
 */
public class CadastroLote extends javax.swing.JDialog {

    private Lote lote;

    public CadastroLote(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        habilitaCampos(false, false);
        botao(true, true, true);
    }
//deletar linha abaixo teste

    private void botao(Boolean... b) {
        SLmacho.setEnabled(b[0]);
        SLfemea.setEnabled(b[1]);
        SLmf.setEnabled(b[2]);

    }

    private void habilitaCampos(Boolean m, Boolean f) {
        tffemea.setEnabled(f);
        tfmacho.setEnabled(m);

    }

    public void setEntidade(Lote cid) {
        lote = cid;
        tflote.setText(cid.getNumeroLote());
        dati.setDate(cid.getData());
        tfquantidade.setText(String.valueOf(cid.getQuantidadeTotal()));
        tffemea.setText(String.valueOf(cid.getQuantidadeFemea()));
        tfmacho.setText(String.valueOf(cid.getQuantidadeMacho()));
        tfcomentario.setText(cid.getDescricao());
        combodestinacao.setModel(new ComboClassificacaoLote());
        comboraca.setModel(new ComboRaca());
        combopasto.setModel(new ComboPasto());
        combofaz.setModel(new ComboFazenda());

    }

    private void limparcampos() {
        tfcomentario.setText("");
        tffemea.setText("");
        tflote.setText("");
        tfmacho.setText("");
        tfquantidade.setText("");
        combodestinacao.setSelectedItem("");
        combofaz.setSelectedItem("");
        combopasto.setSelectedItem("");
        comboraca.setSelectedItem("");

    }

    private boolean validarCampos() {
        boolean valid = true;
        if (this.tflote.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "O Campo Nome Numero do Lote está em Branco.",
                    "Validar Lote", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }

       
        if (this.combodestinacao.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Destinação está em Branco",
                    "Validadar Destinação", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }
        if (this.combopasto.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Pasto está em Branco",
                    "Validadar Pasto ", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }


        if (this.comboraca.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "O Campo Raça está em Branco",
                    "Validadar Raça", JOptionPane.WARNING_MESSAGE);
            valid = false;
        }


        return valid;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dateUtil1 = new com.toedter.calendar.DateUtil();
        jPanel1 = new javax.swing.JPanel();
        clnlot = new javax.swing.JLabel();
        tflote = new javax.swing.JTextField();
        clinformpasto = new javax.swing.JLabel();
        clquantimacho = new javax.swing.JLabel();
        tfmacho = new javax.swing.JTextField();
        clquantfemea = new javax.swing.JLabel();
        tffemea = new javax.swing.JTextField();
        clquantlote = new javax.swing.JLabel();
        tfquantidade = new javax.swing.JTextField();
        clraça = new javax.swing.JLabel();
        cldestinação = new javax.swing.JLabel();
        combodestinacao = new javax.swing.JComboBox();
        clcomentariolote = new javax.swing.JLabel();
        tfcomentario = new javax.swing.JTextField();
        btconfirma = new javax.swing.JButton();
        btcancela = new javax.swing.JButton();
        campoobrigatorio4 = new javax.swing.JLabel();
        campoobrigatorio6 = new javax.swing.JLabel();
        campoobrigatorio7 = new javax.swing.JLabel();
        campoobrigatorio8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoobrigatorio9 = new javax.swing.JLabel();
        combopasto = new javax.swing.JComboBox();
        comboraca = new javax.swing.JComboBox();
        dati = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combofaz = new javax.swing.JComboBox();
        campoobrigatorio10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SLmacho = new javax.swing.JRadioButton();
        SLfemea = new javax.swing.JRadioButton();
        SLmf = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tela Lote"));

        clnlot.setText("Nº Lote");

        tflote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfloteActionPerformed(evt);
            }
        });

        clinformpasto.setText("Pasto");

        clquantimacho.setText("Macho");

        tfmacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmachoActionPerformed(evt);
            }
        });

        clquantfemea.setText("Femeas");

        tffemea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffemeaActionPerformed(evt);
            }
        });

        clquantlote.setText("Quantidade Animais");

        tfquantidade.setEditable(false);
        tfquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfquantidadeActionPerformed(evt);
            }
        });
        tfquantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfquantidadeKeyPressed(evt);
            }
        });

        clraça.setText("Raça");

        cldestinação.setText("Classificação");

        combodestinacao.setModel(new ComboClassificacaoLote());

        clcomentariolote.setText("Comentario do lote");

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

        campoobrigatorio4.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio4.setText("*");

        campoobrigatorio6.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio6.setText("*");

        campoobrigatorio7.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio7.setText("*");

        campoobrigatorio8.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio8.setText("*");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel1.setText("Campo Obrigatorio");

        campoobrigatorio9.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio9.setText("*");

        combopasto.setModel(new ComboPasto());

        comboraca.setModel(new ComboRaca());

        jLabel2.setText("Data");

        jLabel3.setText("Fazenda");

        combofaz.setModel(new ComboFazenda());
        combofaz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combofazItemStateChanged(evt);
            }
        });
        combofaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combofazActionPerformed(evt);
            }
        });

        campoobrigatorio10.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio10.setText("*");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        SLmacho.setText("Macho");
        SLmacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SLmachoActionPerformed(evt);
            }
        });

        SLfemea.setText("Femea");
        SLfemea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SLfemeaActionPerformed(evt);
            }
        });

        SLmf.setText("Macho/Femea");
        SLmf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SLmfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(SLmacho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SLfemea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addComponent(SLmf))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SLmf)
                    .addComponent(SLmacho)
                    .addComponent(SLfemea))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clnlot)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tflote, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(campoobrigatorio9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combofaz, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(17, 17, 17)
                                .addComponent(dati, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(clinformpasto)
                        .addGap(23, 23, 23)
                        .addComponent(combopasto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoobrigatorio4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(clquantimacho)
                        .addGap(9, 9, 9)
                        .addComponent(tfmacho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(clquantfemea)
                        .addGap(3, 3, 3)
                        .addComponent(tffemea, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(clquantlote)
                        .addGap(5, 5, 5)
                        .addComponent(tfquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(clcomentariolote))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btcancela, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cldestinação)
                            .addComponent(clraça))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboraca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoobrigatorio6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combodestinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoobrigatorio7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoobrigatorio8)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(tfcomentario, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btcancela, btconfirma});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(clnlot)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tflote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoobrigatorio9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combofaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoobrigatorio10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(dati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clinformpasto)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combopasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio4)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clquantimacho)
                    .addComponent(tfmacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clquantfemea)
                    .addComponent(tffemea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clquantlote)
                    .addComponent(tfquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clraça)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboraca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio6)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cldestinação)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combodestinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio7)))
                .addGap(9, 9, 9)
                .addComponent(clcomentariolote)
                .addGap(6, 6, 6)
                .addComponent(tfcomentario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoobrigatorio8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcancela, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btconfirma.getAccessibleContext().setAccessibleParent(this);
        combopasto.getAccessibleContext().setAccessibleParent(this);
        comboraca.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfloteActionPerformed
    }//GEN-LAST:event_tfloteActionPerformed

    private void btcancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelaActionPerformed
        if (evt.getSource() == btcancela) {
            dispose();
        }
    }//GEN-LAST:event_btcancelaActionPerformed

    private void btconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmaActionPerformed
        DAOGenerico<Lote> dao = new DAOGenerico<Lote>(Lote.class);
        if (validarCampos()) {
            if (lote == null) {

                Lote cid = new Lote();
                cid.setNumeroLote(tflote.getText());

                if (SLmacho.isSelected()) {
                    cid.setQuantidadeMacho(String.valueOf(tfmacho.getText()));
                    cid.setQuantidadeTotal(String.valueOf(tfmacho.getText()));
                } else if (SLfemea.isSelected()){
                    cid.setQuantidadeFemea(String.valueOf(tffemea.getText()));
                    cid.setQuantidadeTotal(String.valueOf(tffemea.getText()));
                } else {
                    cid.setQuantidadeFemea(String.valueOf(tffemea.getText()));
                    cid.setQuantidadeTotal(String.valueOf(tffemea.getText()) + String.valueOf(tfmacho.getText()));
                }
                
                cid.setDescricao(tfcomentario.getText());
                cid.setClassificacaoLote((ClassificacaoLote) combodestinacao.getSelectedItem());
                cid.setRaca((Raca) comboraca.getSelectedItem());
                cid.setPasto((Pasto) combopasto.getSelectedItem());
                cid.setFazenda((Fazenda) combofaz.getSelectedItem());
                cid.setData(dati.getDate());

                dao.insert(cid);
            } else {
                validarCampos();
                lote.setNumeroLote(tflote.getText());
                lote.setQuantidadeMacho(String.valueOf(tfmacho.getText()));
                if (!SLmacho.isSelected()) {
                    lote.setQuantidadeFemea(String.valueOf(tffemea.getText()));
                }
                lote.setQuantidadeTotal(String.valueOf(tfquantidade.getText()));
                lote.setDescricao(tfcomentario.getText());
                lote.setData(dati.getDate());
                lote.setClassificacaoLote((ClassificacaoLote) combodestinacao.getSelectedItem());
                lote.setRaca((Raca) comboraca.getSelectedItem());
                lote.setPasto((Pasto) combopasto.getSelectedItem());
                lote.setFazenda((Fazenda) combofaz.getSelectedItem());
                dao.update(lote);
            }

            setVisible(false);
            JOptionPane.showMessageDialog(null, " Registro inserido com Sucesso");
        } else {

            limparcampos();
            tflote.requestFocus();
        }
    }//GEN-LAST:event_btconfirmaActionPerformed

    private void tfquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfquantidadeActionPerformed
    }//GEN-LAST:event_tfquantidadeActionPerformed

    private void SLmachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SLmachoActionPerformed

        SLmacho.setSelected(true);
        SLfemea.setSelected(false);
        SLmf.setSelected(false);

        tfmacho.setEnabled(true);
        tffemea.setEnabled(false);
        habilitaCampos(true, false);
    }//GEN-LAST:event_SLmachoActionPerformed

    private void SLfemeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SLfemeaActionPerformed

        SLmacho.setSelected(false);
        SLfemea.setSelected(true);
        SLmf.setSelected(false);

        tfmacho.setEnabled(false);
        tffemea.setEnabled(true);
        habilitaCampos(false, true);
    }//GEN-LAST:event_SLfemeaActionPerformed

    private void SLmfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SLmfActionPerformed

        SLmacho.setSelected(false);
        SLfemea.setSelected(false);
        SLmf.setSelected(true);

        tfmacho.setEnabled(true);
        tffemea.setEnabled(true);
        habilitaCampos(true, true);
    }//GEN-LAST:event_SLmfActionPerformed

    private void tffemeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffemeaActionPerformed
    }//GEN-LAST:event_tffemeaActionPerformed

    private void tfmachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmachoActionPerformed
    }//GEN-LAST:event_tfmachoActionPerformed

    private void tfquantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfquantidadeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfquantidadeKeyPressed

    private void combofazItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combofazItemStateChanged
        combopasto.setModel(new ComboPasto((Fazenda) combofaz.getSelectedItem()));
        combopasto.updateUI();
    }//GEN-LAST:event_combofazItemStateChanged

    private void combofazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combofazActionPerformed

    }//GEN-LAST:event_combofazActionPerformed

    public void run() {
        CadastroLote dialogLote = new CadastroLote(new javax.swing.JFrame(), true);
        dialogLote.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialogLote.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton SLfemea;
    private javax.swing.JRadioButton SLmacho;
    private javax.swing.JRadioButton SLmf;
    private javax.swing.JButton btcancela;
    private javax.swing.JButton btconfirma;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel campoobrigatorio10;
    private javax.swing.JLabel campoobrigatorio4;
    private javax.swing.JLabel campoobrigatorio6;
    private javax.swing.JLabel campoobrigatorio7;
    private javax.swing.JLabel campoobrigatorio8;
    private javax.swing.JLabel campoobrigatorio9;
    private javax.swing.JLabel clcomentariolote;
    private javax.swing.JLabel cldestinação;
    private javax.swing.JLabel clinformpasto;
    private javax.swing.JLabel clnlot;
    private javax.swing.JLabel clquantfemea;
    private javax.swing.JLabel clquantimacho;
    private javax.swing.JLabel clquantlote;
    private javax.swing.JLabel clraça;
    private javax.swing.JComboBox combodestinacao;
    private javax.swing.JComboBox combofaz;
    private javax.swing.JComboBox combopasto;
    private javax.swing.JComboBox comboraca;
    private com.toedter.calendar.DateUtil dateUtil1;
    private com.toedter.calendar.JDateChooser dati;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfcomentario;
    private javax.swing.JTextField tffemea;
    private javax.swing.JTextField tflote;
    private javax.swing.JTextField tfmacho;
    private javax.swing.JTextField tfquantidade;
    // End of variables declaration//GEN-END:variables
}
