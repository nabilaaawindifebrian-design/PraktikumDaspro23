//n=3+(23 mod 5) = 6 (1)
//n=9+(23 mod 5)= 12 (2)
//n=4+(23 mod 4)= 7
//n=10+(23 mod 6) = 15

import java.util.Scanner;
public class Star23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println();
        sc.close();

    }
}
