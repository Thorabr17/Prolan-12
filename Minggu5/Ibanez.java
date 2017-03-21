public class Ibanez extends Drum {
public void tampilkan(){
 int jumlahcimbal;
 String jenisbahanrangka;
 String genre;

 jumlahcimbal=12;
 jenisbahanrangka="besi";
 genre="heavy-metal";

 Drum m = new Drum();

 m.inputData("Ibanez Limited", "Biru", "Original", 4);
 m.tampilkandata();

   System.out.println("Jumlah Cimbal :"+jumlahcimbal);
      System.out.println("jenis bahan rangka :"+jenisbahanrangka);
      System.out.println("jenis genre :"+genre);
}
}

