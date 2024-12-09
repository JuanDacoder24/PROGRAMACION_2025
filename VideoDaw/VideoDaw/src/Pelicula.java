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

    public Pelicula(String codigo, String titulo, Generos genero) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.fechaRegistro = LocalDate.now(); 
        this.fechaBaja = LocalDate.now(); 
        this.fechaAlquiler = LocalDateTime.now();
        this.isAlquilada = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Generos getGenero() {
        return genero;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    public String mostrarInfoPelicula(){
        String infoPelicula = String.format("Info Pelicula - Codigo: %s, Titulo: %s, Genero; %s, Fecha de registro: %s, Fecha de baja: %s", 
        this.codigo, this.titulo, this,genero, this.fechaRegistro, this.fechaBaja);
        return infoPelicula;
    }
    
}
