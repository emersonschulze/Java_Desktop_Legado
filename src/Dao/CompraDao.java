/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Compra;
import entidade.Pessoa;
import entidade.Fazenda;
import entidade.Lote;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
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
public class CompraDao {

    private EntityManager em;

    public CompraDao() {
        try {
        em = Banco.getInstancia().getEm();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Compra> consulta(String consulta) {
        List<Compra> lista = new ArrayList<Compra>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Compra.class);
        crit.createAlias("emitente", "e");
        crit.add(Restrictions.ilike("e.nome", "%" + consulta + "%"));
        lista = crit.list();
        em.getTransaction().commit();
        return lista;
    }

    public List<Pessoa> consultaFornecedor(String consulta) {
        List<Pessoa> emitente = new ArrayList<Pessoa>();
        em.getTransaction().begin();
        Session session = ((HibernateEntityManager) em).getSession();
        Criteria crit = session.createCriteria(Pessoa.class);
        Disjunction d = Restrictions.disjunction();
        d.add(Restrictions.ilike("razao", "%" + consulta + "%"));
        d.add(Restrictions.ilike("nome", "%" + consulta + "%"));
        d.add(Restrictions.ilike("contato", "%" + consulta + "%"));
        crit.add(d);
        crit.add(Restrictions.eq("fornecedor", true));
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

    public List<Compra> consulta(Date dtInicial, Date dtFinal) {
        List<Compra> lista = new ArrayList<Compra>();
        try {
            DateFormat formatInicial = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            DateFormat formatFinal = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date dtI = (Date) formatInicial.parse(new SimpleDateFormat("yyyy/MM/dd 00:00:00").format(dtInicial));
            Date dtF = (Date) formatFinal.parse(new SimpleDateFormat("yyyy/MM/dd 23:59:59").format(dtFinal));
//            Criteria crit = .getSession().createCriteria(Compra.class);
//            crit.add(Restrictions.between("dtCompra", dtI, dtF));
//            lista = crit.list();
      } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta");
        }
        return lista;
    }
}



