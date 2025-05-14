public class Usuario {

    //Atributos de la clase
    private String nombre;
    private int id;
    private String correo;

    public Usuario(String nombre, int id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }
    public String getNombre() { return nombre; }
    public int getId() { return id; }
    public String getCorreo() { return correo; }

    public String toString() { return nombre + " " + id + " " + correo; }

}