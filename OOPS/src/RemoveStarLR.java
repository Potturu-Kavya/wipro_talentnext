import java.util.Scanner;

public class RemoveStarLR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String result = "";

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != '*' && 
               (i == 0 || s.charAt(i-1) != '*') && 
               (i == s.length()-1 || s.charAt(i+1) != '*')) {
                result += s.charAt(i);
            }
        }

        System.out.println(result);
    }
}

