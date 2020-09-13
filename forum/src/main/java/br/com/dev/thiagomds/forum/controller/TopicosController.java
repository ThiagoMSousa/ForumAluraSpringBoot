package br.com.dev.thiagomds.forum.controller;

import br.com.dev.thiagomds.forum.model.Curso;
import br.com.dev.thiagomds.forum.model.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody // A anotação @ResponseBody informa a um controlador que o objeto retornado é serializado automaticamente em JSON e passado de volta para o objeto HttpResponse.
    public List<Topico> lista(){
        Topico topico = new Topico("Dúvida",
                "Dúvida com Spring",
                new Curso("Spring", "Programação"));

        return Arrays.asList(topico, topico, topico);

    }
}
