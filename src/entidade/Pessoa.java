/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="PESSOA")
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="pessoa_Id")
    private Long emitenteId;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="contato", nullable = true)
    private String contato;
    
    @Column(name="endereco")
    private String endereco;
    
    @Column(name="numero", nullable = true)
    private String numero;
    
    @Column(name="bairro", nullable = true)
    private String bairro;
    
    @Column(name="cep")
    private String cep;
    
    @Column(name="email", nullable = true)
    private String email;
    
    @Column(name="telefone", nullable=true)
    private String telefone;
    
    @Column(name="celular", nullable = true)
    private String celular;

    @Column(name="data_Cadastro")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    
    @ManyToOne(fetch=FetchType.LAZY)
    private Cidade cidade;
    
    @Column(name="funcionario", nullable = true)
    private Boolean funcionario;
    
    @Column(name="fornecedor", nullable = true)
    private Boolean fornecedor;
    
    @Column(name="cliente", nullable = true)
    private Boolean cliente;

    public Long getEmitenteId() {
        return emitenteId;
    }

    public void setEmitenteId(Long emitenteId) {
        this.emitenteId = emitenteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Boolean getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Boolean funcionario) {
        this.funcionario = funcionario;
    }

    public Boolean getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Boolean fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Boolean getCliente() {
        return cliente;
    }

    public void setCliente(Boolean cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.emitenteId != null ? this.emitenteId.hashCode() : 0);
        hash = 79 * hash + (this.nome != null ? this.nome.hashCode() : 0);
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
        final Pessoa other = (Pessoa) obj;
        if (this.emitenteId != other.emitenteId && (this.emitenteId == null || !this.emitenteId.equals(other.emitenteId))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

  

}
