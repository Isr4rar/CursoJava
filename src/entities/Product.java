package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public void setNome(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Product data: "+ name + ", $ "+ String.format("%.2f", price)+", "+quantity+
				" units , Total: $"+ String.format("%.2f", totalValueInStock());
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

}
