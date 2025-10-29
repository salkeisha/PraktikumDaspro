package JOBSHEET8;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang : ");
        int jumlahCabang = sc.nextInt();

        System.out.println("==== Input Penjualan Per Cabang ====");

        //Inisialisasi variabel
        int i = 1;
        int j = 1;
        int totalSemuaPelanggan=0;
        int totalSemuaPesanan=0;
        int pesananPelanggan=0;
        do {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan : ");
            int jumlahPelanggan = sc.nextInt();
            //Inisialisasi berada di dalam struktur do karena agar termasuk dalam perulangan
            int totalPesanan = 0;
            for (j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                pesananPelanggan = sc.nextInt();
                totalPesanan += pesananPelanggan;
            }
                totalSemuaPelanggan += jumlahPelanggan;
                totalSemuaPesanan += totalPesanan;
                System.out.println("Cabang " + i + ": ");
                System.out.println("- Pelanggan : " + jumlahPelanggan);
                System.out.println("- Item Terjual : " + totalPesanan);

            i++;
        } while (i <= jumlahCabang);

        System.out.println("Total seluruh cabang : ");
        System.out.println("Pelanggan : " + totalSemuaPelanggan);
        System.out.println("Item Terjual : " + totalSemuaPesanan);
        
        sc.close();
    }
}
