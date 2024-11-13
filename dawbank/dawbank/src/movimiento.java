
import java.time.LocalDateTime;
public class Movimiento {
    //atributos
    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;
    //constructores
    public Movimiento (String tipo, String cantidad){
        this.id = id;
        this.fecha = LocalDateTime.now().toString();
        this.tipo = tipo; //ingreso o retirada
        this.cantidad = 0.0;
}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
