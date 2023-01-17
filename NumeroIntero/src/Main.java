import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumeroIntero num = new NumeroIntero();
        Scanner input = new Scanner(System.in);

        int scelta = 0, n;

        do {
            System.out.println("0) Esci");
            System.out.println("1) Inserisci numero");
            System.out.println("2) Incrementa il numero");
            System.out.println("3) Decrementa il numero");
            System.out.println("4) Il numero è pari?");
            System.out.println("5) Il numero è un numero primo?");
            System.out.println("6) Visualizza il numero");
            System.out.print("Opzione: ");

            scelta = input.nextInt();

            switch(scelta){
                case 0:
                    System.out.println("Grazie e arrivederci!");
                    break;
                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("Errore! Riprova");
                    break;
            }
        }while(scelta!=0);
    }
}