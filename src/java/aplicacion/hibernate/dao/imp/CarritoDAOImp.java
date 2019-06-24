package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.ICarrito;
import aplicacion.modelo.dominio.Carrito;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Elias Acosta
 */
public class CarritoDAOImp implements Serializable, ICarrito{

    @Override
    public void agregarCarrito(Carrito carrito) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(carrito);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarCarrito(Carrito carrito) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(carrito);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminarCarrito(Carrito carrito) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(carrito);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Carrito> obtenerCarritos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Carrito.class);
        List<Carrito> carritos = criteria.list();
        session.close();
        return carritos;
    }
    
}
