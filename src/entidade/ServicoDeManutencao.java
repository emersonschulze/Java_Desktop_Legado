package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICO_MANUTENCAO")
public class ServicoDeManutencao implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name="servicoManutencao_Id")
    private Long servicoManutencaoId;
    
     @Column(name="descricao")
    private String descricao;

    public Long getServicoManutencaoId() {
        return servicoManutencaoId;
    }

    public void setServicoManutencaoId(Long servicoManutencaoId) {
        this.servicoManutencaoId = servicoManutencaoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (this.servicoManutencaoId != null ? this.servicoManutencaoId.hashCode() : 0);
        hash = 61 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
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
        final ServicoDeManutencao other = (ServicoDeManutencao) obj;
        if (this.servicoManutencaoId != other.servicoManutencaoId && (this.servicoManutencaoId == null || !this.servicoManutencaoId.equals(other.servicoManutencaoId))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }
       
}