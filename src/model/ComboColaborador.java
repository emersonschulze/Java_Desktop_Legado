/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entidade.Colaborador;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author altitdb
 */
public class ComboColaborador implements ComboBoxModel {

    private List<Colaborador> lista;

    public ComboColaborador() {
        
    }

    public ComboColaborador(List<Colaborador> lista){
        this.lista = lista;
    }

    public void setLista(List<Colaborador> lista) {
        this.lista = lista;
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

    public void setSelectedItem(Object anItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
