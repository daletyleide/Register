package Register.services;

import Register.entity.Professor;
import Register.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProfessorService {
    private final ProfessorRepository repository;

    public Professor criar(Professor p) { return repository.save(p); }
    public List<Professor> listar() { return repository.findAll(); }
    public Professor buscar(Long id) { return repository.findById(id).orElseThrow(); }
    public void deletar(Long id) { repository.deleteById(id); }
}
