package model;

import entidade.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelUsuario implements TableModel {

    private DAOGenerico<Usuario> dao;
    private List<Usuario> lista= new ArrayList<Usuario>();

    public TableModelUsuario() {
        dao = new DAOGenerico<Usuario>(Usuario.class);
        lista = dao.list();
    }

    public TableModelUsuario(String consultar) {
        dao = new DAOGenerico<Usuario>(Usuario.class);
        Usuario cid = new Usuario();
        cid.setLogin(consultar);
        lista = dao.findByExamplePartial(cid);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Nome do Usuario","Fazenda","Salario","Cargo","Login"};
        return colunas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario cid = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return cid.getColaborador().getEmitente().getNome().toUpperCase();
            case 1 : return cid.getLogin().toUpperCase();
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
}
