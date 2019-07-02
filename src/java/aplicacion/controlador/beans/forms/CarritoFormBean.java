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
//         usuarioLogueado = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioLogueado");
//        System.out.println(getUsuarioLogueado());
//        unCarrito.setUsuarioCliente(usuarioLogueado);
//        for (int i=0; i < getDetalleCarritoBean().obtenerDetalleCarrito().size(); i++){
//            if (usuarioLogueado.getEmailUsuario().equals(getDetalleCarritoBean().obtenerDetalleCarrito().get(i).getUsuarioComprador().getEmailUsuario())){
//                detalles.add(getDetalleCarritoBean().obtenerDetalleCarrito().get(i));
//            }
//        }
//        getMailBean().enviarMail(unCarrito.getCodigoCarrito());
//        getCarritoBean().agregarCarrito(unCarrito);
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
