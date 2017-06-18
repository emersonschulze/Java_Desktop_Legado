/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entidade.Pasto;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author altitdb
 */
public class PastoCombo implements ComboBoxModel {

    private List<Pasto> lista;
    private Pasto selecionado;

    public PastoCombo() {
        
    }

    public PastoCombo(List<Pasto> lista){
        this.lista = lista;
    }

    public List<Pasto> getLista() {
        return lista;
    }

    public void setLista(List<Pasto> lista) {
        this.lista = lista;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado=(Pasto) anItem;

    }

    @Override
    public Object getSelectedItem() {
        return selecionado;

    }

    @Override
    public int getSize() {
        if(getLista() == null) {
            return 0;
        }
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
