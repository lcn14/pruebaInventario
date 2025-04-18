package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;

import java.util.List;

public interface ProductoServicio {
    List<Producto> listarProducto();
    Producto buscarPorId(Integer idProducto);
    void crearProducto(Producto producto);
    void eliminarProducto(Integer idProducto);
}
