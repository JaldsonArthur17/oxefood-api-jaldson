package br.edu.ifpe.oxefood.api.voto;

import java.time.LocalDate;

import br.edu.ifpe.oxefood.util.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Voto")
@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
public class Voto extends EntidadeAuditavel{
@Column(nullable = false, length = 100)
    private String nomeEleitor;

    @Column(nullable = false, length = 9)
    private String numeroRegistroEleitoral;

    @Column
    private LocalDate dataVotacao;

    @Column(nullable = false, length = 5)
    private Integer numeroCandidatoDepFederal;

    @Column(nullable = false, length = 3)
    private Integer numeroCandidatoDepEstadual;

    @Column(nullable = false, length = 3)
    private Integer numeroCandidatoSenador;

    @Column(nullable = false, length = 2)
    private Integer numeroCandidatoGovernador;

    @Column(nullable = false, length = 2)
    private Integer numeroCandidatoPresidente;
    
}
