/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Usuario;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
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

    public void verificarSesionUserConsumidor() {

        try {
            FacesContext fc = FacesContext.getCurrentInstance();

            Usuario user = (Usuario) fc.getExternalContext().getSessionMap().get("usuarioLogueado");

            if (user == null) {
                fc.getExternalContext().redirect("principal.xhtml");
            }
        } catch (IOException e) {

        }
    }

     public void verificarSesionUserAdministrativo() {
        try {
            FacesContext fc = FacesContext.getCurrentInstance();

            Usuario user = (Usuario) fc.getExternalContext().getSessionMap().get("usuarioLogueado");

            if (user == null || user.getTipoCuenta().getTipoRol().equals("Consumidor")) {
                fc.getExternalContext().redirect("principal.xhtml");
                addMessageInfo("", "");
            }
        } catch (IOException e) {

        }
    }

    public void verificarSesionUserAdmin() {
        try {
            FacesContext fc = FacesContext.getCurrentInstance();

            Usuario user = (Usuario) fc.getExternalContext().getSessionMap().get("usuarioLogueado");

            if (user == null || !user.getTipoCuenta().getTipoRol().equals("ADMIN")) {
                fc.getExternalContext().redirect("principal.xhtml");
            }
        } catch (IOException e) {

        }
    }

    //Mensajes
    /**
     * addMessageInfo
     *
     * @param summary permite mostrar el resumen del mensaje informativo
     * @param detail permite mostrar otro mensaje mas detallado
     */
    public void addMessageInfo(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    /**
     * addMessageError
     *
     * @param summary permite mostrar el resumen del mensaje de error
     * @param detail permite mostrar otro mensaje mas detallado
     */
    public void addMessageError(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
