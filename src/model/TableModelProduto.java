package model;

import entidade.Produto;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelProduto implements TableModel {

    private DAOGenerico<Produto> dao;
    private List<Produto> lista;

    public TableModelProduto() {
        dao = new DAOGenerico<Produto>(Produto.class);
        lista = dao.list();
    }

    public TableModelProduto(String consultar) {
        dao = new DAOGenerico<Produto>(Produto.class);
        Produto cid = new Produto();
        cid.setDescricao(consultar);
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
        String colunas[]={"  Produto  ","Unidade de Medida"," Grupo "};
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
        Produto cid = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return cid.getDescricao().toUpperCase();
            case 1 : return cid.getUnidadeMedida().getDescricao().toUpperCase();
            case 2 : return cid.getGrupo().getDescricao().toUpperCase();
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
