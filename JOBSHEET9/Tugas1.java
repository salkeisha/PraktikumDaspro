package JOBSHEET9;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int nilaiMhs[] = new int[jumlahMhs];
        double rata2, total=0;
        int tertinggi = 0, terendah = 100;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
            total += nilaiMhs[i];
            System.out.println("Nilai mahasiswa ke-"+ (i+1) + " adalah : "+ nilaiMhs[i]);
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai mahasiswa adalah : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai tertinggi : " + terendah);
        sc.close();


    }
    
}
