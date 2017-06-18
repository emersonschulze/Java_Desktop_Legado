

package backupmysqlgmail;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Frank
 */
@Entity
@Table(name="tabelaBackup")
public class entidadeBackup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idBackup")
    private Long id;

    

    @Column(name="bacNomeBraseDados")
    private String nomeBaseDados;

    @Column(name="bacUsuarioBase")
    private String usuarioBase;

    @Column(name="bacEnderecoServidor")
    private String enderecoServidor;

    @Column(name="bacSenhaBase")
    private String senhaBase;

    @Column(name="bacDiretorioSalvarSql")
    private String diretorioSalvarSql;

    @Column(name="bacNomeArquivoSalvar")
    private String nomeArquivoSalvar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof entidadeBackup)) {
            return false;
        }
        entidadeBackup other = (entidadeBackup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sisfunrejus.Backup.entidadeBackup[id=" + id + "]";
    }



    /**
     * @return the nomeBaseDados
     */
    public String getNomeBaseDados() {
        return nomeBaseDados;
    }

    /**
     * @param nomeBaseDados the nomeBaseDados to set
     */
    public void setNomeBaseDados(String nomeBaseDados) {
        this.nomeBaseDados = nomeBaseDados;
    }

    /**
     * @return the usuarioBase
     */
    public String getUsuarioBase() {
        return usuarioBase;
    }

    /**
     * @param usuarioBase the usuarioBase to set
     */
    public void setUsuarioBase(String usuarioBase) {
        this.usuarioBase = usuarioBase;
    }

    /**
     * @return the senhaBase
     */
    public String getSenhaBase() {
        return senhaBase;
    }

    /**
     * @param senhaBase the senhaBase to set
     */
    public void setSenhaBase(String senhaBase) {
        this.senhaBase = senhaBase;
    }

    /**
     * @return the diretorioSalvarSql
     */
    public String getDiretorioSalvarSql() {
        return diretorioSalvarSql;
    }

    /**
     * @param diretorioSalvarSql the diretorioSalvarSql to set
     */
    public void setDiretorioSalvarSql(String diretorioSalvarSql) {
        this.diretorioSalvarSql = diretorioSalvarSql;
    }

    /**
     * @return the nomeArquivoSalvar
     */
    public String getNomeArquivoSalvar() {
        return nomeArquivoSalvar;
    }

    /**
     * @param nomeArquivoSalvar the nomeArquivoSalvar to set
     */
    public void setNomeArquivoSalvar(String nomeArquivoSalvar) {
        this.nomeArquivoSalvar = nomeArquivoSalvar;
    }

    /**
     * @return the enderecoServidor
     */
    public String getEnderecoServidor() {
        return enderecoServidor;
    }

    /**
     * @param enderecoServidor the enderecoServidor to set
     */
    public void setEnderecoServidor(String enderecoServidor) {
        this.enderecoServidor = enderecoServidor;
    }

}
