/**
 * Representa a un vendedor del sistema.
 *
 * Esta clase almacena la información del vendedor
 * y el dinero total que ha generado mediante sus ventas.
 */
public class Vendedor {

    // Tipo de documento del vendedor
    private final String tipoDocumento;

    // Número de documento del vendedor
    private final long numeroDocumento;

    // Nombre del vendedor
    private final String nombres;

    // Apellidos del vendedor
    private final String apellidos;

    // Dinero total generado por el vendedor
    private double totalVentas;

    /**
     * Constructor de la clase Vendedor.
     *
     * @param tipoDocumento tipo de documento
     * @param numeroDocumento número de documento
     * @param nombres nombres del vendedor
     * @param apellidos apellidos del vendedor
     */
    public Vendedor(
            String tipoDocumento,
            long numeroDocumento,
            String nombres,
            String apellidos) {

        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;

        // Inicialmente el vendedor no tiene ventas acumuladas
        this.totalVentas = 0.0;
    }

    /**
     * Agrega dinero al total de ventas del vendedor.
     *
     * @param valor valor de la venta
     */
    public void agregarVenta(double valor) {
        totalVentas += valor;
    }

    /**
     * Obtiene el tipo de documento.
     *
     * @return tipo de documento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Obtiene el número de documento.
     *
     * @return número de documento
     */
    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Obtiene los nombres.
     *
     * @return nombres del vendedor
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Obtiene los apellidos.
     *
     * @return apellidos del vendedor
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Obtiene el nombre completo del vendedor.
     *
     * @return nombre y apellido
     */
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }

    /**
     * Obtiene el total de dinero generado.
     *
     * @return total de ventas
     */
    public double getTotalVentas() {
        return totalVentas;
    }
}
