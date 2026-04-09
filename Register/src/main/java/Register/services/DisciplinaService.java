package Register.services;

import Register.entity.Disciplina;
import Register.entity.Professor;
import Register.repository.DisciplinaRepository;
import Register.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DisciplinaService {
    private final DisciplinaRepository repository;
    private final ProfessorRepository professorRepository;

    public Disciplina criar(Disciplina d) { return repository.save(d); }
    public List<Disciplina> listar() { return repository.findAll(); }
    public Disciplina buscar(Long id) { return repository.findById(id).orElseThrow(); }

    public Disciplina vincularProfessor(Long disciplinaId, Long professorId) {
        Disciplina disciplina = buscar(disciplinaId);
        Professor professor = professorRepository.findById(professorId).orElseThrow();
        disciplina.setProfessor(professor);
        return repository.save(disciplina);
    }
}