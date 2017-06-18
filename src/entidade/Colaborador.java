/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author emerson
 */
 @Entity
@Table(name = "COLABORADOR")
public class Colaborador implements Serializable {

   private static final long serialVersionUID = 1L;
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="colaborador_Id")
    private Long colaboradorId;
    
   @Column(name="cargo")
   private String cargo;
    
   @Column(name="salario")
   private Double salario;
    
   @ManyToOne
   private Fazenda fazenda;
   
   @ManyToOne
   private Pessoa emitente;

    public Long getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(Long colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public Pessoa getEmitente() {
        return emitente;
    }

    public void setEmitente(Pessoa emitente) {
        this.emitente = emitente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.colaboradorId != null ? this.colaboradorId.hashCode() : 0);
        hash = 31 * hash + (this.cargo != null ? this.cargo.hashCode() : 0);
        hash = 31 * hash + (this.fazenda != null ? this.fazenda.hashCode() : 0);
        hash = 31 * hash + (this.emitente != null ? this.emitente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Colaborador other = (Colaborador) obj;
        if (this.colaboradorId != other.colaboradorId && (this.colaboradorId == null || !this.colaboradorId.equals(other.colaboradorId))) {
            return false;
        }
        if ((this.cargo == null) ? (other.cargo != null) : !this.cargo.equals(other.cargo)) {
            return false;
        }
        if (this.fazenda != other.fazenda && (this.fazenda == null || !this.fazenda.equals(other.fazenda))) {
            return false;
        }
        if (this.emitente != other.emitente && (this.emitente == null || !this.emitente.equals(other.emitente))) {
            return false;
        }
        return true;
    }
       
}