package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enteties.Client;
import enteties.Order;
import enteties.OrderItem;
import enteties.Product;
import enteties.enums.OrderStatus;

public class Program100 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Email: ");
		String email = input.nextLine();
		System.out.print("Birth date (DD/MM/YYYY):  ");
		String birthDate = input.nextLine();
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = input.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, sdf.parse(birthDate)));
		
		System.out.print("How many items to this order? ");
		int n_order = input.nextInt();
		
		for (int i = 1; i <= n_order; i++) {
			System.out.println("Enter #"+ i+ " item data: ");
			System.out.print("Product name: ");
			input.nextLine();
			String productName = input.nextLine();
			System.out.print("Product price: ");
			double productPrice = input.nextDouble();
			System.out.print("Quantity: ");
			int quantity = input.nextInt();
			
			OrderItem item = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
			
			order.addItem(item);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		
		
		
		input.close();
	}

}
