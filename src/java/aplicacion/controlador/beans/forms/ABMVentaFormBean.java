/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.VentaBean;
import aplicacion.modelo.dominio.Venta;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Full Stackers
 */
@ManagedBean
@ViewScoped
public class ABMVentaFormBean {

    @ManagedProperty(value = "#{ventaBean}")
    private VentaBean ventaBean;
    private Venta venta;
    /**
     * Creates a new instance of VentaFormBean
     */
    public ABMVentaFormBean() {
        venta = new Venta();
    }
    
    public void agregarVenta(){
        getVentaBean().agregarVenta(getVenta());
    }
    
    public List<Venta> obtenerVentas(){
        return getVentaBean().obtenerVentas();
    }
            
            
    // GETTER Y SETTERS
    /**
     * @return the ventaBean
     */
    public VentaBean getVentaBean() {
        return ventaBean;
    }

    /**
     * @param ventaBean the ventaBean to set
     */
    public void setVentaBean(VentaBean ventaBean) {
        this.ventaBean = ventaBean;
    }

    /**
     * @return the venta
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    
}
