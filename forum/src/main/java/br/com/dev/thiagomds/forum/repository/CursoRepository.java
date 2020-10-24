package br.com.dev.thiagomds.forum.repository;

import br.com.dev.thiagomds.forum.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
