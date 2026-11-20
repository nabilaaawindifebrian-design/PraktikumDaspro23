import java.util.Scanner;
public class febriCeritaFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int hari = 1;
        int totTabungan=0;
        int uangPerhari = 5000;
       

        for (int i = 1; i <= 7; i++) {
            System.out.println("Hari ke- " +i);
            System.out.println("Tabungan: Rp" + uangPerhari);
            totTabungan = totTabungan + uangPerhari;
  
        }
        System.out.println(" Total tabungan: " +totTabungan);


    }
}
