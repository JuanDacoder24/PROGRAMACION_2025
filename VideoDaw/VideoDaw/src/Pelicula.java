import java.time.LocalDateTime;

public class Pelicula {

    private String codigo;
    private String Titulo;
    private String genero;
    private String fechaRegistro;
    private String fechaBaja;
    private String fechaAlquiler;
    private boolean isAlquilada;

    public Pelicula(String codigo, String titulo, String genero, String fechaRegistro, String fechaBaja,
        String fechaAlquiler, boolean isAlquilada) {
        this.codigo = codigo;
        Titulo = titulo;
        this.genero = genero; //enum
        this.fechaRegistro = fechaRegistro; //localdate
        this.fechaBaja = fechaBaja; //localdate
        this.fechaAlquiler = LocalDateTime.now().toString();
        this.isAlquilada = isAlquilada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean isAlquilada) {
        this.isAlquilada = isAlquilada;
    }

    
}
