public class PenjagaLapang extends PetugasLapang{
	String ID = "PJ01889";
	String Jadwaltugas;
	
	void TambahJadwaltugas(String l){
		Jadwaltugas=l;
	}
	void Tampil(){
		System.out.println("Tampilan Data Pegawai Penjaga Lapang Futsal");
		System.out.println("---------------------------------");
	}
	
	void DaftarPetugasLapang(){
		super.Tampil();
		System.out.println("ID Petugas Lapang   = " + super.IDpetugas);
		System.out.println("Nama Petugas Lapang = " + super.Namapetugas);
		System.out.println("Alamat Petugas Lapang       = " + super.Alamatpetugas);
		System.out.println("Tanggl Lahir Petugas Lapang = " + super.Tgllahirpetugas);
		System.out.println("Umur Petugas Lapang         = " + super.Umurpetugas);
		System.out.println("Jenis Kelamin Petugas Lapang  = " + super.Jkelamin);
		System.out.println("=============================\n\n");
	}	
	void DaftarPenjagaLapang(){
		Tampil();
		System.out.println("ID Penjaga Lapang   = " + ID);
		System.out.println("Nama Penjaga Lapang = " + super.Namapetugas);
		System.out.println("Alamat Penjaga Lapang        = " + super.Alamatpetugas);
		System.out.println("Tanggl Lahir Penjaga Lapang     = " + super.Tgllahirpetugas);
		System.out.println("Umur Penjaga Lapang            = " + super.Umurpetugas);
		System.out.println("Jenis Kelamin Penjaga Lapang    = " + super.Jkelamin);
		System.out.println("Jadwal Bertugas Penjaga Lapang     = " + Jadwaltugas);
		System.out.println("==================================\n");
	}
}