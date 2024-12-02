public class VideoDaw {

    private String cif;
    private String direccion;
    private String fechaAlta;
    private Pelicula [] peliculasRegistradas;
    private Cliente [] clientesRegistrados;
    private String validCif;
    

    public VideoDaw(String cif, String direccion, String fechaAlta) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        this.clientesRegistrados = new Cliente[100];
    }
    
    public String getValidCif() {
        return validCif;
    }

    public void setValidCif(String validCif) {
        this.validCif = validCif;
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
        String InfoClub = String.format("Informacion de club - CIF: %s, Direccion: %s", this.cif, this.direccion);
        return InfoClub;
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
