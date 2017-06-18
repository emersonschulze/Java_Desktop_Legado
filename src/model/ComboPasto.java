
package model;

import entidade.Fazenda;
import entidade.Pasto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.hibernate.criterion.Restrictions;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboPasto implements ComboBoxModel{

    private DAOGenerico<Pasto> dao;
    private List<Pasto> lista;
    private Pasto selecionado;
    
    public ComboPasto(){
        dao = new DAOGenerico<Pasto>(Pasto.class);
        lista = new ArrayList<Pasto>();
    }

    public ComboPasto(Fazenda f){
        dao = new DAOGenerico<Pasto>(Pasto.class);
       lista = dao.findByCriteria(Restrictions.eq("fazenda", f));
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Pasto) anItem;
        
    }

    @Override
    public Object getSelectedItem() {
        return selecionado;
        
    }

    @Override
    public int getSize() {
        return lista.size();
        
    }

    @Override
    public Object getElementAt(int index) {
        return lista.get(index);
        
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }

}
