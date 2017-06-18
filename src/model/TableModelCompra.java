package model;

import Dao.CompraDao;
import entidade.Compra;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelCompra implements TableModel {

    private CompraDao dao;
    private List<Compra> lista = new ArrayList<Compra>();

    public TableModelCompra() {

    }

    public TableModelCompra(String consultar) {
        dao = new CompraDao();
        lista = dao.consulta(consultar);
    }

    public List<Compra> getLista() {
        return lista;
    }

    public void setLista(List<Compra> lista) {
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
        Compra c = (Compra) lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                    return new SimpleDateFormat("dd/MM/yyyy").format(c.getDataCompra());
            case 1:
                    return c.getTotal();
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
