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
import javax.persistence.Table;

/**
 *
 * @author Emerson
 */
@Entity
@Table(name = "PRODUTO")
public class Raca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="produto_Id")
    private Long produtoId;
    
    @Column(name="descricao")
    private String descricao;
    
    @Column(name="abreveatura")
    private String abreveatura;

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

    public String getAbreveatura() {
        return abreveatura;
    }

    public void setAbreveatura(String abreveatura) {
        this.abreveatura = abreveatura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.produtoId != null ? this.produtoId.hashCode() : 0);
        hash = 29 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
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
        final Raca other = (Raca) obj;
        if (this.produtoId != other.produtoId && (this.produtoId == null || !this.produtoId.equals(other.produtoId))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }
   
   
}
