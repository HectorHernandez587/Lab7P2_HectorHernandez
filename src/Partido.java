
import java.util.ArrayList;


public class Partido {
    
    private Seleccion local;
    private Seleccion visita;
    private int goles;
    private int posesion;
    private int tiros_total;
    private int tiros_meta;
    private int faltas_cometidas;
    private ArrayList <Jugador> jug_comfaltas = new ArrayList();
    private ArrayList <Jugador> jug_tarjetas = new ArrayList();
    private ArrayList <Jugador> jug_goleadores = new ArrayList();

    public Partido(Seleccion local, Seleccion visita, int goles, int posesion, int tiros_total, int tiros_meta, int faltas_cometidas) {
        this.local = local;
        this.visita = visita;
        this.goles = goles;
        this.posesion = posesion;
        this.tiros_total = tiros_total;
        this.tiros_meta = tiros_meta;
        this.faltas_cometidas = faltas_cometidas;
    }

    public Partido() {
    }

    public Seleccion getLocal() {
        return local;
    }

    public void setLocal(Seleccion local) {
        this.local = local;
    }

    public Seleccion getVisita() {
        return visita;
    }

    public void setVisita(Seleccion visita) {
        this.visita = visita;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPosesion() {
        return posesion;
    }

    public void setPosesion(int posesion) {
        this.posesion = posesion;
    }

    public int getTiros_total() {
        return tiros_total;
    }

    public void setTiros_total(int tiros_total) {
        this.tiros_total = tiros_total;
    }

    public int getTiros_meta() {
        return tiros_meta;
    }

    public void setTiros_meta(int tiros_meta) {
        this.tiros_meta = tiros_meta;
    }

    public int getFaltas_cometidas() {
        return faltas_cometidas;
    }

    public void setFaltas_cometidas(int faltas_cometidas) {
        this.faltas_cometidas = faltas_cometidas;
    }

    public ArrayList<Jugador> getJug_comfaltas() {
        return jug_comfaltas;
    }

    public void setJug_comfaltas(ArrayList<Jugador> jug_comfaltas) {
        this.jug_comfaltas = jug_comfaltas;
    }

    public ArrayList<Jugador> getJug_tarjetas() {
        return jug_tarjetas;
    }

    public void setJug_tarjetas(ArrayList<Jugador> jug_tarjetas) {
        this.jug_tarjetas = jug_tarjetas;
    }

    public ArrayList<Jugador> getJug_goleadores() {
        return jug_goleadores;
    }

    public void setJug_goleadores(ArrayList<Jugador> jug_goleadores) {
        this.jug_goleadores = jug_goleadores;
    }

    @Override
    public String toString() {
        return "Partido{" + "local=" + local + ", visita=" + visita + ", goles=" + goles + ", posesion=" + posesion + ", tiros_total=" + tiros_total + ", tiros_meta=" + tiros_meta + ", faltas_cometidas=" + faltas_cometidas + ", jug_comfaltas=" + jug_comfaltas + ", jug_tarjetas=" + jug_tarjetas + ", jug_goleadores=" + jug_goleadores + '}';
    }
    
    
    
}
