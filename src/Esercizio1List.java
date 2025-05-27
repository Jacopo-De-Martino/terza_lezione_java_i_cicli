import java.util.Scanner;

public class Esercizio1List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parola = scanner.nextLine();
        // converto la stringa in un Array di caratteri toCharArray
        char[] lettere = parola.toCharArray();
        // creo un contatore che trova la posizione della lettera
        int counter = 0;
        // faccio un controllo sulla parola se contiene vocali utilizando il metodo
        // matches(regexVocali)
        if (parola.matches(".*[aeiouAEIOU].*")) {
            System.out.println("contiene vocali : ");
            // Ciclo for arrayDiChar
            for (char lettera : lettere) {
                // prendo in considerazione solo le lettere che sono vocali
                if ("aeiouAEIOU".indexOf(lettera) != -1) {
                    // stampo la lettera e la posizione
                    System.out.println("- " + lettera + " e si trova in posizione : " + counter);
                }
                // incremento il counter
                counter++;
            }
        } else {
            System.out.println("non contiene vocali");
        }

        /*
         * SECONDOOOO ESEMPIOOOOO(PROF)!
         */

        // System.out.println("x:inserisci una parola:"); // Richiede all'utente di
        // inserire una parola
        // parola = scanner.nextLine(); // Legge l'intera riga inserita dall'utente

        // String alfabeto = "aeiou"; // Definisce una stringa contenente le vocali
        // minuscole

        // // Ciclo esterno: itera su ogni carattere della parola inserita dall'utente
        // // 'i' è l'indice del carattere corrente nella 'parola'
        // for (int i = 0; i < parola.length(); i++) {
        // // Ciclo interno: itera su ogni carattere della stringa 'alfabeto' (le
        // vocali)
        // // 'j' è l'indice del carattere corrente nella stringa 'alfabeto'
        // for (int j = 0; j < alfabeto.length(); j++) {
        // // Confronta il carattere corrente della 'parola' (parola.charAt(i))
        // // con il carattere corrente della stringa 'alfabeto' (alfabeto.charAt(j))
        // if (parola.charAt(i) == alfabeto.charAt(j)) {
        // // Se i caratteri corrispondono (cioè, il carattere della parola è una
        // vocale)
        // // Stampa la vocale trovata e la sua posizione (indice 'i') nella parola
        // System.out.println(parola.charAt(i) + " sta in posizione " + i);
        // }
        // }

        // scanner.close(); // Chiude lo Scanner per rilasciare le risorse
        // }

    }
}
