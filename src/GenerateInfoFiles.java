import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Clase encargada de generar los archivos de prueba que serán utilizados
 * como entrada para el proyecto principal.
 */
public final class GenerateInfoFiles {
    private static final String CARPETA_SALIDA = "archivos_entrada";
    private static final String TIPO_DOCUMENTO = "CC";
    private static final int CANTIDAD_PRODUCTOS = 200;
    private static final Random RANDOM = new Random();

    private static final String[] NOMBRES = {
        "Juan",
        "Carlos",
        "Andres",
        "Maria",
        "Laura",
        "Camila",
        "Sebastian",
        "Valentina",
        "Santiago",
        "Daniela",
        "Felipe",
        "Paula",
        "Diego",
        "Natalia",
        "Julian",
        "Mariana",
        "Alejandro",
        "Isabella",
        "David",
        "Sofia"
    };

    private static final String[] APELLIDOS = {
        "Garcia",
        "Rodriguez",
        "Martinez",
        "Lopez",
        "Hernandez",
        "Gonzalez",
        "Perez",
        "Sanchez",
        "Ramirez",
        "Torres",
        "Flores",
        "Rivera",
        "Gomez",
        "Diaz",
        "Vargas",
        "Castro",
        "Ortiz",
        "Rojas",
        "Molina",
        "Suarez"
    };

    private static final String[] PRODUCTOS = {
        "Cuaderno",
        "Lapiz",
        "Esfero",
        "Borrador",
        "Regla",
        "Calculadora",
        "Mochila",
        "Marcador",
        "Tijeras",
        "Cartuchera",
        "Corrector",
        "Colores",
        "Sacapuntas",
        "Carpeta",
        "Resaltador",
        "Pegante",
        "Tajalapiz",
        "Block de notas",
        "Grapadora",
        "Perforadora"
    };

    private GenerateInfoFiles() {
    }

    /**
     * Genera un archivo de ventas para un vendedor específico.
     *
     * @param randomSalesCount cantidad de ventas que se generarán
     * @param name nombre del vendedor
     * @param id número de documento del vendedor
     * @throws IOException si ocurre un error al crear el archivo
     */
    public static void createSalesMenFile(
            int randomSalesCount,
            String name,
            long id) throws IOException {

        String fileName = CARPETA_SALIDA + File.separator
                + "ventas_" + id + ".txt";

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName))) {

            writer.write(TIPO_DOCUMENTO + ";" + id);
            writer.newLine();

            for (int i = 0; i < randomSalesCount; i++) {
                int productId = RANDOM.nextInt(CANTIDAD_PRODUCTOS) + 1;
                int quantity = RANDOM.nextInt(10) + 1;
                writer.write(productId + ";" + quantity);
                writer.newLine();
            }
        }
    }

    /**
     * Genera un archivo con información aleatora de productos.
     *
     * @param productsCount cantidad de productos que se generarán
     * @throws IOException si ocurre un error al crear el archivo
     */
    public static void createProductsFile(int productsCount)
            throws IOException {

        String fileName = CARPETA_SALIDA + File.separator
                + "productos.txt";

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName))) {

            for (int i = 1; i <= productsCount; i++) {
                String productName =
                        PRODUCTOS[(i - 1) % PRODUCTOS.length]
                        + "_" + i;

                double price =
                        10000 + RANDOM.nextDouble() * 490000;

                writer.write(
                        i + ";"
                        + productName + ";"
                        + String.format("%.2f", price)
                );

                writer.newLine();
            }
        }
    }

    /**
     * Genera un archivo con información aleatoria de vendedores.
     *
     * @param salesmanCount cantidad de vendedores que se generarán
     * @throws IOException si ocurre un error al crear el archivo
     */
    public static void createSalesManInfoFile(int salesmanCount)
            throws IOException {

        String fileName = CARPETA_SALIDA + File.separator
                + "vendedores.txt";

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName))) {

            for (int i = 1; i <= salesmanCount; i++) {

                String name = NOMBRES[RANDOM.nextInt(NOMBRES.length)];

                String lastName = APELLIDOS[RANDOM.nextInt(APELLIDOS.length)];

                long documentNumber = 10000000L + i;

                writer.write(
                    TIPO_DOCUMENTO + ";"
                    + documentNumber + ";"
                    + name + ";"
                    + lastName
                );

                writer.newLine();
            }
        }
    }

    public static void main(String[] args) {

        try {

            File outputDirectory = new File(CARPETA_SALIDA);

            if (!outputDirectory.exists()) {
                outputDirectory.mkdirs();
            }

            int salesmanCount = 5;
            int salesPerSalesman = 20;

            createProductsFile(CANTIDAD_PRODUCTOS);

            createSalesManInfoFile(salesmanCount);

            for (int i = 1; i <= salesmanCount; i++) {

                createSalesMenFile(
                        salesPerSalesman,
                        "Vendedor_" + i,
                        10000000L + i
                );
            }

            System.out.println(
                    "Generacion de archivos completada exitosamente."
            );

        } catch (IOException e) {

            System.err.println(
                    "Error durante la generacion de archivos: "
                    + e.getMessage()
            );
        }
    }
}