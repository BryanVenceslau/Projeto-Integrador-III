package com.senac.etapa3.controller;

import com.senac.etapa3.entity.TurmaEntity;
import com.senac.etapa3.service.TurmaService;
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
public class TurmaController {
    @Autowired
    TurmaService turmaService;

    @PostMapping("/turma-save")
    public String saveTurma(@Valid  @ModelAttribute("turma") TurmaEntity turma, BindingResult result) {
        if(result.hasErrors()){
            if (turma.getId() == null){
                return "adicionar-turma";
            }else{
                return "atualizar-turma";
            }
        }

        if(turma.getId() == null){
            turmaService.adicionarTurma(turma);
        }else{
            turmaService.atualizarTurma(turma.getId(), turma);
        }
        return "redirect:/turmas";
    }

    @GetMapping("/atualizar-turma/{id}")
    public String atualizarTurma(@PathVariable Long id, Model model){
        TurmaEntity turma = turmaService.getTurmaId(id);
        model.addAttribute("turma", turma);
        return "atualizar-turma";
    }
    
    @GetMapping("/deletar-turma/{id}")
    public String deletarTurma(@PathVariable Long id){
        turmaService.deletarTurma(id);
        return "redirect:/turmas";
    }
}