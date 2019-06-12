/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jack
 */
@ManagedBean
@ViewScoped
public class ABMProductoFormBean implements Serializable{

    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;
    private Producto producto;
    
    public ABMProductoFormBean() {
    }
    @PostConstruct
    public void init(){
         producto = new Producto();
    }
    
    public void agregarProducto(){
        productoBean.agregarProducto(producto);
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
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    /**
    public void modificarProducto(){
        productoBean.modificarProducto(producto);
    }
    public void eliminarProducto(){
        productoBean.eliminarProducto(producto);
    }*/
    
   
    
    
}
