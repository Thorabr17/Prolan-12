public class Mainbooking {
    public static void main(String[] args) {
        Lapang sewa = new Lapang();
        sewa.setNomerpenjaga(10115275);
        sewa.setNamapenyewa("Muhammad Thoriq Abrori");
        sewa.setLapangisi(2);
        sewa.setTotallapang(3);
        sewa.setNamalapang("New England");
        sewa.setJenislapang("Sintetic Grass");
        sewa.sethargalapangan(200000);
        sewa.setKettahundibangun(2011);
        
        GenericBoking <Integer> genbok  = new GenericBoking <>();
        KeteranganLapang <Integer> ketla = new KeteranganLapang <>();
        genbok.sethargalapang(200000);
        genbok.setbayarlapang(80000);
        ketla.setpanjanglapang(20);
        ketla.setlebarlapang(10);
        ketla.settinggigawang(2);
        ketla.setlebargawang(2);
        ketla.setluaslapang(ketla.panjanglapang*ketla.lebarlapang);
        ketla.setluasgawang(ketla.tinggigawang*ketla.lebargawang);
        genbok.setsisabayar(genbok.hargalapang-genbok.bayarlapang);
        genbok.setdiskon(30);
        
        GenericBoking <Double> gen = new GenericBoking <>();
        gen.sethargaakhir(3*genbok.hargalapang*0.3);
        gen.setdenda(genbok.sisabayar*0.2);
        
       
        
        
            
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
        System.out.println("Catatan lapangan Futsal:");
        System.out.print("Panjang dari Lapangan             : "+ketla.getpanjanglapang()); System.out.println(" Meter");
        System.out.print("Lebar dari Lapangan               : "+ketla.getlebarlapang()); System.out.println(" Meter");
        System.out.print("Luas dari Lapangan                : "+ketla.getluaslapang()); System.out.println(" Meter");
        System.out.print("Tinggi dari Gawang                : "+ketla.gettinggigawang()); System.out.println(" Meter");
        System.out.print("Lebar dari Gawang                 : "+ketla.getlebargawang()); System.out.println(" Meter");
        System.out.print("Luas dari Gawang                  : "+ketla.getluasgawang()); System.out.println(" Meter");
        System.out.println("====================================");
	System.out.println("====================================");
        
        
        
        Raaft ra = new Raaft ();
        System.out.println("Data sewa tim Raaft :");
        ra.DPlapang();
        ra.lunas();
        System.out.println("====================================");
        DISC di = new DISC ();
        System.out.println("Data sewa tim DISC :");
        di.DPlapang();
        di.belumlunas();
        di.hutanglapang();
        System.out.println("====================================");
        Saba sa = new Saba();
        System.out.println("Data sewa tim Saba :");
        sa.DPlapang();
        sa.belumlunas();
        sa.hutanglapang();
        sa.dendalapang();
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println("**************************************************************************");
        
    }
}