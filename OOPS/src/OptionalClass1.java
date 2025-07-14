import java.util.Optional;

public class OptionalClass1 {
	public static void main(String[] args) {
		String names[] = new String[5];

		Optional<String> firstName = Optional.ofNullable(names[0]);

		if (firstName.isPresent()) {

			System.out.println("Length: " + firstName.get().length());
		} else {

			System.out.println("Length: 0");
		}
	}
}
