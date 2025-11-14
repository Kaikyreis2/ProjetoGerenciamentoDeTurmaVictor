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

import br.cefetrj.model.Turma;
import br.cefetrj.services.TurmaService;
import br.cefetrj.to.Input.TurmaTOInput;
import br.cefetrj.to.output.TurmaTOOutput;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/turma")
public class TurmaController {

    private final TurmaService turmaService;

    @Autowired
    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @PostMapping
    @ApiOperation(value = "Salvar registro", notes = "Salva uma nova turma")
    public ResponseEntity<TurmaTOOutput> save(@RequestBody TurmaTOInput input) {

        Turma turma = turmaService.save(input.build());

        return new ResponseEntity<>(new TurmaTOOutput(turma), HttpStatus.CREATED);
    }

    @PutMapping
    @ApiOperation(value = "Atualizar registro", notes = "Atualiza uma turma existente")
    public ResponseEntity<TurmaTOOutput> edit(@RequestBody TurmaTOInput input) {

        Turma turma = turmaService.save(input.build());

        return new ResponseEntity<>(new TurmaTOOutput(turma), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Pesquisar por ID", notes = "Retorna a turma pelo ID")
    public ResponseEntity<TurmaTOOutput> findById(@PathVariable Integer id) {

        return ResponseEntity.ok(
                turmaService.findById(id)
                        .map(TurmaTOOutput::new)
                        .orElse(null)
        );
    }

    @GetMapping
    @ApiOperation(value = "Listar todas", notes = "Retorna todas as turmas")
    public ResponseEntity<List<TurmaTOOutput>> findAll() {

        return ResponseEntity.ok(
                turmaService.findAll()
                        .stream()
                        .map(TurmaTOOutput::new)
                        .toList()
        );
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deletar por ID", notes = "Remove uma turma pelo ID")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {

        turmaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}