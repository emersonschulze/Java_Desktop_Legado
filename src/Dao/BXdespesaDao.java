/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Despesa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.ejb.HibernateEntityManager;
import util.Banco;

/**
 *
 * @author altitdb
 */
public class BXdespesaDao {

    private EntityManager em;

    public BXdespesaDao() {
        try {
        em = Banco.getInstancia().getEm();
        } catch (Exception e) {
        }
    }

  

    
    public List<Despesa> consultaDespesa() {
        List<Despesa> listaDespesa = new ArrayList<Despesa>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Despesa.class);
        listaDespesa = crit.list();
        em.getTransaction().commit();
        return listaDespesa;
    }

   
}
