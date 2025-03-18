package Main;

import data.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map mappa = new Map(5, 5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mappa iniziale:");
        mappa.displayOnOut();

        for (int i = 0; i < 3; i++) {
            System.out.print("Inserisci riga: ");
            int row = scanner.nextInt();

            System.out.print("Inserisci colonna: ");
            int col = scanner.nextInt();

            mappa.changeCell(row, col);
            mappa.displayOnOut();
        }

        scanner.close();
    }
}
