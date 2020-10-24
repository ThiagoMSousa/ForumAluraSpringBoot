package br.com.dev.thiagomds.forum.controller.form;

import br.com.dev.thiagomds.forum.model.Topico;
import br.com.dev.thiagomds.forum.repository.TopicoRepository;

public class TopicoForm {

    private String titulo;
    private String mensagem;
    private String nomeCurso;


    public void setTitulo(String titulo)       { this.titulo = titulo; }
    public void setMensagem(String mensagem)   { this.mensagem = mensagem; }
    public void setNomeCurso(String nomeCurso) { this.nomeCurso = nomeCurso; }

    public String getTitulo()    { return titulo; }
    public String getMensagem()  { return mensagem; }
    public String getNomeCurso() { return nomeCurso; }
}
