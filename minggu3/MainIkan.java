public class MainIkan
{
    public static void main (String[] args)
	{
    Ikan ikanpertama = new Ikan();
    ikanpertama.jenis= "koki";
    ikanpertama.warna= "orange";
    ikanpertama.mata= "coklat";
    System.out.println ("Ada seekor ikan jenisnya "+ikanpertama.jenis+"");
    System.out.println ("warnanya "+ikanpertama.warna+"");
    System.out.println ("bermata "+ikanpertama.mata+"");
            
    ikanpertama.makan();
    ikanpertama.bernafas();
	ikanpertama.berenang();
	ikanpertama.bergerak();
    
    Ikan ikankedua = new Ikan();
    ikankedua.jenis= "cupang";
    ikankedua.warna= "ungu";
    ikankedua.mata= "hijau";
    System.out.println ("Lalu ada seekor ikan kedua jenisnya "+ikankedua.jenis+"");
    System.out.println ("warnanya "+ikankedua.warna+"");
    System.out.println ("bermata "+ikankedua.mata+"");
	
	ikankedua.makan();
    ikankedua.bernafas();
	ikankedua.berenang();
	ikankedua.bergerak();
	
	Ikan ikanketiga = new Ikan();
    ikanketiga.jenis= "mujair";
    ikanketiga.warna= "abu-abu";
    ikanketiga.mata= "hitam";
    System.out.println ("Kemudian ada seekor ikan lagi jenisnya "+ikanketiga.jenis+"");
    System.out.println ("warnanya "+ikanketiga.warna+"");
    System.out.println ("bermata "+ikanketiga.mata+"");
	
	ikanketiga.makan();
    ikanketiga.bernafas();
	ikanketiga.berenang();
	ikanketiga.bergerak();
    }
}