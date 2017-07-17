/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booking;

/**
 *
 * @author MTAbrori_17
 */
import Pebooking.DISC;
import Pebooking.GenericBoking;
import Pebooking.Raaft;
import Pebooking.Saba;
import java.util.Scanner;
public class Mainbooking {
public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
 
    System.out.println(">>>>>>>>>>>>>#################################<<<<<<<<<<<<<<");
    System.out.println("\t \t \"       Jadwal Dan Catatn Booking futsal    \"");
    System.out.println("\t \t  \"        Kawaki Futsal Hall     \"");
    System.out.println("\t \t \"Selamat Datang dan Selamat  Bertanding\"");
    System.out.println(">>>>>>>>>>>>>#################################<<<<<<<<<<<<<<");
    System.out.println("");
    System.out.println("Masukan angka dari keterangan yang akan dilihat");
    System.out.println(">>>==Pilihan==<<<");
    System.out.println("1. Keterangan Penjaga dan Lapangan");
    System.out.println("2. Keterangan Biaya Lapangan");
    System.out.println("3. Keterangan Detail lapangan");
    System.out.println("4. Jadwal Booking");
    System.out.println("5. Daftar Tim Pebooking sementara ");
    System.out.println("Silahkan Pilih Hari yang ingin anda lihat .... = ");
    int v = input.nextInt(); 
    
