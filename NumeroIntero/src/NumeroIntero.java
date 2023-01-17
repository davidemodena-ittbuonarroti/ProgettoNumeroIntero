public class NumeroIntero {
    private int numero;

    public NumeroIntero(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String stampa(){
        return "Il numero è: "+numero;
    }

    public boolean pari(){
        if(numero%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
