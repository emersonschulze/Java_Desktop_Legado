
package model;

import entidade.Raca;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboRaca implements ComboBoxModel{

    private DAOGenerico<Raca> dao;
    private List<Raca> lista;
    private Raca selecionado;
    
    public ComboRaca(){
        dao = new DAOGenerico<Raca>(Raca.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Raca) anItem;
        
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
