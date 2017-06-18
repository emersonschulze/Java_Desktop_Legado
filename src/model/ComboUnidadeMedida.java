
package model;

import entidade.UnidadeMedida;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;


public class ComboUnidadeMedida implements ComboBoxModel{

    private DAOGenerico<UnidadeMedida> dao;
    private List<UnidadeMedida> lista;
    private UnidadeMedida selecionado;
    
    public ComboUnidadeMedida(){
        dao = new DAOGenerico<UnidadeMedida>(UnidadeMedida.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado =(UnidadeMedida) anItem;
        
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
