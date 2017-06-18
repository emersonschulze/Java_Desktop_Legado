
package model;

import entidade.Cultura;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class Combocultura implements ComboBoxModel{

    private DAOGenerico<Cultura> dao;
    private List<Cultura> lista;
    private Cultura selecionado;
    
    public Combocultura(){
        dao = new DAOGenerico<Cultura>(Cultura.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Cultura) anItem;
      
        
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
