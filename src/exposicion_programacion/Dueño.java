/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_programacion;

/**
 *
 * @author khris
 */
public class Dueño {
    private String nombre;
    private String telefono;
    private String correo;
    private int edad;
    private String id;
    public Dueño(String Dueño){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.id = id;
        this.edad =edad;
    }
     public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono ) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
     public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
     public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    } 
    
}
