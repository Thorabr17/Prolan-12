public class Mainbooking
{
     public static void main(String[]args)
	 {
           //pemanggilan konstruktor
		   PenjagaLapang fadlan = new PenjagaLapang();	
           Penyewalapang method = new Penyewalapang();		   
		   Lapang deal = new Lapang();
		   
	       System.out.println("Nama Penjaga lapang          : " +fadlan.Nama);
		   System.out.println("ID   penjaga lapang         : " +fadlan.IDPenjaga);
		   System.out.println("Tgl lahir penjaga lapang       : " +fadlan.Tgllahir);
		   System.out.println("Umur penjaga lapang    : " +fadlan.Umur);
		   System.out.println("Jenis Kelamin Penjaga lapang: " +fadlan.JenisKel);
		   System.out.println("= = = = = = = = = = = = = = = = = = =");
		   System.out.println("= = = = = = = = = = = = = = = = = = =");
		   
		  
  		   method.Tampilnamapenyewa("Thoriq");
		   method.Tampildatapenyewa("Arfin", "Jakarta");
		   method.Tampildatapenyewa("Hilman", "Bandung","BG2001");
		   
		   deal.tampillapang(5, 150000, 'A');
		   System.out.println("Nomor lapang  : " +deal.Nolapang);
		   System.out.println("Biaya sewa lapang  : " +deal.Biayasewalapang);
		   System.out.println("Tipe lapang   : " +deal.Tipelapang);

	 }
}