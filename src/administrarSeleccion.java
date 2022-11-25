
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarSeleccion {

    private ArrayList<Seleccion> listaSelecciones = new ArrayList();
    private File archivo = null;

    public administrarSeleccion(String path) {
        archivo = new File(path);
    }

    public ArrayList<Seleccion> getlistaSelecciones() {
        return listaSelecciones;
    }

    public void setListaUsuarios(ArrayList<Seleccion> listaSelecciones) {
        this.listaSelecciones = listaSelecciones;
    }

    //extra mutador
    public void setSeleccion(Seleccion s) {
        this.listaSelecciones.add(s);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarSeleccion{" + "listaSelecciones=" + listaSelecciones + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Seleccion s : listaSelecciones) {
                bw.write(s.getNombre() + "|");
                bw.write(s.getPartidos_jugados() + "|");
                bw.write(s.getPartidos_ganados() + "|");
                bw.write(s.getPartidos_empatados() + "|");
                bw.write(s.getPartidos_perdidos() + "|");
                bw.write(s.getGoles_favor() + "|");
                bw.write(s.getGoles_contra() + "|");
                bw.write(s.getDiferencia_goles() + "|");
                bw.write(s.PuntosObtenidos(s) + "|");

                for (Jugador j : s.getJugadores()) {
                    bw.write(j.getNombre() + ";");
                }
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }//Fin Escribir Archivo

    public void leerArchivo() throws IOException {
        Scanner lea = null;
        listaSelecciones = new ArrayList();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter("|");
                while (lea.hasNext()) {
                    listaSelecciones.add(new Seleccion(lea.next(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt(), lea.nextInt()));
                }
            } catch (Exception e) {
            }
            lea.close();
        }
    }//Fin Leer/Cargar archivo
}
