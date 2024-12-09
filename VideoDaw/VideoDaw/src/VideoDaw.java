
import java.time.LocalDate;

public class VideoDaw {

    private String cif;
    private String direccion;
    private LocalDate fechaAlta;

    private Pelicula [] peliculasRegistradas;
    private Cliente [] clientesRegistrados;

    public VideoDaw(String cif, String direccion, LocalDate fechaAlta) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        this.clientesRegistrados = new Cliente[100];
    }

    public String getCif() {
        return cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public String mostrarInfoVideoClub(){
        String InfoClub = String.format("Informacion de club - CIF: %s, Direccion: %s", this.cif, this.direccion);
        return InfoClub;
    }

    public void mostrarPeliculasRegistradas(){
        for (Pelicula peliculasRegistrada : peliculasRegistradas) {
            System.out.println(peliculasRegistrada);
        }
    }

    public void mostrarClientesRegistrados(){
        for (Cliente clientesRegistrado : clientesRegistrados) {
            System.out.println(clientesRegistrado);   
        }
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
