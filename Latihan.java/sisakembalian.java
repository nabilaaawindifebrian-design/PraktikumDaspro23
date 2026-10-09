import java.util.Scanner;
public class sisakembalian{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int gajiPokok;
        double tunjanganMakan, iuranBpjs;
        double gajiBersih;
        gajiPokok = input.nextInt();
        tunjanganMakan = 0.10 * gajiPokok;
        iuranBpjs = 0.02 * gajiPokok;
        gajiBersih = gajiPokok + tunjanganMakan - iuranBpjs;
        System.out.println("Gaji pokok adalah: " +gajiPokok);
        System.out.println("Besar tunjangan makan: " +tunjanganMakan);
        System.out.println("Iuran bpjs: " +iuranBpjs);
        System.out.println("Total gaji bersih: " +gajiBersih);



    }

}