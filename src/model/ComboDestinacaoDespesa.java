
package model;

import entidade.DestinacaoDespesa;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboDestinacaoDespesa implements ComboBoxModel{

    private DAOGenerico<DestinacaoDespesa> dao;
    private List<DestinacaoDespesa> lista;
    private DestinacaoDespesa selecionado;
    
    public ComboDestinacaoDespesa(){
        dao = new DAOGenerico<DestinacaoDespesa>(DestinacaoDespesa.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(DestinacaoDespesa) anItem;
      
        
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
