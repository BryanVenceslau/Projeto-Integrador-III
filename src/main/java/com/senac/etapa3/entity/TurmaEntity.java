package com.senac.etapa3.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "turmas")
public class TurmaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Min(value = 1, message = "O campo deve ser um número positivo")
    @Column(name = "numero_turma")
    private int numeroTurma;
    
    @NotBlank(message = "Campo 'Professor' não pode ser nulo")
    private String professor;
    
    @NotBlank(message = "Campo 'Turno' não pode ser nulo")
    private String turno;
    
    @Min(value = 15, message = "Somente números positivos acima de '14'")
    @Column(name = "numero_alunos")
    private int numeroAlunos;
}