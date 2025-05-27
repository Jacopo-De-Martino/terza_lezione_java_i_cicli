import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Esercizio2Java {
    public static void main(String[] args) {
        // crea un programma che crei un arraylist di stringhe
        List<String> nomiStudenti = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("inserisci il nome di uno studente o \"fine\" per uscire dal prgramma");
            String valore = scanner.nextLine().toLowerCase();

            if (valore.equalsIgnoreCase("fine")) {
                break;
            }
            nomiStudenti.add(valore);
            System.out.println("Lista attuale : " + nomiStudenti);
        }

        System.out.println("la lista è composta da : " + nomiStudenti.size() + " studenti");
        nomiStudenti.sort(null);// ordine alfabetico
        nomiStudenti.stream().forEach(n -> System.out
                .println("nome : " + n));

        String valoreRemove = "";
        while (true) {

            System.out.println("vuoi eliminare uno studente?\ninserisci il suo nome o \"NO\" per uscire");
            valoreRemove = scanner.nextLine().toLowerCase();
            if (valoreRemove.equalsIgnoreCase("no")) {
                System.out.println("fine rimozione");
                break;
            } else if (nomiStudenti.contains(valoreRemove)) {
                nomiStudenti.remove(valoreRemove);
                System.out.println(
                        " hai rimosso corettamente " + valoreRemove + " dalla lista di studenti" + nomiStudenti);
            } else {
                System.out.println("valore non valido");
            }

        }
        System.out.println("fine programma");
    }
}
