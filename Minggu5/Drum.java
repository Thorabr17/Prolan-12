public class Drum 

{
 String merek;
 String warna;
 int jumlahpedal;
 String jenis;

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getJumlahpedal() {
        return jumlahpedal;
    }

    public void setJumlahpedal(int jumlahpedal) {
        this.jumlahpedal = jumlahpedal;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
 public void tampilkandata(){
        System.out.println("merek drum :"+getMerek());
        System.out.println("warna drum :"+getWarna());
        System.out.println("total pedal :"+getJumlahpedal());
        System.out.println("jenis drum :"+getJenis());
        
 }
 public void inputData(String m,String w,String j,int jp){
     setMerek(m);
     setWarna(w);
     setJenis(j);
     setJumlahpedal(jp);
     
 }
}
