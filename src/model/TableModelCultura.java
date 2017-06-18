package model;

import entidade.Cultura;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelCultura implements TableModel {

    private DAOGenerico<Cultura> dao;
    private List<Cultura> lista;

    public TableModelCultura() {
        dao = new DAOGenerico<Cultura>(Cultura.class);
        lista = dao.list();
    }

    public TableModelCultura(String consultar) {
        dao = new DAOGenerico<Cultura>(Cultura.class);
        Cultura cid = new Cultura();
        cid.setDescricao(consultar);
        lista = dao.findByExamplePartial(cid);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Cultura"};
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
        Cultura gru = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return gru.getDescricao().toUpperCase();
            
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
