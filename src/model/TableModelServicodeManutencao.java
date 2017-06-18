package model;

import entidade.ServicoDeManutencao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelServicodeManutencao implements TableModel {

    private DAOGenerico<ServicoDeManutencao> dao;
    private List<ServicoDeManutencao> lista= new ArrayList<ServicoDeManutencao>();

    public TableModelServicodeManutencao() {
        dao = new DAOGenerico<ServicoDeManutencao>(ServicoDeManutencao.class);
        lista = dao.list();
    }

    public TableModelServicodeManutencao(String consultar) {
        dao = new DAOGenerico<ServicoDeManutencao>(ServicoDeManutencao.class);
        ServicoDeManutencao cid = new ServicoDeManutencao();
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
        String colunas[]={"Serviço"};
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
        ServicoDeManutencao cid = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return cid.getDescricao().toUpperCase();
            
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
