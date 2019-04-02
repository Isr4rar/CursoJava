package entities;

public class Employee {
	
	private String name;
	private double grossSalary;
	private double tax;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return "Employye: "+ name + ", $ "+ String.format("%.2f", netSalary());
	}

}