    switch (v)
    {
    case 1 : Lapang sewa = new Lapang();
        
        sewa.setNomerpenjaga(10115275);
        sewa.setNamapenyewa("Muhammad Thoriq Abrori");
        sewa.setLapangisi(2);
        sewa.setTotallapang(3);
        sewa.setNamalapang("New England");
        sewa.setJenislapang("Sintetic Grass");
        sewa.sethargalapangan(200000);
        sewa.setKettahundibangun(2011);
        
        System.out.println("**************************************************************************");
        System.out.println("Catatan Penjaga Tanda Booking Lapangan Futsal:");
	System.out.println("====================================");
	System.out.println("====================================");
        System.out.println("Nomor Penjaga                   : "+sewa.getNomerpenjaga());
        System.out.println("Nama Penjaga Lapangan           : "+sewa.getNamapenyewa());
        System.out.println("Nama Lapangan                   : "+sewa.getNamalapang());
        System.out.println("Jenis Lapangan                  : "+sewa.getJenislapang());
        System.out.println("Tahun Berdiri Lapangan          : "+sewa.getKettahundibangun());
        System.out.println("Total Lapang Tersedia           : "+sewa.getTotallapang());
        sewa.lapangkosong();
        System.out.println("====================================");
	System.out.println("====================================");
        System.out.println("**************************************************************************");
     break;
     
    case 2:
        Pebooking.GenericBoking <Integer> genbok  = new Pebooking.GenericBoking <>();
        genbok.sethargalapang(200000);
        genbok.setbayarlapang(80000);
        genbok.setsisabayar(genbok.hargalapang-genbok.bayarlapang);
        genbok.setdiskon(30);
        GenericBoking <Double> gen = new GenericBoking <>();
        gen.sethargaakhir(3*genbok.hargalapang*0.3);
        gen.setdenda(genbok.sisabayar*0.2);
        
        System.out.println("====================================");
	System.out.println("====================================");
        System.out.println("Catatan Harga Sewa Lapangan Futsal:");
        System.out.println("Harga Sewa Lapangan                              : "+genbok.gethargalapang());
        System.out.print("Harga diskon Lapangan                            : "+genbok.getdiskon());System.out.println("%");
        System.out.println("(Catatan Diskon Lapangan Futsal jika min 3 jam diskon 30%)");
        System.out.println("Harga DP Lapangan Minimal                        : "+genbok.getbayarlapang());
        System.out.println("Harga Sisa bayar Maksimal                        : "+genbok.getsisabayar());
        System.out.println("Denda terlambat Bayar                            : "+gen.getdenda());
        System.out.println("(Catatan Denda di hitung dari sisa bayar dikali 20%)");
        System.out.println("Harga akhir yang telah di diskon per-3 jam       : "+gen.gethargaakhir());
        System.out.println("====================================");
	System.out.println("====================================");
    break;
        
    case 3:    
        KeteranganLapang <Integer> ketla = new KeteranganLapang <>();
        ketla.setpanjanglapang(20);
        ketla.setlebarlapang(10);
        ketla.settinggigawang(2);
        ketla.setlebargawang(2);
        ketla.setluaslapang(ketla.panjanglapang*ketla.lebarlapang);
        ketla.setluasgawang(ketla.tinggigawang*ketla.lebargawang);
        
        System.out.println("====================================");
	System.out.println("====================================");
        System.out.println("Catatan lapangan Futsal:");
        System.out.print("Panjang dari Lapangan             : "+ketla.getpanjanglapang()); System.out.println(" Meter");
        System.out.print("Lebar dari Lapangan               : "+ketla.getlebarlapang()); System.out.println(" Meter");
        System.out.print("Luas dari Lapangan                : "+ketla.getluaslapang()); System.out.println(" Meter");
        System.out.print("Tinggi dari Gawang                : "+ketla.gettinggigawang()); System.out.println(" Meter");
        System.out.print("Lebar dari Gawang                 : "+ketla.getlebargawang()); System.out.println(" Meter");
        System.out.print("Luas dari Gawang                  : "+ketla.getluasgawang()); System.out.println(" Meter");
        System.out.println("====================================");
	System.out.println("====================================");
     break;   
        
        
        
    case 4:
    System.out.println(">>>>>>>>>>>>>#################################<<<<<<<<<<<<<<");
    System.out.println("\t \t \"       Jadwal Booking Futsal    \"");
    System.out.println("\t \t  \"        Kawaki Futsal Hall     \"");
    System.out.println("\t \t \"Selamat Datang dan Selamat  Bertanding\"");
    System.out.println(">>>>>>>>>>>>>#################################<<<<<<<<<<<<<<");
    System.out.println("");
    System.out.println("Jadwal Boking Futsal Lapang New England Seminggu ini");
    System.out.println(">>>==Hari==<<<");
    System.out.println("1. Senin");
    System.out.println("2. Selasa");
    System.out.println("3. Rabu");
    System.out.println("4. Kamis");
    System.out.println("5. Jum'at");
    System.out.println("6. Sabtu");
    System.out.println("7. Minggu");
    System.out.println("Silahkan Pilih Hari yang ingin anda lihat .... = ");
    int x = input.nextInt(); 
    
    
    switch (x)
    {
    case 1 : System.out.println(" >>> Anda Memilih Hari Senin <<< \n \"Hari Senin Boking kosong pukul 16.00-17.00 > (Lapang New England) \" ") ;
    break;
    case 2 : System.out.println(">>> Anda Memilih Hari Selasa <<< \n \"Hari Selasa Boking kosong pukul 15.00-19.00 > (Lapang New England) \"  ");
    break;
    case 3 : System.out.println(" >>> Anda Memilih Hari Rabu <<< \n  \"Hari Rabu Boking kosong pukul 16.00-20.00 > (Lapang New England) \" ");
    break;
    case 4 : System.out.println(">>> Anda Memilih Hari Kamis <<< \n   \"Hari Kamis Boking kosong pukul 19.00-21.00 > (Lapang New England) \" ");
    break;
    case 5 : System.out.println(">>> Anda Memilih Hari Jum'at <<< \n  \"Hari Jumat Boking kosong pukul 12.00-15.00 > (Lapang New England) \" ");
    break;
    case 6 : System.out.println(">>> Anda Memilih Hari Sabtu <<< \n  \"Hari Sabtu Boking Penuh > (Lapang New England) \" ");
    break;
    case 7 : System.out.println(">>> Anda Memilih Hari Minggu <<< \n  \"Hari Minggu Booking Penuh > (Lapang New England) \" ");
    break;
    default : System.out.println("Pilihan Anda Salah!!! \"Ingat Dalam Satu Minggu Hanya terdapat 7 Hari!!!\"");
    break;
    
    }
    
    System.out.println("Catatan : Jika lapangan tidak tertulis pada list berarti lapangan penuh");
    System.out.println("");
    System.out.println(">>>>>>>>>>>>>#################################<<<<<<<<<<<<<<");
    System.out.println(">>>>>>>>>>>>>#################################<<<<<<<<<<<<<<");
    System.out.println("");

    System.out.println(" Semangat dan Junjung tinggilah Nilai sportivitas !!! ");
    System.out.println("");
    System.out.println(">>>>>>>>>>>>>#################################<<<<<<<<<<<<<<");
    System.out.println(">>>>>>>>>>>>>#################################<<<<<<<<<<<<<<");
    break;
    
    case 5 :   
    System.out.println("Silahkan Lihat Nama tim");
    System.out.println("");
    System.out.println(">>>==Nama Tim==<<<");
    System.out.println("1. Raaft");
    System.out.println("2. DISC");
    System.out.println("3. Saba");
    
    System.out.println("Silahkan Pilih Data yang ingin anda lihat = "); 
    
    int z = input.nextInt();
    switch (z)
    {
    case 1 : Raaft ra = new Raaft ();
        System.out.println("Data sewa tim Raaft :");
        ra.DPlapang();
        ra.lunas();
    break;
    case 2 : DISC di = new DISC ();
        System.out.println("Data sewa tim DISC :");
        di.DPlapang();
        di.belumlunas();
        di.hutanglapang();
    break;
    case 3 : Saba sa = new Saba();
        System.out.println("Data sewa tim Saba :");
        sa.DPlapang();
        sa.belumlunas();
        sa.hutanglapang();
        sa.dendalapang();
    break;
    default : System.out.println("Pilihan Anda Salah!!! \"!!!\"");
    break;
        
    }
       
        System.out.println("====================================");
        
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("**************************************************************************");
        break;
        
    default : System.out.println("Pilihan Anda Salah!!! \"!!!\"");
    break;
    }
  } 
}
