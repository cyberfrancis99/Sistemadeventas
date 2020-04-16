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
public class Dtorecivo {
    String fechaR, comentario;
    int recivoNum; 
    float subtotal, itebisF,total;

    public Dtorecivo(String fechaR, String comentario, int recivoNum, float subtotal, float itebisF, float total) {
        this.fechaR = fechaR;
        this.comentario = comentario;
        this.recivoNum = recivoNum;
        this.subtotal = subtotal;
        this.itebisF = itebisF;
        this.total = total;
    }

    public Dtorecivo() {
    }
    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getRecivoNum() {
        return recivoNum;
    }

    public void setRecivoNum(int recivoNum) {
        this.recivoNum = recivoNum;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getItebisF() {
        return itebisF;
    }

    public void setItebisF(float itebisF) {
        this.itebisF = itebisF;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
