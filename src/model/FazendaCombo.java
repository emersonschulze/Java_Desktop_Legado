/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entidade.Fazenda;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author altitdb
 */
public class FazendaCombo implements ComboBoxModel {

    private List<Fazenda> lista;
    private Fazenda selecionado;

    public FazendaCombo() {
        
    }

    public FazendaCombo(List<Fazenda> lista){
        this.lista = lista;
    }

    public List<Fazenda> getLista() {
        return lista;
    }

    public void setLista(List<Fazenda> lista) {
        this.lista = lista;
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
