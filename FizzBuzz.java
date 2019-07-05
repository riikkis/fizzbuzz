
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku 1-100 väliltä: ");
        int luku = Integer.parseInt(lukija.nextLine());

        if (luku % 5 == 0 && luku % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (luku % 3 == 0) {
            System.out.println("Fizz");
        } else if (luku % 5 == 0) {
            System.out.println("Buzz");
        } else System.out.println(luku);
    }
}
