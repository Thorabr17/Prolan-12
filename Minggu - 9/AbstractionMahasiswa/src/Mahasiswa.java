public abstract class Mahasiswa {
  public String nama = "Muhammad Thoriq Abrori";
  public String nim = "10115275";
  public String kelas = "Prolan - 12";
  public String tahun = "2015";
          
  public String getNama() {
        return nama;
    }

public abstract void printNama();

public String getNim() {
        return nim;
    }

public abstract void printNim();

public String getKelas() {
        return kelas;
    }

public abstract void printKelas();

public String getTahun() {
        return tahun;
    }

public abstract void printTahun();
  
  abstract void kuliah();
  abstract void lulus();
  abstract void tidaklulus();
  abstract void dropout();
}