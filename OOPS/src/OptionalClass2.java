import java.util.Optional;

public class OptionalClass2 {
    public static void main(String[] args) {
        String address = null; 

        Optional<String> optionalAddress = Optional.ofNullable(address);

        if (optionalAddress.isPresent()) {
            System.out.println(optionalAddress.get());
        } else {
            System.out.println("India");
        }
    }
}
