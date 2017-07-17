/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pebooking;

/**
 *
 * @author MTAbrori_17
 */
public class GenericBoking <T> {
    public T hargalapang;
    public T bayarlapang;
    public T sisabayar;
    public T diskon;
    public T hargaakhir;
    public T denda;
    
     public T gethargalapang() {
        return hargalapang;
    }

    public void sethargalapang(T hargalapang) {
        this.hargalapang = hargalapang;
    }
    
     public T getbayarlapang() {
        return bayarlapang;
    }

    public void setbayarlapang(T bayarlapang) {
        this.bayarlapang = bayarlapang;
    }
    
     public T getsisabayar() {
        return sisabayar;
     }
        
     public void setsisabayar(T sisabayar) {
        this.sisabayar = sisabayar;
    }
     
       public T getdiskon() {
        return diskon;
     }
        
     public void setdiskon(T diskon) {
        this.diskon = diskon;
    }
     
      public T gethargaakhir() {
        return hargaakhir;
     }
        
     public void sethargaakhir(T hargaakhir) {
        this.hargaakhir = hargaakhir;
    }
     
     public T getdenda() {
        return denda;
     }
        
     public void setdenda(T denda) {
        this.denda = denda;
    }
 }

