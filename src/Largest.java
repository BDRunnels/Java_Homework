import java.util.Scanner;

public class Largest {
    
    public static void main(String[] args) {

        // double n1 = -4.5, n2 = 3.9, n3 = 2.5;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st Number (integer or decimal): ");
        double n1 = s.nextDouble();
        System.out.print("Enter 2nd Number (integer or decimal): ");
        double n2 = s.nextDouble();
        System.out.print("Enter 3rd Number (integer or decimal): ");
        double n3 = s.nextDouble();

        System.out.println("-".repeat(30));
        if( n1 >= n2 && n1 >= n3)
        System.out.println(n1 + " is the largest number.");
        else if (n2 >= n1 && n2 >= n3)
        System.out.println(n2 + " is the largest number.");
        else
        System.out.println(n3 + " is the largest number.");
    }
}
