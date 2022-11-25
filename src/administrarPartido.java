
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarPartido {

    private ArrayList<Partido> listaPartidos = new ArrayList();
    private File archivo = null;

    public administrarPartido(String path) {
        archivo = new File(path);
    }

    public ArrayList<Partido> getlistaPartidos() {
        return listaPartidos;
    }

    public void setlistaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    //extra mutador
    public void setPartido (Partido p) {
        this.listaPartidos.add(p);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarPartido{" + "listaPartidos=" + listaPartidos + ", archivo=" + archivo + '}';
    }

    

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Partido p : listaPartidos) {
                bw.write(p.getLocal() + "|");
                bw.write(p.getVisita() + "|");
                bw.write(p.getGoles() + "|");
                bw.write(p.getPosesion() + "|");
                bw.write(p.getTiros_total() + "|");
                bw.write(p.getTiros_meta() + "|");
                bw.write(p.getFaltas_cometidas() + "|");
                
                for (Jugador jc : p.getJug_comfaltas()) {
                    bw.write(jc.getNombre() + ";");
                }
                for (Jugador jt : p.getJug_tarjetas()) {
                    bw.write(jt.getNombre() + ";");
                }
                for (Jugador jg : p.getJug_goleadores()) {
                    bw.write(jg.getNombre() + ";");
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
        listaPartidos = new ArrayList();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter("|");

                while (lea.hasNext()) {
                    //listaPartidos.add(new Partido(, visita, 0, 0, 0, 0, 0));
                }
            } catch (Exception e) {
            }
            lea.close();
        }
    }//Fin Leer/Cargar archivo
}
