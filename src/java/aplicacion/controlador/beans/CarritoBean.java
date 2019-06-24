package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.ICarrito;
import aplicacion.hibernate.dao.imp.CarritoDAOImp;
import aplicacion.modelo.dominio.Carrito;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Elias Acosta
 */
@ManagedBean
@ViewScoped
public class CarritoBean implements Serializable{
    private ICarrito carritoDAO;
    
    public CarritoBean() {
        carritoDAO = new CarritoDAOImp();
    }
    
    //Metodos
    public void agregarCarrito(Carrito carrito){
        carritoDAO.agregarCarrito(carrito);
    }
    
    public void eliminarCarrito(Carrito carrito){
        carritoDAO.eliminarCarrito(carrito);
    }
    
    public void modificarCarrito(Carrito carrito){
        carritoDAO.modificarCarrito(carrito);
    }
    
    public List<Carrito> obtenerCarrito(){
        return carritoDAO.obtenerCarritos();
    }
    
    //Getters y Setters
    public ICarrito getCarritoDAO() {
        return carritoDAO;
    }

    public void setCarritoDAO(ICarrito carritoDAO) {
        this.carritoDAO = carritoDAO;
    }
    
}
