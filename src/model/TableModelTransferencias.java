package model;

import Dao.TransferenciasDao;
import entidade.Transferencias;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelTransferencias implements TableModel {

    private TransferenciasDao dao;
    private List<Transferencias> lista = new ArrayList<Transferencias>();

    public TableModelTransferencias() {
        
    }

    public TableModelTransferencias(String consultar) {
        dao = new TransferenciasDao();
        lista = dao.consultaTransferencias(consultar);
    }

    public List<Transferencias> getLista() {
        return lista;
    }

    public void setLista(List<Transferencias> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        if(getLista() == null) {
            return 0;
        }
        return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[] = {"Faz. Origem", "Lote Origem", "Faz. Destino", "Lote Destino", "Pasto Destino", "Data"};
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
        Transferencias t = (Transferencias) lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                    return t.getFazendaOrigem().getNomeFantasia();
            case 1:
                    return t.getLoteOrigem().getNumeroLote();
            case 2:
                    return t.getFazendaDestino().getNomeFantasia();
            case 3:
                    return t.getLoteDestino().getNumeroLote();
            case 4:
                    return t.getPasto() == null ? "" : t.getPasto().getCultura().getDescricao();
            case 5:
                    return new SimpleDateFormat("dd/MM/yyyy").format(t.getDataTransferencia());
        }
        return t;
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
