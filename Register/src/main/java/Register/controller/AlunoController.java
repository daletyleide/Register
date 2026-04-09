package Register.controller;

import Register.entity.Aluno;
import Register.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor

public class AlunoController {
    private final AlunoService service;

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) { return service.criar(aluno); }

    @GetMapping
    public List<Aluno> listar() { return service.listar(); }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) { return service.buscar(id); }

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
