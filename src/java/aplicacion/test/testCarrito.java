package aplicacion.test;

import aplicacion.hibernate.dao.ICarrito;
import aplicacion.hibernate.dao.IDetalleCarritoDAO;
import aplicacion.hibernate.dao.IProductoDAO;
import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.hibernate.dao.imp.CarritoDAOImp;
import aplicacion.hibernate.dao.imp.DetalleCarritoDAOImp;
import aplicacion.hibernate.dao.imp.ProductoDAOImp;
import aplicacion.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Carrito;
import aplicacion.modelo.dominio.DetalleCarrito;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Elias Acosta
 */
public class testCarrito {

    public static void main(String[] args) {

        Carrito unCarrito = new Carrito();
        unCarrito.setEstadoCarrito("Pendiente");
        unCarrito.setFechaCarrito("Fecha");

        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        unCarrito.setUsuarioCliente(usuarioDAO.obtenerUsuarios().get(0));

        IProductoDAO productoDAO = new ProductoDAOImp();
        DetalleCarrito unDetalleCarrito = new DetalleCarrito(productoDAO.obtenerProductos().get(0), 56, 76.6, 87.3, unCarrito);
        //DetalleCarrito otroDetalleCarrito = new DetalleCarrito(productoDAO.obtenerProductos().get(0), 56, 76.6, 87.3, unCarrito);
        Set<DetalleCarrito> listaDetalleCarrito = new HashSet(0);
        listaDetalleCarrito.add(unDetalleCarrito);
        //listaDetalleCarrito.add(otroDetalleCarrito);
        unCarrito.setDetallesCarrito(listaDetalleCarrito);

        ICarrito carritoDAO = new CarritoDAOImp();
        carritoDAO.agregarCarrito(unCarrito);
        IDetalleCarritoDAO detalleCarritoDAO = new DetalleCarritoDAOImp();
        detalleCarritoDAO.agregarDetalleCarrito(unDetalleCarrito);
        //detalleCarritoDAO.agregarDetalleCarrito(otroDetalleCarrito);

    }
}
