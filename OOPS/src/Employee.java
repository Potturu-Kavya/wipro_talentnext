
public class Employee extends Person {
	private double annualsalary;
	private int startyear;
	private String nationalinsurancenumber;
	Employee(){
		
	}
	Employee(String name,double annualsalary,int startyear,String nationalinsurancenumber ){
		super(name);
		this.annualsalary=annualsalary;
		this.startyear=startyear;
		this.nationalinsurancenumber=nationalinsurancenumber;
	}
	public double getAnnualsalary() {
		return annualsalary;
	}
	public void setAnnualsalary(double annualsalary) {
		this.annualsalary=annualsalary;
	}
	public int getStartyear() {
		return startyear;
	}
	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}
	public String getNationalinsurancenumber() {
		return nationalinsurancenumber;
	}
	public void setNationalinsurancenumber(String nationalinsurancenumber) {
		this.nationalinsurancenumber = nationalinsurancenumber;
	}
	

}
