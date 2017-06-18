package sigfaz;

import Relatorios.Relatorio;
import Relatorios.Relatorio2;
import Relatorios.RelatorioForm;


import Telas.cadastro.CadastroEmitente;
import Telas.cadastro.Calendario;
import Telas.cadastro.Login;
import Telas.cadastro.TMcadastroClassificacaoLote;
import Telas.cadastro.TMcadastroCultura;
import Telas.cadastro.TMcadastroDestinacaoDespesa;
import Telas.cadastro.TMcadastroGrupo;
import Telas.cadastro.TMcadastroServicodeManutencao;
import Telas.cadastro.TMcadastroTipodeSanidade;
import Telas.cadastro.TMcadastroUsuario;
import Telas.cadastro.TMcadastrocidade;
import Telas.cadastro.TMcadastrodespesa;
import Telas.cadastro.TMcadastroestado;
import Telas.cadastro.TMcadastrofazenda;
import Telas.cadastro.TMcadastrolote;
import Telas.cadastro.TMcadastropasto;
import Telas.cadastro.TMcadastroproduto;
import Telas.cadastro.TMcadastroraca;
import Telas.cadastro.TMcadastrounidademedida;
import Telas.movimento.BaixaLote;
import Telas.movimento.CompraForm;
import Telas.movimento.ManutPasto;
import Telas.movimento.Transferencia;
import Telas.movimento.Vacinado;
import Telas.movimento.VendaForm;
import backupmysqlgmail.backupBaseDados;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Telaprin extends javax.swing.JFrame {

    public Telaprin(String usu) {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(Telaprin.DISPOSE_ON_CLOSE);
        tfusuario.setText(usu);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        tlprinjpainel = new javax.swing.JPanel();
        atcdespesas = new javax.swing.JButton();
        atmtransferencia = new javax.swing.JButton();
        atmovibxnacimento = new javax.swing.JButton();
        tlbtlote = new javax.swing.JButton();
        tlbtmorte = new javax.swing.JButton();
        tlbotaocalculadora = new javax.swing.JButton();
        tlbotaoblocodenotas = new javax.swing.JButton();
        BTcalendario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        tfusuario = new javax.swing.JLabel();
        tlbtsair = new javax.swing.JButton();
        tlmenus = new javax.swing.JMenuBar();
        MCadastro = new javax.swing.JMenu();
        Cadastrofazenda = new javax.swing.JMenuItem();
        Cadsatroproduto = new javax.swing.JMenuItem();
        Cadastropasto = new javax.swing.JMenuItem();
        Cadastrolote = new javax.swing.JMenuItem();
        tlcadpessoa = new javax.swing.JMenuItem();
        CadDmais = new javax.swing.JMenu();
        raca = new javax.swing.JMenuItem();
        UnidadeMedida = new javax.swing.JMenuItem();
        cidade = new javax.swing.JMenuItem();
        estado = new javax.swing.JMenuItem();
        JMgrupo = new javax.swing.JMenuItem();
        JMcultura = new javax.swing.JMenuItem();
        JMclassificacaolote = new javax.swing.JMenuItem();
        JMdestinodespesa = new javax.swing.JMenuItem();
        servicomanutencao = new javax.swing.JMenuItem();
        TPsanidade = new javax.swing.JMenuItem();
        jlusuario = new javax.swing.JMenuItem();
        MDespesa = new javax.swing.JMenu();
        mlmanutençaolote = new javax.swing.JMenu();
        mltransferencia = new javax.swing.JMenuItem();
        mlvacinaçao = new javax.swing.JMenuItem();
        mmlvenda = new javax.swing.JMenuItem();
        mmcompra = new javax.swing.JMenuItem();
        BxLote = new javax.swing.JMenuItem();
        tlmmanupasto = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MRelatorio = new javax.swing.JMenu();
        rcadastral = new javax.swing.JMenu();
        rcfazenda = new javax.swing.JMenuItem();
        rcpasto = new javax.swing.JMenuItem();
        rclote = new javax.swing.JMenuItem();
        PessoaFis = new javax.swing.JMenuItem();
        PessoaJud = new javax.swing.JMenuItem();
        rgerencial = new javax.swing.JMenu();
        rgdespesas = new javax.swing.JMenuItem();
        relfuncionario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        rmmanutencao = new javax.swing.JMenuItem();
        rmtransferencia = new javax.swing.JMenuItem();
        rmvacina = new javax.swing.JMenuItem();
        MArquivo = new javax.swing.JMenu();
        Backup = new javax.swing.JMenuItem();
        tlacalculadora = new javax.swing.JMenuItem();
        tlablocodenotas = new javax.swing.JMenuItem();
        tlacalendario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        TAusuario = new javax.swing.JMenuItem();
        TAjuda = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenu();
        faz = new javax.swing.JMenuItem();
        past = new javax.swing.JMenuItem();
        lot = new javax.swing.JMenuItem();
        pessoa = new javax.swing.JMenuItem();
        produt = new javax.swing.JMenuItem();
        raça = new javax.swing.JMenuItem();
        unid = new javax.swing.JMenuItem();
        cid = new javax.swing.JMenuItem();
        est = new javax.swing.JMenuItem();
        grup = new javax.swing.JMenuItem();
        subgrp = new javax.swing.JMenuItem();
        cult = new javax.swing.JMenuItem();
        classlote = new javax.swing.JMenuItem();
        destidesp = new javax.swing.JMenuItem();
        sermanutpast = new javax.swing.JMenuItem();
        nomevac = new javax.swing.JMenuItem();
        funci = new javax.swing.JMenuItem();
        Movimento = new javax.swing.JMenu();
        Sobresistema21 = new javax.swing.JMenuItem();
        Sobresistema19 = new javax.swing.JMenuItem();
        Sobresistema20 = new javax.swing.JMenuItem();
        Sobresistema22 = new javax.swing.JMenuItem();
        Sobresistema40 = new javax.swing.JMenuItem();
        Sobresistema41 = new javax.swing.JMenuItem();
        Sobresistema42 = new javax.swing.JMenuItem();
        relatorio = new javax.swing.JMenu();
        faz1 = new javax.swing.JMenuItem();
        past1 = new javax.swing.JMenuItem();
        lot1 = new javax.swing.JMenuItem();
        Sobresistema26 = new javax.swing.JMenuItem();
        Sobresistema27 = new javax.swing.JMenuItem();
        Sobresistema39 = new javax.swing.JMenuItem();
        Sobresistema30 = new javax.swing.JMenuItem();
        Sobresistema31 = new javax.swing.JMenuItem();
        Sobresistema32 = new javax.swing.JMenuItem();
        Sobresistema33 = new javax.swing.JMenuItem();
        Sobresistema34 = new javax.swing.JMenuItem();
        Sobresistema35 = new javax.swing.JMenuItem();
        Sobresistema36 = new javax.swing.JMenuItem();
        Sobresistema = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SigFaz");

        tlprinjpainel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema Gerenciador de Fazendas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tw Cen MT Condensed", 1, 18), new java.awt.Color(0, 0, 102))); // NOI18N
        tlprinjpainel.setForeground(new java.awt.Color(0, 51, 255));
        tlprinjpainel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tlprinjpainel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tlprinjpainel.setPreferredSize(new java.awt.Dimension(715, 715));

        atcdespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/6943_64x64.png"))); // NOI18N
        atcdespesas.setText("Despesas");
        atcdespesas.setAlignmentX(0.5F);
        atcdespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        atcdespesas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        atcdespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atcdespesasActionPerformed(evt);
            }
        });

        atmtransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Sem título.gif"))); // NOI18N
        atmtransferencia.setText("Transferência");
        atmtransferencia.setAlignmentX(0.5F);
        atmtransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        atmtransferencia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        atmtransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmtransferenciaActionPerformed(evt);
            }
        });

        atmovibxnacimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/calf-icon2 - Cópia.png"))); // NOI18N
        atmovibxnacimento.setText("Nascimento");
        atmovibxnacimento.setAlignmentX(0.5F);
        atmovibxnacimento.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        atmovibxnacimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmovibxnacimentoActionPerformed(evt);
            }
        });

        tlbtlote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lote.png"))); // NOI18N
        tlbtlote.setText("Lote");
        tlbtlote.setAlignmentX(0.5F);
        tlbtlote.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tlbtlote.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tlbtlote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbtloteActionPerformed(evt);
            }
        });

        tlbtmorte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1974_64x64.png"))); // NOI18N
        tlbtmorte.setText("Sanidade");
        tlbtmorte.setAlignmentX(0.5F);
        tlbtmorte.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tlbtmorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbtmorteActionPerformed(evt);
            }
        });

        tlbotaocalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1916_64x64.png"))); // NOI18N
        tlbotaocalculadora.setText("Calculadora");
        tlbotaocalculadora.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tlbotaocalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbotaocalculadoraActionPerformed(evt);
            }
        });

        tlbotaoblocodenotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Edit-64.png"))); // NOI18N
        tlbotaoblocodenotas.setText("Bloco de Notas");
        tlbotaoblocodenotas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tlbotaoblocodenotas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tlbotaoblocodenotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbotaoblocodenotasActionPerformed(evt);
            }
        });

        BTcalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/calendario.png"))); // NOI18N
        BTcalendario.setText("Calendario");
        BTcalendario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BTcalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcalendarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tlprinjpainelLayout = new javax.swing.GroupLayout(tlprinjpainel);
        tlprinjpainel.setLayout(tlprinjpainelLayout);
        tlprinjpainelLayout.setHorizontalGroup(
            tlprinjpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tlprinjpainelLayout.createSequentialGroup()
                .addComponent(tlbtlote, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atmtransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atmovibxnacimento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tlbtmorte, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atcdespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tlbotaocalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tlbotaoblocodenotas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tlprinjpainelLayout.setVerticalGroup(
            tlprinjpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tlprinjpainelLayout.createSequentialGroup()
                .addGroup(tlprinjpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlbtlote, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atmtransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atmovibxnacimento, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlbtmorte, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atcdespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlbotaocalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlbotaoblocodenotas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tlprinjpainelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BTcalendario, atcdespesas, atmovibxnacimento, atmtransferencia, tlbotaoblocodenotas, tlbotaocalculadora, tlbtlote, tlbtmorte});

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sigf.gif"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Bem Vindo ");

        jSeparator1.setBackground(new java.awt.Color(153, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/503_16x16.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tlbtsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        tlbtsair.setAlignmentX(0.5F);
        tlbtsair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tlbtsair.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        tlbtsair.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        tlbtsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlbtsairActionPerformed(evt);
            }
        });

        MCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1296_32x32.png"))); // NOI18N
        MCadastro.setText("Cadastro");
        MCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCadastroActionPerformed(evt);
            }
        });

        Cadastrofazenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        Cadastrofazenda.setText("Cadastro Fazenda");
        Cadastrofazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrofazendaActionPerformed(evt);
            }
        });
        MCadastro.add(Cadastrofazenda);

        Cadsatroproduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Cadsatroproduto.setText("Cadastro Produto");
        Cadsatroproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadsatroprodutoActionPerformed(evt);
            }
        });
        MCadastro.add(Cadsatroproduto);

        Cadastropasto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Cadastropasto.setText("Cadastro Pasto");
        Cadastropasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastropastoActionPerformed(evt);
            }
        });
        MCadastro.add(Cadastropasto);

        Cadastrolote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Cadastrolote.setText("Cadastro Lotes");
        Cadastrolote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroloteActionPerformed(evt);
            }
        });
        MCadastro.add(Cadastrolote);

        tlcadpessoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        tlcadpessoa.setText("Pessoa");
        tlcadpessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlcadpessoaActionPerformed(evt);
            }
        });
        MCadastro.add(tlcadpessoa);

        CadDmais.setText("Mais Cadastros");
        CadDmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadDmaisActionPerformed(evt);
            }
        });

        raca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        raca.setText("Raça");
        raca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racaActionPerformed(evt);
            }
        });
        CadDmais.add(raca);

        UnidadeMedida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        UnidadeMedida.setText("Unidade de Medida");
        UnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadeMedidaActionPerformed(evt);
            }
        });
        CadDmais.add(UnidadeMedida);

        cidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        cidade.setText("Cidade");
        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });
        CadDmais.add(cidade);

        estado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        estado.setText("Estado");
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });
        CadDmais.add(estado);

        JMgrupo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        JMgrupo.setText("Grupo ");
        JMgrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMgrupoActionPerformed(evt);
            }
        });
        CadDmais.add(JMgrupo);

        JMcultura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        JMcultura.setText("Cultura");
        JMcultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMculturaActionPerformed(evt);
            }
        });
        CadDmais.add(JMcultura);

        JMclassificacaolote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        JMclassificacaolote.setText("Classificação Lote");
        JMclassificacaolote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMclassificacaoloteActionPerformed(evt);
            }
        });
        CadDmais.add(JMclassificacaolote);

        JMdestinodespesa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        JMdestinodespesa.setText("Destinação Despesa");
        JMdestinodespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMdestinodespesaActionPerformed(evt);
            }
        });
        CadDmais.add(JMdestinodespesa);

        servicomanutencao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        servicomanutencao.setText("Serviço de Manutenção Pasto");
        servicomanutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicomanutencaoActionPerformed(evt);
            }
        });
        CadDmais.add(servicomanutencao);

        TPsanidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        TPsanidade.setText("Nome da Vacina/Sanidade");
        TPsanidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPsanidadeActionPerformed(evt);
            }
        });
        CadDmais.add(TPsanidade);

        jlusuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jlusuario.setText("Usuário");
        jlusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlusuarioActionPerformed(evt);
            }
        });
        CadDmais.add(jlusuario);

        MCadastro.add(CadDmais);

        tlmenus.add(MCadastro);

        MDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/mov.gif"))); // NOI18N
        MDespesa.setText("Movimento");
        MDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDespesaActionPerformed(evt);
            }
        });

        mlmanutençaolote.setText("Manutenção de Lotes");

        mltransferencia.setText("Transferência");
        mltransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mltransferenciaActionPerformed(evt);
            }
        });
        mlmanutençaolote.add(mltransferencia);

        mlvacinaçao.setText("Vacinação");
        mlvacinaçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlvacinaçaoActionPerformed(evt);
            }
        });
        mlmanutençaolote.add(mlvacinaçao);

        mmlvenda.setText("Saida");
        mmlvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmlvendaActionPerformed(evt);
            }
        });
        mlmanutençaolote.add(mmlvenda);

        mmcompra.setText("Entrada");
        mmcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmcompraActionPerformed(evt);
            }
        });
        mlmanutençaolote.add(mmcompra);

        BxLote.setText("Baixa de Lote");
        BxLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BxLoteActionPerformed(evt);
            }
        });
        mlmanutençaolote.add(BxLote);

        MDespesa.add(mlmanutençaolote);

        tlmmanupasto.setText("Manutenção de Pastos");
        tlmmanupasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlmmanupastoActionPerformed(evt);
            }
        });
        MDespesa.add(tlmmanupasto);

        jMenuItem2.setText("Despesa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MDespesa.add(jMenuItem2);

        tlmenus.add(MDespesa);

        MRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/relat.png"))); // NOI18N
        MRelatorio.setText("Relatorio");

        rcadastral.setText("Cadastrais");

        rcfazenda.setText("Fazendas");
        rcfazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcfazendaActionPerformed(evt);
            }
        });
        rcadastral.add(rcfazenda);

        rcpasto.setText("Pastos");
        rcpasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcpastoActionPerformed(evt);
            }
        });
        rcadastral.add(rcpasto);

        rclote.setText("Lote");
        rclote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcloteActionPerformed(evt);
            }
        });
        rcadastral.add(rclote);

        PessoaFis.setText("Pessoa Fisica");
        PessoaFis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PessoaFisActionPerformed(evt);
            }
        });
        rcadastral.add(PessoaFis);

        PessoaJud.setText("Pessoa Juridica");
        PessoaJud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PessoaJudActionPerformed(evt);
            }
        });
        rcadastral.add(PessoaJud);

        MRelatorio.add(rcadastral);

        rgerencial.setText("Gerenciais");

        rgdespesas.setText("Despesas");
        rgdespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgdespesasActionPerformed(evt);
            }
        });
        rgerencial.add(rgdespesas);

        relfuncionario.setText("Funcionario");
        relfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relfuncionarioActionPerformed(evt);
            }
        });
        rgerencial.add(relfuncionario);

        MRelatorio.add(rgerencial);

        jMenu1.setText("Movimentos");

        rmmanutencao.setText("Manutenção de Pasto");
        rmmanutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmmanutencaoActionPerformed(evt);
            }
        });
        jMenu1.add(rmmanutencao);

        rmtransferencia.setText("Transferencia de Lotes");
        jMenu1.add(rmtransferencia);

        rmvacina.setText("Vacinação");
        jMenu1.add(rmvacina);

        MRelatorio.add(jMenu1);

        tlmenus.add(MRelatorio);

        MArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/manute.gif"))); // NOI18N
        MArquivo.setText("Ferramentas");

        Backup.setText("Backup");
        Backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupActionPerformed(evt);
            }
        });
        MArquivo.add(Backup);

        tlacalculadora.setText("Calculadora");
        tlacalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlacalculadoraActionPerformed(evt);
            }
        });
        MArquivo.add(tlacalculadora);

        tlablocodenotas.setText("Bloco de Notas");
        tlablocodenotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlablocodenotasActionPerformed(evt);
            }
        });
        MArquivo.add(tlablocodenotas);

        tlacalendario.setText("Calendario");
        MArquivo.add(tlacalendario);

        jMenuItem1.setText("Contato");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MArquivo.add(jMenuItem1);

        TAusuario.setText("Alterar Usuario");
        TAusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAusuarioActionPerformed(evt);
            }
        });
        MArquivo.add(TAusuario);

        tlmenus.add(MArquivo);

        TAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/8446_32x32.png"))); // NOI18N
        TAjuda.setText("Ajuda");
        TAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAjudaActionPerformed(evt);
            }
        });

        Cadastro.setText("Cadastro");

        faz.setText("Fazenda");
        faz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazActionPerformed(evt);
            }
        });
        Cadastro.add(faz);

        past.setText("Pasto");
        past.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastActionPerformed(evt);
            }
        });
        Cadastro.add(past);

        lot.setText("Lote");
        lot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotActionPerformed(evt);
            }
        });
        Cadastro.add(lot);

        pessoa.setText("Pessoa");
        pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaActionPerformed(evt);
            }
        });
        Cadastro.add(pessoa);

        produt.setText("Produto");
        produt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtActionPerformed(evt);
            }
        });
        Cadastro.add(produt);

        raça.setText("Raça");
        raça.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raçaActionPerformed(evt);
            }
        });
        Cadastro.add(raça);

        unid.setText("Unidade de Medida");
        unid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidActionPerformed(evt);
            }
        });
        Cadastro.add(unid);

        cid.setText("Cidade");
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        Cadastro.add(cid);

        est.setText("Estado");
        est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estActionPerformed(evt);
            }
        });
        Cadastro.add(est);

        grup.setText("Grupo");
        grup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupActionPerformed(evt);
            }
        });
        Cadastro.add(grup);

        subgrp.setText("SubGrupo");
        subgrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subgrpActionPerformed(evt);
            }
        });
        Cadastro.add(subgrp);

        cult.setText("Cultura");
        cult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cultActionPerformed(evt);
            }
        });
        Cadastro.add(cult);

        classlote.setText("Classificação Lote");
        classlote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classloteActionPerformed(evt);
            }
        });
        Cadastro.add(classlote);

        destidesp.setText("Destinação Despesa");
        destidesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destidespActionPerformed(evt);
            }
        });
        Cadastro.add(destidesp);

        sermanutpast.setText("Serviço de Manutenção Pasto");
        sermanutpast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sermanutpastActionPerformed(evt);
            }
        });
        Cadastro.add(sermanutpast);

        nomevac.setText("Nome de Vacina");
        nomevac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomevacActionPerformed(evt);
            }
        });
        Cadastro.add(nomevac);

        funci.setText("Funcionário");
        funci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funciActionPerformed(evt);
            }
        });
        Cadastro.add(funci);

        TAjuda.add(Cadastro);

        Movimento.setText("Movimento");

        Sobresistema21.setText("Despesa");
        Sobresistema21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema21ActionPerformed(evt);
            }
        });
        Movimento.add(Sobresistema21);

        Sobresistema19.setText("Manutenção Pasto");
        Sobresistema19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema19ActionPerformed(evt);
            }
        });
        Movimento.add(Sobresistema19);

        Sobresistema20.setText("Transferência");
        Sobresistema20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema20ActionPerformed(evt);
            }
        });
        Movimento.add(Sobresistema20);

        Sobresistema22.setText("Sanidade");
        Sobresistema22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema22ActionPerformed(evt);
            }
        });
        Movimento.add(Sobresistema22);

        Sobresistema40.setText("Entrada");
        Sobresistema40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema40ActionPerformed(evt);
            }
        });
        Movimento.add(Sobresistema40);

        Sobresistema41.setText("Saída");
        Sobresistema41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema41ActionPerformed(evt);
            }
        });
        Movimento.add(Sobresistema41);

        Sobresistema42.setText("Baixa de Lote");
        Sobresistema42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema42ActionPerformed(evt);
            }
        });
        Movimento.add(Sobresistema42);

        TAjuda.add(Movimento);

        relatorio.setText("Relatório");

        faz1.setText("Fazenda");
        faz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faz1ActionPerformed(evt);
            }
        });
        relatorio.add(faz1);

        past1.setText("Pasto");
        past1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                past1ActionPerformed(evt);
            }
        });
        relatorio.add(past1);

        lot1.setText("Lote");
        lot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lot1ActionPerformed(evt);
            }
        });
        relatorio.add(lot1);

        Sobresistema26.setText("Pessoa Fisíca");
        Sobresistema26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema26ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema26);

        Sobresistema27.setText("Pessoa Jurídica");
        Sobresistema27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema27ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema27);

        Sobresistema39.setText("Funcionário");
        Sobresistema39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema39ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema39);

        Sobresistema30.setText("Despesa");
        Sobresistema30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema30ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema30);

        Sobresistema31.setText("Baixa de Despesa");
        Sobresistema31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema31ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema31);

        Sobresistema32.setText("Transferência");
        Sobresistema32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema32ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema32);

        Sobresistema33.setText("Manutenção de pasto");
        Sobresistema33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema33ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema33);

        Sobresistema34.setText("Baixa de Lote");
        Sobresistema34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema34ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema34);

        Sobresistema35.setText("Saída");
        Sobresistema35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema35ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema35);

        Sobresistema36.setText("Entrada");
        Sobresistema36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sobresistema36ActionPerformed(evt);
            }
        });
        relatorio.add(Sobresistema36);

        TAjuda.add(relatorio);

        Sobresistema.setText("Atalhos");
        Sobresistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobresistemaActionPerformed(evt);
            }
        });
        TAjuda.add(Sobresistema);

        tlmenus.add(TAjuda);

        setJMenuBar(tlmenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tlprinjpainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1288, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tlbtsair, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tlprinjpainel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(tlbtsair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1300, 756));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TASair() {
        System.exit(0);
    }
    private void TAusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAusuarioActionPerformed
        if (evt.getSource() == TAusuario) {
            Object[] botoes = {"Sim", "Não"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja Fechar a Sessão do Sistema?",
                    "Fechar Sessão do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                this.dispose();
            }
             Login tela = new Login();
        tela.setVisible(true);
        }
    }//GEN-LAST:event_TAusuarioActionPerformed

    private void TAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAjudaActionPerformed
    }//GEN-LAST:event_TAjudaActionPerformed

    private void SobresistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobresistemaActionPerformed
       
        
        JOptionPane.showMessageDialog(null, "Sistema Gerenciador de Fazendas");



    }//GEN-LAST:event_SobresistemaActionPerformed
  
    TMcadastrolote TMcadastro;

    private void mostrarTMcadastro() {
        if (TMcadastro == null) {
            TMcadastro = new TMcadastrolote();
            TMcadastro.setVisible(true);
        } else {
            TMcadastro.setVisible(true);
        }
    }
    TMcadastropasto TMcadastropastos;

    private void mostrarTMcadastropasto() {
        if (TMcadastropastos == null) {
            TMcadastropastos = new TMcadastropasto();
            TMcadastropastos.setVisible(true);
        } else {
            TMcadastropastos.setVisible(true);
        }
    }
    TMcadastroraca TMcadastroraca;

    private void mostrarTMcadastroraca() {
        if (TMcadastroraca == null) {
            TMcadastroraca = new TMcadastroraca();
            TMcadastroraca.setVisible(true);
        } else {
            TMcadastroraca.setVisible(true);
        }
    }
    TMcadastroproduto TMcadastroproduto;

    private void mostrarTMcadastroproduto() {
        if (TMcadastroproduto == null) {
            TMcadastroproduto = new TMcadastroproduto();
            TMcadastroproduto.setVisible(true);
        } else {
            TMcadastroproduto.setVisible(true);
        }
    }
    /*TMcadastrounidademedida TMcadastrounidademedida;

    private void mostrarTMcadastrounidademedida(){
    if (TMcadastrounidademedida == null){
    TMcadastrounidademedida = new TMcadastrounidademedida();
    TMcadastrounidademedida.setVisible(true);
    }else {
    TMcadastrounidademedida.setVisible(true);
    }
    }
     */
    TMcadastroestado TMcadastroestado;

    private void mostrarTMcadastroestado() {
        if (TMcadastroestado == null) {
            TMcadastroestado = new TMcadastroestado();
            TMcadastroestado.setVisible(true);
        } else {
            TMcadastroestado.setVisible(true);
        }
    }
    TMcadastrocidade TMcadastrocidade;

    private void mostrarTMcadastrocidade() {
        if (TMcadastrocidade == null) {
            TMcadastrocidade = new TMcadastrocidade();
            TMcadastrocidade.setVisible(true);
        } else {
            TMcadastrocidade.setVisible(true);
        }
    }



    private void CadastroloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroloteActionPerformed
        mostrarTMcadastro();
    }//GEN-LAST:event_CadastroloteActionPerformed

    private void tlbtsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbtsairActionPerformed
        if (evt.getSource() == tlbtsair) {
            Object[] botoes = {"Sim"    ,    "Não"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja Fechar a Sessão do Sistema?",
                    "Fechar Sessão do Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_tlbtsairActionPerformed

    private void CadastropastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastropastoActionPerformed
        mostrarTMcadastropasto();
    }//GEN-LAST:event_CadastropastoActionPerformed

    private void tlbtloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbtloteActionPerformed
        mostrarTMcadastro();        // TODO add your handling code here:
    }//GEN-LAST:event_tlbtloteActionPerformed

    private void atcdespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atcdespesasActionPerformed
        TMcadastrodespesa tela = new TMcadastrodespesa();
        tela.setVisible(true);
    }//GEN-LAST:event_atcdespesasActionPerformed

    private void CadsatroprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadsatroprodutoActionPerformed
        mostrarTMcadastroproduto();
        // TODO add your handling code here:
    }//GEN-LAST:event_CadsatroprodutoActionPerformed

    private void tlbotaocalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbotaocalculadoraActionPerformed
        try {
            String calculadora = "C:/Windows/system32/calc.exe";
            Runtime.getRuntime().exec(calculadora);
        } catch (IOException ex) {
            Logger.getLogger(Telaprin.class.getName()).log(Level.SEVERE, null, ex);


        }


    }//GEN-LAST:event_tlbotaocalculadoraActionPerformed

    private void tlbotaoblocodenotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbotaoblocodenotasActionPerformed
        try {
            Runtime.getRuntime().exec("C:/Windows/system32/notepad.exe"); // metodo que chama o bloco de notas
        } catch (IOException ex) {
            Logger.getLogger(Telaprin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tlbotaoblocodenotasActionPerformed

    private void tlacalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacalculadoraActionPerformed
        try {
            String calculadora = "C:/Windows/system32/calc.exe";
            Runtime.getRuntime().exec(calculadora);
            setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(Telaprin.class.getName()).log(Level.SEVERE, null, ex);



        } // TODO add your handling code here:
    }//GEN-LAST:event_tlacalculadoraActionPerformed

private void tlablocodenotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlablocodenotasActionPerformed
    try {
        Runtime.getRuntime().exec("C:/Windows/system32/notepad.exe"); // metodo que chama o bloco de notas
    } catch (IOException ex) {
        Logger.getLogger(Telaprin.class.getName()).log(Level.SEVERE, null, ex);
    }
    // TODO add your handling code here:
}//GEN-LAST:event_tlablocodenotasActionPerformed

