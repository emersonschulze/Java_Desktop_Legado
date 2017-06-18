package model;

import entidade.ClassificacaoLote;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

public class TableModelClassificacaoLote implements TableModel {

    private DAOGenerico<ClassificacaoLote> dao;
    private List<ClassificacaoLote> lista= new ArrayList<ClassificacaoLote>();

    public TableModelClassificacaoLote() {
        dao = new DAOGenerico<ClassificacaoLote>(ClassificacaoLote.class);
        lista = dao.list();
    }

    public TableModelClassificacaoLote(String consultar) {
        dao = new DAOGenerico<ClassificacaoLote>(ClassificacaoLote.class);
        ClassificacaoLote cid = new ClassificacaoLote();
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
        String colunas[]={"Classificação Lote","Periodo"};
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
        ClassificacaoLote cid = lista.get(rowIndex);
        switch(columnIndex) {
            case 0 : return cid.getDescricao().toUpperCase();
            case 1 : return cid.getPeriodo().toUpperCase();
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
