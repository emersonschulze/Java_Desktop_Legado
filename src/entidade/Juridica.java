/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import br.com.caelum.stella.hibernate.validator.CNPJ;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="pessoa_Id")
public class Juridica extends Pessoa {

    @Column(name="cnpf")
    @CNPJ(formatted=true, message="Digite um CNPJ correto")
    private String cnpj;
    
    @Column(name="insc_Estadual")
    private String inscricaoEstadual;
    
    @Column(name="razao")
    private String razao;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    
}
