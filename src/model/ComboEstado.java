
package model;

import entidade.Estado;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 *
 */
public class ComboEstado implements ComboBoxModel{

    private DAOGenerico<Estado> dao;
    private List<Estado> lista;
    private Estado selecionado;
    
    public ComboEstado(){
        dao = new DAOGenerico<Estado>(Estado.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado =(Estado) anItem;
        
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
