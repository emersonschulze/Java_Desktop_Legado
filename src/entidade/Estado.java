package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADO")
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="estado_Id")
    private Long estadoId;

    @Column(name="nome", length=50)
    private String nome;
    
     @Column(name="sigla", length=2)
    private String sigla;

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoId != null ? estadoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        return !((this.estadoId == null && other.estadoId != null) || (this.estadoId != null && !this.estadoId.equals(other.estadoId)));
    }

    @Override
    public String toString() {
        return nome + " - " + sigla;
    }
    
    public void setEstadoId(Long estadoId) {
        this.estadoId = estadoId;
    }
    
    public Long getEstadoId() {
        return estadoId;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}