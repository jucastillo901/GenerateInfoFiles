/**
 * Representa una venta realizada por un vendedor.
 *
 * Una venta relaciona un producto con la cantidad
 * que fue vendida.
 */
public class Venta {

    // Identificador del producto vendido
    private final int idProducto;

    // Cantidad de unidades vendidas
    private final int cantidad;

    /**
     * Constructor de la clase Venta.
     *
     * @param idProducto identificador del producto
     * @param cantidad cantidad de unidades vendidas
     */
    public Venta(int idProducto, int cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return id del producto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Obtiene la cantidad vendida.
     *
     * @return cantidad de unidades
     */
    public int getCantidad() {
        return cantidad;
    }
}
