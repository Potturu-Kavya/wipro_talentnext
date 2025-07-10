
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Kavya",50000.0,2026,"K314PV68");
		System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualsalary());
        System.out.println("Year Started: " + emp.getStartyear());
        System.out.println("National Insurance Number: "+emp.getNationalinsurancenumber());
        emp.setAnnualsalary(70000.0);
        emp.setStartyear(2027);
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualsalary());
        System.out.println("Year Started: " + emp.getStartyear());
        System.out.println("National Insurance Number: "+emp.getNationalinsurancenumber());
        
        
        
        
	}

}
