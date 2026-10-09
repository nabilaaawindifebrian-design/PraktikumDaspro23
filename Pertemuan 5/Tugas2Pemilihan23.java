import java.util.Scanner;
public class Tugas2Pemilihan23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int jumlahSks;
        System.out.println("jumlahSks");
        jumlahSks = input.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        }else{
            System.out.println("KRS valid");
        }
        
        

    }
    
}
