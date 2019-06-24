package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.CarritoBean;
import aplicacion.modelo.dominio.Carrito;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Elias Acosta
 */
@ManagedBean
@ViewScoped
public class CarritoFormBean implements Serializable{
    private Carrito unCarrito;
    @ManagedProperty(value="#{carritoBean}")
    private CarritoBean carritoBean;
    private List<Carrito> carritos;
    
    
    public CarritoFormBean() {
        carritos = new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
        unCarrito = new Carrito();
        
    }
    
    //Metodos CRUD de Carrito.
    public void agregarCarrito(){
        carritoBean.agregarCarrito(unCarrito);
    }
    
    public void eliminarCarrito(){
        carritoBean.eliminarCarrito(unCarrito);
    }
    
    public void modificarCarrito(){
        carritoBean.modificarCarrito(unCarrito);
    }
    
    public void obtenerCarrito(){
        carritos = carritoBean.obtenerCarrito();
    }
    
    //Getters y Seters

    public Carrito getUnCarrito() {
        return unCarrito;
    }

    public void setUnCarrito(Carrito unCarrito) {
        this.unCarrito = unCarrito;
    }

    public CarritoBean getCarritoBean() {
        return carritoBean;
    }

    public void setCarritoBean(CarritoBean carritoBean) {
        this.carritoBean = carritoBean;
    }

    public List<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(List<Carrito> carritos) {
        this.carritos = carritos;
    }
    
}
