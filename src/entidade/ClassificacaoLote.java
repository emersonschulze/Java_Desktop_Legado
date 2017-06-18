package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLASSIFICACAO_LOTE")
public class ClassificacaoLote implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name="classificacaoLote_Id")
    private Long classificacaoLoteId;

    public Long getClassificacaoLoteId() {
        return classificacaoLoteId;
    }

    public void setClassificacaoLoteId(Long classificacaoLoteId) {
        this.classificacaoLoteId = classificacaoLoteId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Column(name="descricao", length=120)
    private String descricao;

    @Column(name="periodo",nullable=true)
    private String periodo;

    @Override
    public String toString() {
      return descricao + " - " + periodo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.classificacaoLoteId != null ? this.classificacaoLoteId.hashCode() : 0);
        hash = 41 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 41 * hash + (this.periodo != null ? this.periodo.hashCode() : 0);
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
        final ClassificacaoLote other = (ClassificacaoLote) obj;
        if (this.classificacaoLoteId != other.classificacaoLoteId && (this.classificacaoLoteId == null || !this.classificacaoLoteId.equals(other.classificacaoLoteId))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if ((this.periodo == null) ? (other.periodo != null) : !this.periodo.equals(other.periodo)) {
            return false;
        }
        return true;
    }

  

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
  
   
}