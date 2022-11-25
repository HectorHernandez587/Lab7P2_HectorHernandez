import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarUsuarios {

    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    //extra mutador
    public void setUsuario(Usuario u) {
        this.listaUsuarios.add(u);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarUsuarios{" + "listaUsuarios=" + listaUsuarios + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Usuario lu : listaUsuarios) {
                bw.write(lu.getId() + "|");
                bw.write(lu.getUsername() + "|");
                bw.write(lu.getPassword() + "|");
                bw.write(lu.getTipo_usuario() + "|");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }//Fin Escribir Archivo

    public void leerArchivo() throws IOException {
        Scanner lea = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter("|");
                while (lea.hasNext()) {
                    listaUsuarios.add(new Usuario(lea.nextInt(), lea.next(), lea.next(), lea.next()));
                }
            } catch (Exception e) {
            }
            lea.close();
        }
    }//Fin Leer/Cargar archivo
}
