import java.util.Scanner;

public interface TheGame {
    public static void main(String[] args) {
        // ! inizializzo scanner
        Scanner scanner = new Scanner(System.in);

        int numGioc1 = 0;

        while (numGioc1 < 1 || numGioc1 > 100) {
            System.out.println("giocatore 1 inserisci un numero da 1 a 100");
            numGioc1 = scanner.nextInt();
            if (numGioc1 < 1 || numGioc1 > 100) {
                System.err.println("numero inserito non valido valido, range 1 - 100");
            }
        }

        // ! inizializzo variabilie tantativi
        int tentativi = 0;
        // ! utilizzo la variabile tentativi per fare un loop di massimo 5 tentativi
        while (tentativi < 5) {
            int numGioc2 = 0;
            // ! chiedo al giocatore di indovinare
            tentativi++;
            while (numGioc2 < 1 || numGioc2 > 100) {
                System.out
                        .println("giocatore 2 inserisci un numero da 1 a 100 " + tentativi + "/5" + " o 0 per uscire");
                numGioc2 = scanner.nextInt();
                // ! utilizzo break nel caso l'utente inserisce 0 per arrendersi(controllo if)
                if (numGioc2 == 0) {
                    System.out.println("Mi arrendo!!!");
                    return;
                }
                if (numGioc2 < 1 || numGioc2 > 100) {
                    System.err.println("numero inserito non valido valido, range 1 - 100");
                }
            }

            if (numGioc2 < 1 || numGioc2 > 100) {
                System.err.println("numero inserito non valido valido, range 1 - 100");
                continue;
            }
            // ! utilizzo break nel caso l'utente inserisce il numero corretto (controllo
            // if)
            if (numGioc2 == numGioc1) {
                System.out.println("Hai vinto");
                break;
                // ! per dare un feeback all'utente che gioca (controllo else if)
            } else if (numGioc2 < numGioc1) {
                System.out.println("quasi ma il numero da indovinare è più alto");
                // ! per dare un feeback all'utente che gioca (else)
            } else {
                System.out.println("quasi ma il numero da indovinare è più basso");
            }
            if (tentativi == 5) {
                System.out.println("mi dispiace, hai finito i tentativi e hai perso \nriprova la prossima volta");
            }

        }
        // ! chiusura scanner
        scanner.close();
    }

}
