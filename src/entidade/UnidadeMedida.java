package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "UNIDADE_MEDIDA")
public class UnidadeMedida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="unidadeMedida_Id")
    private Long unidadeMedidaId;

    @Column(name="descricao")
    private String descricao;
    
    @Column(name="sigla")
    private String sigla;

    public Long getUnidadeMedidaId() {
        return unidadeMedidaId;
    }

    public void setUnidadeMedidaId(Long unidadeMedidaId) {
        this.unidadeMedidaId = unidadeMedidaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.unidadeMedidaId != null ? this.unidadeMedidaId.hashCode() : 0);
        hash = 37 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 37 * hash + (this.sigla != null ? this.sigla.hashCode() : 0);
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
        final UnidadeMedida other = (UnidadeMedida) obj;
        if (this.unidadeMedidaId != other.unidadeMedidaId && (this.unidadeMedidaId == null || !this.unidadeMedidaId.equals(other.unidadeMedidaId))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if ((this.sigla == null) ? (other.sigla != null) : !this.sigla.equals(other.sigla)) {
            return false;
        }
        return true;
    }
    
}