public class Lapang extends Booking{
    String namalapang;
    String jenislapang;
    int jumlahbola;
    int kettahundibangun;

    Lapang(){

    }

    public Lapang(int nomerpenjaga, String namapenyewa, int lapangisi, String tglbooking, int totallapang, int hargalapangan) {
        super(nomerpenjaga, namapenyewa, lapangisi, tglbooking, totallapang,hargalapangan);
        this.namalapang = namalapang;
        this.jenislapang = jenislapang;
        this.jumlahbola = jumlahbola;
        this.kettahundibangun = kettahundibangun;
    }

    public int getJumlahbola() {
        return jumlahbola;
    }

    public void setJumlahbola(int jumlahbola) {
        this.jumlahbola = jumlahbola;
    }
    
    @Override
     public int gethargalapangan() {
        return hargalapangan;
    }

    @Override
    public void sethargalapangan(int hargalapangan) {
        this.hargalapangan = hargalapangan;
    }

    public String getJenislapang() {
        return jenislapang;
    }

    public void setJenislapang(String jenislapang) {
        this.jenislapang = jenislapang;
    }

    public String getNamalapang() {
        return namalapang;
    }

    public void setNamalapang(String namalapang) {
        this.namalapang = namalapang;
    }

    public int getKettahundibangun() {
        return kettahundibangun;
    }
    
    

    public void setKettahundibangun(int kettahundibangun) {
        this.kettahundibangun = kettahundibangun;
    }

    @Override
    public int getLapangisi() {
        return super.getLapangisi();
    }

    @Override
    public String getNamapenyewa() {
        return super.getNamapenyewa();
    }

    @Override
    public int getNomerpenjaga() {
        return super.getNomerpenjaga();
    }

    @Override
    public int getTotallapang() {
        return super.getTotallapang();
    }

    @Override
    public String getTglbooking() {
        return super.getTglbooking();
    }

    @Override
    public void lapangterisi() {
        super.lapangterisi();
    }

    @Override
    public void lapangkosong() {
        super.lapangkosong();
    }

    @Override
    public void setLapangisi(int lapangisi) {
        super.setLapangisi(lapangisi);
    }

    @Override
    public void setNamapenyewa(String namapenyewa) {
        super.setNamapenyewa(namapenyewa);
    }

    @Override
    public void setNomerpenjaga(int nomerpenjaga) {
        super.setNomerpenjaga(nomerpenjaga);
    }

    @Override
    public void setTotallapang(int totallapang) {
        super.setTotallapang(totallapang);
    }

    @Override
    public void setTglbooking(String tglbooking) {
        super.setTglbooking(tglbooking);
    }
}