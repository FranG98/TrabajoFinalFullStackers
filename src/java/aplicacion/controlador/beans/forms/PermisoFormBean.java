package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.PermisoBean;
import aplicacion.modelo.dominio.Permiso;
import java.io.Serializable;
import java.util.ArrayList;
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
public class PermisoFormBean implements Serializable{
    private Permiso unPermiso;
    @ManagedProperty(value="#{permisoBean}")
    private PermisoBean permisoBean;
    private List<Permiso> permisos;
    /**
     * Creates a new instance of PermisoFormBean
     */
    public PermisoFormBean() {
        permisos = new ArrayList<>();
    }
    
    @PostConstruct
    public void init(){
        unPermiso = new Permiso();
        obtenerPermiso();
    }
    
    public void agregarPermiso(){
        permisoBean.agregarPermiso(unPermiso);
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito!", "Se agrego un nuevo permiso."));
        PrimeFaces.current().executeScript("PF('registrarPermiso').hide();");
        obtenerPermiso();
    }
    
    public void eliminarPermiso(){
        permisoBean.eliminarPermiso(unPermiso);
    }
    
    public void modificarPermiso(){
        permisoBean.modificarPermiso(unPermiso);
    }
    
    public void obtenerPermiso(){
        permisos = permisoBean.obtenerPermiso();
    }

    public Permiso getUnPermiso() {
        return unPermiso;
    }

    public void setUnPermiso(Permiso unPermiso) {
        this.unPermiso = unPermiso;
    }

    public PermisoBean getPermisoBean() {
        return permisoBean;
    }

    public void setPermisoBean(PermisoBean permisoBean) {
        this.permisoBean = permisoBean;
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }
}
