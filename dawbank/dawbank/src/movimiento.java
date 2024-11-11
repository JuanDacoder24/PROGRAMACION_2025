
import java.time.LocalDateTime;

public class movimiento {
    //atributos
    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;

    //constructores
    public movimiento (String tipo, String cantidad){
        this.id = id;
        this.fecha = LocalDateTime.now().toString();
        this.tipo = tipo; //ingreso o retirada
        this.cantidad = cantidad;
    }
    public int getId(){
        return this.id;
    }
    public String getFecha(){
        return this.fecha;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getCantidad(){
        return this.cantidad;
    }
}
