package JOBSHEET11;
import java.util.Scanner;

public class BisokopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu = 0;
        String nama="", next;

        String[][] penonton = new String[4][2];
        
        //Modifikasi 2
        while (true) {
        System.out.println("\n============== PILIH MENU ==============");
        System.out.println("Menu 1 : Input data penonton");
        System.out.println("Menu 2 : Lihat data penonton");
        System.out.println("Menu 3 : Exit");
        System.out.print("Masukkan menu yang ingin dipilih : ");
        menu = sc.nextInt();
        sc.nextLine();

        if (menu == 1) {
        while (true) {
            System.out.print("\nMasukkan nama: ");
            nama = sc.nextLine();

            while (true) {
            System.out.print("Masukkan baris (1-4) : ");
            baris = sc.nextInt();
            //Modifikasi 3
            if (baris < 1 || baris > 4) {
                System.out.println("Masukkan baris sesuai rentang yang ada!");
                continue;
            }
            System.out.print("Masukkan kolom (1-2) : ");
            kolom = sc.nextInt();
            //Modifikasi 3
            if (kolom < 1 || kolom > 2) {
                System.out.println("Masukkan kolom sesuai rentang yang ada!");
                continue;
            }
            sc.nextLine();

            //Modifikasi 4
            if (penonton[baris-1][kolom-1] != null) {
                System.out.println("Kursi sudah terpenuhi. Pilih kursi lainnya!");
            } else {
                penonton[baris-1][kolom-1] = nama;
                break;
            }
            }

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
                }
            }
        }

        if (menu == 2) {
            System.out.println("\nDaftar Penonton : ");
            System.out.println();
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[0].length; j++) {
                    // if (penonton[i][j] != null) {
                    //     System.out.println("Baris " + (i+1) + " dan Kolom " + (j+1) + " Sudah terisi.");
                    // } else {
                    //     System.out.println("Baris " + (i+1) + " dan Kolom " + (j+1) + " Belum Terisi. Silahkan memesan tiket.");
                    // }

                    //Modifikasi no 5
                    if (penonton[i][j] != null) {
                        System.out.println("Baris " + (i+1) + " dan Kolom " + (j+1) + " Sudah terisi.");
                    } else {
                        System.out.println("***");
                    }
                }
            }
            System.out.println("\n *** : Kursi masih kosong, silahkan dipesan.");
        }
        if (menu == 3) {
            System.out.println("\nTerimakasih sudah menggunakan layanan kami!");
            System.out.println();
            break;
        }
        }
        sc.close();
    }
}
