package model;

import entidade.DestinacaoDespesa;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelDestinacaoDespesa implements TableModel {

    private DAOGenerico<DestinacaoDespesa> dao;
    private List<DestinacaoDespesa> lista;

    public TableModelDestinacaoDespesa() {
        dao = new DAOGenerico<DestinacaoDespesa>(DestinacaoDespesa.class);
        lista = dao.list();
    }

    public TableModelDestinacaoDespesa(String consultar) {
        dao = new DAOGenerico<DestinacaoDespesa>(DestinacaoDespesa.class);
        DestinacaoDespesa cid = new DestinacaoDespesa();
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
        String colunas[]={"Destinação Despesa"};
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
        DestinacaoDespesa gru = lista.get(rowIndex);
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
