package model;

import entidade.Raca;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelRaca implements TableModel {

    private DAOGenerico<Raca> dao;
    private List<Raca> lista;

    public TableModelRaca() {
        dao = new DAOGenerico<Raca>(Raca.class);
        lista = dao.list();
    }

    public TableModelRaca(String consultar) {
        dao = new DAOGenerico<Raca>(Raca.class);
        Raca est = new Raca();
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
        String colunas[]={"Raça","Sigla"};
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
        Raca est = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return est.getDescricao().toUpperCase();
            case 1 : return est.getAbreveatura().toUpperCase();
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
