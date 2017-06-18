package model;

import entidade.Pasto;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelPasto implements TableModel {

    private DAOGenerico<Pasto> dao;
    private List<Pasto> lista;

    public TableModelPasto() {
        dao = new DAOGenerico<Pasto>(Pasto.class);
        lista = dao.list();
    }

    public TableModelPasto(String consultar) {
        dao = new DAOGenerico<Pasto>(Pasto.class);
        Pasto cid = new Pasto();
        cid.setNumero(consultar);
        lista = dao.findByExamplePartial(cid);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Fazenda","Numero Pasto","Cultura","Areá"};
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
        Pasto cid = lista.get(rowIndex);
        switch(columnIndex) {
             case 0 : return cid.getFazenda().getNomeFantasia().toUpperCase();
            case 1 : return cid.getNumero().toUpperCase();
            case 2 : return cid.getCultura().getDescricao().toUpperCase();
            case 3 : return cid.getUnidadeMedida().getDescricao().toUpperCase();
           
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
