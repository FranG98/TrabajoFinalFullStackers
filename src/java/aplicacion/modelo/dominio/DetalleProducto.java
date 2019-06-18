/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;



/**
 *
 * @author Windows
 */
public class DetalleProducto implements Serializable{
    private Integer codigoDetalle;
    private String productoVendido;
    private Integer cantidadVendida;
    private Double precioTotal;
    private String usuarioComprador;
    //Email del usuario que solicito la compra de Productos

    public DetalleProducto() {
    }

    public DetalleProducto(Integer cantidadVendida, Double precioTotal, String productoVendido, String usuarioComprador, Integer codigoDetalle) {
        this.productoVendido = productoVendido;
        this.cantidadVendida = cantidadVendida;
        this.precioTotal = precioTotal;
        this.usuarioComprador = usuarioComprador;
        this.codigoDetalle = codigoDetalle;
    }
    
    //GETTERS Y SETTERS
    /**
     * @return the productoVendido
     */
    public String getProductoVendido() {
        return productoVendido;
    }

    /**
     * @param productoVendido the productoVendido to set
     */
    public void setProductoVendido(String productoVendido) {
        this.productoVendido = productoVendido;
    }

    /**
     * @return the cantidadVendida
     */
    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    /**
     * @param cantidadVendida the cantidadVendida to set
     */
    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    /**
     * @return the precioTotal
     */
    public Double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * @param precioTotal the precioTotal to set
     */
    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    /**
     * @return the usuarioComprador
     */
    public String getUsuarioComprador() {
        return usuarioComprador;
    }

    /**
     * @param usuarioComprador the usuarioComprador to set
     */
    public void setUsuarioComprador(String usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    /**
     * @return the codigoDetalle
     */
    public Integer getCodigoDetalle() {
        return codigoDetalle;
    }

    /**
     * @param codigoDetalle the codigoDetalle to set
     */
    public void setCodigoDetalle(Integer codigoDetalle) {
        this.codigoDetalle = codigoDetalle;
    }
    
    
}
