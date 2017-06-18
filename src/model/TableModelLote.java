
package model;

import entidade.Lote;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TableModelLote implements TableModel {


    private DAOGenerico<Lote> dao;
    private List<Lote> lista;

    public TableModelLote() {
        dao = new DAOGenerico<Lote>(Lote.class);
        lista = dao.list();
    }

    public TableModelLote(String consultar) {
        dao = new DAOGenerico<Lote>(Lote.class);
        Lote lot = new Lote();
        lot.setNumeroLote(consultar);
        lista = dao.findByExamplePartial(lot);
    }


    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Fazenda","Pasto","Numero Lote","Quantidade","Classificação"};
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
        Lote lot = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return lot.getFazenda().getNomeFantasia().toUpperCase();
            case 1 : return lot.getPasto().getNumero().toUpperCase();
            case 2 : return lot.getNumeroLote().toUpperCase();
            case 3 : return lot.getQuantidadeTotal();
            case 4 : return lot.getClassificacaoLote().getDescricao().toUpperCase();
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
