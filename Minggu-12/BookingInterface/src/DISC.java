public class DISC implements Interfacesewa {

    @Override
    public void DPlapang() {
        System.out.println("Tim DISC telah membayar DP lapangan"); 
    }

   @Override
    public void lunas() {
        System.out.println("Lapangan yang tim DISC sewa telah lunas terbayar"); 
    }
    
    @Override
    public void belumlunas() {
        System.out.println("Tim DISC belum melunasi biaya sewa lapangan"); 
    }
    
    @Override
    public void hutanglapang() {
        System.out.println("Tim DISC masih memiliki hutang lapangan yang belum di bayar"); 
    }
    
    @Override
    public void dendalapang() {
        System.out.println("Karena tidak mengikuti prosedure sewa lapangan/ merusak fasilitas lapangan tim DISC di kenai denda"); 
    }
    
}

