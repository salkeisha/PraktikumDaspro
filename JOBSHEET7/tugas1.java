package JOBSHEET7;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int jumlahPengunjung;
         double hargaTiket = 50000, totalTiket, totalHargaTiket=0, totalHargaSehari=0, totalTiketSehari=0;
         double diskon1 = 0.9, diskon2 = 0.85;

         System.out.print("Masukkan jumlah pengunjung : ");
         jumlahPengunjung = sc.nextInt();

         for (int i = 1; i <= jumlahPengunjung; i++ ) {
            System.out.print("Masukkan total tiket yang dibeli pengunjung : ");
            totalTiket = sc.nextDouble();

            if (totalTiket < 0) {
                System.out.println("Input invalid");
                continue;
            }
            if (totalTiket < 4) {
                totalHargaTiket = hargaTiket*totalTiket;
            } else if (totalTiket >= 4) {
                totalHargaTiket = hargaTiket*totalTiket*diskon1;
            } else if (totalTiket >= 10) {
                totalHargaTiket = hargaTiket*totalTiket*diskon2;
            } 
            System.out.println("Total harga tiket pengunjung ke-" + i + "adalah sebesar : Rp" + totalHargaTiket);

            //hitung jumlah harga sehari dan jumlah tiket yang terjual
            totalHargaSehari = totalHargaSehari + totalHargaTiket;
            totalTiketSehari = totalTiketSehari + totalTiket;
         }
         System.out.println("Total tiket yang terjual dalam sehari     : " + totalTiketSehari + " tiket");
         System.out.println("Total harga penjualan dalam sehari adalah : Rp" + totalHargaSehari);
         sc.close();
           
    }
    
}
