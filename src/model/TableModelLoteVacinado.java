
package model;

import entidade.Lote;
import entidade.LoteVacinado;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TableModelLoteVacinado implements TableModel {


    private DAOGenerico<LoteVacinado> dao;
    private List<LoteVacinado> lista;

    public TableModelLoteVacinado() {
        dao = new DAOGenerico<LoteVacinado>(LoteVacinado.class);
        lista = dao.list();
    }

    public TableModelLoteVacinado(String consultar) {
        dao = new DAOGenerico<LoteVacinado>(LoteVacinado.class);
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
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Fazenda","Numero Lote","Vacinado contra","Vacinado em "};
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
        LoteVacinado lot = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return lot.getFazenda().getNomeFantasia().toUpperCase();
            case 1 : return lot.getLote().getNumeroLote().toUpperCase();
            case 2 : return lot.getTipodeSanidade().getDescricao().toUpperCase();
            case 3 : return new SimpleDateFormat("dd/MM/yyyy").format(lot.getData());
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
