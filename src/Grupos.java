
import java.util.Collections;


public class Grupos {
    private Seleccion [] lista = new Seleccion [4];

    public Grupos() {
    }

    public Seleccion[] getLista() {
        return lista;
    }

    public void setLista(Seleccion[] lista) {
        this.lista = lista;
    }
    
    public int PuntosObtenidos(Seleccion s) {
        int puntos_obtenidos = s.getPartidos_ganados() * 3 + s.getPartidos_empatados();
        return puntos_obtenidos;
    }

    public void OrdenarLista() {

    }
    
}
