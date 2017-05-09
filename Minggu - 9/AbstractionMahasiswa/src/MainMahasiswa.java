public class MainMahasiswa extends Thoriq {
   public static void main (String[] args) {
       Thoriq Thor = new Thoriq();
       
       System.out.println("****************************************************************************************************************");
       System.out.println("======================================================");
       System.out.println("ini adalah peraturan dan syarat dalam perkuliahan !!! ");
       System.out.println("======================================================\n"); 
       
       System.out.print("Nama Anda        :      "); Thor.printNama();
       System.out.print("NIM Anda         :      "); Thor.printNim();
       System.out.print("Kelas Anda       :      "); Thor.printKelas();
       System.out.print("Tahun masuk anda :      "); Thor.printTahun();
       System.out.println("======================================================\n");
       System.out.println("Keterangan : ");
       
       
       
       Thor.kuliah();
       Thor.lulus();
       Thor.tidaklulus();
       Thor.dropout();
       System.out.println("****************************************************************************************************************");
       }
}
    
