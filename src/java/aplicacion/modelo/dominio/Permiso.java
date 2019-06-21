package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * Clase permiso contrendra los atributos que tendran los distintos permisos
 * (operaciones ) que podran realizar los usuarios independientemente de su rol.
 * @author FullStackers
 */

public class Permiso implements Serializable{

    private Integer codigoPermiso;
    //idPermiso: representara el identificador de cada permiso.

    private String nombrePermiso;
    //nombrePermiso: representara el nombre asignado a cada permiso, por ejemplo: Eliminar Usuarios

    public Permiso() {
    }
    
    /**
     * Constructor parametrizado
     * @param nombrePermiso permite setear el nombre del permiso
     */
    public Permiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }
    
    // METODOS GETTERS AND SETTERS

    public Integer getCodigoPermiso() {
        return codigoPermiso;
    }

    public void setCodigoPermiso(Integer codigoPermiso) {
        this.codigoPermiso = codigoPermiso;
    }

    public String getNombrePermiso() {
        return nombrePermiso;
    }

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
        return "Codigo Permiso:" + getCodigoPermiso() + "; Nombre Permiso:" + getNombrePermiso();
    }

}
