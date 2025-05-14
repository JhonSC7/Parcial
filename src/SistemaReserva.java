import java.util.ArrayList;
import java.util.List;

public class SistemaReserva{
    private List<Usuario> usuarios= new ArrayList<>();
    private List<Vuelo> vuelos= new ArrayList<>();
    private List<Reserva> reservas= new ArrayList<>();

    public SistemaReserva() {
        //aqui agragamos usuarios predefinidos
        usuarios.add(new Usuario("juan",4,"juan@viajavar.com"));
        usuarios.add(new Usuario("rosa",7,"rosa@viajavar.com"));
        usuarios.add(new Usuario("laura",76,"laura@viajavar.com"));
        usuarios.add(new Usuario("sergio",10,"sergio@viajavar.com"));
        usuarios.add(new Usuario("ivan",43,"ivan@viajavar.com"));

        //aqui agragamos vuelos predefinidos
        vuelos.add(new Vuelo(2,"cartagena de indias" ,10,150,"greengo" ));
        vuelos.add(new Vuelo(7,"Cali" ,14,150 ,"greengo" ));
        vuelos.add(new Vuelo(9,"Rionegro" ,8,150, "despegar" ));
        vuelos.add(new Vuelo(4,"Bogota" ,5,150, "despegar" ));
        vuelos.add(new Vuelo(3,"Pasto" ,11,150, "colombianfly" ));
        vuelos.add(new Vuelo(1,"Monteria" ,16,150, "colombianfly" ));
    }
    public void mostrarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    public void mostrarVuelos() {
        for (Vuelo v : vuelos) {
            System.out.println(v);
        }
    }

    public Usuario buscarUsuario(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) return u;
        }
        return null;
    }

    public Vuelo buscarVuelo(int numerodeVuelo) {
        for (Vuelo v : vuelos) {
            if (v.getNumeroVuelo() == numerodeVuelo) return v;
        }
        return null;
    }

    public void reservarVuelo(int usuarioid, int numerodeVuelo) {
        Usuario u = buscarUsuario(usuarioid);
        Vuelo v = buscarVuelo(numerodeVuelo);

        if (u != null && v != null) {
            reservas.add(new Reserva(u, v));
            System.out.println(" Reserva realizada con éxito.");
        } else {
            System.out.println(" Usuario o vuelo no encontrado.");
        }
    }

    public void mostrarReservas() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public void mostrarReservasDeUsuario(int userid) {
        for (Reserva r : reservas) {
            if (r.getUsuario().getId() == userid) {
                System.out.println(r);
            }
        }
    }




}

