/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Compra;
import entidade.Pessoa;
import entidade.Fazenda;
import entidade.Lote;
import entidade.Venda;
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
public class VendaDao {

    private EntityManager em;

    public VendaDao() {
        try {
        em = Banco.getInstancia().getEm();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Venda> consulta(String consulta) {
        List<Venda> lista = new ArrayList<Venda>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Venda.class);
        crit.createAlias("emitente", "e");
        crit.add(Restrictions.ilike("e.nome", "%" + consulta + "%"));
        lista = crit.list();
        em.getTransaction().commit();
        return lista;
    }

    public List<Pessoa> consultaCliente(String consulta) {
        List<Pessoa> emitente = new ArrayList<Pessoa>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Pessoa.class);
        Disjunction d = Restrictions.disjunction();
        d.add(Restrictions.ilike("razao", "%" + consulta + "%"));
        d.add(Restrictions.ilike("nome", "%" + consulta + "%"));
        d.add(Restrictions.ilike("contato", "%" + consulta + "%"));
        crit.add(d);
        crit.add(Restrictions.eq("cliente", true));
        emitente = crit.list();
        em.getTransaction().commit();
        return emitente;
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
}
