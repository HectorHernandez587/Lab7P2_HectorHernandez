
import java.util.ArrayList;


public class Seleccion {
    private String nombre;
    private int partidos_jugados = 0;
    private int partidos_ganados = 0;
    private int partidos_empatados = 0;
    private int partidos_perdidos = 0;
    private int goles_favor = 0;
    private int goles_contra = 0;
    private int diferencia_goles = 0;
    private ArrayList <Jugador> jugadores = new ArrayList();

    public Seleccion() {
    }

    public Seleccion(String nombre, int partidos_jugados, int partidos_ganados, int partidos_empatados, int partidos_perdidos, int goles_favor, int goles_contra, int diferencia_goles) {
        this.nombre = nombre;
        this.partidos_jugados = partidos_jugados;
        this.partidos_ganados = partidos_ganados;
        this.partidos_empatados = partidos_empatados;
        this.partidos_perdidos = partidos_perdidos;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.diferencia_goles = diferencia_goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(int partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public int getPartidos_ganados() {
        return partidos_ganados;
    }

    public void setPartidos_ganados(int partidos_ganados) {
        this.partidos_ganados = partidos_ganados;
    }

    public int getPartidos_empatados() {
        return partidos_empatados;
    }

    public void setPartidos_empatados(int partidos_empatados) {
        this.partidos_empatados = partidos_empatados;
    }

    public int getPartidos_perdidos() {
        return partidos_perdidos;
    }

    public void setPartidos_perdidos(int partidos_perdidos) {
        this.partidos_perdidos = partidos_perdidos;
    }

    public int getGoles_favor() {
        return goles_favor;
    }

    public void setGoles_favor(int goles_favor) {
        this.goles_favor = goles_favor;
    }

    public int getGoles_contra() {
        return goles_contra;
    }

    public void setGoles_contra(int goles_contra) {
        this.goles_contra = goles_contra;
    }

    public int getDiferencia_goles() {
        return diferencia_goles;
    }

    public void setDiferencia_goles(int diferencia_goles) {
        this.diferencia_goles = diferencia_goles;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        if (jugadores.size() > 0 && jugadores.size() < 26) {
            this.jugadores = jugadores;
        }
    }

    @Override
    public String toString() {
        return "Seleccion{" + "nombre=" + nombre + ", partidos_jugados=" + partidos_jugados + ", partidos_ganados=" + partidos_ganados + ", partidos_empatados=" + partidos_empatados + ", partidos_perdidos=" + partidos_perdidos + ", goles_favor=" + goles_favor + ", goles_contra=" + goles_contra + ", diferencia_goles=" + diferencia_goles + ", jugadores=" + jugadores + '}';
    }
    
    
    
    
}
