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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author emerson
 */
@Table(name = "PROPRIETARIO")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="pessoa_Id")
@Entity
public class Proprietario implements Serializable{
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="proprietario_Id")
    private Long proprietarioId;
    
    @ManyToOne
    private Pessoa pessoa;
    
    @ManyToOne
    private Fazenda fazenda;

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    @Column(name="porcent_Propriedade")
    private String porcentagemPropriedade;
    
      public String getPorcentagemPropriedade() {
        return porcentagemPropriedade;
    }

    public void setPorcentagemPropriedade(String porcentagemPropriedade) {
        this.porcentagemPropriedade = porcentagemPropriedade;
    }
    
    public Long getProprietarioId() {
        return proprietarioId;
    }

    public void setProprietarioId(Long proprietarioId) {
        this.proprietarioId = proprietarioId;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.proprietarioId != null ? this.proprietarioId.hashCode() : 0);
        hash = 89 * hash + (this.pessoa != null ? this.pessoa.hashCode() : 0);
        hash = 89 * hash + (this.porcentagemPropriedade != null ? this.porcentagemPropriedade.hashCode() : 0);
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
        final Proprietario other = (Proprietario) obj;
        if (this.proprietarioId != other.proprietarioId && (this.proprietarioId == null || !this.proprietarioId.equals(other.proprietarioId))) {
            return false;
        }
        if (this.pessoa != other.pessoa && (this.pessoa == null || !this.pessoa.equals(other.pessoa))) {
            return false;
        }
        if ((this.porcentagemPropriedade == null) ? (other.porcentagemPropriedade != null) : !this.porcentagemPropriedade.equals(other.porcentagemPropriedade)) {
            return false;
        }
        return true;
    }
    
}