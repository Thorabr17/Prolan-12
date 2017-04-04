public class Mainbooking extends PenjagaLapang{
	String Namapenyewa, Wktmain, Wktstop;
	
	void Tampil_p(){
		System.out.println("Daftar Penyewa lapang");
		System.out.println("-----------------");
	}
	
	void Tambahpenyewa(String u, String v, String w){
		Namapenyewa=u;
		Wktmain=v;
		Wktstop=w;
		Tampil_p();
		System.out.println("Nama Penyewa = " + Namapenyewa);
		System.out.println("Waktu Mulai Bermain  = " + Wktmain);
		System.out.println("Waktu Berhenti Bermain = " + Wktstop);
		System.out.println("=================\n\n");
	}
	
	public static void main(String argd[]){
	
		Mainbooking book = new Mainbooking();
		book.TambahDatapetugas("Fadlan Irsyad A", "Bandung", "04-09-1990");
		book.TambahUmurpetugas(27);
		book.TambahJkelamin('L');
		book.TambahJadwaltugas("07.00-19.00");
		book.Tambahpenyewa("Muhammad Thoriq Abrori", "10.00", "12.00");
		book.DaftarPetugasLapang();
		book.DaftarPenjagaLapang();
		
	}
}
