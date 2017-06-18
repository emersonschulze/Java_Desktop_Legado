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

@Entity
@Table(name="DESPESA")
public class Despesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="despesa_Id")
    private Long despesaId;
    
    @Column(name="quantidade")
    private Double quantidade;
 
    @Column(name="valor_Total")
    private Double valorTotal;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="data_Despesa")
    private Date dataDespesa;
    
    @ManyToOne
    private Fazenda fazenda;
    
    @ManyToOne
    private Produto produto;
    
    @ManyToOne
     private DestinacaoDespesa destinacaoDespesa;
    
    @ManyToOne
    private UnidadeMedida unidadeMedida;

    @Column(name="baixa_Despesa",nullable=true)
    private Boolean baixaDespesa;

   @Override
    public String toString() {
        return quantidade + " - " + valorTotal;
    }

    public Long getDespesaId() {
        return despesaId;
    }

    public void setDespesaId(Long despesaId) {
        this.despesaId = despesaId;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataDespesa() {
        return dataDespesa;
    }

    public void setDataDespesa(Date dataDespesa) {
        this.dataDespesa = dataDespesa;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public DestinacaoDespesa getDestinacaoDespesa() {
        return destinacaoDespesa;
    }

    public void setDestinacaoDespesa(DestinacaoDespesa destinacaoDespesa) {
        this.destinacaoDespesa = destinacaoDespesa;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Boolean getBaixaDespesa() {
        return baixaDespesa;
    }

    public void setBaixaDespesa(Boolean baixaDespesa) {
        this.baixaDespesa = baixaDespesa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.despesaId != null ? this.despesaId.hashCode() : 0);
        hash = 59 * hash + (this.quantidade != null ? this.quantidade.hashCode() : 0);
        hash = 59 * hash + (this.valorTotal != null ? this.valorTotal.hashCode() : 0);
        hash = 59 * hash + (this.dataDespesa != null ? this.dataDespesa.hashCode() : 0);
        hash = 59 * hash + (this.fazenda != null ? this.fazenda.hashCode() : 0);
        hash = 59 * hash + (this.produto != null ? this.produto.hashCode() : 0);
        hash = 59 * hash + (this.destinacaoDespesa != null ? this.destinacaoDespesa.hashCode() : 0);
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
        final Despesa other = (Despesa) obj;
        if (this.despesaId != other.despesaId && (this.despesaId == null || !this.despesaId.equals(other.despesaId))) {
            return false;
        }
        if (this.quantidade != other.quantidade && (this.quantidade == null || !this.quantidade.equals(other.quantidade))) {
            return false;
        }
        if (this.valorTotal != other.valorTotal && (this.valorTotal == null || !this.valorTotal.equals(other.valorTotal))) {
            return false;
        }
        if (this.dataDespesa != other.dataDespesa && (this.dataDespesa == null || !this.dataDespesa.equals(other.dataDespesa))) {
            return false;
        }
        if (this.produto != other.produto && (this.produto == null || !this.produto.equals(other.produto))) {
            return false;
        }
        if (this.destinacaoDespesa != other.destinacaoDespesa && (this.destinacaoDespesa == null || !this.destinacaoDespesa.equals(other.destinacaoDespesa))) {
            return false;
        }
        return true;
    }

    
}
