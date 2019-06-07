/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * Clase Producto contiene los atributos que tendra cada producto registrado
 * @author Full Stackers
 */

public class Producto implements Serializable{
    private String codigo;
    //codigo: representa el codigo unico de cada producto
    private String nombreProducto;
    //nombreProducto: representa el producto
    private String sector;
    //sector: nombre que representa un conjunto de productos que comparten las mismas caracteristicas
    private Float precio;
    //precio: representa el precio de venta del producto al publico
    private Short stock;
    //stock: representa la cantidad dispronible del producto 
    private String material;
    //material: representa material del producto
    private String marca;
    //marca: representa la marca del producto
    private String origen;
    //origen: representa el lugar de origen del producto
    private Boolean prodOferta;
    //prodOferta: representa si un producto esta en oferta o no 
    private String dimension;
    //dimencion: representa las medidas del producto 
    private String imagen;
    //imagen: representa el nombre de la imagen
    
    //CONSTRUCTORES
    /**
     * constructor sin parametros
     */
    public Producto() {
        
    }
    /**
     * constructor parametrizado
     * @param codigo almacena el código del Producto
     * @param nombreProducto almacena el nombre del Producto
     * @param sector almacena el sector del Producto
     * @param precio almacena el precio del Producto
     * @param stock almacena el stock del Producto
     * @param material almacena el material del Producto
     * @param marca almacena la marca del Producto
     * @param origen almacena el origen del Producto
     * @param prodOferta almacena si el producto esta en oferta, prodOferta inicializa en falso 
     * @param dimension almacena la dimencion del Producto
     * @param imagen almacena nombre de la imagen del Producto 
     */
    
    public Producto(String codigo, String nombreProducto, String sector, Float precio, Short stock, String material, String marca, String origen, Boolean prodOferta, String dimension, String imagen) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.sector = sector;
        this.precio = precio;
        this.stock = stock;
        this.material = material;
        this.marca = marca;
        this.origen = origen;
        prodOferta = false;
        this.dimension = dimension;
        this.imagen = imagen;
    }
    
    //GETTER AND SETTER
     
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the sector
     */
    public String getSector() {
        return sector;
    }

    /**
     * @param sector the sector to set
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * @return the precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public Short getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Short stock) {
        this.stock = stock;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the prodOferta
     */
    public Boolean getProdOferta() {
        return prodOferta;
    }

    /**
     * @param prodOferta the prodOferta to set
     */
    public void setProdOferta(Boolean prodOferta) {
        this.prodOferta = prodOferta;
    }

    /**
     * @return the dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * @param dimension the dimencion to set
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    @Override
    public String toString() {
        return "Codigo del Producto: "+getCodigo()+"Nombre del producto: "+getNombreProducto()+"Precio del Producto: "+getPrecio()+
               "Stock del Producto: "+getStock()+"Sector del Producto: "+getSector()+"Material del Producto "+getMaterial()+
               "Origen del Producto: "+getOrigen()+"Dimension del Producto: "+getDimension()+"Marca del Producto: "+getMarca()+
               "Producto en Oferta: "+getProdOferta()+"Direccion de Imagen: "+getImagen();
    }

}
