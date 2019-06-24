/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

/**
 *
 * @author Fernando
 */
@ManagedBean
@ViewScoped
public class UploadImagenFormBean implements Serializable{

     private Part imagen;

    /**
     * METODOS
     * @return 
     * @throws java.io.IOException
     */
    public String upload() throws IOException {
        
        getImagen().write("C:/Users/FERNANDO/OneDrive/FACULTAD/Programacion Visual/TrabajoFinalFullStackers/web/resources/images/" + getFilename(getImagen()));
        return "success";
        
        
    }
    
    private static String getFilename(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
                
            }
        }
        return null;
    }

     
    /**
     * METODOS GETTERS Y SETTERS
     */
    
    /**
     * @return the imagen
     */
    public Part getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(Part imagen) {
        this.imagen = imagen;
    }
    
}
