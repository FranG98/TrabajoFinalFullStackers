/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.UsuarioBean;

import aplicacion.modelo.dominio.Usuario;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Fernando
 */
@ManagedBean
@ViewScoped
public class GestorUsuariosFormBean implements Serializable {

    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private Usuario usuario;
    private String emailLogin;
    private String passLogin;
    private String tipoCuenta;
    private List<Usuario> listaUsuarios;

    /**
     * Constructor por Defecto
     */
    public GestorUsuariosFormBean() {
        listaUsuarios = new ArrayList<>();

    }

    /**
     * Metodo PostConstructor
     */
    @PostConstruct
    public void init() {
        setUsuario(new Usuario());
//        obtenerUsuarios();


    }

    public void crearUsuario() {
        getUsuarioBean().crearUsuario(getUsuario());

        addMessageInfo("Operacion Realizada", "Usuario creado con exito");

    }

    public String iniciarSesion() {
        String redireccion = "";
        Usuario usuarioLogueado = getUsuarioBean().iniciarSesion(getEmailLogin(), getPassLogin());
        if (usuarioLogueado != null) {
            redireccion = "principal?faces-redirect=true";
        } else {
            addMessageInfo("Operacion Fallida", "Datos incorrectos o la cuenta no existe");
        }
        return redireccion;
    }
//    public void obtenerUsuarios() {
//        listaUsuarios = usuarioBean.obtenerUsuarios();
//    }
//    
//    public void eliminarUsuario(Usuario usuario) {
//        usuarioBean.eliminarUsuario(usuario);
//        init();
//        addMessageInfo("Operacion Realizada", "Usuario " + usuario.getEmailUsuario() + " eliminado con exito");
//    }
    

//    public void addMessageError(String summary, String detail) {
//        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail);
//        FacesContext.getCurrentInstance().addMessage(null, message);
//    }
//

//
//    public void actualizarUsuarios() {
//        listaUsuarios = getUsuarioBean().obtenerUsuarios();
//
//    }
//
//    public List<Permiso> obtenerPermisosDisponibles() {
//        return usuarioBean.obtenerPermisosDisponibles();
//
//    }
    
    public void addMessageInfo(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    //METODOS GETTER Y SETTERS
    /**
     * @return the emailLogin
     */
    public String getEmailLogin() {
        return emailLogin;
    }

    /**
     * @return the listaUsuarios
     */
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @return the passLogin
     */
    public String getPassLogin() {
        return passLogin;
    }

    /**
     * @return the tipoCuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @return the usuarioBean
     */
    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    /**
     * @param emailLogin the emailLogin to set
     */
    public void setEmailLogin(String emailLogin) {
        this.emailLogin = emailLogin;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    /**
     * @param passLogin the passLogin to set
     */
    public void setPassLogin(String passLogin) {
        this.passLogin = passLogin;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @param usuarioBean the usuarioBean to set
     */
    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

}
