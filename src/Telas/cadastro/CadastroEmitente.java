/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Emitente.java
 *
 * Created on 11/09/2010, 00:12:05
 */
package Telas.cadastro;

import Busca.BuscaGenerica;
import entidade.Fisica;

import entidade.Juridica;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelCidade;
import model.TableModelEmitente;
import org.hibernate.validator.InvalidStateException;
import org.hibernate.validator.InvalidValue;
import util.DAOGenerico;

/**
 *
 * @author altitdb
 */
public class CadastroEmitente extends javax.swing.JDialog {

    private Fisica fisica;
    private Juridica juridica;
   
    private DAOGenerico<Fisica> daoFisica;
    private DAOGenerico<Juridica> daoJuridica;
   

    public CadastroEmitente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    public CadastroEmitente() {
        initComponents();
        setModal(true);
        setLocationRelativeTo(null);
        habilitaCampos(false, false, false);
        limpaCampos();
        botoes(true, false, false, false);
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public Juridica getJuridica() {
        return juridica;
    }

    private void botoes(Boolean... b) {
        btNovo.setEnabled(b[0]);
        btAlterar.setEnabled(b[1]);
        btSalvar.setEnabled(b[2]);
        btExcluir.setEnabled(b[3]);
    }

     public static boolean validarCNPJCPF(final String CNPJ_CPF) {

        if(CNPJ_CPF.length() == 11) { //CPF

                int acumulador1 = 0;
                int acumulador2 = 0;
                int resto = 0;

                StringBuffer resultado = new StringBuffer();

                String digitoVerificadorCPF = CNPJ_CPF.substring((CNPJ_CPF.length() - 2),
                                                                                                                  CNPJ_CPF.length());

                for(int i = 1; i < (CNPJ_CPF.length() - 1); i++) {
                        acumulador1 += (11 - i) * Integer.valueOf(CNPJ_CPF.substring((i - 1), i));
                        acumulador2 += (12 - i) * Integer.valueOf(CNPJ_CPF.substring((i - 1), i));
                }

                resto = acumulador1 % 11;

                if (resto < 2) {
                        acumulador2 += 2;
                        resultado.append(2);
                }
                else {
                        acumulador2 += 2 * (11 - resto);
                        resultado.append((11 - resto));
                }

                resto = acumulador2 % 11;

                if (resto < 2) {
                        resultado.append(0);
                }
                else {
                        resultado.append((11 - resto));
                }

                return resultado.toString().equals(digitoVerificadorCPF);
        }
        else if(CNPJ_CPF.length() == 14) { //CNPJ

                int acumulador = 0;
                int digito = 0;
                StringBuffer CNPJ = new StringBuffer();
                char[] CNPJCharArray = CNPJ_CPF.toCharArray();

                CNPJ.append(CNPJ_CPF.substring(0, 12));

                for(int i = 0; i < 4; i++) {
                        if(((CNPJCharArray[i] - 48) >= 0) &&
                           ((CNPJCharArray[i] - 48) <= 9)) {
                                acumulador += (CNPJCharArray[i] - 48) * (6 - (i + 1));
                        }
                }

                for(int i = 0; i < 8; i++) {
                        if(((CNPJCharArray[i + 4] - 48) >= 0) &&
                           ((CNPJCharArray[i + 4] - 48) <= 9)) {
                                acumulador += (CNPJCharArray[i + 4] - 48) * (10 - (i + 1));
                        }
                }

                digito = 11 - (acumulador % 11);

                CNPJ.append((digito == 10 || digito == 11) ? "0" : digito);

                acumulador = 0;

                for(int i = 0; i < 5; i++) {
                        if(((CNPJCharArray[i] - 48) >= 0) &&
                           ((CNPJCharArray[i] - 48) <= 9)) {
                                acumulador += (CNPJCharArray[i] - 48) * (7 - (i + 1));
                        }
                }

                for(int i = 0; i < 8; i++) {
                        if(((CNPJCharArray[i + 5] - 48) >= 0) &&
                           ((CNPJCharArray[i + 5] - 48) <= 9)) {
                                acumulador += (CNPJCharArray[i + 5] - 48) * (10 - (i + 1));
                        }
                }

                digito = 11 - (acumulador % 11);

                CNPJ.append((digito == 10 || digito == 11) ? "0" : digito);

                return CNPJ.toString().equals(CNPJ_CPF);
        }

        return false;
}

    private void limpaCampos() {
        rbFisica.setSelected(false);
        rbJuridica.setSelected(false);
        cbCliente.setSelected(false);
        cbFornecedor.setSelected(false);
       
        tfBairro.setText("");
        tfCelular.setText("");
        tfCidade.setText("");
        tfCnpj.setText("");
        tfContato.setText("");
        tfCpf.setText("");
        tfEmail.setText("");
        tfEndereco.setText("");
        tfIe.setText("");
        tfNome.setText("");
        tfNumero.setText("");
        tfRazao.setText("");
        tfRg.setText("");
        tfTelefone.setText("");
        tfUf.setText("");
        tfCep.setText("");
       
    }

    private void habilitaCampos(Boolean b, Boolean f, Boolean j) {
        rbFisica.setEnabled(b);
        rbJuridica.setEnabled(b);
        tfBairro.setEditable(b);
        tfCelular.setEditable(b);
        tfCnpj.setEditable(j);
        tfContato.setEditable(b);
        tfCpf.setEditable(f);
        tfEmail.setEditable(b);
        tfEndereco.setEditable(b);
        tfIe.setEditable(j);
        tfNome.setEditable(b);
        tfNumero.setEditable(b);
        tfRazao.setEditable(j);
        tfRg.setEditable(f);
        tfTelefone.setEditable(b);
        tfCep.setEditable(b);
        btCidade.setEnabled(b);
       
    }

    private Fisica fisica() {
        getFisica().setBairro(tfBairro.getText().trim());
        getFisica().setCelular(tfCelular.getText().trim());
        getFisica().setCep(tfCep.getText().trim());
        getFisica().setCliente(cbCliente.isSelected());
        getFisica().setContato(tfContato.getText().trim());
        getFisica().setCpf(tfCpf.getText().trim());
        getFisica().setEmail(tfEmail.getText().trim());
        getFisica().setEndereco(tfEndereco.getText().trim());
        getFisica().setFornecedor(cbFornecedor.isSelected());
        getFisica().setNome(tfNome.getText().trim());
        getFisica().setNumero(tfNumero.getText().trim());
        getFisica().setRg(tfRg.getText().trim());
        getFisica().setTelefone(tfTelefone.getText().trim());
        return getFisica();
    }

    private Juridica juridica() {
        getJuridica().setBairro(tfBairro.getText().trim());
        getJuridica().setCelular(tfCelular.getText().trim());
        getJuridica().setCep(tfCep.getText().trim());
        getJuridica().setCliente(cbCliente.isSelected());
        getJuridica().setContato(tfContato.getText().trim());
        getJuridica().setCnpj(tfCnpj.getText().trim());
        getJuridica().setEmail(tfEmail.getText().trim());
        getJuridica().setEndereco(tfEndereco.getText().trim());
        getJuridica().setFornecedor(cbFornecedor.isSelected());
        getJuridica().setNome(tfNome.getText().trim());
        getJuridica().setRazao(tfRazao.getText().trim());
        getJuridica().setNumero(tfNumero.getText().trim());
        getJuridica().setInscricaoEstadual(tfIe.getText().trim());
        getJuridica().setTelefone(tfTelefone.getText().trim());
        return getJuridica();
    }

    private void emitenteFisica(Fisica f) {
        rbFisica.setSelected(true);
        tfBairro.setText(f.getBairro());
        tfCelular.setText(f.getCelular());
        tfCidade.setText(f.getCidade().getNome());
        tfContato.setText(f.getContato());
        tfCpf.setText(f.getCpf());
        tfEmail.setText(f.getEmail());
        tfEndereco.setText(f.getEndereco());
        tfNome.setText(f.getNome());
        tfNumero.setText(f.getNumero());
        tfRg.setText(f.getRg());
        tfTelefone.setText(f.getTelefone());
        tfUf.setText(f.getCidade().getEstado().getSigla());
        tfCep.setText(f.getCep());
        rbFisica.setSelected(true);
        rbJuridica.setSelected(false);
        cbCliente.setSelected(f.getCliente());
        cbFornecedor.setSelected(f.getFornecedor());
       
    }

    private void emitenteJuridica(Juridica j) {
        tfBairro.setText(j.getBairro());
        tfCelular.setText(j.getCelular());
        tfCidade.setText(j.getCidade().getNome());
        tfCnpj.setText(j.getCnpj());
        tfContato.setText(j.getContato());
        tfEmail.setText(j.getEmail());
        tfEndereco.setText(j.getEndereco());
        tfIe.setText(j.getInscricaoEstadual());
        tfNome.setText(j.getNome());
        tfNumero.setText(j.getNumero());
        tfRazao.setText(j.getRazao());
        tfTelefone.setText(j.getTelefone());
        tfUf.setText(j.getCidade().getEstado().getSigla());
        tfCep.setText(j.getCep());
        rbFisica.setSelected(false);
        rbJuridica.setSelected(true);
        cbCliente.setSelected(j.getCliente());
        cbFornecedor.setSelected(j.getFornecedor());
        }

    private void buscaCidade() {
        this.setVisible(false);
        BuscaGenerica bg = new BuscaGenerica();
        bg.setTitle("Busca de Cidades");
        bg.tabela.setModel(new TableModelCidade());
        bg.setModal(true);
        bg.setVisible(true);
        if (bg.tabela.getSelectedRow() != -1) {
            if (rbFisica.isSelected()) {
                getFisica().setCidade(bg.tmCidade.getLista().get(bg.tabela.getSelectedRow()));
                tfCidade.setText(getFisica().getCidade().getNome());
                tfUf.setText(getFisica().getCidade().getEstado().getSigla());
            } else {
                getJuridica().setCidade(bg.tmCidade.getLista().get(bg.tabela.getSelectedRow()));
                tfCidade.setText(getJuridica().getCidade().getNome());
                tfUf.setText(getJuridica().getCidade().getEstado().getSigla());
            }
        }
        this.setVisible(true);
    }

    private void buscaEmitente() {
        this.setVisible(false);
        limpaCampos();
        habilitaCampos(false, false, false);
        cbCliente.setEnabled(false);
        cbFornecedor.setEnabled(false);
        BuscaGenerica bg = new BuscaGenerica();
        bg.setTitle("Busca de Emitentes");
        bg.tabela.setModel(new TableModelEmitente());
        bg.setModal(true);
        bg.setVisible(true);
        if (bg.tabela.getSelectedRow() != -1) {
            botoes(true, true, false, true);
            if (bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow()) instanceof Fisica) {
                setFisica((Fisica) bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow()));
                emitenteFisica(getFisica());
            } else {
                setJuridica((Juridica) bg.tmEmitente.getLista().get(bg.tabela.getSelectedRow()));
                emitenteJuridica(getJuridica());
            }
        } else {
            botoes(true, false, false, false);
        }
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        painel01 = new javax.swing.JPanel();
        rbFisica = new javax.swing.JRadioButton();
        rbJuridica = new javax.swing.JRadioButton();
        painel02 = new javax.swing.JPanel();
        cbCliente = new javax.swing.JCheckBox();
        cbFornecedor = new javax.swing.JCheckBox();
        lbNome = new javax.swing.JLabel();
        lbRazao = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbUf = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfRazao = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JFormattedTextField();
        tfCelular = new javax.swing.JFormattedTextField();
        tfCidade = new javax.swing.JTextField();
        tfUf = new javax.swing.JTextField();
        btCidade = new javax.swing.JButton();
        tfCpf = new javax.swing.JFormattedTextField();
        lbRg = new javax.swing.JLabel();
        tfRg = new javax.swing.JFormattedTextField();
        lbCnpj = new javax.swing.JLabel();
        tfCnpj = new javax.swing.JFormattedTextField();
        lbIe = new javax.swing.JLabel();
        tfIe = new javax.swing.JFormattedTextField();
        tfContato = new javax.swing.JTextField();
        lbContato = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbCep = new javax.swing.JLabel();
        tfCep = new javax.swing.JFormattedTextField();
        campoobrigatorio18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoobrigatorio19 = new javax.swing.JLabel();
        campoobrigatorio20 = new javax.swing.JLabel();
        campoobrigatorio21 = new javax.swing.JLabel();
        campoobrigatorio22 = new javax.swing.JLabel();
        campoobrigatorio23 = new javax.swing.JLabel();
        campoobrigatorio24 = new javax.swing.JLabel();
        campoobrigatorio25 = new javax.swing.JLabel();
        campoobrigatorio26 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel01.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        rbFisica.setText("Fisica");
        rbFisica.setEnabled(false);
        rbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicaActionPerformed(evt);
            }
        });

        rbJuridica.setText("Juridica");
        rbJuridica.setEnabled(false);
        rbJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel01Layout = new javax.swing.GroupLayout(painel01);
        painel01.setLayout(painel01Layout);
        painel01Layout.setHorizontalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbJuridica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel01Layout.setVerticalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFisica)
                    .addComponent(rbJuridica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel02.setBorder(javax.swing.BorderFactory.createTitledBorder("Emitente"));

        cbCliente.setText("Cliente");
        cbCliente.setEnabled(false);

        cbFornecedor.setText("Fornecedor");
        cbFornecedor.setEnabled(false);

        javax.swing.GroupLayout painel02Layout = new javax.swing.GroupLayout(painel02);
        painel02.setLayout(painel02Layout);
        painel02Layout.setHorizontalGroup(
            painel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel02Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFornecedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel02Layout.setVerticalGroup(
            painel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel02Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCliente)
                    .addComponent(cbFornecedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbNome.setText("Nome:");

        lbRazao.setText("Razão:");

        lbEndereco.setText("Endereço:");

        lbBairro.setText("Bairro:");

        lbTelefone.setText("Telefone:");

        lbEmail.setText("Email:");

        lbCelular.setText("Celular:");

        lbCidade.setText("Cidade:");

        lbUf.setText("UF:");

        lbCpf.setText("CPF:");

        tfNome.setColumns(50);
        tfNome.setEditable(false);

        tfRazao.setColumns(50);
        tfRazao.setEditable(false);
        tfRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRazaoActionPerformed(evt);
            }
        });

        tfEndereco.setColumns(50);
        tfEndereco.setEditable(false);

        tfBairro.setColumns(50);
        tfBairro.setEditable(false);

        tfEmail.setColumns(50);
        tfEmail.setEditable(false);

        tfTelefone.setColumns(10);
        tfTelefone.setEditable(false);
        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefone.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        tfCelular.setColumns(10);
        tfCelular.setEditable(false);
        try {
            tfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCelular.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        tfCidade.setColumns(50);
        tfCidade.setEditable(false);

        tfUf.setColumns(2);
        tfUf.setEditable(false);

        btCidade.setText("...");
        btCidade.setEnabled(false);
        btCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCidadeActionPerformed(evt);
            }
        });

        tfCpf.setColumns(12);
        tfCpf.setEditable(false);
        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpf.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        tfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfActionPerformed(evt);
            }
        });

        lbRg.setText("RG:");

        tfRg.setColumns(10);
        tfRg.setEditable(false);

        lbCnpj.setText("CNPJ/CGC:");

        tfCnpj.setColumns(14);
        tfCnpj.setEditable(false);
        tfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCnpjActionPerformed(evt);
            }
        });

        lbIe.setText("IE/Nº Incra:");

        tfIe.setColumns(10);
        tfIe.setEditable(false);

        tfContato.setColumns(50);
        tfContato.setEditable(false);

        lbContato.setText("Contato:");

        lbNumero.setText("Nº:");

        tfNumero.setColumns(5);
        tfNumero.setEditable(false);

        btNovo.setIcon(new ImageIcon("src/icones/novo.png"));
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new ImageIcon("src/imagens/JBAlterar1.png"));
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new ImageIcon("src/icones/accept-icon - Cópia.png"));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btConsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new ImageIcon("src/imagens/JBExcluir3.png"));
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSair.setIcon(new ImageIcon("src/icones/fecha.png"));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbCep.setText("CEP:");

        tfCep.setColumns(8);
        tfCep.setEditable(false);
        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCep.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        campoobrigatorio18.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio18.setText("*");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel1.setText("Campo Obrigatorio");

        campoobrigatorio19.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio19.setText("*");

        campoobrigatorio20.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio20.setText("*");

        campoobrigatorio21.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio21.setText("*");

        campoobrigatorio22.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio22.setText("*");

        campoobrigatorio23.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio23.setText("*");

        campoobrigatorio24.setForeground(new java.awt.Color(204, 0, 0));
        campoobrigatorio24.setText("*");

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
                        .addGap(10, 10, 10)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(painel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(painel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmail)
                                    .addComponent(lbTelefone)
                                    .addComponent(lbCidade)
                                    .addComponent(lbCpf)
                                    .addComponent(lbCnpj)
                                    .addComponent(lbContato)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lbNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbRazao))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbEndereco))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbBairro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfRazao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumero)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoobrigatorio19)
                                    .addComponent(campoobrigatorio20)
                                    .addComponent(campoobrigatorio21))
                                .addGap(123, 123, 123))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbCelular)
                                        .addGap(10, 10, 10)
                                        .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                                    .addComponent(tfContato, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoobrigatorio24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbIe)
                                        .addGap(8, 8, 8)
                                        .addComponent(tfIe, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfCidade, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoobrigatorio23)
                                                .addGap(4, 4, 4)
                                                .addComponent(lbRg)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campoobrigatorio25)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbCep)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfCep))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campoobrigatorio22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btCidade)
                                                .addGap(4, 4, 4)
                                                .addComponent(lbUf)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfUf, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoobrigatorio26))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoobrigatorio18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfEmail, tfEndereco, tfNome, tfRazao});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btNovo))
                    .addComponent(painel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbNome))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbRazao))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbEndereco))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbBairro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbNumero))
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbEmail))
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(lbTelefone))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lbCelular))
                                .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lbCidade))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btCidade)
                                            .addComponent(campoobrigatorio22))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(lbUf)))
                                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(tfUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbRg)
                                        .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoobrigatorio23))
                                    .addComponent(campoobrigatorio25)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbCep)))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(campoobrigatorio24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbIe))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoobrigatorio26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbCnpj))
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbContato))
                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoobrigatorio18))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar)
                    .addComponent(btAlterar)
                    .addComponent(btConsultar)
                    .addComponent(btExcluir)
                    .addComponent(btSair))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicaActionPerformed
        limpaCampos();
        rbFisica.setSelected(true);
        rbJuridica.setSelected(false);
        cbCliente.setEnabled(true);
        cbFornecedor.setEnabled(true);
        cbCliente.setSelected(false);
        cbFornecedor.setSelected(false);
        habilitaCampos(true, true, false);
    }//GEN-LAST:event_rbFisicaActionPerformed

    private void rbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuridicaActionPerformed
        limpaCampos();
        rbFisica.setSelected(false);
        rbJuridica.setSelected(true);
        cbCliente.setEnabled(true);
        cbFornecedor.setEnabled(true);
        cbCliente.setSelected(false);
        cbFornecedor.setSelected(false);
        habilitaCampos(true, false, true);
    }//GEN-LAST:event_rbJuridicaActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpaCampos();
        habilitaCampos(false, false, false);
        rbFisica.setEnabled(true);
        rbJuridica.setEnabled(true);
        rbFisica.setSelected(false);
        rbJuridica.setSelected(false);
        botoes(false, false, true, false);
        setFisica(new Fisica());
        setJuridica(new Juridica());
        cbCliente.setEnabled(false);
        cbFornecedor.setEnabled(false);
       
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        botoes(true, false, true, true);
        habilitaCampos(true, rbFisica.isSelected() ? true : false, rbJuridica.isSelected() ? true : false);
        if (rbFisica.isSelected()) {
            cbCliente.setEnabled(true);
            cbFornecedor.setEnabled(true);
          } else if (rbJuridica.isSelected()) {
            cbCliente.setEnabled(true);
            cbFornecedor.setEnabled(true);
           }
        rbFisica.setEnabled(false);
        rbJuridica.setEnabled(false);
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        botoes(true, false, false, false);
        if (rbFisica.isEnabled()) {
            if (rbFisica.isSelected()) {
                daoFisica = new DAOGenerico<Fisica>(Fisica.class);
                daoFisica.insert(fisica());
            } else {
                daoJuridica = new DAOGenerico<Juridica>(Juridica.class);
                daoJuridica.insert(juridica());
                         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");

            }
        } else {
            if (rbFisica.isSelected()) {
                daoFisica = new DAOGenerico<Fisica>(Fisica.class);
                daoFisica.update(fisica());
            } else {
                daoJuridica = new DAOGenerico<Juridica>(Juridica.class);
                daoJuridica.update(juridica());
                         JOptionPane.showMessageDialog(null," Registro inserido com Sucesso");

            }
        }
        setFisica(null);
        setJuridica(null);
        habilitaCampos(false, false, false);
        limpaCampos();
        cbCliente.setEnabled(false);
        cbFornecedor.setEnabled(false);
       
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int sim = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este emitente?");
        if (sim == JOptionPane.OK_OPTION) {
            botoes(true, false, false, false);
            if (rbFisica.isSelected()) {
                daoFisica = new DAOGenerico<Fisica>(Fisica.class);
                daoFisica.delete(getFisica());
            } else if (rbJuridica.isSelected()) {
                daoJuridica = new DAOGenerico<Juridica>(Juridica.class);
                daoJuridica.delete(getJuridica());
            }
            limpaCampos();
            habilitaCampos(false, false, false);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCidadeActionPerformed
        buscaCidade();
    }//GEN-LAST:event_btCidadeActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        buscaEmitente();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void tfRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRazaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRazaoActionPerformed

    private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfActionPerformed
       validarCNPJCPF(toString());
    }//GEN-LAST:event_tfCpfActionPerformed

    private void tfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCnpjActionPerformed
        validarCNPJCPF(null);
    }//GEN-LAST:event_tfCnpjActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCidade;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel campoobrigatorio18;
    private javax.swing.JLabel campoobrigatorio19;
    private javax.swing.JLabel campoobrigatorio20;
    private javax.swing.JLabel campoobrigatorio21;
    private javax.swing.JLabel campoobrigatorio22;
    private javax.swing.JLabel campoobrigatorio23;
    private javax.swing.JLabel campoobrigatorio24;
    private javax.swing.JLabel campoobrigatorio25;
    private javax.swing.JLabel campoobrigatorio26;
    private javax.swing.JCheckBox cbCliente;
    private javax.swing.JCheckBox cbFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbIe;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRazao;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbUf;
    private javax.swing.JPanel painel01;
    private javax.swing.JPanel painel02;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbJuridica;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JFormattedTextField tfCnpj;
    private javax.swing.JTextField tfContato;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JFormattedTextField tfIe;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRazao;
    private javax.swing.JFormattedTextField tfRg;
    private javax.swing.JFormattedTextField tfTelefone;
    private javax.swing.JTextField tfUf;
    // End of variables declaration//GEN-END:variables
}
