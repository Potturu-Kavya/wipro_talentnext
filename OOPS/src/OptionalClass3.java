import java.util.*;

class InvalidEmployeeException extends Exception {
	public InvalidEmployeeException(String message) {
		super(message);
	}
}

class Employeee {
	String name;

	Employeee(String name) {
		this.name = name;
	}
}

public class OptionalClass3 {
	public static void main(String[] args) {

		Employeee emp = null;

		try {

			Employeee validEmployee = java.util.Optional.ofNullable(emp)
					.orElseThrow(() -> new InvalidEmployeeException("Employee is invalid or null"));

			System.out.println("Valid Employee: " + validEmployee.name);
		} catch (InvalidEmployeeException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
