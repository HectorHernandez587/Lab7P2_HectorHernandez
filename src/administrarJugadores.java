
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarJugadores {

    private ArrayList<Jugador> listaJugadores = new ArrayList();
    private File archivo = null;

    public administrarJugadores(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jugador> getlistaJugadores() {
        return listaJugadores;
    }

    public void setlistaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    //extra mutador
    public void setJugador(Jugador j) {
        this.listaJugadores.add(j);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarJugadores{" + "listaJugadores=" + listaJugadores + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Jugador j : listaJugadores) {
                bw.write(j.getNombre() + "|");
                bw.write(j.getDorsal() + "|");
                bw.write(j.getGoles() + "|");
                bw.write(j.getAsistencia() + "|");
                bw.write(j.getPartidos_jugados() + "|");
                bw.write(j.getTarjetas_amarillas() + "|");
                bw.write(j.getTarjetas_rojas() + "|");
                bw.write(j.getFaltas_cometidas() + "|");
                bw.write(j.getFaltas_recibidas() + "|");
                bw.write(j.getPosicion() + "|");
                bw.write(j.getPorterias_imbatidas() + "|");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }//Fin Escribir Archivo

    public void leerArchivo() throws IOException {
        Scanner lea = null;
        listaJugadores = new ArrayList();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter("|");

                while (lea.hasNext()) {
                    listaJugadores.add(new Jugador(lea.next(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.next(), lea.next(), lea.nextInt()));
                }
            } catch (Exception e) {
            }
            lea.close();
        }
    }//Fin Leer/Cargar archivo
}
