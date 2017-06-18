package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

@Entity
//@NamedQuery(name="Usuario.verificaLogin", query="SELECT u FROM Usuario u WHERE u.Login = :Login and u.Senha = :Senha")
@Table(name = "USUARIO")
public class Usuario implements Serializable {
   private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="usuario_Id")
    private Long usuarioId;
   
    @ManyToOne
    private Colaborador colaborador;
    
    @Column(name="login")
    private String login;
    
    @Column(name="senha")
    private String senha;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.usuarioId != null ? this.usuarioId.hashCode() : 0);
        hash = 37 * hash + (this.colaborador != null ? this.colaborador.hashCode() : 0);
        hash = 37 * hash + (this.login != null ? this.login.hashCode() : 0);
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
        final Usuario other = (Usuario) obj;
        if (this.usuarioId != other.usuarioId && (this.usuarioId == null || !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        if (this.colaborador != other.colaborador && (this.colaborador == null || !this.colaborador.equals(other.colaborador))) {
            return false;
        }
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        return true;
    }
     
}