/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author FullStackers
 */
/**
 *
 * Clase permiso contrendra los atributos que tendran los distintos permisos
 * (operaciones ) que podran realizar los usuarios independientemente de su rol.
 *
 */
public class Permiso implements Serializable{

    private Integer idPermiso;
    //idPermiso: representara el identificador de cada permiso.

    private String nombrePermiso;
    //nombrePermiso: representara el nombre asignado a cada permiso, por ejemplo: Eliminar Usuarios

    /**
     * Constructor por defecto
     */
    public Permiso() {
    }

    /**
     * Constructor parametrizado
     *
     * @param idPermiso permite setear el id de permiso
     * @param nombrePermiso permite setear el nombre del permiso
     */
    public Permiso(Integer idPermiso, String nombrePermiso) {
        this.idPermiso = idPermiso;
        this.nombrePermiso = nombrePermiso;
    }

    public Permiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }
    

    /**
     * METODOS GETTERS AND SETTERS
     *
     */
    /**
     * @return the idPermiso
     */
    public Integer getIdPermiso() {
        return idPermiso;
    }

    /**
     * @return the nombrePermiso
     */
    public String getNombrePermiso() {
        return nombrePermiso;
    }

    /**
     * @param idPermiso the idPermiso to set
     */
    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    /**
     * @param nombrePermiso the nombrePermiso to set
     */
    public void setNombrePermiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }

    /**
     * Metodo toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "ID Permiso:" + getIdPermiso() + "; Nombre Permiso:" + getNombrePermiso();
    }

}
