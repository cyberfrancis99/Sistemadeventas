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
public class Dtocategoria {
    
    String descripcion;
    int codigo;
    
    public Dtocategoria() {
    }
    
    public Dtocategoria(String descripcion, int codigo) {
        this.descripcion = descripcion;
        this.codigo = codigo;
    }    
        
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
