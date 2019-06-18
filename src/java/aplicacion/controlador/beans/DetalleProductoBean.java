/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IDetalleProductoDAO;
import aplicacion.hibernate.dao.imp.DetalleProductoDAOImp;
import aplicacion.modelo.dominio.DetalleProducto;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Windows
 */
@ManagedBean
@ViewScoped
public class DetalleProductoBean implements Serializable{
    
    private IDetalleProductoDAO detalleProductoDAO;

    public DetalleProductoBean() {
        detalleProductoDAO = new DetalleProductoDAOImp();
    }
    
    public void agregarDetalleProducto(DetalleProducto nuevoDetalleProd){
        getDetalleProductoDAO().agregarDetalleProducto(nuevoDetalleProd);
    }
    
    public List<DetalleProducto> obtenerDetalleProducto(){
        return getDetalleProductoDAO().obtenerDetalleProducto();
    }
    
    /**
     * @return the detalleProductoDAO
     */
    public IDetalleProductoDAO getDetalleProductoDAO() {
        return detalleProductoDAO;
    }

    /**
     * @param detalleProductoDAO the detalleProductoDAO to set
     */
    public void setDetalleProductoDAO(IDetalleProductoDAO detalleProductoDAO) {
        this.detalleProductoDAO = detalleProductoDAO;
    }
    
}
