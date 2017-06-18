
package model;

import entidade.Fazenda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import util.DAOGenerico;

/**
 *
 * @author Emerson
 */
public class TableModelFazenda implements TableModel {


    private DAOGenerico<Fazenda> dao;
    private List<Fazenda> lista = new ArrayList<Fazenda>();

    public TableModelFazenda() {
        dao = new DAOGenerico<Fazenda>(Fazenda.class);
        lista = dao.list();
    }

    public TableModelFazenda(String consultar) {
        dao = new DAOGenerico<Fazenda>(Fazenda.class);
        Fazenda faz = new Fazenda();
        faz.setNomeFantasia(consultar);
        lista = dao.findByExamplePartial(faz);
    }


    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[]={"Fazenda","Proprietario","Area"};
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
        Fazenda faz = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return faz.getNomeFantasia().toUpperCase();
            case 1 : return faz.getProprietario().getPessoa().getNome().toUpperCase();
            case 2 : return faz.getArea() + " " + faz.getUnidadedemedida();
           
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
