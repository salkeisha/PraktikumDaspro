package JOBSHEET9;
import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        double total = 0;
        double rata2, rata2Lulus, rata2TdkLulus, totalMhsLulus=0, totalMhsTdkLulus=0;
        int mhsLulus = 0, mhsTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                totalMhsLulus += nilaiMhs[i];
            } else {
                mhsTdkLulus++;
                totalMhsTdkLulus += nilaiMhs[i];
            }
        }
        rata2Lulus = totalMhsLulus/mhsLulus;
        rata2TdkLulus = totalMhsTdkLulus/mhsTdkLulus;
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
        System.out.println("Jumlah mahasiswa yang lulus adalah : "+ mhsLulus);
        sc.close();
    }
    
}
