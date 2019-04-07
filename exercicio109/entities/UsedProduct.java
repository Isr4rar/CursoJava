package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct  extends Product{
	
	private Date manufactureDate;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name 
				+ " (used)  $ " 
				+ String.format("%.2f", price)
				+ "(Customs fee: " + sdf.format(manufactureDate);
}
	

}
