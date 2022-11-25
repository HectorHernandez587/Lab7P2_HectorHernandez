
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

    public void OrdenarLista() {
        //Collections.sort(lista, (lista[0], lista[1]) -> ((Seleccion)PuntosObtenidos(lista[0])).compareTo((Seleccion)PuntosObtenidos(lista[1])));
    }
    
}
