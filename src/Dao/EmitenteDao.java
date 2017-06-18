/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import entidade.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.ejb.HibernateEntityManager;
import util.Banco;

/**
 *
 * @author altitdb
 */
public final class EmitenteDao {

    private EntityManager em;

    public EmitenteDao() {
        try {
        em = Banco.getInstancia().getEm();
        } catch (Exception e) {
        }
        consulta("");
    }

    public List<Pessoa> consulta(String consulta) {
        List<Pessoa> emitente = new ArrayList<Pessoa>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Pessoa.class);
        Disjunction d = Restrictions.disjunction();
        d.add(Restrictions.ilike("razao", "%" + consulta + "%"));
        d.add(Restrictions.ilike("nome", "%" + consulta + "%"));
        d.add(Restrictions.ilike("contato", "%" + consulta + "%"));
        crit.add(d);
        emitente = crit.list();
//        System.out.println(emitente.size());
//        for(Emitente e : emitente) {
////            System.out.println(e.getNome());
//            if(e instanceof Fisica) {
//                System.out.println(((Fisica)e).getNome());
//                System.out.println(((Fisica) e).getContato());
//                System.out.println(((Fisica) e).getCidade().getCidNome());
//            } else if(e instanceof Juridica) {
//                System.out.println(((Juridica)e).getNome());
//                System.out.println(((Juridica) e).getContato());
//                System.out.println(((Juridica) e).getRazao());
//                System.out.println(((Juridica) e).getCidade().getCidNome());
//            }
//        }
        em.getTransaction().commit();
        return emitente;
    }

    public static void main(String [] args ){
        EmitenteDao emitenteDao = new EmitenteDao();
    }
}
