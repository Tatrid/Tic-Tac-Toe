import java.util.Scanner;
import java.util.Random;

public class GhicesteNumarul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int incercari = 0;

        System.out.println("Hai sa jucam si noi ceva!");
        System.out.println("Incearca sa gasesti numarul secret  de la 1 la  100.");

        while (true) {
            System.out.print("Numarul presupus: ");
            int guess = sc.nextInt();
            incercari++;

            if (guess == secretNumber) {
                System.out.println("Ala e, numarul secret e " + secretNumber + ".");
                System.out.println("Ti-a luat " + incercari + " incercari.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Numaru care il cauti e mai mare.");
            } else {
                System.out.println("Numaru care il cauti e mai mic.");
            }
        }

        sc.close();
    }
}