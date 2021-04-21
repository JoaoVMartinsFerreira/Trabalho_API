package com.cotemig.TrabalhoAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.TrabalhoAPI.model.Aluno;

@Repository("alunoRepository")
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
