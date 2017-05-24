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
	System.out.println("**************************************************************************");
        System.out.println("Catatan Penjaga Tanda Booking Lapangan Futsal:");
	System.out.println("====================================");
	System.out.println("====================================");
        System.out.println("Nomor Penjaga              : "+sewa.getNomerpenjaga());
        System.out.println("Nama Penjaga Lapangan      : "+sewa.getNamapenyewa());
        System.out.println("Nama Lapangan              : "+sewa.getNamalapang());
        System.out.println("Jenis Lapangan             : "+sewa.getJenislapang());
        System.out.println("Tahun Berdiri Lapangan     : "+sewa.getKettahundibangun());
        System.out.println("Harga Sewa Lapangan        : "+sewa.gethargalapangan());
        System.out.println("Total Lapang Tersedia      : "+sewa.getTotallapang());
        sewa.lapangkosong();
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