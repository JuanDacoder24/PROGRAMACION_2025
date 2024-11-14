import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaBancaria {

    private String iban;
    private String titular;
    private double saldo;
    private Movimiento [] movimientos;
    private String validIban;

    public CuentaBancaria( String iban, String titular, double saldo, String validIban){

        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.movimientos = new Movimiento[100];
        this.validIban = validIban;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
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
        if(saldo >=0.0)
        this.saldo = saldo;
    }
    
    public String getValidIban() {
        return validIban;
    }

    public void setValidIban(String validIban) {
        Pattern pat = Pattern.compile("[A-Z]{2}\\d[0-9]{22}$");
        Matcher mat = pat.matcher(iban);
        this.validIban = validIban;
        if(mat.matches()==true){
            System.out.println("¡CORRECTO!");
        }else{
            System.out.println("Incorrecto, intentelo otra vez");
        }
    }


}
