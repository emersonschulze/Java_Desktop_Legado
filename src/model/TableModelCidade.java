package model;

import entidade.Cidade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelCidade implements TableModel {

    private DAOGenerico<Cidade> dao;
    private List<Cidade> lista = new ArrayList<Cidade>();

    public TableModelCidade() {
      //  dao = new DAOGenerico<Cidade>(Cidade.class);
       //lista = dao.list();
    }

    public TableModelCidade(String consultar) {
        dao = new DAOGenerico<Cidade>(Cidade.class);
        Cidade cid = new Cidade();
        cid.setNome(consultar);
        lista = dao.findByExamplePartial(cid);
    }

    public List<Cidade> getLista() {
        return lista;
    }

    public void setLista(List<Cidade> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        if(getLista() == null){
            return 0;
    }
        return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Nome","Estado"};
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
        Cidade cid = getLista().get(rowIndex);
        switch(columnIndex) {
            case 0 : return cid.getNome().toUpperCase();
            case 1 : return cid.getEstado().getNome().toUpperCase();
        }
        return cid;
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
