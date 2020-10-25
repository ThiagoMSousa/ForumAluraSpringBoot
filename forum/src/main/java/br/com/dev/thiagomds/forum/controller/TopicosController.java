package br.com.dev.thiagomds.forum.controller;

import br.com.dev.thiagomds.forum.controller.dto.TopicoDTO;
import br.com.dev.thiagomds.forum.controller.form.TopicoForm;
import br.com.dev.thiagomds.forum.model.Curso;
import br.com.dev.thiagomds.forum.model.Topico;
import br.com.dev.thiagomds.forum.repository.CursoRepository;
import br.com.dev.thiagomds.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController // A annotation @RestController nada mais é do que uma combinação das annotations @Controller e @ResponseBody.
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    //@RequestMapping("/topicos")
    //@ResponseBody // A anotação @ResponseBody informa a um controlador que o objeto retornado é serializado automaticamente em JSON e passado de volta para o objeto HttpResponse.
     /* Por padrão, o Spring considera que o retorno do método é o nome da página que ele deve carregar,
     * mas ao utilizar a anotação @ResponseBody, indicamos que o retorno do método deve ser serializado
     * e devolvido no corpo da resposta.*/
    public List<TopicoDTO> lista(String nomeCurso){
        if(nomeCurso == null) {
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDTO.converter(topicos);
        } else {
            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
            return TopicoDTO.converter(topicos);
        }
    }

    @PostMapping
    public void cadastrar( @RequestBody TopicoForm form ){
        Topico topico = form.converter( cursoRepository );
        topicoRepository.save( topico );
    }
}
