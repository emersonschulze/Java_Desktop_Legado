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
@Entity
@Table(name = "LOTE")
public class Lote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="lote_Id")
    private Long loteId;
    
    @Column(name="numero_Lote")
    private String numeroLote;
    
    @Column(name="quant_Macho")
    private String quantidadeMacho;
    
    @Column(name="quant_Femea")
    private String quantidadeFemea;
    
    @Column(name="quant_Total")
    private String quantidadeTotal;
    
    @Column(name="sexo")
    private String sexo;
    
    @Column(name="descricao")
    private String descricao;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="data")
    private Date data;
    
    @ManyToOne
    private Raca raca;
    
    @ManyToOne
    private Pasto pasto;
    
    @ManyToOne
    private Fazenda fazenda;
    
    @ManyToOne
    private ClassificacaoLote classificacaoLote;

    public Long getLoteId() {
        return loteId;
    }

    public void setLoteId(Long loteId) {
        this.loteId = loteId;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getQuantidadeMacho() {
        return quantidadeMacho;
    }

    public void setQuantidadeMacho(String quantidadeMacho) {
        this.quantidadeMacho = quantidadeMacho;
    }

    public String getQuantidadeFemea() {
        return quantidadeFemea;
    }

    public void setQuantidadeFemea(String quantidadeFemea) {
        this.quantidadeFemea = quantidadeFemea;
    }

    public String getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(String quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Pasto getPasto() {
        return pasto;
    }

    public void setPasto(Pasto pasto) {
        this.pasto = pasto;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public ClassificacaoLote getClassificacaoLote() {
        return classificacaoLote;
    }

    public void setClassificacaoLote(ClassificacaoLote classificacaoLote) {
        this.classificacaoLote = classificacaoLote;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.loteId != null ? this.loteId.hashCode() : 0);
        hash = 71 * hash + (this.numeroLote != null ? this.numeroLote.hashCode() : 0);
        hash = 71 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 71 * hash + (this.raca != null ? this.raca.hashCode() : 0);
        hash = 71 * hash + (this.pasto != null ? this.pasto.hashCode() : 0);
        hash = 71 * hash + (this.fazenda != null ? this.fazenda.hashCode() : 0);
        hash = 71 * hash + (this.classificacaoLote != null ? this.classificacaoLote.hashCode() : 0);
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
        final Lote other = (Lote) obj;
        if (this.loteId != other.loteId && (this.loteId == null || !this.loteId.equals(other.loteId))) {
            return false;
        }
        if ((this.numeroLote == null) ? (other.numeroLote != null) : !this.numeroLote.equals(other.numeroLote)) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.raca != other.raca && (this.raca == null || !this.raca.equals(other.raca))) {
            return false;
        }
        if (this.pasto != other.pasto && (this.pasto == null || !this.pasto.equals(other.pasto))) {
            return false;
        }
        if (this.fazenda != other.fazenda && (this.fazenda == null || !this.fazenda.equals(other.fazenda))) {
            return false;
        }
        return true;
    }

}
