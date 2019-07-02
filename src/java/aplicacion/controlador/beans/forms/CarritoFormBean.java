package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.CarritoBean;
import aplicacion.modelo.dominio.Carrito;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
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
    private Integer codigoIngresado;
    private Carrito carritoBuscado;
    
    public CarritoFormBean() {
        carritos = new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
        unCarrito = new Carrito();
        setCarritoBuscado(new Carrito());
    }
    
    //Metodos CRUD de Carrito.
    public void agregarCarrito(){
        carritoBean.agregarCarrito(unCarrito);
    }
    
    public void eliminarCarrito(){
        getCarritoBean().eliminarCarrito(unCarrito);
    }
    
    public void modificarCarrito(){
        getCarritoBean().modificarCarrito(unCarrito);
    }
    
    public List<Carrito> obtenerCarrito(){
        return getCarritoBean().obtenerCarrito();
    }

     public void verificarCarrito(){
        Boolean obtenido = false;
        FacesContext context = FacesContext.getCurrentInstance();
        for(int i = 0; i < obtenerCarrito().size() && obtenido != true; i++){
            if (obtenerCarrito().get(i).getCodigoCarrito().equals(getCodigoIngresado())) {
                setCarritoBuscado(obtenerCarrito().get(i));
                obtenido = true;
            }   
            }
            if (obtenido == false){
                context.addMessage(null,
                  new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERROR",
                       "No existe una compra con el codigo especificado"));        
            }
    }   
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

    /**
     * @return the codigoIngresado
     */
    public Integer getCodigoIngresado() {
        return codigoIngresado;
    }

    /**
     * @param codigoIngresado the codigoIngresado to set
     */
    public void setCodigoIngresado(Integer codigoIngresado) {
        this.codigoIngresado = codigoIngresado;
    }

    /**
     * @return the carritoBuscado
     */
    public Carrito getCarritoBuscado() {
        return carritoBuscado;
    }

    /**
     * @param carritoBuscado the carritoBuscado to set
     */
    public void setCarritoBuscado(Carrito carritoBuscado) {
        this.carritoBuscado = carritoBuscado;
    }
        
}
