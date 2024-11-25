package com.senac.etapa3.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Entity
@Table(name = "funcionarios")
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Campo 'Nome' não pode ser nulo")
    private String nome;
    
    @CPF(message = "Insira um CPF válido")
    private String cpf;
    
    @NotBlank(message = "Campo 'Cargo' não pode ser nulo")
    private String cargo;
    
    @Email(message = "Insira um E-Mail válido")
    @NotBlank(message = "E-mail não pode ser vazio")
    private String email;
    
    @NotBlank(message = "Telefone não pode ser nulo")
    private String telefone;
    
    @NotBlank(message = "Campo 'Nome' não pode ser nulo")
    @Column(name = "data_contratacao")
    private String dataContratacao;
}