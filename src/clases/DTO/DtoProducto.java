/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.DTO;

/**
 *
 * @author ing
 */
public class DtoProducto {
    String referencia,descripcion, servicio, categoria;
    int costo, precio, existencia;
    float impuesto; 
    
    public DtoProducto() {
    }
    public DtoProducto(String referencia, String descripcion, String servicio, String categoria, int costo, int precio, int existencia, float impuesto) {
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.servicio = servicio;
        this.categoria = categoria;
        this.costo = costo;
        this.precio = precio;
        this.existencia = existencia;
        this.impuesto = impuesto;
    }

    
        
    
    
    
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }
    

   

    
    
    
}
