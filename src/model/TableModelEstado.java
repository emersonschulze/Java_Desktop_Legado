package model;

import entidade.Estado;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelEstado implements TableModel {

    private DAOGenerico<Estado> dao;
    private List<Estado> lista;

    public TableModelEstado() {
        dao = new DAOGenerico<Estado>(Estado.class);
        lista = dao.list();
    }

    public TableModelEstado(String consultar) {
        dao = new DAOGenerico<Estado>(Estado.class);
        Estado est = new Estado();
        est.setNome(consultar);
        lista = dao.findByExamplePartial(est);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Estado","Sigla"};
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
        Estado est = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return est.getNome().toUpperCase();
            case 1 : return est.getSigla().toUpperCase();
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
