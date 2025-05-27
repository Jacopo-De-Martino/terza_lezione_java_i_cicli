import java.util.Scanner;

public class TabellinaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero per ottenere la tua tabellina a schermo");
        int tabellina = scanner.nextInt();

        // ! blocco di codice funzionante, commentato
        // inizializzo i ad 1
        // int i = 1;
        // //condizione di while loop ripeti lo statment finche i <= 10
        // while (i <= 10) {
        // System.out.println(tabellina + " * " + i + " = " + (tabellina * i));
        // //incremento i
        // i++;
        // }

        System.out.println("tabellina del " + tabellina + ":");
        // //condizione di for loop ripeti lo statment finche i <= 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabellina + " * " + i + " = " + (tabellina * i));
        }
        scanner.close();
    }

}
