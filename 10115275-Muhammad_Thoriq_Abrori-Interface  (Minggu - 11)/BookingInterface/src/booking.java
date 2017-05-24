public abstract class booking  {
    int nomerpenjaga;
    String namapenyewa;
    int lapangisi;
    String tglbooking;
    int totallapang;
    int hargalapangan;
    
    booking(){
        
    }

    booking(int nomerpenjaga, String namapenyewa, int lapangisi, String tglbooking, int totallapang, int hargalapangan) {
        this.nomerpenjaga = nomerpenjaga;
        this.namapenyewa = namapenyewa;
        this.lapangisi = lapangisi;
        this.tglbooking = tglbooking;
        this.totallapang = totallapang;
        this.hargalapangan = hargalapangan;
    }
    
    public int getLapangisi() {
        return lapangisi;
    }

    void setLapangisi(int lapangisi) {
        this.lapangisi = lapangisi;
    }
    
     public int gethargalapangan() {
        return hargalapangan;
    }

    void sethargalapangan(int hargalapangan) {
        this.hargalapangan = hargalapangan;
    }

    public String getNamapenyewa() {
        return namapenyewa;
    }

    public void setNamapenyewa(String namapenyewa) {
        this.namapenyewa = namapenyewa;
    }

    public int getNomerpenjaga() {
        return nomerpenjaga;
    }

    public void setNomerpenjaga(int nomerpenjaga) {
        this.nomerpenjaga = nomerpenjaga;
    }

    public int getTotallapang() {
        return totallapang;
    }

    public void setTotallapang(int totallapang) {
        this.totallapang = totallapang;
    }

    public String getTglbooking() {
        return tglbooking;
    }

    public void setTglbooking(String tglbooking) {
        this.tglbooking = tglbooking;
    }

    public void lapangterisi(){
        System.out.println("Total Lapang yang terisi  : "+getLapangisi());
    }

    public void lapangkosong(){
        System.out.println("Lapang yang tersisa = "+(getTotallapang()+ " - "+getLapangisi())+" = "+(getTotallapang()-getLapangisi()));
    }
}