package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CULTURA")
public class Cultura implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cultura_Id")
    private Long culturaId;
    
    @Column(name="descricao")
    private String descricao;

    public Long getCulturaId() {
        return culturaId;
    }

    public void setCulturaId(Long culturaId) {
        this.culturaId = culturaId;
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
        hash = 89 * hash + (this.culturaId != null ? this.culturaId.hashCode() : 0);
        hash = 89 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
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
        final Cultura other = (Cultura) obj;
        if (this.culturaId != other.culturaId && (this.culturaId == null || !this.culturaId.equals(other.culturaId))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }
   
}