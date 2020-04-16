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
public class Dtodevolucion {
    String fechaD, codigofactura, nombreC, apellidoC, tipofactura, referenciaP;
        int cantidad, precio;
        float itebis, balance;

        public Dtodevolucion() {
        }
        
    public Dtodevolucion(String fechaD, String codigofactura, String nombreC, String apellidoC, String tipofactura, String referenciaP, int cantidad, int precio, float itebis, float balance) {
        this.fechaD = fechaD;
        this.codigofactura = codigofactura;
        this.nombreC = nombreC;
        this.apellidoC = apellidoC;
        this.tipofactura = tipofactura;
        this.referenciaP = referenciaP;
        this.cantidad = cantidad;
        this.precio = precio;
        this.itebis = itebis;
        this.balance = balance;
    }

    public String getFechaD() {
        return fechaD;
    }

    public void setFechaD(String fechaD) {
        this.fechaD = fechaD;
    }

    public String getCodigofactura() {
        return codigofactura;
    }

    public void setCodigofactura(String codigofactura) {
        this.codigofactura = codigofactura;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getApellidoC() {
        return apellidoC;
    }

    public void setApellidoC(String apellidoC) {
        this.apellidoC = apellidoC;
    }

    public String getTipofactura() {
        return tipofactura;
    }

    public void setTipofactura(String tipofactura) {
        this.tipofactura = tipofactura;
    }

    public String getReferenciaP() {
        return referenciaP;
    }

    public void setReferenciaP(String referenciaP) {
        this.referenciaP = referenciaP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getItebis() {
        return itebis;
    }

    public void setItebis(float itebis) {
        this.itebis = itebis;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
}
