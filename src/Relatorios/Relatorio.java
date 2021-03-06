package Relatorios;

import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import util.Banco;

public class Relatorio {

    private String path;
    private Connection conn;
    private Map map;
    private File file;
    private JasperPrint print;
    private JasperViewer viewer;
    
    public Relatorio(String caminho) {
        try {
            conn = Banco.getInstancia().getConnection();
            map = new HashMap();

           String p = caminho;
            file = new File(caminho);
            file = file.getAbsoluteFile();
            path = file.getPath();

            print = JasperFillManager.fillReport(path, map, conn);
             viewer = new JasperViewer(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
    }
    public Relatorio(String caminho, Map map) {
        try {
            conn = Banco.getInstancia().getConnection();
           String p = caminho;
            file = new File(caminho);
            file = file.getAbsoluteFile();
            path = file.getPath();
           
            print = JasperFillManager.fillReport(path, map, conn);
             viewer = new JasperViewer(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
    }
    
    public void setVisible(boolean b){
        viewer.setVisible(true);
    }
    
}