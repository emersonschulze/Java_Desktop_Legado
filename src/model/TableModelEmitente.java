package model;

import Dao.CompraDao;
import Dao.EmitenteDao;
import Dao.VendaDao;
import entidade.Pessoa;
import entidade.Fisica;
import entidade.Juridica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TableModelEmitente implements TableModel {

    private EmitenteDao dao;
    private CompraDao cdao;
    private VendaDao vdao;
    private List<Pessoa> lista = new ArrayList<Pessoa>();

    public TableModelEmitente() {
        
    }

    public TableModelEmitente(String consultar) {
        dao = new EmitenteDao();
        lista = dao.consulta(consultar);
    }

    public TableModelEmitente(String consultar, Boolean fornecedor, Boolean cliente) {
        if(fornecedor) {
        cdao = new CompraDao();
        lista = cdao.consultaFornecedor(consultar);
        } else if(cliente) {
            vdao = new VendaDao();
            lista = vdao.consultaCliente(consultar);
        }
    }

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[] = {"Nome / Nome Fantasia", "Razão Social", "Contato"};
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
        Pessoa e = (Pessoa) lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                    return e instanceof Fisica ? ((Fisica) e).getNome().toUpperCase() : ((Juridica) e).getNome().toUpperCase();
            case 1:
                    return e instanceof Fisica ? "" : ((Juridica) e).getRazao().toUpperCase();
            case 2:
                    return e instanceof Fisica ? ((Fisica) e).getContato().toUpperCase() : ((Juridica) e).getContato().toUpperCase();
        }
        return e;
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
