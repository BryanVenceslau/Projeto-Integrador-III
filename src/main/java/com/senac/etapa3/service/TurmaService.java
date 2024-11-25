package com.senac.etapa3.service;

import com.senac.etapa3.data.TurmaRepository;
import com.senac.etapa3.entity.TurmaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TurmaService {
    @Autowired
    TurmaRepository turmaRepository;

    public List<TurmaEntity> getTodasAsTurmas(){
        return turmaRepository.findAll();
    }

    public TurmaEntity adicionarTurma(TurmaEntity turma){
        turma.setId(null);
        turmaRepository.save(turma);
        return turma;
    }

    public TurmaEntity atualizarTurma(Long id, TurmaEntity turmaAtt){
        TurmaEntity turma = getTurmaId(id);
        turma.setNumeroTurma(turmaAtt.getNumeroTurma());
        turma.setProfessor(turmaAtt.getProfessor());
        turma.setTurno(turmaAtt.getTurno());
        turma.setNumeroAlunos(turmaAtt.getNumeroAlunos());
        turmaRepository.save(turma);
        return turma;
    }

    public TurmaEntity getTurmaId(Long id) {
        return turmaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi possível encontar turma com ID ("+id+")"));
    }

    public void deletarTurma(Long id){
        TurmaEntity turma = getTurmaId(id);
        turmaRepository.deleteById(turma.getId());
    }
}