public class Ikan2 
{
    String jenis,warna,mata,mulut,sirip,ekor,insang;
	int berat;
	byte usia;
	char kelaminikan;
	
    

    public void makan()
	{
     this.mulut="makan";
     System.out.println("Mulutnya digunakan untuk "+mulut+"");    
	}
	
	public void bernafas()
	{
     this.insang="bernafas";
     System.out.println("Insangnya digunakan untuk "+insang+"");    
	}
    
    public void berenang() 
	{
    this.ekor="berenang";
    System.out.println("Ekornya digunakan untuk "+ekor+"");    
	}
    
    public void bergerak() 
	{
    this.sirip="bergerak";
    System.out.println("Sirip ikan itu untuk "+sirip+"");    
	}
    
}
