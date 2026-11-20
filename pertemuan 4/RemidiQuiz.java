import  java.util.Scanner;

public class RemidiQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalJamLembur;
        int gajiPokok;
        int upahLemburPerJam = 40000;
        int gajiKotor;
        int iuranBpjs = 5/100;
        String namaKaryawan;
        int gajiBersih;


        System.out.print("namaKaryawan: ");
        namaKaryawan = sc.nextLine();

        System.out.println("Total jam lembur karyawan : ");
        totalJamLembur = sc.nextInt();
        
        gajiPokok = 25000 * 40;
        System.out.println("tampilkan gaji pokok: " +gajiPokok);

        upahLemburPerJam = 40000 * totalJamLembur;
        System.out.println("Tampilkan upah lembur perjam: " +upahLemburPerJam);
       

        gajiKotor = (gajiPokok + upahLemburPerJam);
        gajiBersih = (gajiKotor - iuranBpjs);
        System.out.println("total gaji bersih yang diterima karyawan: " +gajiBersih);







    }
    
}
