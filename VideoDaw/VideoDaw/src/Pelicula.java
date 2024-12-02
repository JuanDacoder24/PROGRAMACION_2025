import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {

    private String codigo;
    private String titulo;
    private Generos genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquiler;
    private boolean isAlquilada;

    public Pelicula(String codigo, String titulo, Generos genero, LocalDate fechaRegistro, LocalDate fechaBaja,
        LocalDateTime fechaAlquiler, boolean isAlquilada) {
            
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro; 
        this.fechaBaja = fechaBaja; 
        this.fechaAlquiler = fechaAlquiler;
        this.isAlquilada = isAlquilada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public void setAlquilada(boolean isAlquilada) {
        this.isAlquilada = isAlquilada;
    }

    public String mostrarInfoPelicula(){
        String infoPelicula = String.format("Info Pelicula - Codigo: %s, Titulo: %s, Genero; %s, Fecha de registro: %s, Fecha de baja: %s", 
        this.codigo, this.titulo, this,genero, this.fechaRegistro, this.fechaBaja);
        return infoPelicula;
    }
    
}
