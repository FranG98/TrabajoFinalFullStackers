/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.modelo.dominio.Producto;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author jack
 */
@ManagedBean
@ViewScoped
public class ABMProductoFormBean implements Serializable {

    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;
    private Producto producto;
    private List<Producto> listaProductos;
    private List<String> productos;
    private Part image;
    private static String imagenCadena;

    public ABMProductoFormBean() {

        producto = new Producto();
        listaProductos = new ArrayList<>();
        productos = new ArrayList<>();

    }

    @PostConstruct
    public void init() {
        obtenerProductos();
        for (int i = 0; i < listaProductos.size(); i++) {
            getProductos().add(listaProductos.get(i).getNombreProducto());
        }
    }

    public void agregarProducto() {

        producto.setImagen(imagenCadena);
        imagenCadena = null;
        if (producto.getImagen() != null) {

            getProductoBean().agregarProducto(getProducto());
            obtenerProductos();
        } else {
            addMessageError("Debe seleccionar una imagen de producto", "");
        }

    }

    public void modificarProducto(Producto producto) {
        getProductoBean().modificarProducto(producto);
        obtenerProductos();
    }

    public void eliminarProducto(Producto producto) {
        getProductoBean().eliminarProducto(producto);
        obtenerProductos();
    }

    public void obtenerProductos() {
        listaProductos = getProductoBean().obtenerProductos();
    }
    /**
     * encode(): Permite codificar una imagen subida desde la vista y convertirla en base64
     * lo que permite almacenarla facilmente como un simple string, en donde el tipo de dato de mysql
     * corresponde con un text(un string largo); luego con un simple decodificador en la vista mostramos
     * directamente las imagenes
     */
    public void encode() {

        byte[] imageAsByte = new byte[(int) getImage().getSize()];
        try {
            if (image.getSize() > 0) {
                getImage().getInputStream().read(imageAsByte);
                imagenCadena = new String(Base64.encodeBase64(imageAsByte));
            }

        } catch (IOException e) {
            System.out.println(e);

        }
    }

    //Mensajes
    /**
     * addMessageInfo
     *
     * @param summary permite mostrar el resumen del mensaje informativo
     * @param detail permite mostrar otro mensaje mas detallado
     */
    public void addMessageInfo(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    /**
     * addMessageError
     *
     * @param summary permite mostrar el resumen del mensaje de error
     * @param detail permite mostrar otro mensaje mas detallado
     */
    public void addMessageError(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
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

    /**
     * @return the image
     */
    public Part getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Part image) {
        this.image = image;
    }

}
