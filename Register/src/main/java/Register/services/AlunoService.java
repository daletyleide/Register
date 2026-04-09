package Register.services;

import Register.entity.Aluno;
import Register.entity.Disciplina;
import Register.repository.AlunoRepository;
import Register.repository.DisciplinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AlunoService {
    private final AlunoRepository repository;
    private final DisciplinaRepository disciplinaRepository;

    public Aluno criar(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> listar() {
        return repository.findAll();
    }

    public Aluno buscar(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Aluno atualizar(Long id, Aluno alunoAtualizado) {
        Aluno aluno = buscar(id);
        aluno.setNome(alunoAtualizado.getNome());
        aluno.setEmail(alunoAtualizado.getEmail());
        return repository.save(aluno);
    }
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Aluno matricular(Long alunoId, Long disciplinaId) {
        Aluno aluno = buscar(alunoId);
        Disciplina disciplina = disciplinaRepository.findById(disciplinaId).orElseThrow();
        aluno.getDisciplinas().add(disciplina);
        return repository.save(aluno);
    }
}