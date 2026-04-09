package Register.controller;

import Register.dtos.UserRecordDto;
import Register.entity.Aluno;
import Register.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor

public class AlunoController {
    private final AlunoService service;

    @PostMapping
    public ResponseEntity<Aluno> saveUser(@RequestBody @Validated UserRecordDto userRecordDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body();
    }

    @GetMapping
    public List<Aluno> listar() {
        return service.listar(); }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable UUID id) { return service.buscar(id); }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
        return service.atualizar(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }

    @PostMapping("/{alunoId}/disciplinas/{disciplinaId}")
    public Aluno matricular(@PathVariable Long alunoId, @PathVariable Long disciplinaId) {
        return service.matricular(alunoId, disciplinaId);
    }
}
