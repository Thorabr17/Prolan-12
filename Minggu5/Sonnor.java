public class Sonnor extends Drum {
public void tampilkan(){
     int jumlahcimbal=8;
     String jenisbahanrangka="besi";
     String genre="Rock";

     Drum m = new Drum();

     m.inputData("Sonnor Electric", "Merah", "Electric", 3);
     m.tampilkandata();

      System.out.println("Jumlah Cimbal :"+jumlahcimbal);
      System.out.println("jenis bahan rangka :"+jenisbahanrangka);
      System.out.println("jenis genre :"+genre);
    
}    
}