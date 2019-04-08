package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program111 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n_shape = input.nextInt();
		input.nextLine();
		
		for (int i = 1; i <= n_shape; i++) {
			System.out.printf("Shape #%d data: \n", i);
			System.out.print("Rectangle or Circle (r/c)?");
			char r_c = input.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.next());
			if (r_c == 'r') {
				System.out.print("Width: ");
				double width = input.nextDouble();
				System.out.print("Height: ");
				double height = input.nextDouble();
				list.add(new Rectangle(width, height, color));
			}else {
				System.out.print("Radius: ");
				double radius = input.nextDouble();
				list.add(new Circle(radius,color));
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		input.close();
	}

}
