package com.senac.etapa3.controller;

import com.senac.etapa3.entity.FuncionarioEntity;
import com.senac.etapa3.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FuncionarioController {
    @Autowired
    FuncionarioService funcionarioService;

    @PostMapping("/save-funcionario")
    public String adicionarFuncionario(@Valid @ModelAttribute("funcionario") FuncionarioEntity funcionario, BindingResult result){
        if (result.hasErrors()){
            if (funcionario.getId() == null){
                return "adicionar-funcionario";
            }else{
                return "atualizar-funcionario";
            }
        }

        if(funcionario.getId() == null){
            funcionarioService.adicionarFuncionario(funcionario);
        }else{
            funcionarioService.atualizarFuncionario(funcionario.getId(), funcionario);
        }
        return "redirect:/funcionarios";
    }

    @GetMapping("/atualizar-funcionario/{id}")
    public String atualizarFuncionario(@PathVariable Long id, Model model){
        FuncionarioEntity funcionario = funcionarioService.getFuncionarioId(id);
        model.addAttribute("funcionario", funcionario);
        return "atualizar-funcionario";
    }

    @GetMapping("/deletar-funcionario/{id}")
    public String deletarFuncionario(@PathVariable Long id){
        funcionarioService.deletarFuncionario(id);
        return "redirect:/funcionarios";
    }
}