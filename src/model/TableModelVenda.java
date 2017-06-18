package model;

import Dao.VendaDao;
import entidade.Venda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelVenda implements TableModel {

    private VendaDao dao;
    private List<Venda> lista = new ArrayList<Venda>();

    public TableModelVenda() {

    }

    public TableModelVenda(String consultar) {
        dao = new VendaDao();
        lista = dao.consulta(consultar);
    }

    public List<Venda> getLista() {
        return lista;
    }

    public void setLista(List<Venda> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[] = {"Data", "Valor", "Fazenda", "Lote"};
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
        Venda c = (Venda) lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                    return new SimpleDateFormat("dd/MM/yyyy").format(c.getDataVenda());
            case 1:
                    return c.getValorTotal();
            case 2:
                    return c.getFazenda().getNomeFantasia();
            case 3:
                    return c.getLote().getNumeroLote();
        }
        return c;
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
