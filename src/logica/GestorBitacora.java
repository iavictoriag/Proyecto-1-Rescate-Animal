package logica;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GestorBitacora {
    // fecha y hora 
    private static String obtenerFechaHora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.now().format(dtf);
    }
    // Acción Exitosa
    public static void registrarAccion(String usuario, String modulo, String evento, String descripcion) {
        String registro = obtenerFechaHora() + "|" + usuario + "|" + modulo + "|" + evento + "|" + descripcion;
        guardarEnArchivo("bitacora_acciones.txt", registro);
    }
    // Error 
    public static void registrarError(String usuario, String modulo, String evento, String motivo) {
        String registro = obtenerFechaHora() + "|" + usuario + "|" + modulo + "|" + evento + "|" + motivo;
        guardarEnArchivo("bitacora_errores.txt", registro);
    }
    // archivo de texto
    private static void guardarEnArchivo(String nombreArchivo, String linea) {
        try (FileWriter fw = new FileWriter(nombreArchivo, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(linea);
        } catch (Exception e) {
            System.err.println("Error al escribir en la bitácora: " + e.getMessage());
        }
    }
}