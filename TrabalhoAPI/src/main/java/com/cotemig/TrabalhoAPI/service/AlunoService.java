package com.cotemig.TrabalhoAPI.service;

import com.cotemig.TrabalhoAPI.model.Aluno;
import java.util.List;
import java.util.Optional;



public interface AlunoService {
	 Optional<Aluno> getAlunoById(Integer id);
	 List<Aluno> getAllAlunos();
	 void deleteAllAlunos();
	 void deleteAlunoById(Integer id);
	 void updateAlunoById(Integer id, Aluno aluno);
	 void updateAluno(Aluno aluno);
	 void insertAluno(Aluno aluno);
}
