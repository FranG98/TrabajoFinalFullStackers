package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.CarritoBean;
import aplicacion.controlador.beans.DetalleCarritoBean;
import aplicacion.controlador.beans.MailBean;
import aplicacion.modelo.dominio.Carrito;
import aplicacion.modelo.dominio.DetalleCarrito;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
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
    @ManagedProperty(value="#{detalleCarritoBean}")
    private DetalleCarritoBean detalleCarritoBean;
    @ManagedProperty(value="#{mailBean}")
    private MailBean mailBean;
    private List<Carrito> carritos;
    private Usuario usuarioLogueado;
    private List<DetalleCarrito> detalles;
   
    public CarritoFormBean() {
        carritos = new ArrayList<>();
        detalles = new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
        unCarrito = new Carrito();
        
    }
    
    //Metodos CRUD de Carrito.
    public void agregarCarrito(){
         usuarioLogueado = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioLogueado");
        System.out.println(getUsuarioLogueado());
        unCarrito.setUsuarioCliente(usuarioLogueado);
        for (int i=0; i < getDetalleCarritoBean().obtenerDetalleCarrito().size(); i++){
            if (usuarioLogueado.getEmailUsuario().equals(getDetalleCarritoBean().obtenerDetalleCarrito().get(i).getUsuarioComprador().getEmailUsuario())){
                detalles.add(getDetalleCarritoBean().obtenerDetalleCarrito().get(i));
            }
        }
        getMailBean().enviarMail(unCarrito.getCodigoCarrito());
        getCarritoBean().agregarCarrito(unCarrito);
    }
    
    public void eliminarCarrito(Carrito carrito){
        detalles.clear();
        getCarritoBean().eliminarCarrito(carrito);
    }
    
    public void modificarCarrito(Carrito carrito){
        getCarritoBean().modificarCarrito(carrito);
    }
    
    public List<Carrito> obtenerCarrito(){
        return getCarritoBean().obtenerCarrito();
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

    /**
     * @return the usuarioLogueado
     */
    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    /**
     * @param usuarioLogueado the usuarioLogueado to set
     */
    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    /**
     * @return the detalleCarritoBean
     */
    public DetalleCarritoBean getDetalleCarritoBean() {
        return detalleCarritoBean;
    }

    /**
     * @param detalleCarritoBean the detalleCarritoBean to set
     */
    public void setDetalleCarritoBean(DetalleCarritoBean detalleCarritoBean) {
        this.detalleCarritoBean = detalleCarritoBean;
    }

    /**
     * @return the detalles
     */
    public List<DetalleCarrito> getDetalles() {
        return detalles;
    }

    /**
     * @param detalles the detalles to set
     */
    public void setDetalles(List<DetalleCarrito> detalles) {
        this.detalles = detalles;
    }

    /**
     * @return the mailBean
     */
    public MailBean getMailBean() {
        return mailBean;
    }

    /**
     * @param mailBean the mailBean to set
     */
    public void setMailBean(MailBean mailBean) {
        this.mailBean = mailBean;
    }
    
}
