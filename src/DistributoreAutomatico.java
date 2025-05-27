import java.util.Scanner;

public class DistributoreAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci credito max 10");
        double credito = 0;
        while (credito < 1 || credito > 10) {
            credito = scanner.nextDouble();
            if (credito < 1 || credito > 10) {
                System.out.println("banconota non valida, puoi inserire da 1 fino a un massimo di 10 euro");
            }
        }

        System.out.println("credito : " + credito + " euro");

        while (credito > 0.00) {
            // if (credito == 0) {
            // System.out.println("hai finito il credito ricarica per accedere al menu");
            // break;
            // }
            System.out.println("MENU \n1)caffe-1.50€\n2)cappuccuno-2.00€\n3)Te-1.00€\n4)acqua-0.50€\n5)uscire");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    if (credito >= 1.50) {
                        credito -= 1.50;
                        System.out.println("Erogazione del caffè in corso credito rimanente :" + credito + " euro");
                    } else {
                        System.out.println("saldo insufficente per caffè, saldo attuale: " + credito + " euro");
                    }
                    break;
                case 2:
                    if (credito >= 2.00) {
                        credito -= 2.00;
                        System.out
                                .println("Erogazione del capuccino in corso, credito rimanente :" + credito + " euro");
                    } else {
                        System.out.println("saldo insufficente per cappuccino, saldo attuale: " + credito + " euro");
                    }
                    break;
                case 3:
                    if (credito >= 1) {
                        credito -= 1.00;
                        System.out.println("Erogazione del te in corso credito rimanente :" + credito + " euro");
                    } else {
                        System.out.println("saldo insufficente per te, saldo attuale: " + credito + " euro");
                    }
                    break;
                case 4:
                    if (credito >= 0.50) {
                        credito -= 0.50;
                        System.out.println("Erogazione del acqua in corso credito rimanente :" + credito + " euro");
                    } else {
                        System.out.println("saldo insufficente per acqua, saldo attuale: " + credito + " euro");
                    }
                    break;
                case 5:
                    System.out.println("Grazie,arrivederci, ritira il resto di " + credito + " euro");
                    return;
                default:
                    System.out.println("inserisci un prodotto presente nella macchinetta");
                    break;
            }
        }
        System.out.println("hai finito il credito ricarica per accedere al menu, credito : " + credito + " euro");
    }
}
