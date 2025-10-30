package JOBSHEET8; 
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // Input angka harus lebih dari 3
        int angka;
        do {
        System.out.print("Masukkan angka (lebih dari 3) : ");
        angka = sc.nextInt();
            if (angka < 3) {
                System.out.println("Angka kurang dari 3. Coba lagi!");
            }
        } while (angka < 3);

        //Jika angka kurang dari 10 maka spasi yg dibutuhkan hanya satu
        if (angka < 10) {
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                if (i == 1 || j == 1 || i == angka || j == angka) {
                    System.out.print(angka + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Jika angka lebih dari sama dengan 10 maka spasi yang dibutuhkan dua
        } else {
                    for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                if (i == 1 || j == 1 || i == angka || j == angka) {
                    System.out.print(angka + "  ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        }
        sc.close();
    }
    
}
