package model;

import entidade.ManutencaoPasto;
import java.text.DecimalFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.ejb.HibernateEntityManager;
import util.Banco;
import util.DAOGenerico;

public class TableModelManutencaopasto implements TableModel {

    private DAOGenerico<ManutencaoPasto> dao;
    private List<ManutencaoPasto> lista;

private EntityManager em;

    public TableModelManutencaopasto() {
        try {
        em = Banco.getInstancia().getEm();
        } catch (Exception e) {
            e.printStackTrace();
        }
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(ManutencaoPasto.class);
        lista = crit.list();
    }
    


  /* public TableModelDespesa(String   consultar) {
        dao = new DAOGenerico<Despesa>(Despesa.class);
        Despesa est = new Despesa();
        est.(consultar);
        lista = dao.findByExamplePartial(est);
  }
*/
   
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
        String colunas[]={"Fazenda","Pasto","Manutenção"+"Valor"};
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
        ManutencaoPasto est = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return est.getFazenda().getNomeFantasia().toUpperCase();
            case 1 : return est.getPasto().getNumero().toUpperCase();
            case 2 : return est.getServicoDeManutencao()+ " " + new DecimalFormat("#,##0.00").format(est.getValorTotal());
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
