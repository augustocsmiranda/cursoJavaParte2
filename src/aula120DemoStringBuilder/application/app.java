package aula120DemoStringBuilder.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import aula120DemoStringBuilder.entities.Comment;
import aula120DemoStringBuilder.entities.Post;

public class app {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        Comment c1 = new Comment("Have a nice Trip!");
        Comment c2 = new Comment("WoW! That's Awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm Going to Visit this wonderfull country", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good Night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(sdf.parse("28/04/2018 23:14:19"), "Good Night Guys", "See you Tomorrow", 5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);

        System.out.println(p2);
    }
}
