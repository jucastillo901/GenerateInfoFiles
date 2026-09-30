public class Producto {
    // Identificador único del producto
    private int id;

    // Nombre del producto
    private final String nombre;

    // Precio de una unidad del producto
    private final double precio;

    /**
     * Constructor de la clase Producto.
     *
     * @param id identificador del producto
     * @param nombre nombre del producto
     * @param precio precio por unidad
     */
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return id del producto
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return precio por unidad
     */
    public double getPrecio() {
        return precio;
    }
}
