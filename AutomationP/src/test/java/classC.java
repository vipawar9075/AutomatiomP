import org.testng.annotations.Test;

public class classC {
    @Test
    public static void classCMethod() {

        int i, fact = 1;
        int number = 5;//It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        method();
    }

    public static void method() {
        System.out.println("Factorial of " );
        System.out.println("Squash comment");

    }
}
