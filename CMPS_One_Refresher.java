import java.util.Scanner;
import java.io.IOException;

public class CMPS_One_Refresher {
     static int stat = 0;

    public static void main(String[] args)
    {
        int statW = stat++;
        int number = 1;
        double decimal = 1.1;
        char letter = 'c';
        String name = "erik";
        boolean bool = false;

        double numberTwo = number + decimal;
        String nameTwo = name + letter;
        boolean updated = !bool;

        int intOp = 1+1;
        String strOp = "hello " + "World!";
        int intOPTwo = 2-1;
        int div = 4/2;
        int remChan = 10%2;
        int multi = 2*2;
        int[] arr = {1,2,3};
        int[] arrTwo = new int[10];


        Scanner in = new Scanner(System.in);
        System.out.println("Enter your thing");
        String input = in.nextLine();
        System.out.println("Enter your other thing");
        int age = in.nextInt();



        System.out.println(methodOne(input));

        person pOne = new person(input, age);
        pOne.rename("Sergio");

        System.out.println(pOne.details());

        for(int i = 0; i <= pOne.getAge(); i++)
        {
            if(i == 1)
            {
                continue;
            }

            System.out.println(i);


            if(i == 18)
            {
                break;
            }

        }

        String first = "Erik Be the boi";

        String half = first.substring(0, first.length()/2);
        String otherHalf = first.substring(first.length()/2);

        String complete = half.concat(otherHalf);
        System.out.println(complete);

        String[] chars = new String[first.length()];
        for(int k = 0; k <= first.length() - 1; k++)
        {
            chars[k] = first.substring(k, k+1);
        }

        for (String aChar : chars) {
            System.out.println(aChar);
        }
    }

    public static String methodOne(String input) {
        return "You have entered: " + input + ".";
    }
}
