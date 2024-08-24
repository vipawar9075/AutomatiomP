import org.testng.annotations.Test;

import java.util.Scanner;

public class classA {


    @Test
    public static void classAMethod() {
        System.out.println("Branch Name: Developer Branch");
        classs();
        classss();
    }

    public static void classs() {
        System.out.println("Branch Name: Developer Branch");

    }

    public static void classss() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        reverseNumber(num);
    }

    public static void reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed number " + reverse);
    }

}

