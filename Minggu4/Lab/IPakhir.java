import java.util.Scanner;

class IPakhir {
	public static void main(String args[]){
	IPakhir ipmhs = new IPakhir();
	
	Scanner input = new Scanner (System.in);
	float IP;
	int jmlMhs = 0, jmlMhsLls = 0;
	
	System.out.print("Masukkan IP : ");	
	IP = input.nextFloat();
	while (IP != -999) {
		if (ipmhs.isWithinRange(IP, 0, 4) ==1) {
			jmlMhs++;
		}
		if (IP >= 2.75) {
			jmlMhsLls++;
		}
		System.out.print("Masukkan IP : ");	
		IP = input.nextFloat();
	}
	System.out.println("Jumlah Mahasiswa Adalah : "+jmlMhs);
	System.out.println("Jumlah Mahasiswa Lulus Adalah : "+jmlMhsLls);

	}
	
	int isWithinRange (float X, int min, int max) {
		if (X >= min && X <= max) {
		return 1;
		} else {
		return 0;
	}
	}
}

