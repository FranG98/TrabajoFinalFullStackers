/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.RolBean;
import aplicacion.modelo.dominio.Rol;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Elias Acosta
 */
@ManagedBean
@ViewScoped
public class RolFormBean {
    private Rol unRol;
    @ManagedProperty(value="#{rolBean}")
    private RolBean rolBean;
    private List<Rol> listaRoles;
    /**
     * Creates a new instance of RolFormBean
     */
    public RolFormBean() {
    }
    
    @PostConstruct
    public void init(){
        unRol = new Rol();
    }
    
    //Metodos CRUD de rol
    public void agregarRol(){
        rolBean.agregarRol(unRol);
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito!", "Se agrego un nuevo rol."));
       PrimeFaces.current().executeScript("PF('AgregarRol').hide();");
    }
    
    public void eliminarRol(){
        rolBean.eliminarRol(unRol);
    }
    
    public void modificarRol(){
        rolBean.modificarRol(unRol);
    }
    
    public void obtenerRoles(){
        listaRoles = rolBean.obtenerRol();
    }
    
    //Getters y Setters
    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }

    public RolBean getRolBean() {
        return rolBean;
    }

    public void setRolBean(RolBean rolBean) {
        this.rolBean = rolBean;
    }

    public List<Rol> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(List<Rol> listaRoles) {
        this.listaRoles = listaRoles;
    }
    
}