private void CadastrofazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrofazendaActionPerformed
    TMcadastrofazenda tela = new TMcadastrofazenda();
    tela.setVisible(true);    // TODO add your handling code here:
}//GEN-LAST:event_CadastrofazendaActionPerformed

private void MCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCadastroActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_MCadastroActionPerformed

private void CadDmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadDmaisActionPerformed
}//GEN-LAST:event_CadDmaisActionPerformed

private void JMgrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMgrupoActionPerformed
    TMcadastroGrupo vc = new TMcadastroGrupo();
    vc.setVisible(true);
}//GEN-LAST:event_JMgrupoActionPerformed

private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
    mostrarTMcadastroestado();  // TODO add your handling code here:
}//GEN-LAST:event_estadoActionPerformed

private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
    mostrarTMcadastrocidade();
}//GEN-LAST:event_cidadeActionPerformed

private void UnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadeMedidaActionPerformed
    TMcadastrounidademedida tela = new TMcadastrounidademedida();
    tela.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_UnidadeMedidaActionPerformed

private void racaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racaActionPerformed
    mostrarTMcadastroraca();
}//GEN-LAST:event_racaActionPerformed

private void JMculturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMculturaActionPerformed
    TMcadastroCultura tela = new TMcadastroCultura();
    tela.setVisible(true);
}//GEN-LAST:event_JMculturaActionPerformed

