//Kelas utama
//Perhatikan kata "main"
public class IkanSemua {
    public static void main(String[] args) {
        
    //instansiasi kelas    
    //menggunakan "new"    
     System.out.println("Berikut daftar klasifiksi ikan beserta contoh serta jenisnya :");
     System.out.println("");
     IkanLaut ikanlaut = new IkanLaut(100, "Ikan Laut", "Merupakan jenis ikan yang hidup di laut.");
     Lumba2 lumba2 = new Lumba2(110, "Lumba-lumba", "Merupakan ikan yang hidupdi laut dan akrab dengan manusia.", "Ikan Laut");
     Hiu hiu = new Hiu(120, "Hiu", "Merupakan Predator laut yang sangat berbahaya", "Ikan Laut");
     HiuPutih hiuputih = new HiuPutih(121, "Hiu Putih", "Merupakan jenis hiu yang berbahaya .", "Hiu");
     HiuMacan hiumacan = new HiuMacan(122, "Hiu Macan", "Merupakan jenis hiu yang sangat lincah.", "Hiu");
     HiuMartil hiumartil = new HiuMartil(123, "Hiu Martil", "Hiu jenis ini memiliki mulut yang seperti martil.", "Hiu");
     Paus paus = new Paus(130, "Paus", "Merupakan ikan terbesar di bumi.", "Ikan Laut");
     PausBiru pausbiru = new PausBiru(131, "Paus Biru", "Merupakan jenis paus yang paling besar.", "Paus");
     PausOrcha pausorcha = new PausOrcha(132, "Paus Orcha", "Merupakan paus yang sering memakan daging.", "Paus");
     PausBintik pausbintik = new PausBintik(133, "Paus Bintik", "paus ini memiliki ciri bintik-bintik pad tubuhnya.", "Paus");
    
     IkanSungai ikansungai = new IkanSungai(200, "Ikan Sungai", "Merupkan jenis ikan yang hidup di sungai atau air tawar");
     IkanHias ikanhias = new IkanHias(210, "Ikan hias", "Digolongkan ke dalam ikan yang sering dipelihara.", "Ikan Sungai");
     IkanMas ikanmas = new IkanMas(211, "Ikan Mas", "Ikan ini dapat dipelihara dan di konsumsi.", "Ikan Hias");
     IkanCupang ikancupang = new IkanCupang(212, "Ikan cupang", "Ikan ini dapat dipelihara dan bisa di adu .", "Ikan Hias");
     Piranha piranha = new Piranha(220, "Piranha", "Ikan ini adalah ikan sungai paling berbahaya.", "Ikan Sungai");
     Lele lele = new Lele(230, "Lele", "Ikan ini memiliki keunikan kumis yang panjang.", "Ikan Sungai");
    
    //Pemanggilan konstruktor masing - masing
     ikanlaut.TampilkanRincian();
     System.out.println("");
     lumba2.TampilkanRincian();
     System.out.println("");
     hiu.TampilkanRincian();
     System.out.println("");
     hiuputih.TampilkanRincian();
     System.out.println("");
     hiumacan.TampilkanRincian();     
     System.out.println("");
     hiumartil.TampilkanRincian();
     System.out.println("");
     paus.TampilkanRincian();
     System.out.println("");
     pausbiru.TampilkanRincian();
     System.out.println("");
     pausorcha.TampilkanRincian();
     System.out.println("");
     pausbintik.TampilkanRincian();
     System.out.println("");
     ikansungai.TampilkanRincian();
     System.out.println("");
     ikanhias.TampilkanRincian();
     System.out.println("");
     ikanmas.TampilkanRincian();
     System.out.println("");
     ikancupang.TampilkanRincian();
     System.out.println("");
     piranha.TampilkanRincian();
     System.out.println("");
     lele.TampilkanRincian();
     System.out.println("");
     System.out.println("");
     System.out.println("==============");
    }
}
