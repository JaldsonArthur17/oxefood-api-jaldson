package br.edu.ifpe.oxefood.api.categoriaproduto;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class CategoriaProdutoDTO {

    private Long id;

    private String versao;

    @NotBlank(message = "A descrição é obrigatória")
    @Length(max = 100, message = "A descriçãod deve ter no máximo {max} caracteres")
    private String descricao;

}