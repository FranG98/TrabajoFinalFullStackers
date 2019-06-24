/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.DetalleCarritoBean;
import aplicacion.controlador.beans.ProductoBean;
import aplicacion.modelo.dominio.DetalleCarrito;
import java.io.Serializable;
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
public class DetalleCarritoFormBean implements Serializable{
    
    @ManagedProperty(value="#{detalleCarritoBean}")
    private DetalleCarritoBean detalleCarritoBean;
    @ManagedProperty(value="#{productoBean}")
    private ProductoBean productoBean;
    private DetalleCarrito detalleCarrito;
    private String nombreProducto;
    private Short cantidad;
    /**
     * Creates a new instance of DetalleProductoFormBean
     */
    public DetalleCarritoFormBean() {
        detalleCarrito = new DetalleCarrito();
    }
    
    public void agregarDetalleCarrito(){
        FacesContext context = FacesContext.getCurrentInstance();
        for (int i = 0; i < getProductoBean().obtenerProductos().size();i++)
            {
                if (getProductoBean().obtenerProductos().get(i).getNombreProducto().equals(nombreProducto))
            {
                detalleCarrito.setProductoVendido(getProductoBean().obtenerProductos().get(i));
                if (detalleCarrito.getProductoVendido().getStock()<= cantidad){
                    context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"ERROR"
                            ,"La cantidad especificada debe ser menor al stock disponible"));
                }else{
                    context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Exito"
                            ,"Producto añadido correctamente al carrito"));
                    detalleCarrito.setCantidadVendida((int)cantidad);
//                    detalleCarrito.getProductoVendido().setStock((short)detalleCarrito.getProductoVendido().getStock()-(short)cantidad); //Tira un error de compatibilidad de tipos cuando ambos valores son short, alegando que uno de ellos es int(?)
                    productoBean.modificarProducto(detalleCarrito.getProductoVendido());
                    detalleCarrito.setPrecioTotal((double)detalleCarrito.getProductoVendido().getPrecio()*cantidad);
                    detalleCarrito.setSubtotal((double)detalleCarrito.getProductoVendido().getPrecio()*cantidad);
                    getDetalleCarritoBean().agregarDetalleCarrito(getDetalleCarrito());
                }
            }
        }
        
    }
    
    public void eliminarDetallesCarrito(DetalleCarrito detallecarrito){
        getDetalleCarritoBean().eliminarDetalleCarrito(detallecarrito);
    }
    
    public List<DetalleCarrito> obtenerDetallesCarrito(){
        List<DetalleCarrito> listaDetalles=getDetalleCarritoBean().obtenerDetalleCarrito();
        return listaDetalles;
    }
    
    /**
     * @return the detalleProductoBean
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
     * @return the detalleCarrito
     */
    public DetalleCarrito getDetalleCarrito() {
        return detalleCarrito;
    }

    /**
     * @param detalleCarrito the detalleCarrito to set
     */
    public void setDetalleCarrito(DetalleCarrito detalleCarrito) {
        this.detalleCarrito = detalleCarrito;
    }

    /**
     * @return the productoBean
     */
    public ProductoBean getProductoBean() {
        return productoBean;
    }

    /**
     * @param productoBean the productoBean to set
     */
    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the cantidad
     */
    public Short getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }
   
}
