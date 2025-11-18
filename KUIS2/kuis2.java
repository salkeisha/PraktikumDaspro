package KUIS2;
import java.util.Scanner;

public class kuis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berapa wilayah yang ingin di input : ");
        int jmlWilayah = sc.nextInt();

        int[][] jmlAirBersih = new int[jmlWilayah][7];
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        int totalAirBersih = 0, tertinggi1 = 0, tertinggi2 = 0;
        
        for (int i = 0; i < jmlAirBersih.length; i++) {
            System.out.println("\nPada wilayah ke-" + (i+1) + " jumlah konsumsi air bersih yang digunakan : ");
            totalAirBersih = 0;
            for (int j = 0; j < jmlAirBersih[i].length; j++) {
                System.out.print("Pada hari " + hari[j] + " telah digunakan air sebanyak : ");
                jmlAirBersih[i][j] = sc.nextInt();
                totalAirBersih += jmlAirBersih[i][j];
                if (totalAirBersih > tertinggi1) {
                    tertinggi1 = totalAirBersih;
                    if (tertinggi1 < totalAirBersih) {
                        tertinggi1 = totalAirBersih;
                    }
                }

            }
            System.out.println("\nTotal konsumsi air bersih di wilayah ke-" + (i+1) + " adalah sebanyak : " + totalAirBersih + " m2");
        } 
        System.out.println();

        int rataHarian = 0;
        for (int j = 0; j < jmlAirBersih[0].length; j++) {
            totalAirBersih = 0;
            rataHarian = 0;
            for (int i = 0; i < jmlAirBersih.length; i++) {
                totalAirBersih += jmlAirBersih[i][j];
                rataHarian = totalAirBersih/jmlWilayah;
                if (rataHarian > tertinggi2) {
                    tertinggi2 = rataHarian;
                } 
            }
            System.out.println("Jumlah rata-rata konsumi hari " + hari[j] + " adalah sebanyak : " + rataHarian + " m2");
        } 
        System.out.println("Wilayah dengan konsumsi tertinggi ialah wilayah dengan jumlah konsumsi sebanyak : " + tertinggi1 + " m2");
        System.out.println("Hari dengan rata-rata jumlah konsumsi tertinggi adalah sebanyak : " + tertinggi2 + " m2");
        sc.close();
    }
    
}
