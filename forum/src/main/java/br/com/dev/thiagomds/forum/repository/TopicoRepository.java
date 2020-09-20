package br.com.dev.thiagomds.forum.repository;

import br.com.dev.thiagomds.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    // Método responsável por buscar o Nome do Curso a partir da classe Tópico
    /*
     Classe: Tópico
     Entidade: Curso curso
     Método: getNome()
     */
    // Caso fosse algo mais incerto/ambíguo, incluir o underline (_)
    /*
      EXEMPLO:
      List<Topico> findByCurso_Nome(String nomeCurso);
      Classe: Tópico
      Entidade: Curso curso
      Método: getNome()
     */
    List<Topico> findByCursoNome(String nomeCurso);

}
