package model;

import entidade.Despesa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.ejb.HibernateEntityManager;
import util.Banco;
import util.DAOGenerico;

public class TableModelDespesa implements TableModel {

    private DAOGenerico<Despesa> dao;
    private List<Despesa> lista;
    private EntityManager em;

    public TableModelDespesa() {
         try {
        em = Banco.getInstancia().getEm();
        } catch (Exception e) {
            e.printStackTrace();
        }
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Despesa.class);
        crit.add(Restrictions.eq("bxdespesa", true));
        lista = crit.list();
        em.getTransaction().commit();

    }

    public List<Despesa> getLista() {
        return lista;
    }

    public void setLista(List<Despesa> lista) {
        this.lista = lista;
    }




   public TableModelDespesa(String consultar) {
       try {
        em = Banco.getInstancia().getEm();
        } catch (Exception e) {
            e.printStackTrace();
        }
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Despesa.class);
        crit.createAlias("fazenda", "f");
        crit.add(Restrictions.ilike("f.faznomefan", "%" + consultar + "%"));
        crit.add(Restrictions.eq("bxdespesa", false));
        lista = crit.list();
        em.getTransaction().commit();
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
        String colunas[]={"Fazenda","Produto","Quantidade","Valor","Vencimento"};
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
        Despesa est = lista.get(rowIndex);
        switch (columnIndex){
            case 0 : return est.getFazenda().getNomeFantasia().toUpperCase();
            case 1 : return est.getProduto().getDescricao().toUpperCase();
            case 2 : return est.getQuantidade()+ " - " + est.getUnidadeMedida();
            case 3 : return est.getValorTotal();
            case 4: return est.getDataDespesa();
            
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
