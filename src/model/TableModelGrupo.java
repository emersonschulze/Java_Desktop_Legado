package model;

import entidade.Grupo;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelGrupo implements TableModel {

    private DAOGenerico<Grupo> dao;
    private List<Grupo> lista;

    public TableModelGrupo() {
        dao = new DAOGenerico<Grupo>(Grupo.class);
        lista = dao.list();
    }

    public TableModelGrupo(String consultar) {
        dao = new DAOGenerico<Grupo>(Grupo.class);
        Grupo cid = new Grupo();
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
        String colunas[]={"Grupo"};
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
        Grupo gru = lista.get(rowIndex);
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
