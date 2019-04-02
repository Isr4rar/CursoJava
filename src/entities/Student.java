package entities;

public class Student {
	
	private String name;
	private double note1, note2, note3;
	private double finalGrade;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNote1(double note1) {
		this.note1 = note1;
	}
	public void setNote2(double note2) {
		this.note2 = note2;
	}
	public void setNote3(double note3) {
		this.note3 = note3;
	}
	
 	public void resultFinal() {
 		finalGrade = note1 + note2 + note3;
		if (finalGrade > 60.00) {
			System.out.println("FINAL GRADE = "+ finalGrade);
			System.out.println("PASS");
		}else {
			System.out.println("FINAL GRADE = "+ finalGrade);
			System.out.println("FAILED");
			System.out.println("MISSING "+ (60.00 - finalGrade)+ " POINTS");
		}
	}

}
