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
import javax.persistence.TemporalType;

@Entity
@Table(name="VENDA")
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="venda_Id")
    private Long vendaId;

    @ManyToOne
    private Pessoa emitente;

    @Column(name="quantidade")
    private Integer quantidade;

    @Column(name="valor_Total")
    private Double valorTotal;

    @Column(name="data_Venda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;

    @ManyToOne
    private Fazenda fazenda;

    @ManyToOne
    private Lote lote;

    @Column(name="estornado")
    private Boolean estornado;

    @Temporal(TemporalType.DATE)
    @Column(name="data_Estorno")
    private Date dataEstorno;

    public Long getVendaId() {
        return vendaId;
    }

    public void setVendaId(Long vendaId) {
        this.vendaId = vendaId;
    }

    public Pessoa getEmitente() {
        return emitente;
    }

    public void setEmitente(Pessoa emitente) {
        this.emitente = emitente;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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

    public Boolean getEstornado() {
        return estornado;
    }

    public void setEstornado(Boolean estornado) {
        this.estornado = estornado;
    }

    public Date getDataEstorno() {
        return dataEstorno;
    }

    public void setDataEstorno(Date dataEstorno) {
        this.dataEstorno = dataEstorno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.vendaId != null ? this.vendaId.hashCode() : 0);
        hash = 53 * hash + (this.emitente != null ? this.emitente.hashCode() : 0);
        hash = 53 * hash + (this.quantidade != null ? this.quantidade.hashCode() : 0);
        hash = 53 * hash + (this.valorTotal != null ? this.valorTotal.hashCode() : 0);
        hash = 53 * hash + (this.dataVenda != null ? this.dataVenda.hashCode() : 0);
        hash = 53 * hash + (this.fazenda != null ? this.fazenda.hashCode() : 0);
        hash = 53 * hash + (this.lote != null ? this.lote.hashCode() : 0);
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
        final Venda other = (Venda) obj;
        if (this.vendaId != other.vendaId && (this.vendaId == null || !this.vendaId.equals(other.vendaId))) {
            return false;
        }
        if (this.emitente != other.emitente && (this.emitente == null || !this.emitente.equals(other.emitente))) {
            return false;
        }
        if (this.quantidade != other.quantidade && (this.quantidade == null || !this.quantidade.equals(other.quantidade))) {
            return false;
        }
        if (this.valorTotal != other.valorTotal && (this.valorTotal == null || !this.valorTotal.equals(other.valorTotal))) {
            return false;
        }
        if (this.dataVenda != other.dataVenda && (this.dataVenda == null || !this.dataVenda.equals(other.dataVenda))) {
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
