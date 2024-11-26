public class VideoDaw {

    private String cif;
    private String direccion;
    private String fechaAlta;
    private Pelicula [] PeliculasRegistradas;
    
    public VideoDaw(String cif, String direccion, String fechaAlta, Pelicula[] peliculasRegistradas) {
        this.cif = cif;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
        PeliculasRegistradas = peliculasRegistradas;
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
        return PeliculasRegistradas;
    }
    
    public void setPeliculasRegistradas(Pelicula[] peliculasRegistradas) {
        PeliculasRegistradas = peliculasRegistradas;
    }

}
