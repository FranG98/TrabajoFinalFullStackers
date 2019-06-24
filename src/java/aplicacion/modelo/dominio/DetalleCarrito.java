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
public class DetalleCarrito implements Serializable{
    private Integer codigoDetalle;
    private Producto productoVendido;
    private Integer cantidadVendida;
    private Double precioTotal;
    private Double subtotal;
    private Usuario usuarioComprador;
    

    public DetalleCarrito() {
    }

    public DetalleCarrito(Integer cantidadVendida, Double precioTotal, Double subtotal , Integer codigoDetalle) {
        productoVendido = new Producto();
        this.cantidadVendida = cantidadVendida;
        this.precioTotal = precioTotal;
        this.subtotal = subtotal;
        this.codigoDetalle = codigoDetalle;
        usuarioComprador = new Usuario();
    }

    //GETTERS Y SETTERS
    /**
     * @return the productoVendido
     */
    public Producto getProductoVendido() {
        return productoVendido;
    }

    /**
     * @param productoVendido the productoVendido to set
     */
    public void setProductoVendido(Producto productoVendido) {
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

    /**
     * @return the subtotal
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the usuarioComprador
     */
    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    /**
     * @param usuarioComprador the usuarioComprador to set
     */
    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }
    
    
}
