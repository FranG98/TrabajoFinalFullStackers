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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

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
    
    /**
     * Creates a new instance of DetalleProductoFormBean
     */
    public DetalleCarritoFormBean() {
        detalleCarrito = new DetalleCarrito();
    }
    
    public void agregarDetalleCarrito(){
        for (int i = 0; i < getProductoBean().obtenerProductos().size();i++)
        {
            if (getProductoBean().obtenerProductos().get(i).getNombreProducto().equals(nombreProducto))
            {
                detalleCarrito.setProductoVendido(getProductoBean().obtenerProductos().get(i));
            }
        }
        getDetalleCarritoBean().agregarDetalleCarrito(getDetalleCarrito());
    }
    
    public void eliminarDetallesCarrito(){
        getDetalleCarritoBean().eliminarDetalleCarrito(detalleCarrito);
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
   
}
