package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;

	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnuallncome() < 20000.00) {
			setAnuallncome(getAnuallncome() - (getAnuallncome()* 0.15));
		}else if(getAnuallncome() > 20000.00) {
			setAnuallncome(getAnuallncome() - (getAnuallncome()* 0.25));
		}
		if (healthExpenditures != null) {
			setAnuallncome(getAnuallncome() - healthExpenditures * 0.50 );
		}

		return getAnuallncome();
}

}
