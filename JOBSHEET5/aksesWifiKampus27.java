package JOBSHEET5;
import java.util.Scanner;

public class aksesWifiKampus27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String pengguna;
        int sks;
        
        System.out.println("Masukkan status anda di kampus : (Dosen/Mahasiswa) ");
        pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Selamat Akses WiFi diberikan (dosen)");
        } else if (pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil : ");
            sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFI diberikan");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
}
