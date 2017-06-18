/*
 * To change this template, choose Tools | Templates
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
import javax.persistence.Table;

/**
 *
 * @author Emerson
 */
@Table(name = "PASTO")
@Entity
public class Pasto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="pasto_Id")
    private Long pastoId;
    
    @Column(name="numero")
    private String numero;
    
    @Column(name="area")
    private String area;
    
    @ManyToOne
    private Cultura cultura;

    @ManyToOne
    private UnidadeMedida unidadeMedida;

    @ManyToOne
    private Fazenda fazenda;

    public Long getPastoId() {
        return pastoId;
    }

    public void setPastoId(Long pastoId) {
        this.pastoId = pastoId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Cultura getCultura() {
        return cultura;
    }

    public void setCultura(Cultura cultura) {
        this.cultura = cultura;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.pastoId != null ? this.pastoId.hashCode() : 0);
        hash = 59 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 59 * hash + (this.cultura != null ? this.cultura.hashCode() : 0);
        hash = 59 * hash + (this.fazenda != null ? this.fazenda.hashCode() : 0);
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
        final Pasto other = (Pasto) obj;
        if (this.pastoId != other.pastoId && (this.pastoId == null || !this.pastoId.equals(other.pastoId))) {
            return false;
        }
        if ((this.numero == null) ? (other.numero != null) : !this.numero.equals(other.numero)) {
            return false;
        }
        if (this.cultura != other.cultura && (this.cultura == null || !this.cultura.equals(other.cultura))) {
            return false;
        }
        if (this.fazenda != other.fazenda && (this.fazenda == null || !this.fazenda.equals(other.fazenda))) {
            return false;
        }
        return true;
    }


    
}

