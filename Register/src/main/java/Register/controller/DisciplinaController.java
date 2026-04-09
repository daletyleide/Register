package Register.controller;


import Register.entity.Disciplina;
import Register.services.DisciplinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
@RequiredArgsConstructor
public class DisciplinaController {
    private final DisciplinaService service;

    @PostMapping
    public Disciplina criar(@RequestBody Disciplina d) { return service.criar(d); }

    @GetMapping
    public List<Disciplina> listar() { return service.listar(); }

    @GetMapping("/{id}")
    public Disciplina buscar(@PathVariable Long id) { return service.buscar(id); }

    @PostMapping("/{disciplinaId}/professor/{professorId}")
    public Disciplina vincularProfessor(@PathVariable Long disciplinaId, @PathVariable Long professorId) {
        return service.vincularProfessor(disciplinaId, professorId);
    }
}
