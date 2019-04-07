package entities;

public class Employee {
	
	protected String name;
	protected Integer hour;
	protected Double valuePerHour;
	
	
	public Employee(String name, Integer hour, Double valuePerHour) {
		super();
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return hour*valuePerHour;
	}

	public String toString() {
		return name 
				+ " - $" 
				+ String.format("%.2f", payment()) ;
	}
}
