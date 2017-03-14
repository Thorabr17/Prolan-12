/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futsal;

/**
 *
 * @author MTAbrori_17
 */
public class MainFutsal
{
    public static void main(String [] args)
	
	{
    Futsal pemainpertama = new Futsal();
    pemainpertama.nama= "Muhammad Thoriq Abrori";
    pemainpertama.tim= "Miracle Fc";
    pemainpertama.namakaos= "MT Abrori";
	pemainpertama.nopung= 17;
	pemainpertama.berat= 52;
	pemainpertama.tinggi= 182;
	pemainpertama.usia= 20;
	pemainpertama.nomorsepatu= 44;
	pemainpertama.kelaminpemain= 'L';
    System.out.println ("Ada seorang pemain Futsal bernama "+pemainpertama.nama+"");
    System.out.println ("Dari Tim "+pemainpertama.tim+"");
    System.out.println ("Dengan nama Punggung "+pemainpertama.namakaos+"");
	System.out.println ("Dengan nomor Punggung "+pemainpertama.nopung+"");
	System.out.println ("Dengan nomor sepatu "+pemainpertama.nomorsepatu+"");
	System.out.print ("Tingginya "+pemainpertama.tinggi);       System.out.println ("cm");
	System.out.print ("Umurnya "+pemainpertama.usia);         System.out.println ("tahun");
	System.out.println ("Memiliki jenis kelamin "+pemainpertama.kelaminpemain);
	System.out.print ("Beratnya "+pemainpertama.berat);       System.out.println ("Kg");
            
    pemainpertama.menendang();
	pemainpertama.mencetakgol();
	pemainpertama.menyundul();
	pemainpertama.membuatgol();
	pemainpertama.menangkap();
	pemainpertama.handsball();
    
    Futsal pemainkedua = new Futsal();
    pemainkedua.nama= "Moch. Fathan Mustaqim";
    pemainkedua.tim= "Miracle Fc";
    pemainkedua.namakaos= "M.Fathan";
	pemainkedua.nopung= 11;
	pemainkedua.berat= 45;
	pemainkedua.tinggi= 170;
	pemainkedua.usia= 21;
	pemainkedua.nomorsepatu= 42;
	pemainkedua.kelaminpemain= 'L';
    System.out.println ("Ada seorang pemain Futsal lagi bernama "+pemainkedua.nama+"");
    System.out.println ("Dari Tim "+pemainkedua.tim+"");
    System.out.println ("Dengan nama Punggung "+pemainkedua.namakaos+"");
	System.out.println ("Dengan nomor Punggung "+pemainkedua.nopung+"");
	System.out.println ("Dengan nomor sepatu "+pemainkedua.nomorsepatu+"");
	System.out.print ("Tingginya "+pemainkedua.tinggi);       System.out.println ("cm");
	System.out.print ("Umurnya "+pemainkedua.usia);         System.out.println ("tahun");
	System.out.println ("Memiliki jenis kelamin "+pemainkedua.kelaminpemain);
	System.out.print ("Beratnya "+pemainkedua.berat);       System.out.println ("Kg");
            
    pemainkedua.menendang();
	pemainkedua.mencetakgol();
	pemainkedua.menyundul();
	pemainkedua.membuatgol();
	pemainkedua.menangkap();
	pemainkedua.handsball();
	
	Futsal pemainketiga = new Futsal();
    pemainketiga.nama= "Adi Lasylva";
    pemainketiga.tim= "Miracle Fc";
    pemainketiga.namakaos= "Lasylva";
	pemainketiga.nopung= 7;
	pemainketiga.berat= 50;
	pemainketiga.tinggi= 175;
	pemainketiga.usia= 20;
	pemainketiga.nomorsepatu= 43;
	pemainketiga.kelaminpemain= 'L';
    System.out.println ("Dan ada seorang pemain Futsal lagi juga bernama "+pemainketiga.nama+"");
    System.out.println ("Dari Tim "+pemainketiga.tim+"");
    System.out.println ("Dengan nama Punggung "+pemainketiga.namakaos+"");
	System.out.println ("Dengan nomor Punggung "+pemainketiga.nopung+"");
	System.out.println ("Dengan nomor sepatu "+pemainketiga.nomorsepatu+"");
	System.out.print ("Tingginya "+pemainketiga.tinggi);       System.out.println ("cm");
	System.out.print ("Umurnya "+pemainketiga.usia);         System.out.println ("tahun");
	System.out.println ("Memiliki jenis kelamin "+pemainketiga.kelaminpemain);
	System.out.print ("Beratnya "+pemainketiga.berat);       System.out.println ("Kg");
            
    pemainketiga.menendang();
	pemainketiga.mencetakgol();
	pemainketiga.menyundul();
	pemainketiga.membuatgol();
	pemainketiga.menangkap();
	pemainketiga.handsball();
    }
}