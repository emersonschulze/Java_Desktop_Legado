
package model;

import entidade.ServicoDeManutencao;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboServicoManutencao implements ComboBoxModel{

    private DAOGenerico<ServicoDeManutencao> dao;
    private List<ServicoDeManutencao> lista;
    private ServicoDeManutencao selecionado;
    
    public ComboServicoManutencao(){
        dao = new DAOGenerico<ServicoDeManutencao>(ServicoDeManutencao.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(ServicoDeManutencao) anItem;
      
        
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
