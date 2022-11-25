
public class Jugador {

    private String nombre;
    private int dorsal;
    private int goles;
    private int asistencia;
    private int partidos_jugados;
    private int tarjetas_amarillas;
    private int tarjetas_rojas;
    private int faltas_cometidas;
    private int faltas_recibidas;
    private String posicion;
    private int porterias_imbatidas;

    public Jugador() {
    }

    public Jugador(String nombre, int dorsal, int goles, int asistencia, int partidos_jugados, int tarjetas_amarillas, int tarjetas_rojas, int faltas_cometidas, int faltas_recibidas, String posicion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.partidos_jugados = partidos_jugados;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
        this.faltas_cometidas = faltas_cometidas;
        this.faltas_recibidas = faltas_recibidas;
        this.posicion = posicion;
    }

    public Jugador(String nombre, int dorsal, int goles, int asistencia, int partidos_jugados, int tarjetas_amarillas, int tarjetas_rojas, int faltas_cometidas, int faltas_recibidas, String posicion, int porterias_imbatidas) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencia = asistencia;
        this.partidos_jugados = partidos_jugados;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
        this.faltas_cometidas = faltas_cometidas;
        this.faltas_recibidas = faltas_recibidas;
        this.posicion = posicion;
        this.porterias_imbatidas = porterias_imbatidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(int partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public int getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(int tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    public int getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(int tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }

    public int getFaltas_cometidas() {
        return faltas_cometidas;
    }

    public void setFaltas_cometidas(int faltas_cometidas) {
        this.faltas_cometidas = faltas_cometidas;
    }

    public int getFaltas_recibidas() {
        return faltas_recibidas;
    }

    public void setFaltas_recibidas(int faltas_recibidas) {
        this.faltas_recibidas = faltas_recibidas;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getPorterias_imbatidas() {
        return porterias_imbatidas;
    }

    public void setPorterias_imbatidas(int porterias_imbatidas) {
        this.porterias_imbatidas = porterias_imbatidas;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dorsal=" + dorsal + ", goles=" + goles + ", asistencia=" + asistencia + ", partidos_jugados=" + partidos_jugados + ", tarjetas_amarillas=" + tarjetas_amarillas + ", tarjetas_rojas=" + tarjetas_rojas + ", faltas_cometidas=" + faltas_cometidas + ", faltas_recibidas=" + faltas_recibidas + ", posicion=" + posicion + ", porterias_imbatidas=" + porterias_imbatidas + '}';
    }

}
