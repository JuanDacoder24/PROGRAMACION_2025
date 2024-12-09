import java.time.LocalDate;

public class Cliente {

    private String dni;
    private String nombre;
    private String numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    
    private Pelicula [] PeliculasAlquiladas;

    public Cliente(String dni, String nombre, String numSocio) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = LocalDate.now();
        
        this.PeliculasAlquiladas = new Pelicula[100];
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public String mostrarInfoCliente(){
        String infoCliente = String.format("Informacion del cliente - Nombre: %s, DNI: %s, NumSocio: %s, Direccion: %s, Fecha de nacimiento: %s", 
        this.nombre, this.dni, this.numSocio, this.direccion, this.fechaNacimiento);
        return infoCliente;
    }

    public String mostrarPeliculasAlquiladas(){
        return mostrarPeliculasAlquiladas();
    }
    
}
