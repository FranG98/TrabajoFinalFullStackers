package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 * Representa la orden de un carrito que puede llegar a comprar o no un cliente.
 * @author Elias Acosta
 */
public class Carrito implements Serializable{
    private Integer codigoCarrito;
    private Date fechaCarrito;
    private Usuario usuarioCliente;
    private String estadoCarrito;

    public Carrito() {
        usuarioCliente = new Usuario();
    }

    /**
     * Constructor parametrizado
     * @param codigoCarrito identificacion unica de un carrito.
     * @param usuarioCliente el dueño del carrito.
     * @param estadoCarrito puede ser ...
     */
    public Carrito(Integer codigoCarrito, Usuario usuarioCliente, String estadoCarrito) {
        this.codigoCarrito = codigoCarrito;
        fechaCarrito = new Date();
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


    public Date getFechaCarrito() {
        return fechaCarrito;
    }

    public void setFechaCarrito(Date fechaCarrito) {
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
        return "codigoCarrito=" + codigoCarrito +", fechaCarrito=" + fechaCarrito + ", usuarioCliente=" + usuarioCliente + ", estadoCarrito=" + estadoCarrito;
    }

    
    
}
