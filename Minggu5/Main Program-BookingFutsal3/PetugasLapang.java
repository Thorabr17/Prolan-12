public class PetugasLapang{
	String  IDpetugas = "PT22130";
	String Namapetugas, Alamatpetugas, Tgllahirpetugas;
	int Umurpetugas;
	char Jkelamin;
 
	void Tampil(){
		System.out.println("Tampilan Data Petugas lapangan futsal");
		System.out.println("------------------------------");	
		System.out.println("------------------------------");
	}
	void TambahDatapetugas(String x, String y, String z){
		Namapetugas=x;
		Alamatpetugas=y;
		Tgllahirpetugas=z;
		
	}
 
	void TambahUmurpetugas(int j){
		Umurpetugas=j;	
	}

 
	void TambahJkelamin(char k){
		Jkelamin=k;
	}
}