/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Emerson
 */
@Table(name = "LOTE_VACINADO")
@Entity
public class LoteVacinado implements Serializable {
    
    @Column(name="loteVacinado_Id")
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loteVacinadoId;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="data")
    private Date data;
    
    @Column(name="observacao",length = 350,nullable = true)
    private String observacao;
    
    @ManyToOne
    private Fazenda fazenda;
    
    @ManyToOne
    private TipodeSanidade tipodeSanidade;
    
    @ManyToOne
    private Lote lote;

    public Long getLoteVacinadoId() {
        return loteVacinadoId;
    }

    public void setLoteVacinadoId(Long loteVacinadoId) {
        this.loteVacinadoId = loteVacinadoId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public TipodeSanidade getTipodeSanidade() {
        return tipodeSanidade;
    }

    public void setTipodeSanidade(TipodeSanidade tipodeSanidade) {
        this.tipodeSanidade = tipodeSanidade;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.loteVacinadoId != null ? this.loteVacinadoId.hashCode() : 0);
        hash = 31 * hash + (this.data != null ? this.data.hashCode() : 0);
        hash = 31 * hash + (this.fazenda != null ? this.fazenda.hashCode() : 0);
        hash = 31 * hash + (this.tipodeSanidade != null ? this.tipodeSanidade.hashCode() : 0);
        hash = 31 * hash + (this.lote != null ? this.lote.hashCode() : 0);
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
        final LoteVacinado other = (LoteVacinado) obj;
        if (this.loteVacinadoId != other.loteVacinadoId && (this.loteVacinadoId == null || !this.loteVacinadoId.equals(other.loteVacinadoId))) {
            return false;
        }
        if (this.data != other.data && (this.data == null || !this.data.equals(other.data))) {
            return false;
        }
        if (this.fazenda != other.fazenda && (this.fazenda == null || !this.fazenda.equals(other.fazenda))) {
            return false;
        }
        if (this.tipodeSanidade != other.tipodeSanidade && (this.tipodeSanidade == null || !this.tipodeSanidade.equals(other.tipodeSanidade))) {
            return false;
        }
        if (this.lote != other.lote && (this.lote == null || !this.lote.equals(other.lote))) {
            return false;
        }
        return true;
    }

}
