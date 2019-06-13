/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IVentaDAO;
import aplicacion.hibernate.dao.imp.VentaDAOImp;
import aplicacion.modelo.dominio.Venta;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Full Stackers
 */
@ManagedBean
@ViewScoped
public class VentaBean implements Serializable{
    
    private IVentaDAO ventaDAO;
    /**
     * Creates a new instance of VentaBean
     */
    public VentaBean() {
        ventaDAO = new VentaDAOImp();
    }
    
    public void agregarVenta(Venta nuevaVenta){
        getVentaDAO().crearVenta(nuevaVenta);
    }
    
    public List<Venta> obtenerVentas(){
        return getVentaDAO().obtenerVentas();
    }

    /**
     * @return the ventaDAO
     */
    public IVentaDAO getVentaDAO() {
        return ventaDAO;
    }

    /**
     * @param ventaDAO the ventaDAO to set
     */
    public void setVentaDAO(IVentaDAO ventaDAO) {
        this.ventaDAO = ventaDAO;
    }
    
}
