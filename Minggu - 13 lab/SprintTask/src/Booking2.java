public class Booking2 <T>{
    
    public <T> void hargalapang(T hargalapang){
        System.out.println("Harga Lapangan: "+hargalapang);
    }  
      public <N> void bayarlapang(T bayarlapang){
        System.out.println("Bayar Lapangan :"+bayarlapang);
    }  
        public <T> void sisabayar(T sisabayar){
        System.out.println("Sisa Bayar Lapangan :"+sisabayar);
    }  
        public void namalapang(String namalapang){
        System.out.println("Nama Lapangan: "+namalapang);
    }  
       public static void main(String[] args) {
           Booking2 book = new Booking2();
           book.namalapang("Greece");
           Booking2<Integer> boo = new Booking2<>();
           boo.hargalapang(200000);
           boo.bayarlapang(100000);
           boo.sisabayar(100000);
                   
       }
}
