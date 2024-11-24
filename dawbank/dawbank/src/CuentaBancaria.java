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
    private int nElementosActuales;

    public CuentaBancaria( String iban, String titular){

        this.contador++;
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.movimientos = new Movimiento[nMovimientos];
        this.nMovimientos = 0;
        this.nElementosActuales = 100;
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
    public void registrarMovimiento(String tipo, double cantidad){
        if(nMovimientos >= 100){
            System.out.println("No se pueden realizar mas movimientos.");
        }
        movimientos[nMovimientos] = new Movimiento(tipo,cantidad);
        nMovimientos++;
    }

    public void ingresarMovimientos(double cantidad){
        if(cantidad <= 0){
            System.out.println("La cantidad debe ser mayor que 0.");
        }
        if(cantidad >= 3000){
            System.out.println("AVISO: Notificar a hacienda.");
        }
        saldo += cantidad;
        registrarMovimiento("Ingreso", cantidad);
    }

    public void retirarMovimientos(double cantidad){
        if(cantidad <= 0){
            System.out.println("La cantidad debe ser mayor que 0.");
        }
        if(cantidad >= -50){
            System.out.println("Retirada no permitida, verificar el saldo.");
        }
        saldo -= cantidad;
        registrarMovimiento("Retirada", cantidad);
    }

    public void mostrarMovimiento(){
        if(nMovimientos==0){
            System.out.println("No existen movimientos.");
        }
        for (int i = 0; i < nMovimientos; i++) {
            movimientos[i].mostrarInfoMovimiento();
        }
    }
}
