/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IVentaDAO;
import aplicacion.modelo.dominio.Venta;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Full Stackers
 */
public class VentaDAOImp implements Serializable, IVentaDAO{

    public VentaDAOImp() {
    }
    
    
    @Override
    public void crearVenta(Venta venta) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(venta);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Venta> obtenerVentas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Venta.class);
        List<Venta> usuarios = criteria.list();
        session.close();
        return usuarios;    
    }
    
}
