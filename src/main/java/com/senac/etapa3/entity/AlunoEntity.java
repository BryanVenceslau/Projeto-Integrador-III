package com.senac.etapa3.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Entity
@Table(name = "alunos")
public class AlunoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Campo 'Nome' não pode ser nulo")
    @Size(min = 2, message = "Esse campo exige no mínimo 2 caracters.")
    private String nome;
    
    @CPF(message = "Insira um CPF válido")
    private String cpf;
    
    @Column(name = "data_nascimento")
    @NotBlank(message = "Data de Nascimento não pode ser nulo")
    private String dataNascimento;
    
    @NotNull(message = "Campo 'Matrícula' não pode ser nulo")
    @Min(value = 1, message = "Matrícula deve ser um número positivo")
    private int matricula;
    
    @NotBlank(message = "Telefone não pode ser nulo")
    private String telefone;
}