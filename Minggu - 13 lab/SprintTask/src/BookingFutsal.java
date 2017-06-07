public class BookingFutsal {
     public <T> void namalapang(T namalapang){
        System.out.println("Nama Lapangan: "+namalapang);
    }  
      public <U> void jenislapang(U jenislapang){
        System.out.println("Jenis Lapangan :"+jenislapang);
    }  
        public <N> void jumlahlapangan(N jumlahlapangan){
        System.out.println("Jumlah Lapangan :"+jumlahlapangan);
    }  
        public <X,Y> void sisabayar(X u ,Y v ){
        System.out.println("Harga Lapangan :"+u);
        System.out.println("Sisa Bayar Booking :"+v);
    }  

    public static void main(String[] args) {
        BookingFutsal t1 = new BookingFutsal();
     
        
        t1.jenislapang("syntetic");
        t1.namalapang("New England");
        t1.jumlahlapangan('3');
        t1.sisabayar(200000,100000);
 
      
       
    }
}

