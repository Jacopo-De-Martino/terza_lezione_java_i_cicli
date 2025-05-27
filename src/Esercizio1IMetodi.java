import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio1IMetodi {

    public static long calcolaFattoriale(int numero) {
        if (numero < 0) {
            // Per numeri negativi, il fattoriale non è definito.
            // Possiamo lanciare un'eccezione o restituire un valore speciale (es. -1)
            // Lanciare un'eccezione è generalmente preferibile per indicare un errore.
            throw new IllegalArgumentException("Errore: Il fattoriale non è definito per numeri negativi.");
        }
        if (numero == 0 || numero == 1) {
            // Caso base: 0! = 1 e 1! = 1
            return 1;
        }

        long fattoriale = 1; // Inizializziamo a 1 per la moltiplicazione
        for (int i = 2; i <= numero; i++) {
            fattoriale *= i; // fattoriale = fattoriale * i;
        }
        return fattoriale;
    }

    // --- Metodo 2: Accetta una String (tenta di convertirla e poi calcola il
    // fattoriale) ---
    // Questo metodo gestisce l'input di una stringa.
    // Tenta di convertire la stringa in un intero.
    // Se la conversione fallisce, stampa un messaggio di errore.
    public static long calcolaFattoriale(String numeroStringa) {
        try {
            int numero = Integer.parseInt(numeroStringa); // Tenta di convertire la stringa in int
            // Se la conversione ha successo, chiama il metodo calcolaFattoriale(int)
            return calcolaFattoriale(numero);
        } catch (NumberFormatException e) {
            // Se la stringa non può essere convertita in un numero valido
            System.out.println("Inserisci un numero valido. La stringa fornita non è un numero.");
            return -1; // Oppure lancia un'eccezione personalizzata, o un valore che indica errore.
                       // Qui -1 è un valore sentinel per indicare l'errore, dato che i fattoriali sono
                       // sempre >= 1.
        } catch (IllegalArgumentException e) {
            // Cattura l'eccezione lanciata dal metodo calcolaFattoriale(int) se il numero è
            // negativo
            System.out.println(e.getMessage());
            return -1; // Indica un errore
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calcolo del Fattoriale ---");

        // Test con input intero
        System.out.println("\nInserisci un numero intero (es. 5):");
        try {
            int inputInt = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline rimasto dopo nextInt()
            long risultatoInt = calcolaFattoriale(inputInt);
            if (risultatoInt != -1) { // -1 indicherebbe un errore se gestito così
                System.out.println("Il fattoriale di " + inputInt + " è: " + risultatoInt);
            }
        } catch (InputMismatchException e) {
            // Questo cattura se l'utente digita una stringa quando nextInt() si aspetta un
            // int
            System.out.println("Input non valido per il numero intero. Riprova.");
            scanner.nextLine(); // Consuma l'input errato
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Test con input stringa (che è un numero valido)
        System.out.println("\nInserisci un numero come stringa (es. \"7\"):");
        String inputStringaValida = scanner.nextLine();
        long risultatoStringaValida = calcolaFattoriale(inputStringaValida);
        if (risultatoStringaValida != -1) {
            System.out.println("Il fattoriale di \"" + inputStringaValida + "\" è: " + risultatoStringaValida);
        }

        // Test con input stringa (che NON è un numero)
        System.out.println("\nInserisci una stringa che NON è un numero (es. \"ciao\"):");
        String inputStringaInvalida = scanner.nextLine();
        long risultatoStringaInvalida = calcolaFattoriale(inputStringaInvalida);
        // Il messaggio di errore viene stampato direttamente dal metodo
        // calcolaFattoriale(String)

        // Test con input stringa (numero negativo)
        System.out.println("\nInserisci un numero negativo come stringa (es. \"-4\"):");
        String inputStringaNegativa = scanner.nextLine();
        long risultatoStringaNegativa = calcolaFattoriale(inputStringaNegativa);
        // Anche qui il messaggio di errore viene gestito dal metodo
        // calcolaFattoriale(String)

        scanner.close(); // Chiude lo scanner

    }
}