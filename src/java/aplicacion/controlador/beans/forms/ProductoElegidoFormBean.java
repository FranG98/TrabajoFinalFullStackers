package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ProductoElegidoBean;
import aplicacion.modelo.dominio.Carrito;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.ProductoElegido;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Windows
 */
@ManagedBean
@ViewScoped
public class ProductoElegidoFormBean implements Serializable{
    private ProductoElegido unProductoElegido;
    @ManagedProperty(value="#{productoElegidoBean}")
    private ProductoElegidoBean productoElegidoBean;
    private List<ProductoElegido> listaProductoElegido;
    private Carrito carritoCreado;
    private Integer cantidad;
    private List<ProductoElegido> productosElegidos;
    private Producto productoPedido;
    
    /**
     * Creates a new instance of DetalleProductoFormBean
     */
    public ProductoElegidoFormBean() {
        unProductoElegido = new ProductoElegido();
        carritoCreado = new Carrito();
        productosElegidos = new ArrayList<>();
        productoPedido = new Producto();
    }
    
    public void agregarProductoElegido(){
        Usuario usuarioLogueado = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioLogueado");
        if (productoPedido.getStock() < cantidad){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage
        (FacesMessage.SEVERITY_ERROR,"ERROR","Debe especificar una cantidad menor o igual al stock disponible de este producto"));
        } else{
        carritoCreado.setUsuarioCliente(usuarioLogueado);
        carritoCreado.setFechaCarrito(new Date());
        carritoCreado.setEstadoCarrito("Pendiente");
        
        unProductoElegido.setCantidadReservada(cantidad);
        unProductoElegido.setCarrito(carritoCreado);
        unProductoElegido.setProductoElegido(productoPedido);
        unProductoElegido.setPrecioTotal((double)productoPedido.getPrecio()*cantidad);
        unProductoElegido.setSubtotal((double)productoPedido.getPrecio()*cantidad);
        
        productosElegidos.add(unProductoElegido);
        productoElegidoBean.agregarProductoElegido(unProductoElegido);
        }
    }
    
    public void eliminarProductoElegido(){
        productoElegidoBean.eliminarProductoElegido(unProductoElegido);
    }
    
    public void modificarProductoElegido(){
        productoElegidoBean.modificarProductoElegido(unProductoElegido);
    }
    
    public List<ProductoElegido> obtenerProductosElegidos(){
        listaProductoElegido = productoElegidoBean.obtenerProductoElegido();
        return listaProductoElegido;
    }



    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the unProductoElegido
     */
    public ProductoElegido getUnProductoElegido() {
        return unProductoElegido;
    }

    /**
     * @param unProductoElegido the unProductoElegido to set
     */
    public void setUnProductoElegido(ProductoElegido unProductoElegido) {
        this.unProductoElegido = unProductoElegido;
    }

    /**
     * @return the productoElegidoBean
     */
    public ProductoElegidoBean getProductoElegidoBean() {
        return productoElegidoBean;
    }

    /**
     * @param productoElegidoBean the productoElegidoBean to set
     */
    public void setProductoElegidoBean(ProductoElegidoBean productoElegidoBean) {
        this.productoElegidoBean = productoElegidoBean;
    }

    /**
     * @return the listaProductoElegido
     */
    public List<ProductoElegido> getListaProductoElegido() {
        return listaProductoElegido;
    }

    /**
     * @param listaProductoElegido the listaProductoElegido to set
     */
    public void setListaProductoElegido(List<ProductoElegido> listaProductoElegido) {
        this.listaProductoElegido = listaProductoElegido;
    }

    /**
     * @return the carritoCreado
     */
    public Carrito getCarritoCreado() {
        return carritoCreado;
    }

    /**
     * @param carritoCreado the carritoCreado to set
     */
    public void setCarritoCreado(Carrito carritoCreado) {
        this.carritoCreado = carritoCreado;
    }

    /**
     * @return the productosElegidos
     */
    public List<ProductoElegido> getProductosElegidos() {
        return productosElegidos;
    }

    /**
     * @param productosElegidos the productosElegidos to set
     */
    public void setProductosElegidos(List<ProductoElegido> productosElegidos) {
        this.productosElegidos = productosElegidos;
    }

    /**
     * @return the productoPedido
     */
    public Producto getProductoPedido() {
        return productoPedido;
    }

    /**
     * @param productoPedido the productoPedido to set
     */
    public void setProductoPedido(Producto productoPedido) {
        this.productoPedido = productoPedido;
    }
    
    
}
