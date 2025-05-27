import java.util.Scanner;

public class TabellineJava2 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Dichiarazione e inizializzazione di una variabile intera 'num' a 0
        // Questa variabile conterrà il numero inserito dall'utente
        int num = 0;

        while (num < 1 || num > 10) {
            // Stampa un messaggio che richiede all'utente di inserire un numero
            System.out.println("Inserisci un numero: ");

            // Legge l'intero inserito dall'utente e lo assegna alla variabile 'num'
            num = myScanner.nextInt();

            // Controllo 'if' per verificare se il numero appena inserito è ancora non
            // valido.
            // Questa condizione è la stessa del ciclo 'while' esterno.
            if (num < 1 || num > 10) {
                // Se il numero non è valido, stampa un messaggio di errore
                System.out.println("Numero non valido!");
            }
        } // Fine del ciclo while

        // Ciclo 'for' per calcolare e stampare la tabellina del numero inserito
        // dall'utente.
        // Il ciclo itera 10 volte, con la variabile 'i' che va da 1 a 10.
        for (int i = 1; i <= 10; i++) {
            // Stampa la riga della tabellina nel formato: "numero * i = risultato"

            System.out.println(num + "x" + i + "=" + i * num);
        } // Fine del ciclo for

        // Chiude lo Scanner per rilasciare le risorse di sistema.

        myScanner.close();
    }
}