private void JMdestinodespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMdestinodespesaActionPerformed
    TMcadastroDestinacaoDespesa tela = new TMcadastroDestinacaoDespesa();
    tela.setVisible(true);
}//GEN-LAST:event_JMdestinodespesaActionPerformed

private void JMclassificacaoloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMclassificacaoloteActionPerformed
    TMcadastroClassificacaoLote tela = new TMcadastroClassificacaoLote();
    tela.setVisible(true);
}//GEN-LAST:event_JMclassificacaoloteActionPerformed

private void BTcalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcalendarioActionPerformed
    Calendario vc = new Calendario();
    vc.setVisible(true);
}//GEN-LAST:event_BTcalendarioActionPerformed

private void tlacalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlacalendarioActionPerformed
    Calendario vc = new Calendario();
    vc.setVisible(true);
}//GEN-LAST:event_tlacalendarioActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 JOptionPane.showMessageDialog(null, "SigFaz- Sistema Gerenciador de Fazenda \n" +
                                     "Émerson da Costa Schulze \n" +
                                     "Email: emersonalemao10@hotmail.com/emersomalemao@yahoo.com.br \n" +

                                     "Terra Rica - Paraná cep 87890-000 \n" +
                                     
                                      "todos os direitos reservados");
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void tlcadpessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlcadpessoaActionPerformed
     CadastroEmitente vc = new CadastroEmitente() ;
    vc.setVisible(true);
}//GEN-LAST:event_tlcadpessoaActionPerformed

