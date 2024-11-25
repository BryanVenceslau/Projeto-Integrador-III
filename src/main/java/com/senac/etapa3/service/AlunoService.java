package com.senac.etapa3.service;

import com.senac.etapa3.data.AlunoRepository;
import com.senac.etapa3.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    public List<AlunoEntity> getTodosAlunos(){
        return alunoRepository.findAll();
    }

    public AlunoEntity adicionarAluno(AlunoEntity aluno){
        aluno.setId(null);
        alunoRepository.save(aluno);
        return aluno;
    }

    public void deletarAluno(Long id){
        AlunoEntity aluno = getAlunoId(id);
        alunoRepository.deleteById(aluno.getId());
    }

    public AlunoEntity getAlunoId(Long id) {
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Não foi possível encontrar aluno id '"+id+"'"));
    }

    public AlunoEntity atualizarAlunos(Long id, AlunoEntity alunoAtt){
        AlunoEntity aluno = getAlunoId(id);
        aluno.setNome(alunoAtt.getNome());
        aluno.setCpf(alunoAtt.getCpf());
        aluno.setDataNascimento(alunoAtt.getDataNascimento());
        aluno.setMatricula(alunoAtt.getMatricula());
        aluno.setTelefone(alunoAtt.getTelefone());
        alunoRepository.save(aluno);
        return aluno;
    }
}