
package model;

import entidade.Fazenda;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboFazenda implements ComboBoxModel{

    private DAOGenerico<Fazenda> dao;
    private List<Fazenda> lista;
    private Fazenda selecionado;
    
    public ComboFazenda(){
        dao = new DAOGenerico<Fazenda>(Fazenda.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Fazenda) anItem;
        
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
