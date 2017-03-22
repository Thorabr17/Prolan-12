// kelas Reptil
//super kelas untuk kelas anak : Ular, Buaya, Cicak 
class IkanSungai {
    int ID;
    String Nama;
    String Keterangan;
    //konstructor
    public IkanSungai (int id, String nama, String keterangan) {
        ID = id;
        Nama = nama;
        Keterangan = keterangan;       
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID         = " +ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
    }   
}

//kelas Ular
//Turunan dari kelas Reptil, menggunakan "extends" dan "super"
class IkanHias extends IkanSungai {
    String Jenis;
    //konstructor
    public IkanHias (int isid, String nama, String keterangan, String jenis) {
        super (isid, nama, keterangan);
        Jenis = jenis;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID         = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis      = " + Jenis);
    }       
} 
//kelas Kobra
//Turunan dari kelas Ular, menggunakan "extends" dan "super"
class IkanMas extends IkanHias {
    String Jenis;
    //konstructor
    public IkanMas (int ihid, String nama, String keterangan, String jenis) {
        super (ihid, nama, keterangan, jenis);
        Jenis = jenis;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID         = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis      = " + Jenis);
    }       
}

//kelas Phyton
//Turunan dari kelas Ular, menggunakan "extends" dan "super"
class IkanCupang extends IkanHias {
    String Jenis;
    //konstructor
    public IkanCupang (int ihid, String nama, String keterangan, String jenis) {
        super (ihid, nama, keterangan,jenis);
        Jenis = jenis;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID         = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis      = " + Jenis);
    }       
} 
//kelas Buaya
//Turunan dari kelas Reptil, menggunakan "extends" dan "super"
class Piranha extends IkanSungai  {
    String Jenis;
    //konstructor
    public Piranha (int isid, String nama, String keterangan, String jenis) {
        super (isid, nama, keterangan);
        Jenis = jenis;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID         = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis      = " + Jenis);
    }       
}

//kelas Cicak
//Turunan dari kelas Reptil, menggunakan "extends" dan "super"
class Lele extends IkanSungai {
    String Jenis;
    //konstructor
    public Lele (int isid, String nama, String keterangan, String jenis) {
        super (isid, nama, keterangan);
        Jenis = jenis;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID         = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis      = " + Jenis);
    }       
} 
  