private void servicomanutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicomanutencaoActionPerformed
     TMcadastroServicodeManutencao vc = new TMcadastroServicodeManutencao() ;
    vc.setVisible(true);
}//GEN-LAST:event_servicomanutencaoActionPerformed

private void tlmmanupastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlmmanupastoActionPerformed
ManutPasto mt = new ManutPasto();
mt.setVisible(true);
}//GEN-LAST:event_tlmmanupastoActionPerformed

private void rcfazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcfazendaActionPerformed
  Relatorio rel = new Relatorio("C:/Users/Emerson/Documents/NetBeansProjects/Sigfaz/src/Relatorios/Fazenda.jasper");
    rel.setVisible(true);
}//GEN-LAST:event_rcfazendaActionPerformed

private void atmtransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atmtransferenciaActionPerformed
    Transferencia tr = new Transferencia();
    tr.setVisible(true);
}//GEN-LAST:event_atmtransferenciaActionPerformed

private void rcloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcloteActionPerformed
       Relatorio rel = new Relatorio("C:/Users/Emerson/Documents/NetBeansProjects/Sigfaz/src/Relatorios/Lote.jasper");
    rel.setVisible(true);
}//GEN-LAST:event_rcloteActionPerformed

private void rcpastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcpastoActionPerformed
   Relatorio rel = new Relatorio("C:/Users/Emerson/Documents/NetBeansProjects/Sigfaz/src/Relatorios/Pasto.jasper");
    rel.setVisible(true);
}//GEN-LAST:event_rcpastoActionPerformed

