public class Mainbooking {
    public static void main(String[] args) {
        lapang sewa = new lapang();
        sewa.setNomerpenjaga(10115275);
        sewa.setNamapenyewa("Muhammad Thoriq Abrori");
        sewa.setLapangisi(2);
        sewa.setTotallapang(3);
        sewa.setNamalapang("New England");
        sewa.setJenislapang("Sintetic Grass");
        sewa.sethargalapangan(200000);
        sewa.setKettahundibangun(2011);
        
        GenericBoking <Integer> genbok  = new GenericBoking <>();
        genbok.sethargalapang(200000);
        genbok.setbayarlapang(80000);
        genbok.setsisabayar(genbok.hargalapang-genbok.bayarlapang);
        genbok.setdiskon(30);
        
        GenericBoking <Double> gen = new GenericBoking <>();
        gen.sethargaakhir(3*genbok.hargalapang*0.3);
        gen.setdenda(genbok.sisabayar*0.20);
        
        
        
        
        
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
        System.out.println("Harga Sewa Lapangan             : "+genbok.gethargalapang());
        System.out.print("Harga diskon Lapangan           : "+genbok.getdiskon());System.out.println("%");
        System.out.println("(Catatan Diskon Lapangan Futsal jika min 3 jam diskon 30%)");
        System.out.println("Harga DP Lapangan Minimal               : "+genbok.getbayarlapang());
        System.out.println("Harga Sisa bayar Maksimal               : "+genbok.getsisabayar());
        System.out.println("Denda terlambat Bayar                   : "+gen.getdenda());
        System.out.println("(Catatan Denda di hitung dari sisa bayar dikali 70%)");
        System.out.println("Harga akhir yang telah di diskon per-3 jam       : "+gen.gethargaakhir());
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