package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_SANIDADE")
public class TipodeSanidade implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="tipoSanidade_Id")
    private Long tipoSanidadeId;
    
    @Column(name="descricao")
    private String descricao;

    public Long getTipoSanidadeId() {
        return tipoSanidadeId;
    }

    public void setTipoSanidadeId(Long tipoSanidadeId) {
        this.tipoSanidadeId = tipoSanidadeId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.tipoSanidadeId != null ? this.tipoSanidadeId.hashCode() : 0);
        hash = 17 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
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
        final TipodeSanidade other = (TipodeSanidade) obj;
        if (this.tipoSanidadeId != other.tipoSanidadeId && (this.tipoSanidadeId == null || !this.tipoSanidadeId.equals(other.tipoSanidadeId))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }

}