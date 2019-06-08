/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Fernando
 */
/**
 * Clase UsuarioBean ManagedBean que interactua con la logica del negocio
 *
 */
@ManagedBean
@ViewScoped
public class UsuarioBean implements Serializable {

    //usuarioDAO atributo de tipo IUsuarioDAO que permite 
    private IUsuarioDAO usuarioDAO;

    /**
     * Creates a new instance of LoginBean
     */
    public UsuarioBean() {
        usuarioDAO = new UsuarioDAOImp();
    }

    public void crearUsuario(Usuario nuevo) {
        getUsuarioDAO().crearUsuario(nuevo);
    }

    public void eliminarUsuario(Usuario borrado) {
        getUsuarioDAO().eliminarUsuario(borrado);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioDAO.obtenerUsuarios();
    }

    public Usuario iniciarSesion(String emailLogin, String passLogin) {

        return usuarioDAO.iniciarSesion(emailLogin, passLogin);
    }

    /**
     * @return the usuarioDAO
     */
    public IUsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    /**
     * @param usuarioDAO the usuarioDAO to set
     */
    public void setUsuarioDAO(IUsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    
}
