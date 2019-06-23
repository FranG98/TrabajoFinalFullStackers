/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.sql.Blob;

/**
 *
 * @author FERNANDO
 */
public class Imagen implements Serializable {

    private String nombreImagen;
    private Blob imagen;

    public Imagen() {
    }

    public Imagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    /**
     * @return the imagen
     */
    public Blob getImagen() {
        return imagen;
    }

    /**
     * @return the nombreImagen
     */
    public String getNombreImagen() {
        return nombreImagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

    /**
     * @param nombreImagen the nombreImagen to set
     */
    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    @Override
    public String toString() {
        return "Imagen{" + "nombreImagen=" + nombreImagen + ", imagen=" + imagen + '}';
    }

}
