public class Mainbooking {
    public static void main(String[] args) {
        lapang sewa = new lapang();
        sewa.setNomerbooking(17);
        sewa.setNamapenyewa("Muhammad Thoriq Abrori");
        sewa.setLapangisi(4);
        sewa.setTotallapang(2);
        sewa.setJenislapang("New England");
        sewa.setNamalapang("Sintetic Grass");
        sewa.setKettahundibangun(2011);
        System.out.println("Bukti Tanda Booking Lapangan Futsal:");
		System.out.println("====================================");
        System.out.println("Nomor Booking            : "+sewa.getNomerbooking());
        System.out.println("Nama Penyewa Lapangan       : "+sewa.getNamapenyewa());
        System.out.println("Nama Lapangan         : "+sewa.getNamalapangan());
        System.out.println("Jenis Lapangan        : "+sewa.getJenislapangan());
        System.out.println("Tahun Berdiri Lapangan     : "+sewa.getKettahundibangun);
        book.lapangisi();
        System.out.println("Total Lapang Tersedia             : "+sewa.getTotallapang());
        sewa.lapangkosong();
		System.out.println("====================================");
		System.out.println("====================================");
    }
}