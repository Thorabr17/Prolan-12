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

    void sethargalapang(T hargalapang) {
        this.hargalapang = hargalapang;
    }
    
     public T getbayarlapang() {
        return bayarlapang;
    }

    void setbayarlapang(T bayarlapang) {
        this.bayarlapang = bayarlapang;
    }
    
     public T getsisabayar() {
        return sisabayar;
     }
        
     void setsisabayar(T sisabayar) {
        this.sisabayar = sisabayar;
    }
     
       public T getdiskon() {
        return diskon;
     }
        
     void setdiskon(T diskon) {
        this.diskon = diskon;
    }
     
      public T gethargaakhir() {
        return hargaakhir;
     }
        
     void sethargaakhir(T hargaakhir) {
        this.hargaakhir = hargaakhir;
    }
     
     public T getdenda() {
        return denda;
     }
        
     void setdenda(T denda) {
        this.denda = denda;
    }
 }

