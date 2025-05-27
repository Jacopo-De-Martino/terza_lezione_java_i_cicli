import java.util.HashMap;
import java.util.Map;

public class MapCiclo {
    public static void main(String[] args) {
        // 1. Creazione di una HashMap
        Map<String, Integer> etaStudenti = new HashMap<>();

        // 2. Aggiunta di elementi alla HashMap
        etaStudenti.put("Alice", 20);
        etaStudenti.put("Bob", 22);
        etaStudenti.put("Charlie", 19);
        etaStudenti.put("David", 20); // Notare che Alice e David hanno la stessa età, va bene per i valori
        etaStudenti.put("Alice", 21); // Questo sovrascriverà l'età di Alice da 20 a 21

        System.out.println("Mappa originale: " + etaStudenti);
        System.out.println("Età di Bob: " + etaStudenti.get("Bob"));
        System.out.println("La mappa contiene Charlie? " + etaStudenti.containsKey("Charlie"));
        System.out.println("La mappa contiene l'età 22? " + etaStudenti.containsValue(22));

        System.out.println("\n--- Iterazione sulla Map (metodo consigliato) ---");
        // Iterazione usando entrySet() con il ciclo for-each
        // Questo è il modo più efficiente perché accedi direttamente a chiave e valore
        for (Map.Entry<String, Integer> entry : etaStudenti.entrySet()) {
            String nome = entry.getKey();
            Integer eta = entry.getValue();
            System.out.println(nome + " ha " + eta + " anni.");
        }

        System.out.println("\n--- Iterazione sulle sole chiavi ---");
        // Iterazione solo sulle chiavi usando keySet()
        // Poi recuperiamo il valore per ogni chiave (potrebbe essere meno efficiente)
        for (String nome : etaStudenti.keySet()) {
            Integer eta = etaStudenti.get(nome); // Recupera il valore usando la chiave
            System.out.println("Nome: " + nome + ", Età: " + eta);
        }

        System.out.println("\n--- Iterazione sui soli valori ---");
        // Iterazione solo sui valori usando values()
        // Questo è utile se ti interessano solo i valori
        for (Integer eta : etaStudenti.values()) {
            System.out.println("Un'età presente: " + eta);
        }

        // Rimozione di un elemento
        etaStudenti.remove("David");
        System.out.println("\nMappa dopo la rimozione di David: " + etaStudenti);

        // Pulizia della mappa
        etaStudenti.clear();
        System.out.println("Mappa dopo clear(): " + etaStudenti);
        System.out.println("La mappa è vuota? " + etaStudenti.isEmpty());
    }
}
