import java.util.HashMap;
import java.util.Map;

public class MapLezione {
    public static void main(String[] args) {

        // Creazione delle mappe per i singoli professori
        Map<String, String> prof1 = new HashMap<>();
        prof1.put("nome", "Tommaso");
        prof1.put("cognome", "Muraca");
        prof1.put("via", "Via Roma");

        Map<String, String> prof2 = new HashMap<>();
        prof2.put("nome", "Giulia"); // Ho cambiato il nome per differenziare
        prof2.put("cognome", "Bianchi");
        prof2.put("via", "Via Milano");

        // Creazione della mappa principale che contiene i professori
        // La chiave è un Integer (es. un ID), il valore è una Map<String, String>
        // (dettagli del prof)
        Map<Integer, Map<String, String>> profs = new HashMap<>();

        // Aggiunta dei professori alla mappa principale
        profs.put(0, prof1);
        profs.put(1, prof2);

        for (Integer num : profs.keySet()) {
            System.out.println(profs.get(num).get("nome"));
        }

        // Stampa dell'intera mappa (utile per debug)
        System.out.println("Mappa completa dei professori: " + profs);
        // Stampa dettagli del singolo professore (utile per accesso diretto)
        System.out.println("Dettagli Professore 0: " + profs.get(0));
        System.out.println("Dettagli Professore 1: " + profs.get(1));

        System.out.println("\n--- Nomi dei Professori ---");

        // Metodo 1: Iterare su entrySet() della mappa esterna (raccomandato)
        // Questo ti dà accesso sia all'ID del professore che alla sua mappa di dettagli
        for (Map.Entry<Integer, Map<String, String>> entry : profs.entrySet()) {
            Integer idProfessore = entry.getKey(); // L'ID del professore (es. 0, 1)
            Map<String, String> dettagliProfessore = entry.getValue(); // La mappa con i dettagli {"nome": "Tommaso",
                                                                       // ...}

            // Ora, dalla mappa dei dettagli, estraiamo il nome
            String nomeProfessore = dettagliProfessore.get("nome");
            String cognomeProfessore = dettagliProfessore.get("cognome");

            System.out.println("Professore ID " + idProfessore + ": " + nomeProfessore + " " + cognomeProfessore);
        }

        System.out.println("\n--- Nomi dei Professori (solo iterando sui valori) ---");

        // Metodo 2: Iterare direttamente sui valori della mappa esterna (se non ti
        // serve l'ID)
        // Questo ti dà direttamente le mappe dei dettagli di ogni professore
        for (Map<String, String> dettagliProfessore : profs.values()) {
            String nomeProfessore = dettagliProfessore.get("nome");
            String cognomeProfessore = dettagliProfessore.get("cognome");

            System.out.println("Nome: " + nomeProfessore + " " + cognomeProfessore);
        }

        System.out.println("\n--- Nomi dei Professori (usando forEach con Lambda - Java 8+) ---");

        // Metodo 3: Usando forEach con espressioni lambda (sintassi più concisa)
        profs.forEach((id, dettagli) -> {
            String nomeProfessore = dettagli.get("nome");
            String cognomeProfessore = dettagli.get("cognome");
            System.out.println("Professore ID " + id + ": " + nomeProfessore + " " + cognomeProfessore);
        });
    }

}
