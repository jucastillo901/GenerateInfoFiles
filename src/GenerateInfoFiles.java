import java.util.Random;


/**
 * Clase utilitaria (solo métodos estáticos) que genera los archivos planos
 * de entrada: ventas, productos y vendedores.
 */
public final class GenerateInfoFiles {

    // Carpeta donde se guardan TODOS los archivos generados.
    // Debe estar dentro del proyecto, como se está pidiendo el enunciado.
    public static final String CARPETA_SALIDA = "archivos_entrada";

    /**
     * Usamos  "CC" como tipo de documento por defecto para que
     * el archivo de vendedores y los archivos de ventas queden coherentes
     * entre sí (mismo tipo de documento para el mismo número).
     */
    private static final String TIPO_DOCUMENTO_DEFECTO = "CC";

    /**
     * Límite superior de IDs de producto. Se usa tanto al generar el
     * catálogo como al generar las ventas, así los IDs que aparecen
     * en las ventas SIEMPRE existen en el catálogo de productos.
     */
    private static final int MAX_ID_PRODUCTO = 30;

    private static final Random RANDOM = new Random();

    /**
     * Listas de nombres/apellidos reales para que los vendedores
     * generados sean "coherentes" (pide el enunciado esto explícitamente).
     */
    private static final String[] NOMBRES = {
            "Juan", "Carlos", "Andres", "Maria", "Laura", "Camila", "Sebastian",
            "Valentina", "Santiago", "Daniela", "Felipe", "Paula", "Diego",
            "Natalia", "Julian", "Mariana", "Alejandro", "Isabella", "David", "Sofia"
    };

    private static final String[] APELLIDOS = {
            "Garcia", "Rodriguez", "Martinez", "Lopez", "Hernandez", "Gonzalez",
            "Perez", "Sanchez", "Ramirez", "Torres", "Flores", "Rivera", "Gomez",
            "Diaz", "Vargas", "Castro", "Ortiz", "Rojas", "Molina", "Suarez"
    };

    private static final String[] PRODUCTOS_BASE = {
            "Cuaderno", "Lapiz", "Esfero", "Borrador", "Regla", "Calculadora",
            "Mochila", "Marcador", "Tijeras", "Cartuchera", "Corrector", "Colores",
            "Sacapuntas", "Carpeta", "Resaltador", "Pegante", "Tajalapiz",
            "Block de notas", "Grapadora", "Perforadora", "USB", "Audifonos",
            "Mouse", "Teclado", "Cargador", "Agenda", "Cinta adhesiva",
            "Boligrafo de gel", "Papel bond", "Estuche"
    };

    // Constructor privado: es una clase utilitaria, nadie debe crear
    // instancias de ella (todos sus métodos son static).
    private GenerateInfoFiles() {
    }

}