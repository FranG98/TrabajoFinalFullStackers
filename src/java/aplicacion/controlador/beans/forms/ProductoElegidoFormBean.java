package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ProductoElegidoBean;
import aplicacion.modelo.dominio.ProductoElegido;
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
public class ProductoElegidoFormBean implements Serializable{
    private ProductoElegido unProductoElegido;
    @ManagedProperty(value="#{productoElegidoBean}")
    private ProductoElegidoBean productoElegidoBean;
    private List<ProductoElegido> listaProductoElegido;
    /**
     * Creates a new instance of DetalleProductoFormBean
     */
    public ProductoElegidoFormBean() {
        unProductoElegido = new ProductoElegido();
    }
    
    public void agregarProductoElegido(){
        productoElegidoBean.agregarProdcutoElegido(unProductoElegido);
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

    public ProductoElegido getUnProductoElegido() {
        return unProductoElegido;
    }

    public void setUnProductoElegido(ProductoElegido unProductoElegido) {
        this.unProductoElegido = unProductoElegido;
    }

    public ProductoElegidoBean getProductoElegidoBean() {
        return productoElegidoBean;
    }

    public void setProductoElegidoBean(ProductoElegidoBean productoElegidoBean) {
        this.productoElegidoBean = productoElegidoBean;
    }

    public List<ProductoElegido> getListaProductoElegido() {
        return listaProductoElegido;
    }

    public void setListaProductoElegido(List<ProductoElegido> listaProductoElegido) {
        this.listaProductoElegido = listaProductoElegido;
    }
    
}
