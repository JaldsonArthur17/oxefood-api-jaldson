package br.edu.ifpe.oxefood.api.produto;

import br.edu.ifpe.oxefood.api.categoriaproduto.CategoriaProduto;
import br.edu.ifpe.oxefood.util.EntidadeAuditavel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data 
@Table(name = "produto")
public class Produto extends EntidadeAuditavel{

    @ManyToOne
    private CategoriaProduto categoria;
    private String codigo;
    private String titulo;
    private String descricao;
    private Double valorUnitario;
    private Integer tempoEntregaMinimo;
    private Integer tempoEntregaMaximo;
}