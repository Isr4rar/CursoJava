package main;

import static java.util.Locale.US;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program108 {

	public static void main(String[] args) {
		
		Locale.setDefault(US);
		Scanner input = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("Enter the number of employess: ");
		int employess = input.nextInt();
		for (int i = 1; i <= employess; i++) {
			input.nextLine();
			System.out.println("Employee #"+ i + " data:");
			System.out.print("Outsourced (y/n)? ");
			String outSourced = input.nextLine();
			System.out.print("Name:");
			String employeeName = input.nextLine();
			System.out.print("Hours:");
			int employeeHours = input.nextInt();
			System.out.print("Value per hour: ");
			input.nextLine();
			double employeePerHour = input.nextDouble();
			if (outSourced.equals("n")) {
				employee.add(new Employee(employeeName, employeeHours, employeePerHour));
			}else if(outSourced.equals("y")) {
				System.out.print("Additional charge: ");
				double employeeAddCharge = input.nextDouble();
				
				employee.add(new OutsourcedEmployee(employeeName, employeeHours, employeePerHour, employeeAddCharge));
			}
			
		}
		
		System.out.println("PAYMENTS");
		
		for (Employee c : employee) {
			System.out.println(c);
		}
		
		
		
		input.close();

	}

}
