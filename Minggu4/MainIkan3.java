public class MainIkan3
{
    public static void main(String [] args)
	
	{
    Ikan3 ikanpertama = new Ikan3();
    ikanpertama.jenis= "koki";
    ikanpertama.warna= "orange";
    ikanpertama.mata= "coklat";
	ikanpertama.berat= 30;
	ikanpertama.usia= 3;
	ikanpertama.kelaminikan= 'J';
    System.out.println ("Ada seekor ikan jenisnya "+ikanpertama.jenis+"");
    System.out.println ("warnanya "+ikanpertama.warna+"");
    System.out.println ("bermata "+ikanpertama.mata+"");
	System.out.print ("Umurnya "+ikanpertama.usia);         System.out.println ("tahun");
	System.out.println ("Memiliki jenis kelamin "+ikanpertama.kelaminikan);
	System.out.print ("Beratnya "+ikanpertama.berat);       System.out.println ("gram");
            
    ikanpertama.makan();
	ikanpertama.mendeteksi();
    ikanpertama.bernafas();
	ikanpertama.berenang();
	ikanpertama.bergerak();
    
    Ikan3 ikankedua = new Ikan3();
    ikankedua.jenis= "cupang";
    ikankedua.warna= "ungu";
    ikankedua.mata= "hijau";
	ikankedua.berat= 20;
	ikankedua.usia= 5;
	ikankedua.kelaminikan= 'J';
    System.out.println ("Lalu ada seekor ikan kedua jenisnya "+ikankedua.jenis+"");
    System.out.println ("warnanya "+ikankedua.warna+"");
    System.out.println ("bermata "+ikankedua.mata+"");
	System.out.print ("Umurnya "+ikankedua.usia);         System.out.println ("tahun");
	System.out.println ("Memiliki jenis kelamin "+ikankedua.kelaminikan);
	System.out.print ("Beratnya "+ikankedua.berat);       System.out.println ("gram");
	
	ikankedua.makan();
	ikankedua.mendeteksi();
    ikankedua.bernafas();
	ikankedua.berenang();
	ikankedua.bergerak();
	
	Ikan3 ikanketiga = new Ikan3();
    ikanketiga.jenis= "mujair";
    ikanketiga.warna= "abu-abu";
    ikanketiga.mata= "hitam";
	ikanketiga.berat= 10;
	ikanketiga.usia= 2;
	ikanketiga.kelaminikan= 'B';
    System.out.println ("Kemudian ada seekor ikan lagi jenisnya "+ikanketiga.jenis+"");
    System.out.println ("warnanya "+ikanketiga.warna+"");
    System.out.println ("bermata "+ikanketiga.mata+"");
	System.out.print ("Umurnya "+ikanketiga.usia);         System.out.println ("tahun");
	System.out.println ("Memiliki jenis kelamin "+ikanketiga.kelaminikan);
	System.out.print ("Beratnya "+ikanketiga.berat);       System.out.println ("gram");
	ikanketiga.makan();
	ikanketiga.mendeteksi();
    ikanketiga.bernafas();
	ikanketiga.berenang();
	ikanketiga.bergerak();
    }
}