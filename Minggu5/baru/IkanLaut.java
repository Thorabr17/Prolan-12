//kelas Mamalia
//super kelas untuk kelas anak : Sapi, Kucing, Anjing
class IkanLaut{
    int ID;
    String Nama;
    String Keterangan;
    //konstruktor 
    public IkanLaut (int id, String nama, String keterangan) {
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


//kelas Sapi
//Turunan dari kelas Mamalia, menggunakan "extends" dan "super"
class Lumba2 extends IkanLaut {
    String Jenis;
    //konstruktor
    public Lumba2 (int iID, String nama, String keterangan, String jenis) {
        super (iID, nama, keterangan);
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


//kelas Kucing
//Turunan dari kelas Mamalia, menggunakan "extends" dan "super"
class Hiu extends IkanLaut {
    String Jenis;
    //konstruktor
    public Hiu (int iID, String nama, String keterangan, String jenis) {
        super (iID, nama, keterangan);
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

//kelas Angora
//Turunan dari kelas Kucing, menggunakan "extends" dan "super"
class HiuPutih extends Hiu {
    String Jenis;
    //konstruktor
    public HiuPutih (int hID, String nama, String keterangan, String jenis) {
        super (hID, nama, keterangan, jenis);
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
//kelas Persia
//Turunan dari kelas Kucing, menggunakan "extends" dan "super"
class HiuMacan extends Hiu {
    String Jenis;
    //konstruktor
    public HiuMacan (int hID, String nama, String keterangan, String jenis) {
        super (hID, nama, keterangan, jenis);
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

//kelas Tiffany
//Turunan dari kelas Kucing, menggunakan "extends" dan "super"
class HiuMartil extends Hiu {
    String Jenis;
    //konstruktor
    public HiuMartil (int hID, String nama, String keterangan, String jenis) {
        super (hID, nama, keterangan, jenis);
        Jenis = jenis;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID 		   = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis 	   = " + Jenis);
    }    
}


//kelas Anjing
//Turunan dari kelas Mamalia, menggunakan "extends" dan "super"
class Paus extends IkanLaut {
    String Jenis;
    //konstruktor
    public Paus (int iID, String nama, String keterangan, String jenis) {
        super (iID, nama, keterangan);
        Jenis = jenis;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID 		   = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis      = " + Jenis);
    }   
}

//kelas Pom
//Turunan dari kelas Anjing, menggunakan "extends" dan "super"
class PausBiru extends Paus {
    String Jenis;
    //konstruktor
    public PausBiru (int pID, String nama, String keterangan, String jenis) {
        super (pID, nama, keterangan, jenis);
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
//kelas Golden
//Turunan dari kelas Anjing, menggunakan "extends" dan "super"
class PausOrcha extends Paus {
    String Jenis;
    //konstruktor
    public PausOrcha (int pID, String nama, String keterangan, String jenis) {
        super (pID, nama, keterangan, jenis);
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

//kelas CiHuaHua
//Turunan dari kelas Anjing, menggunakan "extends" dan "super"
class PausBintik extends Paus {
    String Jenis;
    //konstruktor
    public PausBintik (int pID, String nama, String keterangan, String jenis) {
        super (pID, nama, keterangan, jenis);
        Jenis = jenis;
    }
    //methode
    public void TampilkanRincian() {
        System.out.println("ID 		   = " + ID);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Keterangan);
        System.out.println("Jenis 	   = " + Jenis);
    }   
} 
