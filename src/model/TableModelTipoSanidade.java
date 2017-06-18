package model;

import entidade.TipodeSanidade;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelTipoSanidade implements TableModel {

    private DAOGenerico<TipodeSanidade> dao;
    private List<TipodeSanidade> lista;

    public TableModelTipoSanidade() {
        dao = new DAOGenerico<TipodeSanidade>(TipodeSanidade.class);
        lista = dao.list();
    }

    public TableModelTipoSanidade(String consultar) {
        dao = new DAOGenerico<TipodeSanidade>(TipodeSanidade.class);
        TipodeSanidade cid = new TipodeSanidade();
        cid.setDescricao(consultar);
        lista = dao.findByExamplePartial(cid);
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
        String colunas[]={"Nome da Vacina", "Tempo de Imunidade em Dias"};
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
        TipodeSanidade cid = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return cid.getDescricao().toUpperCase();
            //case 1 : return cid.getExpirasn();
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
