import java.util.Scanner;
public class febriWhileCerita {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       int i = 1;
       int nilaiMahasiswa;
       

        while (i <= 5){
          
            System.out.print("Masukkan nilai mahasiswa ke- " + i + ": ");
            nilaiMahasiswa = sc.nextInt();
            

            if(nilaiMahasiswa >= 75){
                System.out.println("Status: LULUS");
            } else {
                System.out.println("Status: Tidak Lulus");
            }
            i++;
        }
       
        

    }
}
