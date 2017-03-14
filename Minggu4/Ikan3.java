public class Ikan3
{
    String jenis,warna,mata,mulut,sirip,ekor,insang;
	int berat;
	byte usia;
	char kelaminikan;
	
    

    public void makan()
	{
     mulut="makan";
     System.out.println("Mulutnya digunakan untuk "+mulut+"");    
	}
	 public void mendeteksi()
	{
     this.mulut="mendeteksi";
     System.out.println("Mulutnya digunakan untuk "+mulut+"");    
	}
	
	public void bernafas()
	{
    insang="bernafas";
    System.out.println("Insangnya digunakan untuk "+insang+"");    
	}
    
	public void bertahanhidup()
	{
    this.insang="bertahan hidup";
    System.out.println("Insangnya digunakan untuk "+insang+"");    
	}
    public void berenang() 
	{
    ekor="berenang";
    System.out.println("Ekornya digunakan untuk "+ekor+"");    
	}
    
    public void bergerak() 
	{
    sirip="bergerak";
    System.out.println("Sirip ikan itu untuk "+sirip+"");    
	}
    
}
