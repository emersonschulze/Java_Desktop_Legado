
package model;

import entidade.ClassificacaoLote;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboClassificacaoLote implements ComboBoxModel{

    private DAOGenerico<ClassificacaoLote> dao;
    private List<ClassificacaoLote> lista;
    private ClassificacaoLote selecionado;
    
    public ComboClassificacaoLote(){
        dao = new DAOGenerico<ClassificacaoLote>(ClassificacaoLote.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(ClassificacaoLote) anItem;
      
        
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
