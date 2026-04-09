package Register.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private UUID id;
    private String nome;
    private Integer cargaHoraria;
    @ManyToOne
    private Aluno aluno;

   /* @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToMany(mappedBy = "disciplinas")
    private List<Aluno> alunos;

    */
}