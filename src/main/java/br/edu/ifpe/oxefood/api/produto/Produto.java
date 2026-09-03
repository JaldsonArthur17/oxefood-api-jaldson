package br.edu.ifpe.oxefood.api.produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String titulo;
    private String descricao;
    private Double valorUnitario;
    private Integer tempoEntregaMinimo;
    private Integer tempoEntregaMaximo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getTempoEntregaMinimo() {
        return tempoEntregaMinimo;
    }

    public void setTempoEntregaMinimo(Integer tempoEntregaMinimo) {
        this.tempoEntregaMinimo = tempoEntregaMinimo;
    }

    public Integer getTempoEntregaMaximo() {
        return tempoEntregaMaximo;
    }

    public void setTempoEntregaMaximo(Integer tempoEntregaMaximo) {
        this.tempoEntregaMaximo = tempoEntregaMaximo;
    }
}