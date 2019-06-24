/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    private List<Producto> listaProductos;
    private List<String> productos;
    
    public ABMProductoFormBean() {
        producto = new Producto();
        listaProductos = new ArrayList<>();
        productos = new ArrayList<>();
    }
    @PostConstruct
    public void init(){
       obtenerProductos();  
       for(int i=0; i < listaProductos.size();i++)
       {
            getProductos().add(listaProductos.get(i).getNombreProducto());
       }
    }
    
    public void agregarProducto(){
        getProductoBean().agregarProducto(getProducto());
        obtenerProductos();
    }
    public void modificarProducto(Producto producto){
        getProductoBean().modificarProducto(producto);
        obtenerProductos();
    }
    public void eliminarProducto(Producto producto){
        getProductoBean().eliminarProducto(producto);
        obtenerProductos();
    }
    public void obtenerProductos(){
        listaProductos = getProductoBean().obtenerProductos();
    }

    /**
     * @return the listaProductos
     */
    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @return the productoBean
     */
    public ProductoBean getProductoBean() {
        return productoBean;
    }

    /**
     * @param listaProductos the listaProductos to set
     */
    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @param productoBean the productoBean to set
     */
    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    /**
     * @return the productos
     */
    public List<String> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<String> productos) {
        this.productos = productos;
    }
}
