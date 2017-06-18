package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "PRODUTO")
@Entity
public class Produto implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="produto_Id")
    private Long produtoId;
    
    @Column(name="descricao")
    private String descricao;
    
    @ManyToOne
    private Grupo grupo;

   @ManyToOne
   private UnidadeMedida unidadeMedida;

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.produtoId != null ? this.produtoId.hashCode() : 0);
        hash = 79 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 79 * hash + (this.grupo != null ? this.grupo.hashCode() : 0);
        hash = 79 * hash + (this.unidadeMedida != null ? this.unidadeMedida.hashCode() : 0);
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
        final Produto other = (Produto) obj;
        if (this.produtoId != other.produtoId && (this.produtoId == null || !this.produtoId.equals(other.produtoId))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.grupo != other.grupo && (this.grupo == null || !this.grupo.equals(other.grupo))) {
            return false;
        }
        if (this.unidadeMedida != other.unidadeMedida && (this.unidadeMedida == null || !this.unidadeMedida.equals(other.unidadeMedida))) {
            return false;
        }
        return true;
    }

  
}