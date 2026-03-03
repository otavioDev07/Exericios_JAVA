package poo.stringBuilderDemo.application;

import poo.stringBuilderDemo.entitites.Comment;
import poo.stringBuilderDemo.entitites.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post(sdf.parse("02/03/2026 23:24:15"), "Traveling to new Zealand", "I'm going to visit this wonderful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

    }
}
