package co.edu.uniquindio.fx10.repositorio;

import co.edu.uniquindio.fx10.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositorio centralizado para gestionar los productos
 * Singleton para garantizar una única instancia en toda la aplicación
 */
public class ProductoRepository {
    private static ProductoRepository instancia;
    private ArrayList<Producto> productos;

    private ProductoRepository() {
        productos = new ArrayList<>();
        cargarDatosEjemplo();
    }

    /**
     * Obtiene la instancia única del repositorio
     */
    public static ProductoRepository getInstancia() {
        if (instancia == null) {
            instancia = new ProductoRepository();
        }
        return instancia;
    }

    /**
     * Carga algunos productos de ejemplo
     */
    private void cargarDatosEjemplo() {
        productos.add(new Producto("P001", "Laptop Dell", "Laptop Dell Inspiron 15", 1200.00, 10));
        productos.add(new Producto("P002", "Mouse Logitech", "Mouse inalámbrico Logitech MX Master", 89.99, 25));
        productos.add(new Producto("P003", "Teclado Mecánico", "Teclado mecánico RGB", 150.00, 15));
    }

    /**
     * Obtiene todos los productos
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * Agrega un nuevo producto
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Elimina un producto
     */
    public boolean eliminarProducto(Producto producto) {
        return productos.remove(producto);
    }

    /**
     * Busca un producto por código
     */
    public Producto buscarPorCodigo(String codigo) {
        return productos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }

    /**
     * Obtiene la cantidad de productos
     */
    public int getCantidadProductos() {
        return productos.size();
    }
}

