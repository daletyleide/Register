package Register.controller;

import Register.entity.Professor;
import Register.services.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
@RequiredArgsConstructor
public class ProfessorController {
    private final ProfessorService service;

    @PostMapping
    public Professor criar(@RequestBody Professor p) { return service.criar(p); }

    @GetMapping
    public List<Professor> listar() { return service.listar(); }

    @GetMapping("/{id}")
    public Professor buscar(@PathVariable Long id) { return service.buscar(id); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}