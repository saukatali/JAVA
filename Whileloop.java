

import java.util.Scanner;

public class Whileloop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Hello " + name);

        if (a > b) {
            System.out.println(a + " is greater");
        }
        else if (b > a) {
            System.out.println(b + " is greater");
        }
        else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}