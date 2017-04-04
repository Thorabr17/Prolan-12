class Penyewalapang
{
	 
   //method mengembalikan nilai dengan menggunakan parameter
   public String Tampilnamapenyewa(String Namapenyewa)
   {
        return Namapenyewa;
   }
    
	
	
	//method overloading dan penggunaan
    public void Tampildatapenyewa(String Namapenyewa, String alamatpenyewa)	
	{
		System.out.println("Nama Penyewa   : " +Namapenyewa);
		System.out.println("Alamat Penyewa : " +alamatpenyewa);
		System.out.println("= = = = = = = = = = = = = = = = = =");
		System.out.println("= = = = = = = = = = = = = = = = = =");
	}
	
	public void Tampildatapenyewa(String Namapenyewa, String alamatpenyewa, String IDpenyewa)	
	{
	    System.out.println("Nama Penyewa   : "+Namapenyewa);
		System.out.println("Alamat Penyewa : "+alamatpenyewa);
		System.out.println("ID Penyewa    : "+IDpenyewa);
		System.out.println("= = = = = = = = = = = = = = = = = =");
		System.out.println("= = = = = = = = = = = = = = = = = =");
	}
}