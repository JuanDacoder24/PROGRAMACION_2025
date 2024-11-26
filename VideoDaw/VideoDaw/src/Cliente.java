public class Cliente {

    private String dni;
    private String nombre;
    private String numSocio;
    private String direccion;
    private String fechaNacimiento;
    private String fechaBaja;
    private Pelicula [] PeliculasAlquiladas;

    public Cliente(String dni, String nombre, String numSocio, String direccion, String fechaNacimiento,
            String fechaBaja, Pelicula[] peliculasAlquiladas) {
        this.dni = dni;
        this.nombre = nombre;
        this.numSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaBaja = fechaBaja;
        PeliculasAlquiladas = peliculasAlquiladas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Pelicula[] getPeliculasAlquiladas() {
        return PeliculasAlquiladas;
    }

    public void setPeliculasAlquiladas(Pelicula[] peliculasAlquiladas) {
        PeliculasAlquiladas = peliculasAlquiladas;
    }


}
