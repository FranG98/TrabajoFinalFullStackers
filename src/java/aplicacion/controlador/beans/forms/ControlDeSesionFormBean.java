/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Usuario;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fernando
 */
@ManagedBean
@ViewScoped
public class ControlDeSesionFormBean implements Serializable {

    /**
     * Creates a new instance of ControlDeSesionFormBean
     */
    public ControlDeSesionFormBean() {

    }

    public void verificarSesion() {

        try {
            FacesContext fc = FacesContext.getCurrentInstance();

            Usuario user = (Usuario) fc.getExternalContext().getSessionMap().get("usuarioLogueado");

            if (user == null) {
                fc.getExternalContext().redirect("login.xhtml");
            }
        } catch (IOException e) {

        }
    }
}
