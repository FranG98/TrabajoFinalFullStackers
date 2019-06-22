package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Representa el tipo de rol de un usuario, por defecto tendremos los roles "Consumidor","Administrativo" o "Admin"
    con él definiremos e identificaremos los distimtos tipos de cuentas.
 * @author Fernando
 */

public class Rol implements Serializable{
    private Integer codigoRol;
    private String tipoRol;
    private Set<Permiso> permisos;//permisos representa la lista de los permisos asociados a cada usuario.
    private String comentario;//comentario podremos representa un string el cual nos permitara describir o informar sobre algo 
    //de interes sobre la cuenta en cuestion.
    
    public Rol() {
        permisos = new HashSet<>();
    }

    /**
     * @param tipoRol permite guardar el tipo de rol, pudiendo ser consumidor,
     * administrativo o admin.
     * @param permisos permite agregar distintos permisos a cada cuentas.
     * @param comentario permite guardar un comentario con alguna informacion
     * relevante sobre la cuenta.
     */
    public Rol(String tipoRol, Set<Permiso> permisos, String comentario) {
        this.tipoRol = tipoRol;
        this.permisos = permisos;
        this.comentario = comentario;
    }    

    public Rol(Integer codigoRol, String tipoRol, String comentario) {
        this.codigoRol = codigoRol;
        this.tipoRol = tipoRol;
        this.comentario = comentario;
    }

   

    public Rol(String tipoRol, String comentario) {
        this.tipoRol = tipoRol;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Rol{" + "codigoRol=" + codigoRol + ", tipoRol=" + tipoRol + ", permisos=" + permisos + ", comentario=" + comentario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigoRol);
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
        if (!Objects.equals(this.codigoRol, other.codigoRol)) {
            return false;
        }
        return true;
    }

   
    
    
   
   

    //GETTERS & SETTERS

    public Integer getCodigoRol() {
        return codigoRol;
    }
     
    public void setCodigoRol(Integer codigoRol) {    
        this.codigoRol = codigoRol;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public Set<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
