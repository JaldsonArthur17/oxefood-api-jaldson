package br.edu.ifpe.oxefood.api.voto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class VotoDTO {
    private Long id;

   @NotNull(message = "O Nome do Eleitor é de preenchimento obrigatório")
   @NotEmpty(message = "O Nome do Eleitor é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome deverá ter no máximo {max} caracteres")
    private String nomeEleitor;

    @NotEmpty(message = "O Numero de registro eleitoral é de preenchimento obrigatório")
    @NotEmpty(message = "O Numero de registro eleitoral é limitado a 9 dígitos")
    private String numeroRegistroEleitoral;
    
    private LocalDate dataVotacao;

    @NotEmpty(message = "O Numero do candidato a deputado federal é de preenchimento obrigatório")
    @NotEmpty(message = "O Numero do candidato a deputado federal é limitado a 5 dígitos")
    private Integer numeroCandidatoDepFederal;

    @NotEmpty(message = "O Numero do candidato a deputado estadual é de preenchimento obrigatório")
    @NotEmpty(message = "O Numero do candidato a deputado estadual é limitado a 3 dígitos")
    private Integer numeroCandidatoDepEstadual;

    @NotEmpty(message = "O Numero do candidato a senador é de preenchimento obrigatório")
    @NotEmpty(message = "O Numero do candidato a senador é limitado a 3 dígitos")
    private Integer numeroCandidatoSenador;
    
    @NotEmpty(message = "O Numero do candidato a governador é de preenchimento obrigatório")
    @NotEmpty(message = "O Numero do candidato a governador é limitado a 2 dígitos")
    private Integer numeroCandidatoGovernador;

    @NotEmpty(message = "O Numero do candidato a presidente é de preenchimento obrigatório")
    @NotEmpty(message = "O Numero do candidato a senador é limitado a 2 dígitos")
    private Integer numeroCandidatoPresidente;

    
}
