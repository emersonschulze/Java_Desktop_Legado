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
@Table(name="COMPRA")
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="compra_Id")
    private Long compraId;

    @ManyToOne
    private Pessoa emitente;

    @Column(name="quantidade")
    private Integer quantidade;

    @Column(name="total")
    private Double total;

    @Temporal(TemporalType.DATE)
    @Column(name="data_Compra")
    private Date dataCompra;

    @ManyToOne
    private Fazenda fazenda;

    @ManyToOne
    private Lote lote;

    @Column(name="estornado",nullable=true)
    private Boolean estornado;

    @Temporal(TemporalType.DATE)
    @Column(name="data_Estorno",nullable=true)
    private Date dataEstorno;

    public Long getCompraId() {
        return compraId;
    }

    public void setCompraId(Long compraId) {
        this.compraId = compraId;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Date getDataEstorno() {
        return dataEstorno;
    }

    public void setDataEstorno(Date dataEstorno) {
        this.dataEstorno = dataEstorno;
    }

    public Pessoa getEmitente() {
        return emitente;
    }

    public void setEmitente(Pessoa emitente) {
        this.emitente = emitente;
    }

    public Boolean getEstornado() {
        return estornado;
    }

    public void setEstornado(Boolean estornado) {
        this.estornado = estornado;
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (this.compraId != null ? this.compraId.hashCode() : 0);
        hash = 23 * hash + (this.emitente != null ? this.emitente.hashCode() : 0);
        hash = 23 * hash + (this.quantidade != null ? this.quantidade.hashCode() : 0);
        hash = 23 * hash + (this.total != null ? this.total.hashCode() : 0);
        hash = 23 * hash + (this.lote != null ? this.lote.hashCode() : 0);
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
        final Compra other = (Compra) obj;
        if (this.compraId != other.compraId && (this.compraId == null || !this.compraId.equals(other.compraId))) {
            return false;
        }
        if (this.emitente != other.emitente && (this.emitente == null || !this.emitente.equals(other.emitente))) {
            return false;
        }
        if (this.quantidade != other.quantidade && (this.quantidade == null || !this.quantidade.equals(other.quantidade))) {
            return false;
        }
        if (this.total != other.total && (this.total == null || !this.total.equals(other.total))) {
            return false;
        }
        if (this.dataCompra != other.dataCompra && (this.dataCompra == null || !this.dataCompra.equals(other.dataCompra))) {
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
