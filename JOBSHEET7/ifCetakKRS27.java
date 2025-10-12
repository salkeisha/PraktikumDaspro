package JOBSHEET5;
import java.util.Scanner;

public class ifCetakKRS27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Versi IF-ELSE
        // if (uktLunas) {
        //  System.out.println("Pembayaran UKT Terverifikasi");
        //  System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        // } else {
        //  System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        //}

        pesan = (uktLunas) ? "Pembayaran UKT Terverifikasi. Silahkan cek KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
        sc.close();
    }
}
