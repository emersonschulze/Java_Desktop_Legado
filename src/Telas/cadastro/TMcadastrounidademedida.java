package Telas.cadastro;

import entidade.UnidadeMedida;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.TableModelUnidadeMedida;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TMcadastrounidademedida extends javax.swing.JFrame {

    private DAOGenerico<UnidadeMedida> dao;
    private List<UnidadeMedida> lista;

    /** Creates new form TMcadastroestado */
    public TMcadastrounidademedida() {
        dao = new DAOGenerico<UnidadeMedida>(UnidadeMedida.class);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelamedida = new javax.swing.JTable();
        btnovo = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jlraça = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfconsultar = new javax.swing.JTextField();
        btconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelamedida.setModel(new TableModelUnidadeMedida());
        jScrollPane1.setViewportView(tabelamedida);

        btnovo.setIcon(new ImageIcon("src/icones/novo.png"));
        btnovo.setText("Novo");
        btnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovoActionPerformed(evt);
            }
        });

        btalterar.setIcon(new ImageIcon("src/imagens/JBAlterar1.png"));
        btalterar.setText("Alterar");
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        btexcluir.setIcon(new ImageIcon("src/imagens/JBExcluir3.png"));
        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btsair.setIcon(new ImageIcon("src/icones/fecha.png"));
        btsair.setText("Fechar");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        jlraça.setText("Tabela Unidade e Medida");

        jLabel1.setText("Unidade de Medida/Consultar");

        tfconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfconsultarActionPerformed(evt);
            }
        });

        btconsultar.setIcon(new ImageIcon("src/icones/lupa.png"));
        btconsultar.setText("Consultar");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jlraça, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btalterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btconsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btalterar, btconsultar, btexcluir, btnovo, btsair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlraça)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnovo)
                    .addComponent(btalterar)
                    .addComponent(btconsultar)
                    .addComponent(btexcluir)
                    .addComponent(btsair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        int selecionado = tabelamedida.getSelectedRow();
        if (selecionado != -1) {
            Object[] botoes = {"Sim", "Não", "Cancelar"};
            int ev = JOptionPane.showOptionDialog(null, "Deseja realmente Excluir?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, botoes, botoes[0]);
            if (ev == JOptionPane.YES_OPTION) {
                dao.delete(dao.list().get(selecionado));
                tabelamedida.setModel(new TableModelUnidadeMedida());
                tabelamedida.updateUI();
                     JOptionPane.showMessageDialog(null, " Registro Não Pode ser Excluido");
       
            }
        }
    }//GEN-LAST:event_btexcluirActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        if (evt.getSource() == btsair) {
            dispose();
        }      // TODO add your handling code here:
    }//GEN-LAST:event_btsairActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
        int selecionado = tabelamedida.getSelectedRow();
        if (selecionado != -1) {
            UnidadeMedida umd = dao.list().get(selecionado);
            CadastroUnidadedeMedida vc = new CadastroUnidadedeMedida(this, true);
            vc.setEntidade(umd);
            vc.setVisible(true);
            tabelamedida.setModel(new TableModelUnidadeMedida());
            tabelamedida.updateUI();
        }
    }//GEN-LAST:event_btalterarActionPerformed

    private void btnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovoActionPerformed
        CadastroUnidadedeMedida vc = new CadastroUnidadedeMedida(this, true);
        vc.setVisible(true);
        tabelamedida.setModel(new TableModelUnidadeMedida());
        tabelamedida.updateUI();        // TODO add your handling code here:
    }//GEN-LAST:event_btnovoActionPerformed

    private void tfconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfconsultarActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfconsultarActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        tabelamedida.setModel(new TableModelUnidadeMedida());
        tabelamedida.updateUI();
        String consultar = tfconsultar.getText();
        tabelamedida.setModel(new TableModelUnidadeMedida(consultar));
        tabelamedida.updateUI();          // TODO add your handling code here:
}//GEN-LAST:event_btconsultarActionPerformed

    public void run() {
        new TMcadastrounidademedida().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btalterar;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btnovo;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlraça;
    private javax.swing.JTable tabelamedida;
    private javax.swing.JTextField tfconsultar;
    // End of variables declaration//GEN-END:variables
}
