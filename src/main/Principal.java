package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Principal {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name: ");
		student.setName(input.nextLine());
		
		System.out.print("Note 1: ");
		student.setNote1(input.nextDouble());
		System.out.print("Note 2: ");
		student.setNote2(input.nextDouble());
		System.out.print("Note 3: ");
		student.setNote3(input.nextDouble());
		
		student.resultFinal();
		
		input.close();
	}

}
