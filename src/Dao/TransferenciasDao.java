/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import entidade.Fazenda;
import entidade.Lote;
import entidade.Pasto;
import entidade.Transferencias;
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
public class TransferenciasDao {

    private EntityManager em;
    

    public TransferenciasDao () {
        try {
        em = Banco.getInstancia().getEm();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        consultaLote(consultaFazenda().get(1));
    }

    public List<Transferencias> consultaTransferencias(String fazenda) {
        List<Transferencias> listaTransferencias = new ArrayList<Transferencias>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Transferencias.class);
        crit.createAlias("fazendaOrigem", "fazendaOrigem");
        crit.createAlias("fazendaDestino", "fazendaDestino");
        crit.add(Restrictions.or(Restrictions.ilike("fazendaOrigem.faznomefan", "%" + fazenda + "%"), Restrictions.ilike("fazendaDestino.faznomefan", "%" + fazenda + "%")));
        listaTransferencias = crit.list();
        em.getTransaction().commit();
        return listaTransferencias;
    }

    public List<Fazenda> consultaFazenda() {
        List<Fazenda> listaFazenda = new ArrayList<Fazenda>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Fazenda.class);
        listaFazenda = crit.list();
        em.getTransaction().commit();
        return listaFazenda;
    }

    public List<Lote> consultaLote(Fazenda f) {
        List<Lote> lista = new ArrayList<Lote>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Lote.class);
        crit.add(Restrictions.eq("fazenda", f));
        lista = crit.list();
        em.getTransaction().commit();
        return lista;
    }

     public List<Pasto> consultaPasto(Fazenda f) {
        List<Pasto> lista = new ArrayList<Pasto>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Pasto.class);
        crit.add(Restrictions.eq("fazenda", f));
        lista = crit.list();
        em.getTransaction().commit();
        return lista;
    }

    public static void main(String [] args ) {
        new TransferenciasDao();
    }

}
