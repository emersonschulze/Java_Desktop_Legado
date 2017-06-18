/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 package sigfaz;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

 public class ExemploCombo extends JFrame {
    private JComboBox combo;
    private JButton botao;

    public static void main(String args[]) {
       new ExemploCombo();
    }

    public ExemploCombo() {
       Container contentPane = this.getContentPane();

       JPanel painel = new JPanel();

       combo = new JComboBox();

       combo.addItem(new Cidade("Bauru", "SP"));
       combo.addItem(new Cidade("São Carlos", "Não sei"));
       combo.addItem(new Cidade("São Paulo", "Teste"));

       botao = new JButton("Clique");
       botao.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
             Cidade c = (Cidade)combo.getSelectedItem();
             JOptionPane.showMessageDialog(ExemploCombo.this, "Cidade: " + c.getCidade() + " - UF: " + c.getUf());
          }
       });

       painel.add(combo);
       painel.add(botao);

       contentPane.add(painel, BorderLayout.NORTH);

       this.setTitle("Exemplo JComboBox");
       this.pack();
       this.setVisible(true);
    }

    class Cidade {
       private String cidade;
       private String uf;

       public Cidade() {

       }

       public Cidade(String cidade, String uf) {
          this.setCidade(cidade);
          this.setUf(uf);
       }

       public String getCidade() {
          return this.cidade;
       }

       public void setCidade(String cidade) {
          this.cidade = cidade;
       }

       public String getUf() {
          return uf;
       }

       public void setUf(String uf) {
          this.uf = uf;
       }

       public String toString() {
          return this.getCidade();
       }
    }
 }