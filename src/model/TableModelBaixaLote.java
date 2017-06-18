
package model;

import entidade.BaixaLote;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TableModelBaixaLote implements TableModel {


    private DAOGenerico<BaixaLote> dao;
    private List<BaixaLote> lista;

    public TableModelBaixaLote() {
//        dao = new DAOGenerico<BXLote>(BaixaLote.class);
//        lista = dao.list();
    }


    @Override
    public int getRowCount() {
        if(lista == null) {
            return 0;
        }
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Fazenda","Lote","Motivo","Quantidade","Data"};
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
        BaixaLote lot = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return lot.getFazenda().getNomeFantasia().toUpperCase();
            case 1 : return lot.getLote().getNumeroLote().toUpperCase();
            case 2: return lot.getMotivo() == 0 ? "NASCIMENTO" : lot.getMotivo() == 1 ? "MORTE" : lot.getMotivo() == 2 ? "DOAÇÃO" : "";
            case 3 : return lot.getQuantidate();
            case 4 : return new SimpleDateFormat("dd/MM/yyyy").format(lot.getDataBaixa());
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
