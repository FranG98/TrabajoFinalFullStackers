/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    private Set<Permiso> permisos;
    //permisos representa la lista de los permisos asociados a cada usuario.

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
        permisos=new HashSet<>();
        
    }

    /**
     * Constructor parametrizado
     *
     * @param codigoRol permite guardar el codigo de rol.
     * @param tipoRol permite guardar el tipo de rol, pudiendo ser consumidor,
     * administrativo o admin.
     * @param permisos permite agregar distintos permisos a cada cuentas.
     * @param comentario permite guardar un comentario con alguna informacion
     * relevante sobre la cuenta.
     */
    public Rol(Integer codigoRol, String tipoRol, Set<Permiso> permisos, String comentario) {   
        this.codigoRol = codigoRol;
        this.tipoRol = tipoRol;
        this.permisos = permisos;
        this.comentario = comentario;
    }

    public Rol(String tipoRol, Set<Permiso> permisos, String comentario) {
        this.tipoRol = tipoRol;
        this.permisos = permisos;
        this.comentario = comentario;
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
    public Set<Permiso> getPermisos() {
        return permisos;
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
     * @param permisos the permisos to set
     */
    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }

    /**
     * @param tipoRol the tipoRol to set
     */
    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    /**
     * METODOS hashCode & equals
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codigoRol);
        hash = 67 * hash + Objects.hashCode(this.tipoRol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rol other = (Rol) obj;
        if (!Objects.equals(this.tipoRol, other.tipoRol)) {
            return false;
        }
        if (!Objects.equals(this.codigoRol, other.codigoRol)) {
            return false;
        }
        return true;
    }
    
    /**
     * Metodo ToString
     *
     * @return
     */    
    @Override
    public String toString() {
        return "codigoRol=" + codigoRol + ", tipoRol=" + tipoRol + ", permisos=" + permisos + ", comentario=" + comentario;
    }
    
    
}
