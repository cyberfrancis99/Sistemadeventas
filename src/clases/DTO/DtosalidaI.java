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
public class DtosalidaI {

    
        String fecha_salidaI, descripcionE, nombreS, wedS, direccionS, referenciaP; 
        int precioP, telefonoS,existenciaP;
        
    public DtosalidaI() {
    }
        
    public DtosalidaI(String fecha_salidaI, String descripcionE, String nombreS, String wedS, String direccionS, String referenciaP, int precioP, int telefonoS, int existenciaP) {
        this.fecha_salidaI = fecha_salidaI;
        this.descripcionE = descripcionE;
        this.nombreS = nombreS;
        this.wedS = wedS;
        this.direccionS = direccionS;
        this.referenciaP = referenciaP;
        this.precioP = precioP;
        this.telefonoS = telefonoS;
        this.existenciaP = existenciaP;
    }   
    
    public String getFecha_salidaI() {
        return fecha_salidaI;
    }

    public void setFecha_salidaI(String fecha_salidaI) {
        this.fecha_salidaI = fecha_salidaI;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getWedS() {
        return wedS;
    }

    public void setWedS(String wedS) {
        this.wedS = wedS;
    }

    public String getDireccionS() {
        return direccionS;
    }

    public void setDireccionS(String direccionS) {
        this.direccionS = direccionS;
    }

    public String getReferenciaP() {
        return referenciaP;
    }

    public void setReferenciaP(String referenciaP) {
        this.referenciaP = referenciaP;
    }

    public int getPrecioP() {
        return precioP;
    }

    public void setPrecioP(int precioP) {
        this.precioP = precioP;
    }

    public int getTelefonoS() {
        return telefonoS;
    }

    public void setTelefonoS(int telefonoS) {
        this.telefonoS = telefonoS;
    }

    public int getExistenciaP() {
        return existenciaP;
    }

    public void setExistenciaP(int existenciaP) {
        this.existenciaP = existenciaP;
    }
    
}
