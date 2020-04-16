/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.DTO;

/**
 *
 * @author Ing
 */
public class Dtosuplidores {
       
    String nombre, compani,direccion, wed, emailC;
    int rnc,telC,telefono;
    
    public Dtosuplidores() {
    }
    public Dtosuplidores(String nombre, String compani, String direccion, String wed, String emailC, int rnc, int telC, int telefono) {
        this.nombre = nombre;
        this.compani = compani;
        this.direccion = direccion;
        this.wed = wed;
        this.emailC = emailC;
        this.rnc = rnc;
        this.telC = telC;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompani() {
        return compani;
    }

    public void setCompani(String compani) {
        this.compani = compani;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public String getEmailC() {
        return emailC;
    }

    public void setEmailC(String emailC) {
        this.emailC = emailC;
    }

    public int getRnc() {
        return rnc;
    }

    public void setRnc(int rnc) {
        this.rnc = rnc;
    }

    public int getTelC() {
        return telC;
    }

    public void setTelC(int telC) {
        this.telC = telC;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
