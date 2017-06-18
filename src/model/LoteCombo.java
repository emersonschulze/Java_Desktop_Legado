/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entidade.Lote;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author altitdb
 */
public class LoteCombo implements ComboBoxModel {

    private List<Lote> lista;
    private Lote selecionado;

    public LoteCombo() {
        
    }

    public LoteCombo(List<Lote> lista){
        this.lista = lista;
    }

    public List<Lote> getLista() {
        return lista;
    }

    public void setLista(List<Lote> lista) {
        this.lista = lista;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado = (Lote) anItem;

    }

    @Override
    public Object getSelectedItem() {
        return selecionado;

    }

    @Override
    public int getSize() {
        if (getLista() == null) {
            return 0;
        }
        return getLista().size();
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
