package Register.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import Register.entity.Disciplina;

@Entity
@Table (name="TB_USERS")
@NoArgsConstructor
@AllArgsConstructor


public class Aluno implements Serializable {
    private static final long serialVersionUID= 1L;


    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)


    private UUID id;
    private String nome;
    private String email;
    private String matricula;
    //@OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    //private List<Disciplina> disciplinas;



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


   /* public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = new ArrayList<>();
    }

    */
}
