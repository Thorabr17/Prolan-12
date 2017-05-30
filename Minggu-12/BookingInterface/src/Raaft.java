public class  Raaft implements Interfacesewa {

    @Override
    public void DPlapang() {
        System.out.println("Tim Raaft telah membayar DP lapangan"); 
    }

   @Override
    public void lunas() {
        System.out.println("Lapangan yang tim Raaft sewa telah lunas terbayar"); 
    }
    
    @Override
    public void belumlunas() {
        System.out.println("Tim Raaft belum melunasi biaya sewa lapangan"); 
    }
    
    @Override
    public void hutanglapang() {
        System.out.println("Tim Raaft masih memiliki hutang lapangan yang belum di bayar"); 
    }
    
    @Override
    public void dendalapang() {
        System.out.println("Karena tidak mengikuti prosedure sewa lapangan/ merusak fasilitas lapangan tim Raaft di kenai denda"); 
    }
    
}
