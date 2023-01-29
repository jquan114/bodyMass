import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("PLease enter your weight");

        float w = scanner.nextFloat();

        System.out.println("Please enter your Height");

        float h = scanner.nextFloat();

        float bmi = w/(h*h);

        System.out.print("bmi = " + bmi) ;




    }
}
