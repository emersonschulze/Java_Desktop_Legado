
package model;

import entidade.Produto;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import util.DAOGenerico;

/**
 *
 
 */
public class ComboProduto implements ComboBoxModel{

    private DAOGenerico<Produto> dao;
    private List<Produto> lista;
    private Produto selecionado;
    
    public ComboProduto(){
        dao = new DAOGenerico<Produto>(Produto.class);
        lista = dao.list();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Produto) anItem;
        
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
