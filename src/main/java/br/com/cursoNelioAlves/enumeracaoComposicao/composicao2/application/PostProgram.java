package br.com.cursoNelioAlves.enumeracaoComposicao.composicao2.application;

import br.com.cursoNelioAlves.enumeracaoComposicao.composicao2.entities.Comment;
import br.com.cursoNelioAlves.enumeracaoComposicao.composicao2.entities.Post;


import java.text.ParseException;
import java.text.SimpleDateFormat;


public class PostProgram {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");
        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country",
                12);

        post1.addComment(comment1);
        post1.addComment(comment2);

    }
}
