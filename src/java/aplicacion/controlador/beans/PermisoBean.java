/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IPermisoDAO;
import aplicacion.hibernate.dao.imp.PermisoDAOImp;
import aplicacion.modelo.dominio.Permiso;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Representa un managedbean que solo interactua con la logica de negocio de la clase Permiso.
 * @author Usuario
 */
@ManagedBean
@ViewScoped
public class PermisoBean implements Serializable{
    IPermisoDAO permisoDAO;
    /**
     * Creates a new instance of PermisoBean
     */
    public PermisoBean() {
        permisoDAO = new PermisoDAOImp();
    }
    
    public void agregarPermiso(Permiso permiso){
        permisoDAO.agregarPermiso(permiso);
    }
    
    public void eliminarPermiso(Permiso permiso){
        permisoDAO.eliminarPermiso(permiso);
    }
    
    public void modificarPermiso(Permiso permiso){
        permisoDAO.modificarPermiso(permiso);
    }
    
    public List<Permiso> obtenerPermiso(){
        return permisoDAO.obtenerPermisos();
    }
}
