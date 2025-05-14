public class Reserva {
    private Usuario usuario;
    private Vuelo vuelo;

    public Reserva(Usuario usuario, Vuelo vuelo) {
        this.usuario = usuario;
        this.vuelo = vuelo;
    }
    public Usuario getUsuario() { return usuario; }
    public Vuelo getVuelo() { return vuelo; }
    public String toString() {
        return "reserva de" +usuario.getNombre() + " Para el vuelo " + vuelo.getNumeroVuelo() +" con destino" +vuelo.getDestino();
    }
}