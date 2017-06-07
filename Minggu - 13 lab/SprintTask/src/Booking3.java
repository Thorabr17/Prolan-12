public class Booking3 {


    public <V> Booking2 Catatan (V Catatan){
        return (Booking2) Catatan;
        
    }
    
     public static void main(String[] args) {
         Booking3 book = new Booking3();
         
         book.Catatan(new Booking2<>()).sisabayar(100000);
         book.Catatan(new Booking2<>()).namalapang("Greece");
         book.Catatan(new Booking2<>()).hargalapang(200000);

     }
}