private void TPsanidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPsanidadeActionPerformed
   TMcadastroTipodeSanidade tr = new TMcadastroTipodeSanidade();
    tr.setVisible(true);
}//GEN-LAST:event_TPsanidadeActionPerformed

private void tlbtmorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlbtmorteActionPerformed
new Vacinado(this,true).setVisible(true);
}//GEN-LAST:event_tlbtmorteActionPerformed

private void jlusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlusuarioActionPerformed
TMcadastroUsuario tela = new TMcadastroUsuario();
   tela.setVisible(true);
}//GEN-LAST:event_jlusuarioActionPerformed

private void mmlvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmlvendaActionPerformed
 VendaForm c = new VendaForm();
    c.setVisible(true);
                            // TODO add your handling code here:
}//GEN-LAST:event_mmlvendaActionPerformed

private void mmcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmcompraActionPerformed
 CompraForm c = new CompraForm();
    c.setVisible(true);    // TODO add your handling code here:
}//GEN-LAST:event_mmcompraActionPerformed

private void rgdespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgdespesasActionPerformed
RelatorioForm rl = new RelatorioForm();
rl.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_rgdespesasActionPerformed

private void mltransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mltransferenciaActionPerformed
   Transferencia tr = new Transferencia();
    tr.setVisible(true);
}//GEN-LAST:event_mltransferenciaActionPerformed

