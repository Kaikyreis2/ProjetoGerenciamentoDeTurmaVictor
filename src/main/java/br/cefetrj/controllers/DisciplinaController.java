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

import br.cefetrj.model.Disciplina;
import br.cefetrj.services.DisciplinaService;
import br.cefetrj.to.Input.DisciplinaTOInput;
import br.cefetrj.to.output.DisciplinaTOOutput;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    @Autowired
    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @PostMapping
    @ApiOperation(value = "Salvar registro", notes = "Salva uma nova disciplina")
    public ResponseEntity<DisciplinaTOOutput> save(@RequestBody DisciplinaTOInput input) {

        Disciplina disciplina = disciplinaService.save(input.build());

        return new ResponseEntity<>(new DisciplinaTOOutput(disciplina), HttpStatus.CREATED);
    }

    @PutMapping
    @ApiOperation(value = "Atualizar registro", notes = "Atualiza uma disciplina existente")
    public ResponseEntity<DisciplinaTOOutput> edit(@RequestBody DisciplinaTOInput input) {

        Disciplina disciplina = disciplinaService.save(input.build());

        return new ResponseEntity<>(new DisciplinaTOOutput(disciplina), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Pesquisar por ID", notes = "Retorna a disciplina pelo ID")
    public ResponseEntity<DisciplinaTOOutput> findById(@PathVariable Integer id) {

        return ResponseEntity.ok(
                disciplinaService.findById(id)
                        .map(DisciplinaTOOutput::new)
                        .orElse(null)
        );
    }

    @GetMapping
    @ApiOperation(value = "Listar todos", notes = "Retorna todas as disciplinas")
    public ResponseEntity<List<DisciplinaTOOutput>> findAll() {

        return ResponseEntity.ok(
                disciplinaService.findAll()
                        .stream()
                        .map(DisciplinaTOOutput::new)
                        .toList()
        );
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deletar por ID", notes = "Remove uma disciplina pelo ID")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        disciplinaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}