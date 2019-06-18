/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.DetalleProductoBean;
import aplicacion.modelo.dominio.DetalleProducto;
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
public class DetalleProductoFormBean implements Serializable{
    
    @ManagedProperty(value="#{detalleProductoBean}")
    private DetalleProductoBean detalleProductoBean;
    private DetalleProducto detalleProducto;
    
    /**
     * Creates a new instance of DetalleProductoFormBean
     */
    public DetalleProductoFormBean() {
        detalleProducto = new DetalleProducto();
    }
    
    public void agregarVenta(){
        getDetalleProductoBean().agregarDetalleProducto(getDetalleProducto());
    }
    
    public List<DetalleProducto> obtenerVentas(){
        return getDetalleProductoBean().obtenerDetalleProducto();
    }
    /**
     * @return the detalleProductoBean
     */
    public DetalleProductoBean getDetalleProductoBean() {
        return detalleProductoBean;
    }

    /**
     * @param detalleProductoBean the detalleProductoBean to set
     */
    public void setDetalleProductoBean(DetalleProductoBean detalleProductoBean) {
        this.detalleProductoBean = detalleProductoBean;
    }

    /**
     * @return the detalleProducto
     */
    public DetalleProducto getDetalleProducto() {
        return detalleProducto;
    }

    /**
     * @param detalleProducto the detalleProducto to set
     */
    public void setDetalleProducto(DetalleProducto detalleProducto) {
        this.detalleProducto = detalleProducto;
    }
   
}
