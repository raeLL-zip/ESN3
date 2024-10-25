package com.example.universidadeESN3.service;

import com.example.universidadeESN3.entity.Aluno;
import com.example.universidadeESN3.repository.AlunoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AlunoService implements IAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno salvar(Aluno aluno) {
        log.info("salvar() - aluno:{}", aluno );
        return alunoRepository.save(aluno);
    }

    @Override
    public void atualizar(Aluno aluno) {

    }

    @Override
    public void excluir(Long id) {

    }
}
