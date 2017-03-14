public class Futsal
{
    String nama,tim,kaki,kepala,tangan,namakaos;
	int berat,tinggi,nopung;
	byte usia,nomorsepatu;
	char kelaminpemain;
	
    

    public void menendang()
	{
     kaki="menendang";
     System.out.println("Kakinya digunakan untuk "+kaki+"");    
	}
	 public void mencetakgol()
	{
     this.kaki="mencetak gol";
     System.out.println("kakinya juga bisa digunakan untuk "+kaki+"");    
	}
	
	public void menyundul()
	{
    kepala="menyundul";
    System.out.println("Kepalanya digunakan untuk "+kepala+"");    
	}
    
	 public void membuatgol()
	{
     this.kepala="mencetak gol";
     System.out.println("kepalanya juga bisa digunakan untuk "+kepala+"");    
	}
    public void menangkap() 
	{
    tangan="menangkap bola";
    System.out.println("tangannya digunakan untuk "+tangan+"");    
	}
    
    public void handsball() 
	{
    this.tangan="handsball";
    System.out.println("jika bola mengenai tangan pemain maka "+tangan+"");    
	}
    
}
