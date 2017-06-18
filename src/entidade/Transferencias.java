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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TRANSFERENCIAS")
public class Transferencias implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="transferencia_Id")
    private Long transferenciaId;

    @ManyToOne
    private Fazenda fazendaOrigem;
    
    @ManyToOne
    private Fazenda fazendaDestino;

    @ManyToOne
    @JoinColumn(nullable=true)
    private Lote loteOrigem;

    @ManyToOne
    @JoinColumn(nullable=true)
    private Lote loteDestino;

    @ManyToOne
    @JoinColumn(nullable=true)
    private Pasto pasto;

    @Column(name="estorno")
    private Boolean estornado;

    @Temporal(TemporalType.DATE)
    @Column(name="data_Transferencia")
    private Date dataTransferencia;

    @Column(name="quantidade")
    private Integer quantidade;

    public Long getTransferenciaId() {
        return transferenciaId;
    }

    public void setTransferenciaId(Long transferenciaId) {
        this.transferenciaId = transferenciaId;
    }

    public Fazenda getFazendaOrigem() {
        return fazendaOrigem;
    }

    public void setFazendaOrigem(Fazenda fazendaOrigem) {
        this.fazendaOrigem = fazendaOrigem;
    }

    public Fazenda getFazendaDestino() {
        return fazendaDestino;
    }

    public void setFazendaDestino(Fazenda fazendaDestino) {
        this.fazendaDestino = fazendaDestino;
    }

    public Lote getLoteOrigem() {
        return loteOrigem;
    }

    public void setLoteOrigem(Lote loteOrigem) {
        this.loteOrigem = loteOrigem;
    }

    public Lote getLoteDestino() {
        return loteDestino;
    }

    public void setLoteDestino(Lote loteDestino) {
        this.loteDestino = loteDestino;
    }

    public Pasto getPasto() {
        return pasto;
    }

    public void setPasto(Pasto pasto) {
        this.pasto = pasto;
    }

    public Boolean getEstornado() {
        return estornado;
    }

    public void setEstornado(Boolean estornado) {
        this.estornado = estornado;
    }

    public Date getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(Date dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.transferenciaId != null ? this.transferenciaId.hashCode() : 0);
        hash = 29 * hash + (this.fazendaOrigem != null ? this.fazendaOrigem.hashCode() : 0);
        hash = 29 * hash + (this.fazendaDestino != null ? this.fazendaDestino.hashCode() : 0);
        hash = 29 * hash + (this.loteOrigem != null ? this.loteOrigem.hashCode() : 0);
        hash = 29 * hash + (this.loteDestino != null ? this.loteDestino.hashCode() : 0);
        hash = 29 * hash + (this.pasto != null ? this.pasto.hashCode() : 0);
        hash = 29 * hash + (this.dataTransferencia != null ? this.dataTransferencia.hashCode() : 0);
        hash = 29 * hash + (this.quantidade != null ? this.quantidade.hashCode() : 0);
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
        final Transferencias other = (Transferencias) obj;
        if (this.transferenciaId != other.transferenciaId && (this.transferenciaId == null || !this.transferenciaId.equals(other.transferenciaId))) {
            return false;
        }
        if (this.fazendaOrigem != other.fazendaOrigem && (this.fazendaOrigem == null || !this.fazendaOrigem.equals(other.fazendaOrigem))) {
            return false;
        }
        if (this.fazendaDestino != other.fazendaDestino && (this.fazendaDestino == null || !this.fazendaDestino.equals(other.fazendaDestino))) {
            return false;
        }
        if (this.loteOrigem != other.loteOrigem && (this.loteOrigem == null || !this.loteOrigem.equals(other.loteOrigem))) {
            return false;
        }
        if (this.loteDestino != other.loteDestino && (this.loteDestino == null || !this.loteDestino.equals(other.loteDestino))) {
            return false;
        }
        if (this.pasto != other.pasto && (this.pasto == null || !this.pasto.equals(other.pasto))) {
            return false;
        }
        if (this.dataTransferencia != other.dataTransferencia && (this.dataTransferencia == null || !this.dataTransferencia.equals(other.dataTransferencia))) {
            return false;
        }
        if (this.quantidade != other.quantidade && (this.quantidade == null || !this.quantidade.equals(other.quantidade))) {
            return false;
        }
        return true;
    }

   
    
}
