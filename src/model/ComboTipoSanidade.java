
package model;

import entidade.TipodeSanidade;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboTipoSanidade implements ComboBoxModel{

    private DAOGenerico<TipodeSanidade> dao;
    private List<TipodeSanidade> lista;
    private TipodeSanidade selecionado;
    
    public ComboTipoSanidade(){
        dao = new DAOGenerico<TipodeSanidade>(TipodeSanidade.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(TipodeSanidade) anItem;
      
        
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
