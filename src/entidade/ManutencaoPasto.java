package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Table(name = "MANUTENCAO_PASTO")
@Entity
public class ManutencaoPasto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ManutencaoPasto_Id")
    private Long Id;
    
    @Column(name="valor_Total")
    private Double valorTotal;
    
    @Column(name="data")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    
    @ManyToOne
    private Fazenda fazenda;
    
    @ManyToOne
    private Pasto pasto;
    
    @ManyToOne
    private ServicoDeManutencao servicoDeManutencao;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public Pasto getPasto() {
        return pasto;
    }

    public void setPasto(Pasto pasto) {
        this.pasto = pasto;
    }

    public ServicoDeManutencao getServicoDeManutencao() {
        return servicoDeManutencao;
    }

    public void setServicoDeManutencao(ServicoDeManutencao servicoDeManutencao) {
        this.servicoDeManutencao = servicoDeManutencao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.Id != null ? this.Id.hashCode() : 0);
        hash = 29 * hash + (this.valorTotal != null ? this.valorTotal.hashCode() : 0);
        hash = 29 * hash + (this.data != null ? this.data.hashCode() : 0);
        hash = 29 * hash + (this.fazenda != null ? this.fazenda.hashCode() : 0);
        hash = 29 * hash + (this.pasto != null ? this.pasto.hashCode() : 0);
        hash = 29 * hash + (this.servicoDeManutencao != null ? this.servicoDeManutencao.hashCode() : 0);
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
        final ManutencaoPasto other = (ManutencaoPasto) obj;
        if (this.Id != other.Id && (this.Id == null || !this.Id.equals(other.Id))) {
            return false;
        }
        if (this.valorTotal != other.valorTotal && (this.valorTotal == null || !this.valorTotal.equals(other.valorTotal))) {
            return false;
        }
        if (this.data != other.data && (this.data == null || !this.data.equals(other.data))) {
            return false;
        }
        if (this.fazenda != other.fazenda && (this.fazenda == null || !this.fazenda.equals(other.fazenda))) {
            return false;
        }
        if (this.pasto != other.pasto && (this.pasto == null || !this.pasto.equals(other.pasto))) {
            return false;
        }
        if (this.servicoDeManutencao != other.servicoDeManutencao && (this.servicoDeManutencao == null || !this.servicoDeManutencao.equals(other.servicoDeManutencao))) {
            return false;
        }
        return true;
    }

   
}
