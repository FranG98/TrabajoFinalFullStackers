/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
/**
 * Clare Rol contiene los atributos que tendran los distintos roles que podran
 * tener los usuarios.
 *
 */
public class Rol implements Serializable{

    private Integer codigoRol;
    //codigoDeRol representa el codigo de cada rol. Clave primaria en la base de datos.

    private String tipoRol;
    /*claseRol representa el tipo de rol de un usuario; por defecto tendremos los roles "Consumidor","Administrativo" o "Admin"
    con él definiremos e identificaremos los distimtos tipos de cuentas.
    
     */

    private List<Permiso> listaPermisos;
    //listaPermisos representa la lista de los permisos asociados a cada usuario.

    private String comentario;
    //comentario podremos representa un string el cual nos permitara describir o informar sobre algo 
    //de interes sobre la cuenta en cuestion.

    //CONSTRUCTORES
    /**
     * Constructor por defecto
     */
    /**
     * Clase Rol contiene los atributos que tendra cada rol del sistema
     *
     */
    public Rol() {
        listaPermisos = new ArrayList<>();
    }

    /**
     * Constructor parametrizado
     *
     * @param codigoRol permite guardar el codigo de rol.
     * @param tipoRol permite guardar el tipo de rol, pudiendo ser consumidor,
     * administrativo o admin.
     * @param listaPermisos permite agregar distintos permisos a las cuentas.
     * @param comentario permite guardar un comentario con alguna informacion
     * relevante sobre la cuenta.
     */
    public Rol(Integer codigoRol, String tipoRol, List<Permiso> listaPermisos, String comentario) {
        this.codigoRol = codigoRol;
        this.tipoRol = tipoRol;
        this.listaPermisos = listaPermisos;
        this.comentario = comentario;
    }

    /**
     * METODOS
     */
    /**
     * otorgarPermiso permite agregar un permiso a la cuenta.
     *
     * @param permiso string que indica que permiso tendra la cuenta.
     * @return la lista de permisos
     */
    public List<Permiso> otorgarPermiso(Permiso permiso) {
        getListaPermisos().add(permiso);
        return getListaPermisos();
    }

    /**
     * revocarPermiso permite quitar un permiso a la cuenta.
     *
     * @param permiso string que indica que permiso qie perdera la cuenta.
     * @return la lista de permisos
     */
    public List<Permiso> revocarPermiso(Permiso permiso) {
        getListaPermisos().remove(permiso);
        return getListaPermisos();
    }

    /**
     * METODOS GETTERS & SETTERS
     */
    /**
     * @return the codigoRol
     */
    public Integer getCodigoRol() {
        return codigoRol;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @return the listaPermisos
     */
    public List<Permiso> getListaPermisos() {
        return listaPermisos;
    }

    /**
     * @return the tipoRol
     */
    public String getTipoRol() {
        return tipoRol;
    }

    /**
     * @param codigoRol the codigoRol to set
     */
    public void setCodigoRol(Integer codigoRol) {
        this.codigoRol = codigoRol;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @param listaPermisos the listaPermisos to set
     */
    public void setListaPermisos(List<Permiso> listaPermisos) {
        this.listaPermisos = listaPermisos;
    }

    /**
     * @param tipoRol the tipoRol to set
     */
    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    /**
     * Metodo ToString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Rol{" + "codigoRol=" + getCodigoRol() + ", tipoRol=" + getTipoRol() + ", listaPermisos=" + getListaPermisos() + ", comentario=" + getComentario() + '}';
    }

}
