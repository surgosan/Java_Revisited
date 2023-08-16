import java.util.Scanner;

public class B_Methods_Strings_Scanner {
    public static void main(String[] args) {
        System.out.println(world());

        String name = "Sergio Sanchez-Alvares";
        int spaceIndex = name.indexOf(' ');
        String first_name = name.substring(0, spaceIndex);
        String last_name = name.substring(spaceIndex+1);
        String business_name = String.format("%s, %s", last_name, first_name);
        System.out.printf("My formal name is %s.%n", business_name);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name.");
        String input = in.nextLine();
        System.out.printf("Hello %s", input);
    }

    public static String world() {
        return "Hello World!";
    }
}
