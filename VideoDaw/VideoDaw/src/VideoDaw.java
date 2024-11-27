public class VideoDaw {

    private String cif;
    private String direccion;
    private String fechaAlta;
    private Pelicula [] peliculasRegistradas;
    private Cliente [] clientesRegistrados;
    
    public VideoDaw(String cif, String direccion, String fechaAlta) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Pelicula[] getPeliculasRegistradas() {
        return peliculasRegistradas;
    }

    public String mostrarInfoVideoClub(){
        return mostrarInfoVideoClub();
    }

    public String mostrarPeliculasRegistradas(){
        return mostrarPeliculasRegistradas();
    }

    public String mostrarClientesRegistrados(){
        return mostrarClientesRegistrados();
    }

    public String alquilarPelicula(Pelicula p, Cliente c){
        return alquilarPelicula(p, c);
    }

    public String devolverPelicula(Pelicula p, Cliente c){
        return devolverPelicula(p, c);
    }

    public String darBajaCliente(Cliente c){
        return darBajaCliente(c);
    }
    
    public String registrarCliente(Cliente c){
        return registrarCliente(c);
    }
}
