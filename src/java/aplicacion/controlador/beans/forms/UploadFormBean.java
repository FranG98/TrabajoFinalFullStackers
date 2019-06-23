/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author FERNANDO
 */
@ManagedBean
@ViewScoped
public class UploadFormBean implements Serializable {

    private UploadedFile file;
    private String nombreImagen;
    private final String login = "pv";
    private final String password = "pv2019";
    private final String url = "jdbc:mysql://localhost:3306/jugueteria?serverTimezone=UTC";

    /**
     * Creates a new instance of UploadFormBean
     */
    public UploadFormBean() {

    }

    /**
     * METODOS
     *
     */
    /**
     *
     * @throws java.io.IOException
     */
    public void subirImagen() throws IOException {
        Connection conn = null;
        String SQL_INSERT = "INSERT INTO imagenes (img_nombre, img_imagen) VALUES (?,?)";
        try {
            if (file.getSize() > 0) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url, login, password);
                System.out.println("Conexión a base de datos " + url + " ... Ok");
                PreparedStatement st = conn.prepareStatement(SQL_INSERT);
                st.setString(1, getNombreImagen());
                st.setBinaryStream(2, file.getInputstream());
                st.executeUpdate();
                conn.close();
                addMessageInfo("Carga Completa", "imagen " + getFile().getFileName() + " fue subida con exito");
                nombreImagen = "";
            }
        } catch (ClassNotFoundException | SQLException e) {
            addMessageError("Error", "La imagen " + getFile().getFileName() + " no fue subida");
            nombreImagen = null;
            System.out.println(e);
        }
    }

    /**
     *
     * @throws IOException
     */
    public void mostrarImagen() throws IOException {
        Connection conn = null;
        String SQL_SELECT = "SELECT img_imagen FROM imagenes WHERE img_nombre = (?)";
        ResultSet rs;
        try {
            byte[] imagen = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            System.out.println("Conexión a base de datos " + url + " ... Ok");
            PreparedStatement st = conn.prepareStatement(SQL_SELECT);
            System.out.println(nombreImagen);
            st.setString(1, getNombreImagen());
            rs = st.executeQuery();
            while (rs.next()) {
                imagen = rs.getBytes("img_imagen");
            }
            conn.close();
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.getOutputStream().write(imagen);
            response.getOutputStream().close();
            FacesContext.getCurrentInstance().responseComplete();
            nombreImagen = "";
        } catch (ClassNotFoundException | SQLException e) {
            addMessageError("Error", "Imagen no encontrada");
            System.out.println(e);
        }
    }

    /**
     *
     * @throws IOException
     */
    public void borrarImagen() throws IOException {
        Connection conn = null;
        String SQL_DELETE = "DELETE FROM imagenes WHERE img_nombre = (?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            System.out.println("Conexión a base de datos " + url + " ... Ok");
            PreparedStatement st = conn.prepareStatement(SQL_DELETE);
            st.setString(1, getNombreImagen());
            st.executeUpdate();
            nombreImagen = null;
        } catch (ClassNotFoundException | SQLException e) {
            addMessageError("Error", "Imagen no encontrada");
            System.out.println(e);
        }
    }

//Mensajes
    /**
     * addMessageInfo
     *
     * @param summary permite mostrar el resumen del mensaje informativo
     * @param detail permite mostrar otro mensaje mas detallado
     */
    public void addMessageInfo(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    /**
     * addMessageError
     *
     * @param summary permite mostrar el resumen del mensaje de error
     * @param detail permite mostrar otro mensaje mas detallado
     */
    public void addMessageError(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    /**
     * METODOS GETTERS Y SETTERS
     */
    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @return the nombreImagen
     */
    public String getNombreImagen() {
        return nombreImagen;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }

    /**
     * @param nombreImagen the nombreImagen to set
     */
    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

}
