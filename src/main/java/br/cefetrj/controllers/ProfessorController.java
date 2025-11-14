package br.cefetrj.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cefetrj.model.Professor;
import br.cefetrj.services.ProfessorService;
import br.cefetrj.to.Input.ProfessorTOInput;
import br.cefetrj.to.output.ProfessorTOOutput;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService professorService;

    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping
    @ApiOperation(value = "Salvar registro", notes = "Salva um novo professor")
    public ResponseEntity<ProfessorTOOutput> save(@RequestBody ProfessorTOInput input) {

        Professor professor = professorService.save(input.build());

        return new ResponseEntity<>(new ProfessorTOOutput(professor), HttpStatus.CREATED);
    }

    @PutMapping
    @ApiOperation(value = "Atualizar registro", notes = "Atualiza um professor existente")
    public ResponseEntity<ProfessorTOOutput> edit(@RequestBody ProfessorTOInput input) {

        Professor professor = professorService.save(input.build());

        return new ResponseEntity<>(new ProfessorTOOutput(professor), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Pesquisar por ID", notes = "Retorna o professor pelo ID")
    public ResponseEntity<ProfessorTOOutput> findById(@PathVariable Integer id) {

        return ResponseEntity.ok(
                professorService.findById(id)
                        .map(ProfessorTOOutput::new)
                        .orElse(null)
        );
    }

    @GetMapping
    @ApiOperation(value = "Listar todos", notes = "Retorna todos os professores")
    public ResponseEntity<List<ProfessorTOOutput>> findAll() {

        return ResponseEntity.ok(
                professorService.findAll()
                        .stream()
                        .map(ProfessorTOOutput::new)
                        .toList()
        );
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deletar por ID", notes = "Remove um professor pelo ID")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        professorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}