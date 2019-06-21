/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Permiso;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import aplicacion.hibernate.dao.IPermisoDAO;

/**
 *
 * @author Usuario
 */ 
public class PermisoDAOImp implements IPermisoDAO, Serializable{

    @Override
    public void agregarPermiso(Permiso permiso) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(permiso);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminarPermiso(Permiso permiso) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(permiso);
        session.beginTransaction().commit();
        session.close();
    }

    @Override
    public void modificarPermiso(Permiso permiso) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(permiso);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Permiso> obtenerPermisos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Permiso.class);
        List<Permiso> permisos = criteria.list();
        session.close();
        return permisos;
    }
    
}
