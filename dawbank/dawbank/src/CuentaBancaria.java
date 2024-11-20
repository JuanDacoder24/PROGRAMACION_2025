import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaBancaria {

    private static int contador = 0;
    private String iban;
    private String titular;
    private double saldo;
    private Movimiento [] movimientos;
    private String validIban;
    private int nMovimientos;

    public CuentaBancaria( String iban, String titular, double saldo, String validIban){

        this.contador++;
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.movimientos = new Movimiento[100];
        this.validIban = validIban;
        this.nMovimientos = 0;
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

    public void ingresarMovimientos(Movimiento m1){
       if(m1 != null){
        this.movimientos[nMovimientos] = m1;
        this.nMovimientos++;
       }
    }

    public void retirarMovmientos(Movimiento m1){
        if(m1 != null){
            this.movimientos[nMovimientos] = m1;
            this.nMovimientos--;
        }
    }
}
