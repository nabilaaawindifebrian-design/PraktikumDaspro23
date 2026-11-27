import java.util.Scanner;
public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        String[][] penonton = new String[4][2];
        int pilihan;

        do{
            System.out.println("=====MENU BIOSKOP====");
            System.out.println("1. input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nama: ");
                    String nama = sc.nextLine();
                    
                    System.out.println("Masukkan baris: ");
                    int baris = sc.nextInt();

                    System.out.println("Masukkan kolom: ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1|| baris >4 || kolom < 1 || kolom >2) {
                        System.out.println("Nomor kursi tidak tersedia");
                    } else if(penonton[baris-1][kolom-1]!=null){
                        System.out.println("Kursi sudah terisi");
                    } else{
                       System.out.println(penonton[baris-1][kolom-1]=nama);
                       System.out.println("Data berhasil disimpan");
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j]==null) {
                            System.out.println("Penonton pada baris ke-"+(i+1) +": *");
                            } else{
                                System.out.println("Penonton pada baris ke-"+(i+1) +": "+ penonton[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilihan!=3);

    }
    
}
