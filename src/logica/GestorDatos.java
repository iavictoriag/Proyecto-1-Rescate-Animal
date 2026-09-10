package logica;

public class GestorDatos {
    
    // Matriz y contador para Adoptantes 
    // Columnas: [0] Código, [1] Nombre, [2] DPI, [3] Teléfono
    public static String[][] adoptantes = new String[100][4];
    public static int contadorAdoptantes = 0;

    // Matriz y contador para Animales 
    // Columnas: [0] Código, [1] Especie, [2] Edad, [3] Salud, [4] Estado
    public static String[][] animales = new String[100][5];
    public static int contadorAnimales = 0;
    
    // Matriz y contador para Solicitudes 
    // Columnas: [0] Código Solicitud, [1] Código Adoptante, [2] Código Animal
    public static String[][] solicitudes = new String[100][3];
    public static int contadorSolicitudes = 0;
    
    // Matriz y contador para Rescates 
    public static String[][] rescates = new String[100][4];
    public static int contadorRescates = 0;
    
    // Matriz y contador para Espacios de Refugio 
    public static String[][] espacios = new String[100][4];
    public static int contadorEspacios = 0;
}