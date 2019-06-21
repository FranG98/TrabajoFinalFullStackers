/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Permiso;
import java.util.List;

/**
 *
 * @author Elias Acosta
 */
public interface IPermisoDAO {
    public void agregarPermiso(Permiso permiso);
    public void eliminarPermiso(Permiso permiso);
    public void modificarPermiso(Permiso permiso);
    public List<Permiso>obtenerPermisos();
    
}
