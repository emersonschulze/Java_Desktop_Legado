package model;

import entidade.UnidadeMedida;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelUnidadeMedida implements TableModel {

    private DAOGenerico<UnidadeMedida> dao;
    private List<UnidadeMedida> lista;

    public TableModelUnidadeMedida() {
        dao = new DAOGenerico<UnidadeMedida>(UnidadeMedida.class);
        lista = dao.list();
    }

    public TableModelUnidadeMedida(String consultar) {
        dao = new DAOGenerico<UnidadeMedida>(UnidadeMedida.class);
        UnidadeMedida est = new UnidadeMedida();
        est.setDescricao(consultar);
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
        String colunas[]={"Unidade Medida","Sigla"};
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
        UnidadeMedida est = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return est.getDescricao().toUpperCase();
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
