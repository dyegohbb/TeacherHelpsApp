package com.teacherhelps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teacherhelps.model.Professor;
import com.teacherhelps.service.ProfessorService;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorService ProfessorService;

	@CrossOrigin()
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Professor>> listAll() throws Exception {
//		Professor professor = new Professor();
//		Endereco endereco = new Endereco();
//		endereco.setRua("sao joao");
//		endereco.setNumero(40);
//		endereco.setBairro("jardim paulista");
//		endereco.setCidade("veneza");
//		endereco.setEstado(Estado.PE);
//		endereco.setPais(Pais.BRA);
//		
//		professor.setEndereco(endereco);
//		professor.setDataDeCadastro(LocalDateTime.now());
//		professor.setDisciplina(Disciplina.BIOLOGIA);
//
//		List<Disponibilidade> disponibilidades = new ArrayList<>();
//		Disponibilidade disponibilidade1 = new Disponibilidade(LocalDateTime.of(2022, 5, 10, 17, 30, 0), LocalDateTime.of(2022, 5, 10, 20, 0, 0));
//		Disponibilidade disponibilidade2 = new Disponibilidade(LocalDateTime.of(2022, 6, 16, 17, 30, 0), LocalDateTime.of(2022, 6, 16, 20, 0, 0));
//		
//		disponibilidades.add(disponibilidade1);
//		disponibilidades.add(disponibilidade2);
//		
//		professor.setDisponibilidade(disponibilidades);
//		professor.setNome("Dyego");
//		professor.setSobre("Sou Dyego");
//		professor.setEmail("dyegohbb@gmail.com");
//		professor.setCpf(2222245450L);
//		professor.setTelefone(8198213455554L);
//		professor.setValorPorHora(2005.9);
//		professor.setSenha("root");
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		professor.setSenha(encoder.encode(professor.getSenha()));
//		ProfessorService.salvar(professor);
		List<Professor> professores = ProfessorService.listAll();
		if (professores.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok().body(professores);
		}
	}
}
