public class Variabel
{
	private int a;
	private boolean menikah;
	private char _nama;
	public static final String JUDUL = "Belajar Java Yuks";
	public static String judul2 = "Belajar Java Yuks";
	
	public static void main(String[]args)
	{
		Variabel var = new Variabel();
		final int a = 12;
		
		var.a = 1;
		//a=11/ -> tidak bisa dilakukan
		double aa, b, c;
		String nama = "nama saya";
		byte bb =1; b =2;
		System.out.println(JUDUL);
		System.out.println(judul2);
	}
	
	public void tesvariabel()
	{
		System.out.println(a);
		System.out.println(menikah);
		System.out.println(JUDUL);
		System.out.println(judul2);
	}
}

class aksesvariabelstatic
{
	public void staticvariabelstatic()
	{
		System.out.println(Variabel.JUDUL);
		//varabel.nama = "belajar Java Yuks" -> tidak bisa diaktifkan
	}
}	