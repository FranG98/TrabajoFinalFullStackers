/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.imp.DetalleCarritoDAOImp;
import aplicacion.modelo.dominio.DetalleCarrito;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import aplicacion.hibernate.dao.IDetalleCarritoDAO;

/**
 *
 * @author Windows
 */
@ManagedBean
@ViewScoped
public class DetalleCarritoBean implements Serializable{
    
    private IDetalleCarritoDAO detalleCarritoDAO;

    public DetalleCarritoBean() {
        detalleCarritoDAO = new DetalleCarritoDAOImp();
    }
    
    public void agregarDetalleCarrito(DetalleCarrito nuevoDetalleProd){
        getDetalleCarritoDAO().agregarDetalleCarrito(nuevoDetalleProd);
    }
    
    public void eliminarDetalleCarrito(DetalleCarrito detalleCarr){
        getDetalleCarritoDAO().eliminarDetalleCarrito(detalleCarr);
    }
    
    public List<DetalleCarrito> obtenerDetalleCarrito(){
        return getDetalleCarritoDAO().obtenerDetalleCarrito();
    }
    
    /**
     * @return the detalleProductoDAO
     */
    public IDetalleCarritoDAO getDetalleCarritoDAO() {
        return detalleCarritoDAO;
    }

    /**
        * @param detalleCarritoDAO the detalleProductoDAO to set
     */
    public void setDetalleCarritoDAO(IDetalleCarritoDAO detalleCarritoDAO) {
        this.detalleCarritoDAO = detalleCarritoDAO;
    }
    
}
