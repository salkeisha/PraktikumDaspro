package JOBSHEET14;

import java.util.Scanner;

public class Tugas1 {

    //Fungsi Rekursif
    static int hitungN(int N, Scanner sc) {
        if (N == 0) {
            return (0);
        } else {
            System.out.print("Masukkan angka yang mau diinput : ");
            int angka = sc.nextInt();
            return (angka + hitungN(N-1, sc));
        }
    }

    //Fungsi Iteratif
    static int hitungIteratifN(int N, Scanner sc) {
        int totalIteratif = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan angka yang mau diinput : ");
            int angka = sc.nextInt();
            totalIteratif += angka;
        } 
        return totalIteratif;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();

        int hasil = hitungN(N, sc);
        System.out.println("Total dari angka yang dihasilkan adalah : " + hasil);

        System.out.println("\n============== ITERATIF =================");
        System.out.println();

        int total = hitungIteratifN(N, sc);
        System.out.println("Total dari angka yang dihasilkan adalah : " + total);

    }    
}