private void mlvacinaçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlvacinaçaoActionPerformed
new Vacinado(this,true).setVisible(true);//new Vacinacao(this,true).setVisible(true);
}//GEN-LAST:event_mlvacinaçaoActionPerformed

private void BxLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BxLoteActionPerformed
BaixaLote bl = new BaixaLote();
bl.setVisible(true);
}//GEN-LAST:event_BxLoteActionPerformed

private void BackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupActionPerformed
    // TODO add your handling code here:
    new backupBaseDados(this, true).setVisible(true);
}//GEN-LAST:event_BackupActionPerformed

private void relfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relfuncionarioActionPerformed
    Relatorio rel = new Relatorio("C:/Users/Emerson/Documents/NetBeansProjects/Sigfaz/src/Relatorios/Funcionario.jasper");
    rel.setVisible(true);
}//GEN-LAST:event_relfuncionarioActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
  TMcadastrodespesa tela = new TMcadastrodespesa();
        tela.setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void MDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDespesaActionPerformed
    TMcadastrodespesa tela = new TMcadastrodespesa();
        tela.setVisible(true);
}//GEN-LAST:event_MDespesaActionPerformed

private void PessoaFisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PessoaFisActionPerformed
      Relatorio rel = new Relatorio("C:/Users/Emerson/Documents/NetBeansProjects/Sigfaz/src/Relatorios/PessoaFisica.jasper");
    rel.setVisible(true);
}//GEN-LAST:event_PessoaFisActionPerformed

