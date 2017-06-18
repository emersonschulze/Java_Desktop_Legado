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
import org.hibernate.annotations.Columns;

@Entity
@Table(name="BAIXA_LOTE")
public class BaixaLote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="baixaLote_Id")
    private Long baixaLoteId;
    
    @Column(name="quantidade")
    private Integer quantidate;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="data_Baixa")
    private Date dataBaixa;
    
    @ManyToOne
    private Fazenda fazenda;

    @ManyToOne
    private Lote lote;
    
    @Column(name="observacao")
    private String observacao;
    
    @Column(name="motivo")
    private Integer motivo;

    public Long getBaixaLoteId() {
        return baixaLoteId;
    }

    public void setBaixaLoteId(Long baixaLoteId) {
        this.baixaLoteId = baixaLoteId;
    }

    public Integer getQuantidate() {
        return quantidate;
    }

    public void setQuantidate(Integer quantidate) {
        this.quantidate = quantidate;
    }

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
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

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Integer getMotivo() {
        return motivo;
    }

    public void setMotivo(Integer motivo) {
        this.motivo = motivo;
    }

    public String getObs() {
        return observacao;
    }

    public void setObs(String obs) {
        this.observacao = obs;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.baixaLoteId != null ? this.baixaLoteId.hashCode() : 0);
        hash = 89 * hash + (this.quantidate != null ? this.quantidate.hashCode() : 0);
        hash = 89 * hash + (this.dataBaixa != null ? this.dataBaixa.hashCode() : 0);
        hash = 89 * hash + (this.fazenda != null ? this.fazenda.hashCode() : 0);
        hash = 89 * hash + (this.lote != null ? this.lote.hashCode() : 0);
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
        final BaixaLote other = (BaixaLote) obj;
        if (this.baixaLoteId != other.baixaLoteId && (this.baixaLoteId == null || !this.baixaLoteId.equals(other.baixaLoteId))) {
            return false;
        }
        if (this.quantidate != other.quantidate && (this.quantidate == null || !this.quantidate.equals(other.quantidate))) {
            return false;
        }
        if (this.dataBaixa != other.dataBaixa && (this.dataBaixa == null || !this.dataBaixa.equals(other.dataBaixa))) {
            return false;
        }
        if (this.fazenda != other.fazenda && (this.fazenda == null || !this.fazenda.equals(other.fazenda))) {
            return false;
        }
        if (this.lote != other.lote && (this.lote == null || !this.lote.equals(other.lote))) {
            return false;
        }
        return true;
    }

   
   
}
