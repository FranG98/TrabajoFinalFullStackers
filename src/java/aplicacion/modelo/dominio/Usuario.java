/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author FullStackers
 */
/**
 * Clase Usuario contiene los atributos que tendra cada cuenta registrada
 *
 */
public class Usuario implements Serializable {

    private String idUsuario;
    //idUsuario: representa el id de la cuenta de usuario

    private String passUsuario;
    //passUsuario: representa la contraseña de la cuenta del usuario

    private String emailUsuario;
    //emailUsuario: representa el correo electronico del usuario

    private String nombreUsuario;
    //nombreUsuario: representa el nombre del usuario

    private String apellidoUsuario;
    //apellidoUsuario: representa el apellido del usuario

    private Integer dniUsuario;
    //dniUsuario: representa el dni del usuario

    private Byte edadUsuario;
    //edadUsuario: representa la edad del usuario

    private String estadoCuenta;
    /**
     * agregado fuera de los requerimientos del proyecto:
     * considero algo logico poseer esta caracteristica, y no unicamente la eliminacion de una cuenta de forma permanente.
     * estadoCuenta: permite establecer el estado de una cuenta de un usuario.
     * Se aplica a usuarios administrativos.
     * Las cuentas de clientes siempre tendra el estado "normal". 
     * Las cuentas de empleados pueden tener el estado "normal" o "bloqueado"
     * El estado "bloqueado" puede darse por "x" suceso como por ejemplo, suspencion del mismo.
     */

    private String tipoCuenta;
    //tipoCuenta: permite establecer si es una cuenta consumidor, administrativo o administrador.

    //CONSTRUCTORES
    /**
     * Constructor por defecto
     */
    public Usuario() {
    }
    /**
     * @param idUsuario permite almacenar el ID de la cuenta del usuario
     * @param passUsuario permite almacenar la contraseña de la cuenta del
     * usuario
     * @param emailUsuario permite almacenar el correo electronico del usuario
     * @param nombreUsuario permite almacenar el nombre del usuario
     * @param apellidoUsuario permite almacenar el apellido del usuario
     * @param dniUsuario permite almacenar el numero de documento nacional de
     * identidad del usuario
     * @param edadUsuario permite almacenar la edad del usuario
     * @param estadoCuenta permite definir el estado de la cuenta; "normal" o
     * bloqueada
     * @param tipoCuenta permite definir que tipo de cuenta es; cliente,
     * empleado o administrador
     */
    public Usuario(String idUsuario, String passUsuario, String emailUsuario, String nombreUsuario, String apellidoUsuario, Integer dniUsuario, Byte edadUsuario, String estadoCuenta, String tipoCuenta) {   
        this.idUsuario = idUsuario;
        this.passUsuario = passUsuario;
        this.emailUsuario = emailUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dniUsuario = dniUsuario;
        this.edadUsuario = edadUsuario;
        this.estadoCuenta = estadoCuenta;
        this.tipoCuenta = tipoCuenta;
        
    }

    //METODOS GETTERS & SETTERS
    /**
     * @return the apellidoUsuario
     */
    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    /**
     * @return the dniUsuario
     */
    public Integer getDniUsuario() {
        return dniUsuario;
    }

    /**
     * @return the edadUsuario
     */
    public Byte getEdadUsuario() {
        return edadUsuario;
    }

    /**
     * @return the emailUsuario
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * @return the estadoCuenta
     */
    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @return the passUsuario
     */
    public String getPassUsuario() {
        return passUsuario;
    }

    /**
     * @return the tipoCuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param apellidoUsuario the apellidoUsuario to set
     */
    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    /**
     * @param dniUsuario the dniUsuario to set
     */
    public void setDniUsuario(Integer dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    /**
     * @param edadUsuario the edadUsuario to set
     */
    public void setEdadUsuario(Byte edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    /**
     * @param emailUsuario the emailUsuario to set
     */
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    /**
     * @param estadoCuenta the estadoCuenta to set
     */
    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @param passUsuario the passUsuario to set
     */
    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * Metodo ToString
     */
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", passUsuario=" + passUsuario + ", emailUsuario=" + emailUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", dniUsuario=" + dniUsuario + ", edadUsuario=" + edadUsuario + ", estadoCuenta=" + estadoCuenta + ", tipoCuenta=" + tipoCuenta + '}';
    }
   
}