private void PessoaJudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PessoaJudActionPerformed
       Relatorio rel = new Relatorio("C:/Users/Emerson/Documents/NetBeansProjects/Sigfaz/src/Relatorios/PessoaJuridica.jasper");
    rel.setVisible(true);
}//GEN-LAST:event_PessoaJudActionPerformed

private void fazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazActionPerformed
    JOptionPane.showMessageDialog(null, "Cadastra as Fazenda que o sistema gerenciará");
}//GEN-LAST:event_fazActionPerformed

private void pastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastActionPerformed
    JOptionPane.showMessageDialog(null, "Cadastra os Pasto refente a cada Fazenda");
}//GEN-LAST:event_pastActionPerformed

private void lotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotActionPerformed
    JOptionPane.showMessageDialog(null, "Cadastra os Lotes Referente a cada Fazenda e o Pasto que o mesmo estará");
}//GEN-LAST:event_lotActionPerformed

private void pessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaActionPerformed
     JOptionPane.showMessageDialog(null, "Cadastra as Pessoas que movimentaram as Entradas e Saidas de Bovinos \n"
                                          + "Podendo estás serem Física como Cliente, Fornecedor \n"
                                          + "Jurídica Cliente e Forncedor");
}//GEN-LAST:event_pessoaActionPerformed

private void produtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtActionPerformed
    JOptionPane.showMessageDialog(null, "Cadastra os Produtos para lançamento de Despesa ");
}//GEN-LAST:event_produtActionPerformed

private void raçaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raçaActionPerformed
  JOptionPane.showMessageDialog(null, "Cadastra as Raças dos Lotes");
}//GEN-LAST:event_raçaActionPerformed

private void unidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidActionPerformed
   JOptionPane.showMessageDialog(null, "Cadastra as Unidades de Medida usada nos produtos, Fazenda e Pasto");
}//GEN-LAST:event_unidActionPerformed

private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
  JOptionPane.showMessageDialog(null, "Cadastra as Cidades");
}//GEN-LAST:event_cidActionPerformed

private void estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estActionPerformed
    JOptionPane.showMessageDialog(null, "Cadastra os Estados ");
}//GEN-LAST:event_estActionPerformed

private void grupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupActionPerformed
   JOptionPane.showMessageDialog(null, "Cadastra os Grupos onde os Produtos farão parte");
}//GEN-LAST:event_grupActionPerformed

private void subgrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subgrpActionPerformed
   JOptionPane.showMessageDialog(null, "Cadastra os SubGrupo dos Produtos ");
}//GEN-LAST:event_subgrpActionPerformed

private void cultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cultActionPerformed
    JOptionPane.showMessageDialog(null, "Cadastra as Culturas dos Pasto");
}//GEN-LAST:event_cultActionPerformed

private void classloteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classloteActionPerformed
  JOptionPane.showMessageDialog(null, "Cadastra a Classificaçao que o Lote se enquadra");
}//GEN-LAST:event_classloteActionPerformed

private void destidespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destidespActionPerformed
  JOptionPane.showMessageDialog(null, "Cadastra a Destinação da Despesa ");
}//GEN-LAST:event_destidespActionPerformed

private void sermanutpastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sermanutpastActionPerformed
   JOptionPane.showMessageDialog(null, "Cadastra os Serviços que Manutenção que os Pasto tende a sofrer");
}//GEN-LAST:event_sermanutpastActionPerformed

private void nomevacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomevacActionPerformed
  JOptionPane.showMessageDialog(null, "Cadastra o Nome das Vacina ou Sanida que os Lotes serão imunizados");
}//GEN-LAST:event_nomevacActionPerformed

private void funciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funciActionPerformed
    JOptionPane.showMessageDialog(null, "Cadastra os Funcionarios que estao ligados a Fazenda");
}//GEN-LAST:event_funciActionPerformed

private void Sobresistema26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema26ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema26ActionPerformed

private void Sobresistema27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema27ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema27ActionPerformed

private void Sobresistema30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema30ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema30ActionPerformed

private void Sobresistema31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema31ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema31ActionPerformed

private void Sobresistema32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema32ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema32ActionPerformed

private void Sobresistema33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema33ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema33ActionPerformed

private void Sobresistema34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema34ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema34ActionPerformed

private void Sobresistema35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema35ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema35ActionPerformed

private void Sobresistema36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema36ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema36ActionPerformed

private void Sobresistema39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema39ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema39ActionPerformed

private void Sobresistema19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema19ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema19ActionPerformed

private void Sobresistema20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema20ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema20ActionPerformed

private void Sobresistema21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema21ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema21ActionPerformed

private void Sobresistema22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema22ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema22ActionPerformed

private void Sobresistema40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema40ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema40ActionPerformed

