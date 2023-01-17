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
                    System.out.print("Inserisci numero: ");
                    n = input.nextInt();
                    num.setNumero(n);
                    break;
                case 2:
                    System.out.print("Di quanto vuoi incrementare il numero? ");
                    n = input.nextInt();
                    num.aggiungi(n);
                    break;
                case 3:
                    System.out.print("Di quanto vuoi decrementare il numero? ");
                    n = input.nextInt();
                    num.togli(n);
                    break;
                case 4:
                    if(num.pari()){
                        System.out.println("Sì, il numero è pari!");
                    }
                    else{
                        System.out.println("No, il numero non è pari!");
                    }
                    break;
                case 5:
                    if(num.primo()){
                        System.out.println("Sì, il numero è primo!");
                    }
                    else{
                        System.out.println("No, il numero non è primo!");
                    }
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