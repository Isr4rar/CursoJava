package main;

import static entites.Post.sdf;

import java.text.ParseException;

import entites.Comment;
import entites.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit his wonderful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		
		Comment c3 = new Comment("Good nigth");
		Comment c4 = new Comment("May the Forcer be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
		
		
		
		
		
		
	}
}