private void Sobresistema41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema41ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema41ActionPerformed

private void Sobresistema42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema42ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema42ActionPerformed

private void Sobresistema50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sobresistema50ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Sobresistema50ActionPerformed

private void faz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faz1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_faz1ActionPerformed

private void past1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_past1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_past1ActionPerformed

private void lot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lot1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_lot1ActionPerformed

private void rmmanutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmmanutencaoActionPerformed
    Relatorio2 rl = new Relatorio2();
rl.setVisible(true);
}//GEN-LAST:event_rmmanutencaoActionPerformed

private void atmovibxnacimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atmovibxnacimentoActionPerformed
   BaixaLote bl = new BaixaLote();
bl.setVisible(true);
}//GEN-LAST:event_atmovibxnacimentoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcalendario;
    private javax.swing.JMenuItem Backup;
    private javax.swing.JMenuItem BxLote;
    private javax.swing.JMenu CadDmais;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem Cadastrofazenda;
    private javax.swing.JMenuItem Cadastrolote;
    private javax.swing.JMenuItem Cadastropasto;
    private javax.swing.JMenuItem Cadsatroproduto;
    private javax.swing.JMenuItem JMclassificacaolote;
    private javax.swing.JMenuItem JMcultura;
    private javax.swing.JMenuItem JMdestinodespesa;
    private javax.swing.JMenuItem JMgrupo;
    private javax.swing.JMenu MArquivo;
    private javax.swing.JMenu MCadastro;
    private javax.swing.JMenu MDespesa;
    private javax.swing.JMenu MRelatorio;
    private javax.swing.JMenu Movimento;
    private javax.swing.JMenuItem PessoaFis;
    private javax.swing.JMenuItem PessoaJud;
    private javax.swing.JMenuItem Sobresistema;
    private javax.swing.JMenuItem Sobresistema19;
    private javax.swing.JMenuItem Sobresistema20;
    private javax.swing.JMenuItem Sobresistema21;
    private javax.swing.JMenuItem Sobresistema22;
    private javax.swing.JMenuItem Sobresistema26;
    private javax.swing.JMenuItem Sobresistema27;
    private javax.swing.JMenuItem Sobresistema30;
    private javax.swing.JMenuItem Sobresistema31;
    private javax.swing.JMenuItem Sobresistema32;
    private javax.swing.JMenuItem Sobresistema33;
    private javax.swing.JMenuItem Sobresistema34;
    private javax.swing.JMenuItem Sobresistema35;
    private javax.swing.JMenuItem Sobresistema36;
    private javax.swing.JMenuItem Sobresistema39;
    private javax.swing.JMenuItem Sobresistema40;
    private javax.swing.JMenuItem Sobresistema41;
    private javax.swing.JMenuItem Sobresistema42;
    private javax.swing.JMenu TAjuda;
    private javax.swing.JMenuItem TAusuario;
    private javax.swing.JMenuItem TPsanidade;
    private javax.swing.JMenuItem UnidadeMedida;
    private javax.swing.JButton atcdespesas;
    private javax.swing.JButton atmovibxnacimento;
    private javax.swing.JButton atmtransferencia;
    private javax.swing.JMenuItem cid;
    private javax.swing.JMenuItem cidade;
    private javax.swing.JMenuItem classlote;
    private javax.swing.JMenuItem cult;
    private javax.swing.JMenuItem destidesp;
    private javax.swing.JMenuItem est;
    private javax.swing.JMenuItem estado;
    private javax.swing.JMenuItem faz;
    private javax.swing.JMenuItem faz1;
    private javax.swing.JMenuItem funci;
    private javax.swing.JMenuItem grup;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem jlusuario;
    private javax.swing.JMenuItem lot;
    private javax.swing.JMenuItem lot1;
    private javax.swing.JMenu mlmanutençaolote;
    private javax.swing.JMenuItem mltransferencia;
    private javax.swing.JMenuItem mlvacinaçao;
    private javax.swing.JMenuItem mmcompra;
    private javax.swing.JMenuItem mmlvenda;
    private javax.swing.JMenuItem nomevac;
    private javax.swing.JMenuItem past;
    private javax.swing.JMenuItem past1;
    private javax.swing.JMenuItem pessoa;
    private javax.swing.JMenuItem produt;
    private javax.swing.JMenuItem raca;
    private javax.swing.JMenuItem raça;
    private javax.swing.JMenu rcadastral;
    private javax.swing.JMenuItem rcfazenda;
    private javax.swing.JMenuItem rclote;
    private javax.swing.JMenuItem rcpasto;
    private javax.swing.JMenu relatorio;
    private javax.swing.JMenuItem relfuncionario;
    private javax.swing.JMenuItem rgdespesas;
    private javax.swing.JMenu rgerencial;
    private javax.swing.JMenuItem rmmanutencao;
    private javax.swing.JMenuItem rmtransferencia;
    private javax.swing.JMenuItem rmvacina;
    private javax.swing.JMenuItem sermanutpast;
    private javax.swing.JMenuItem servicomanutencao;
    private javax.swing.JMenuItem subgrp;
    private javax.swing.JLabel tfusuario;
    private javax.swing.JMenuItem tlablocodenotas;
    private javax.swing.JMenuItem tlacalculadora;
    private javax.swing.JMenuItem tlacalendario;
    private javax.swing.JButton tlbotaoblocodenotas;
    private javax.swing.JButton tlbotaocalculadora;
    private javax.swing.JButton tlbtlote;
    private javax.swing.JButton tlbtmorte;
    private javax.swing.JButton tlbtsair;
    private javax.swing.JMenuItem tlcadpessoa;
    private javax.swing.JMenuBar tlmenus;
    private javax.swing.JMenuItem tlmmanupasto;
    private javax.swing.JPanel tlprinjpainel;
    private javax.swing.JMenuItem unid;
    // End of variables declaration//GEN-END:variables
}
