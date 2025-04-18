package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;
import gm.inventarios.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductoService implements ProductoServicio{

    @Autowired
    ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> listarProducto() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto buscarPorId(Integer idProducto) {
            Producto producto = this.productoRepositorio.findById(idProducto).orElse(null);
            return producto;

    }

    @Override
    public void crearProducto(Producto producto) {
        this.productoRepositorio.save(producto);
    }

    @Override
    public void eliminarProducto(Integer idProducto) {
        this.productoRepositorio.deleteById(idProducto);
    }
}
