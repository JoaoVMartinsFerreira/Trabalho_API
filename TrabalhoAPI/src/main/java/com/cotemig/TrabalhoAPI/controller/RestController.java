package com.cotemig.TrabalhoAPI.controller;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cotemig.TrabalhoAPI.model.Aluno;
import com.cotemig.TrabalhoAPI.service.AlunoService;





@org.springframework.web.bind.annotation.RestController
public class RestController {
	 
	@Autowired
	 private AlunoService alunoService;
	 
	 @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
	 public List<com.cotemig.TrabalhoAPI.model.Aluno> getAlunos() {
	 return alunoService.getAllAlunos();
	 }

	 @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
	 public Optional<com.cotemig.TrabalhoAPI.model.Aluno> getAluno(@PathVariable("id") Integer id) {
	 return alunoService.getAlunoById(id);
	 }
	    
	 @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
	 public void deleteAlunos() {
	     alunoService.deleteAllAlunos();
	 }
	    
	 @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
	 public void deleteAluno(@PathVariable("id") Integer id) {
	 alunoService.deleteAlunoById(id);
	 }
	    
	 @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
	 public void updateAluno(@RequestBody Aluno aluno, @PathVariable("id") Integer id) {
	     alunoService.updateAlunoById(id, aluno);
	 }
	    
	 @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
	 public void updateAluno(@RequestBody Aluno aluno) {
	 alunoService.insertAluno(aluno);
	 }
	}
