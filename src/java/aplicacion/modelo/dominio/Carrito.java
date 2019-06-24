package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Representa la orden de un carrito que puede llegar a comprar o no un cliente.
 * @author Elias Acosta
 */
public class Carrito implements Serializable{
    private Integer codigoCarrito;
    private Set<DetalleCarrito> detallesCarrito;
    private String fechaCarrito;
    private Usuario usuarioCliente;
    private String estadoCarrito;

    public Carrito() {
        detallesCarrito = new HashSet(0);
        usuarioCliente = new Usuario();
    }

    /**
     * Constructor parametrizado
     * @param codigoCarrito identificacion unica de un carrito.
     * @param detallesCarrito especificaciones de los productos.
     * @param fechaCarrito dia, mes y año en que se agrego el ultimo producto.
     * @param usuarioCliente el dueño del carrito.
     * @param estadoCarrito puede ser ...
     */
    public Carrito(Integer codigoCarrito, Set<DetalleCarrito> detallesCarrito, String fechaCarrito, Usuario usuarioCliente, String estadoCarrito) {
        this.codigoCarrito = codigoCarrito;
        this.detallesCarrito = detallesCarrito;
        this.fechaCarrito = fechaCarrito;
        this.usuarioCliente = usuarioCliente;
        this.estadoCarrito = estadoCarrito;
    }
    
    //Getters y Setters
    public Integer getCodigoCarrito() {
        return codigoCarrito;
    }

    public void setCodigoCarrito(Integer codigoCarrito) {
        this.codigoCarrito = codigoCarrito;
    }

    public Set<DetalleCarrito> getDetallesCarrito() {
        return detallesCarrito;
    }

    public void setDetallesCarrito(Set<DetalleCarrito> detallesCarrito) {
        this.detallesCarrito = detallesCarrito;
    }

    public String getFechaCarrito() {
        return fechaCarrito;
    }

    public void setFechaCarrito(String fechaCarrito) {
        this.fechaCarrito = fechaCarrito;
    }

    public Usuario getUsuarioCliente() {
        return usuarioCliente;
    }

    public void setUsuarioCliente(Usuario usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public String getEstadoCarrito() {
        return estadoCarrito;
    }

    public void setEstadoCarrito(String estadoCarrito) {
        this.estadoCarrito = estadoCarrito;
    }

    @Override
    public String toString() {
        return "codigoCarrito=" + codigoCarrito + ", detalleCarrito=" + detallesCarrito + ", fechaCarrito=" + fechaCarrito + ", usuarioCliente=" + usuarioCliente + ", estadoCarrito=" + estadoCarrito;
    }
    
}
