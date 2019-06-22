/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IRolDAO;
import aplicacion.hibernate.dao.IUsuarioDAO;
import aplicacion.hibernate.dao.imp.RolDAOImp;
import aplicacion.hibernate.dao.imp.UsuarioDAOImp;
import aplicacion.modelo.dominio.Rol;
import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author FERNANDO
 */
public class testRolyUsuario {
    public static void main(String[] args) {
        Rol rol = new Rol("Admin", "Rol Admin tiene todos los permisos");
        IRolDAO rolDAO=new RolDAOImp();
        rolDAO.agregarRol(rol);
        
        Usuario usuario = new Usuario("admin", "fullstackers", Byte.parseByte("23"), 12123123, "fullstackers@gmail.com", "Full123", "Habilitada", rol);
        
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        usuarioDAO.crearUsuario(usuario);
        
        
    }
    
}
