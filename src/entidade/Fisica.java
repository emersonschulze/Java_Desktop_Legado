/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import br.com.caelum.stella.hibernate.validator.CPF;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="pessoa_Id")
@Table(name = "PESSOA_FISICA")
public class Fisica extends Pessoa {

    @Column(name="cpf")
    @CPF(formatted=true, message="Digite um CPF correto")
    private String cpf;
    
    @Column(name="rg")
    private String rg;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
