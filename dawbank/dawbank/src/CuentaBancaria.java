import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaBancaria {

    private String iban;
    private String titular;
    private double saldo;
    private Movimiento [] movimientos;

    public CuentaBancaria( String iban, String titular, double saldo){

        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        Pattern pat = Pattern.compile("[A-Z]{2}\\d[0-9]{22}$");
        Matcher mat = pat.matcher(iban);
        if(mat.matches() == true){
            System.out.println("¡CORRECTO!");
            this.iban = iban;
        }else{
            System.out.println("Intentelo otra vez");
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getMovimientos() {
        return movimientos;
    }


}
