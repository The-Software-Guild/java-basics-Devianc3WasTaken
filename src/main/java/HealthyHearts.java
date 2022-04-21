import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = input.nextInt();
        int maximum = 220 - age;

        System.out.println("Your maximum heart rate should be "+ maximum + " beats per minute");
        System.out.println("Your target HR Zone is " + (maximum / 2) + " - " + (maximum*(85.0/100.0)) + " beats per minute");
        input.close();
    }
}
