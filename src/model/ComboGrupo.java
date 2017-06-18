
package model;

import entidade.Grupo;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboGrupo implements ComboBoxModel{

    private DAOGenerico<Grupo> dao;
    private List<Grupo> lista;
    private Grupo selecionado;
    
    public ComboGrupo(){
        dao = new DAOGenerico<Grupo>(Grupo.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Grupo) anItem;
      
        
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
