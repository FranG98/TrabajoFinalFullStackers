/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.LoginBean;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fernando
 */
/**
 *
 * Clase LoginFormBean ManagedBean que interactua con la vista respecto todo lo
 * referido al inicio de sesion de un usuario
 */
@ManagedBean
@SessionScoped
public class LoginFormBean implements Serializable {
    //Notacion ManagedProperty permite incrustar un managedBean para que pueda ser manejado por el managed
    //que lo instancia

    @ManagedProperty(value = "#{loginBean}")
    private LoginBean loginBean;
    //loginBean permite la conexion entre la vista y la logica del negocio
    private String emailLogin;
    //emailLogin permite almacenar desde la vista el email del usuario que quiere loguearse
    private String passLogin;

    /**
     * Constructor por defecto
     */
    public LoginFormBean() {

    }

    /**
     * IniciarSesion permite el ingreso al contenido web si la cuenta existe en
     * la base de datos
     *
     * @return la redireccion web que vera el usuario si sus datos son correctos
     */
    public String iniciarSesion() {
        String redireccion = "";
        Usuario usuario = getLoginBean().iniciarSesion(getEmailLogin(), getPassLogin());
        if (usuario != null && usuario.getEstadoCuenta().equals("Habilitada")) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioLogueado", usuario);
            redireccion = "principal?faces-redirect=true";
        } else {
            if (usuario != null && usuario.getEstadoCuenta().equals("Inhabilitada")) {
                addMessageInfo("Cuenta Bloqueada", "Contacte con el Administrador");
            } else {
                addMessageInfo("Operacion Fallida", "Datos incorrectos o la cuenta no existe");
            }
        }
        return redireccion;
    }

    /**
     * obtenerUsuarioLogueado permite mostrar el usuario en sesion a travez de
     * la variable emailLogin
     *
     */
    public void obtenerUsuarioLogueado() {
        Usuario userLogueado = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioLogueado");
        emailLogin = userLogueado.getEmailUsuario();
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

    /**
     * @return the emailLogin
     */
    public String getEmailLogin() {
        return emailLogin;
    }

    /**
     * @return the loginBean
     */
    public LoginBean getLoginBean() {
        return loginBean;
    }

    /**
     * @return the passLogin
     */
    public String getPassLogin() {
        return passLogin;
    }

    /**
     * @param emailLogin the emailLogin to set
     */
    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    /**
     * @param loginBean the loginBean to set
     */
    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    /**
     * @param passLogin the passLogin to set
     */
    public void setPassLogin(String passLogin) {
        this.passLogin = passLogin;
    }
}
