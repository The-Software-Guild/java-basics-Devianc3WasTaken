import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Random r = new Random();
        int[] dogGenetics = new int[5];
        Scanner input = new Scanner(System.in);

        dogGenetics[0] = r.nextInt(101);
        dogGenetics[1] = r.nextInt(101 - dogGenetics[0]);
        dogGenetics[2] = r.nextInt(101 - dogGenetics[0] - dogGenetics[1]);
        dogGenetics[3] = r.nextInt(101 - dogGenetics[0] - dogGenetics[1] - dogGenetics[2]);
        dogGenetics[4] = 100 - dogGenetics[0] - dogGenetics[1] - dogGenetics[2] - dogGenetics[3];

        System.out.print("What is your dogs name? ");
        String dogName = input.next();
        System.out.println("Well then, I have this highly reliable report on " + dogName + " prestigious background right here.\n");

        System.out.println(dogName + " is: ");
        System.out.println(dogGenetics[0] + "% St. Bernard");
        System.out.println(dogGenetics[1] + "% Chihuahua");
        System.out.println(dogGenetics[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(dogGenetics[3] + "% Common Cur");
        System.out.println(dogGenetics[4] + "% King Doberman\n");

        System.out.println("Wow, that's QUITE a dog!");

        input.close();

    }
}
