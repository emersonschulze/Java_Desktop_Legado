/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Emerson
 */
@Entity
@Table(name = "FAZENDA")
public class Fazenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="fazenda_Id")
    private Long fazendaId;
    
    @Column(name="nome_Fantasia")
    private String nomeFantasia;
    
    @Column(name="razao_Social")
    private String razaoSocial;
    
    @Column(name="cgc", nullable = true)
    private Integer cgc;
    
    @Column(name="numero_Incra", nullable = true)
    private Integer numeroIncra;
    
    @Column(name="endereco")
    private String endereco;
    
    @Column(name="bairro", nullable = true)
    private String bairro;
    
    @Column(name="telefone",nullable = true)
    private String telefone;
    
    @Column(name="email",nullable = true)
    private String email;
    
    @ManyToOne
    private Proprietario proprietario;
       
    @Column(name="area")
    private String area;
    
    @ManyToOne
    private Cidade cidade;

    @ManyToOne
    private UnidadeMedida unidadedemedida;

    public Long getFazendaId() {
        return fazendaId;
    }

   

    public void setFazendaId(Long fazendaId) {
        this.fazendaId = fazendaId;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Integer getCgc() {
        return cgc;
    }

    public void setCgc(Integer cgc) {
        this.cgc = cgc;
    }

    public Integer getNumeroIncra() {
        return numeroIncra;
    }

    public void setNumeroIncra(Integer numeroIncra) {
        this.numeroIncra = numeroIncra;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public UnidadeMedida getUnidadedemedida() {
        return unidadedemedida;
    }

    public void setUnidadedemedida(UnidadeMedida unidadedemedida) {
        this.unidadedemedida = unidadedemedida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.fazendaId != null ? this.fazendaId.hashCode() : 0);
        hash = 79 * hash + (this.nomeFantasia != null ? this.nomeFantasia.hashCode() : 0);
        hash = 79 * hash + (this.razaoSocial != null ? this.razaoSocial.hashCode() : 0);
        hash = 79 * hash + (this.cgc != null ? this.cgc.hashCode() : 0);
        hash = 79 * hash + (this.numeroIncra != null ? this.numeroIncra.hashCode() : 0);
        hash = 79 * hash + (this.proprietario != null ? this.proprietario.hashCode() : 0);
        hash = 79 * hash + (this.area != null ? this.area.hashCode() : 0);
        hash = 79 * hash + (this.cidade != null ? this.cidade.hashCode() : 0);
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
        final Fazenda other = (Fazenda) obj;
        if (this.fazendaId != other.fazendaId && (this.fazendaId == null || !this.fazendaId.equals(other.fazendaId))) {
            return false;
        }
        if ((this.nomeFantasia == null) ? (other.nomeFantasia != null) : !this.nomeFantasia.equals(other.nomeFantasia)) {
            return false;
        }
        if ((this.razaoSocial == null) ? (other.razaoSocial != null) : !this.razaoSocial.equals(other.razaoSocial)) {
            return false;
        }
        if (this.cgc != other.cgc && (this.cgc == null || !this.cgc.equals(other.cgc))) {
            return false;
        }
        if (this.numeroIncra != other.numeroIncra && (this.numeroIncra == null || !this.numeroIncra.equals(other.numeroIncra))) {
            return false;
        }
        if ((this.proprietario == null) ? (other.proprietario != null) : !this.proprietario.equals(other.proprietario)) {
            return false;
        }
        if ((this.area == null) ? (other.area != null) : !this.area.equals(other.area)) {
            return false;
        }
        if (this.cidade != other.cidade && (this.cidade == null || !this.cidade.equals(other.cidade))) {
            return false;
        }
        return true;
    }
    
    
}
