import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio1Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // IMPUT UTENTE
        String parola = scanner.nextLine().toLowerCase();
        String stringaPulita = parola.replaceAll("[^a-z0-9]", "");

        // CONVERSIONE STRINGA IN CHAR ARRAY
        char[] caratteri = stringaPulita.toCharArray();

        // INIZIALIZZAZIONE HASHMAP
        Map<Character, Integer> counterLettereKeyValues = new HashMap<>();

        // CICLO I SINGOLI CARATTERI DEL'ARRAY CARATTERI
        for (char c : caratteri) {

            // CONTROLLA SE IL CARATTERE E' NELLA MAPPA
            if (counterLettereKeyValues.containsKey(c)) {
                // NEL CASO è PRESENTE recupera il conteggio attuale
                int conteggioAttuale = counterLettereKeyValues.get(c);
                // E INCREMENTA IL CONTEGGIO E AGGIORNA LA MAPPA
                counterLettereKeyValues.put(c, conteggioAttuale + 1);
            } else {
                // SE NON E' PRESENTE LO AGGIUNGIAMO CON CONTEGGIO 1
                counterLettereKeyValues.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counterLettereKeyValues.entrySet()) {
            System.out.println("Valore : " + entry.getKey() + " : " + "quante votle è presente " + entry.getValue());
        }

        System.out.println(counterLettereKeyValues);
        // counterLettereKeyValues
        // .forEach((carattere, conteggio) -> System.out.println("'" + carattere + "': "
        // + conteggio));
    }
}
