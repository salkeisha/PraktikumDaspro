package JOBSHEET9;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan jumlah makanan/minuman yang ingi dipesan : ");
        int jmlPesanan = sc. nextInt();

        String[] menu = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];
        int total = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Makanan/minuman yang ingin anda pesan : ");
            menu[i] = sc2.nextLine();
            System.out.print("Masukkan harga dari pesanan yang baru saja anda pilih : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            total += harga[i];
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("===================== PESANAN ANDA ======================");
        for (int i = 0; i < jmlPesanan; i++) {
        System.out.println((i+1) + ". " + menu[i] + " dengan harga : " + harga[i]);
        }
        System.out.println("Total harga semua pesanan anda adalah : " + total);
        sc.close();
        sc2.close();
    }
}