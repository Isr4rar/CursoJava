package main;

import static entities.UsedProduct.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program109 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Product> product = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n_products = input.nextInt();
		
		for (int i = 1; i <= n_products; i++) {
			input.nextLine();
			System.out.println("Product #" + i + "data: " );
			System.out.print("Common, used or imported (c/u/i)?");
			String type = input.nextLine();
			System.out.print("Name: ");
			String productName = input.nextLine();
			System.out.print("Price: ");
			double productPrice = input.nextDouble();
			if (type.equals("i")) {
				System.out.print("Customs fee: ");
				double customsFee = input.nextDouble();
				product.add(new ImportedProduct(productName, productPrice, customsFee));
				
			}else if (type.equals("c")) {
				product.add(new Product(productName, productPrice));
			}else if (type.equals("u")) {
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date manufactureDate = sdf.parse(input.next());
				product.add(new UsedProduct(productName, productPrice,manufactureDate ));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : product) {
			System.out.println(prod.priceTag());
		}


		input.close();

	}

}
