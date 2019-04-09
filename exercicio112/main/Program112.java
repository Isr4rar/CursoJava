package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program112 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n_payers = input.nextInt();
		for (int i = 1; i <= n_payers; i++) {
			System.out.printf("Tax payer #%d data \n", i);
			System.out.print("Individual or campany (i/c)? ");
			char i_c = input.next().charAt(0);
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = input.nextDouble();
			if (i_c == 'i') {
				System.out.print("Health expenditures:");
				double healthExp = input.nextDouble();
				list.add(new Individual(name, anualIncome, healthExp));
			}else {
				System.out.print("Number of employees:");
				int n_employees = input.nextInt();
				input.nextLine();
				list.add(new Company(name, anualIncome, n_employees));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		input.close();
	}

}	







