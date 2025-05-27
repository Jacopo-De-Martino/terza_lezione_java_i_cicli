public class MatriceCiclo {
    public static void main(String[] args) {
        // Dichiariamo una matrice 5x5 (5 righe, 5 colonne)
        int[][] matrice = new int[5][5];

        int contatore = 1; // Variabile per tenere traccia del numero corrente da inserire

        // Ciclo esterno per le righe
        for (int riga = 0; riga < matrice.length; riga++) {
            // Ciclo interno per le colonne
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                // Assegna il valore corrente del contatore all'elemento della matrice
                matrice[riga][colonna] = contatore;
                // Incrementa il contatore per il prossimo elemento
                contatore++;
            }
        }

        // Ora stampiamo la matrice per verificare che sia stata riempita correttamente
        System.out.println("Matrice con numeri progressivi:");
        for (int riga = 0; riga < matrice.length; riga++) {
            for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
                // Usiamo System.out.printf per formattare l'output e allineare i numeri
                // "%4d" significa un intero con almeno 4 caratteri, riempito con spazi a
                // sinistra
                System.out.printf("%4d", matrice[riga][colonna]);
            }
            System.out.println(); // Nuova riga dopo ogni riga della matrice
        }
    }

}
