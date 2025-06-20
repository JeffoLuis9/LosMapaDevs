/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.prog03.webhooke.modelo.gestionusuarios;


import java.text.SimpleDateFormat;
import jakarta.json.bind.annotation.JsonbDateFormat;


import java.util.Date;

/**
 *
 * @author andre
 */

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String DNI;
    private String email;
    
   
    @JsonbDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    private Date fechaNacimiento;
    
    private char tipoUsuario;
    private String password;
    

//preguntar para ver sis agregamos el pssword como hash

    public Usuario() {

    }

    public Usuario(String nombre, String apellido, String DNI, String email,
            Date fechaNacimiento, char tipoUsuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoUsuario = tipoUsuario;
        this.password = password;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void ImprimirDatosUsuario() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(apellido + "," + nombre + "		" + DNI + "			" + email + "		" + format);
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
