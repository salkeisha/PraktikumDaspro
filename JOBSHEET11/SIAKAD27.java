package JOBSHEET11;
import java.util.Scanner;

public class SIAKAD27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Modfikasi 1
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = sc.nextInt();

        System.out.print("\nMasukkan jumlah mata kuliah : ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();

        int[][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahsiswa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("nilai rata-rata: " + totalPerSiswa/jmlMatkul);
        }

        System.out.println("\n===================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < jmlMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/jmlMahasiswa);
        }
        sc.close();
    }
    
}
