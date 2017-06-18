package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DESTINO_DESPESA")
public class DestinacaoDespesa implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="destinoDespesa_Id")
    private Long destinacaoDespesaId;
    
    @Column(name="descricao")
    private String descricao;
  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (destinacaoDespesaId != null ? destinacaoDespesaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof DestinacaoDespesa)) {
            return false;
        }
        DestinacaoDespesa other = (DestinacaoDespesa) object;
        if ((this.destinacaoDespesaId == null && other.destinacaoDespesaId != null) || 
                 (this.destinacaoDespesaId != null && !this.destinacaoDespesaId.equals(other.destinacaoDespesaId))) {
            return false;
        }
        return true;

    }

    public Long getId() {
        return destinacaoDespesaId;
    }

    public void setId(Long Id) {
        this.destinacaoDespesaId = Id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
}