package gm.inventarios.controlador;

import gm.inventarios.modelo.Producto;
import gm.inventarios.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/apiProducts")
@RestController
@CrossOrigin("*") //value = "https://localhost:4200" Puerto por default en Angular
public class ProductoControlador {

    @Autowired
    ProductoServicio productoServicio;

    @GetMapping
    public Producto buscarPorId(@RequestParam Integer idProducto) {
        Producto producto = this.productoServicio.buscarPorId(idProducto);
        return producto;
    }
    @GetMapping(path = "/listaProductos")
    public List<Producto> buscarPorId() {
        return productoServicio.listarProducto();
    }
}
