package PEMILIHAN;
import java.util.Scanner;

public class LATIHAN1 {
    public static void main(String[] args) {
        boolean inputKartu;
        boolean inputRegistrasi;

        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah kamu mempunyai kartu mahasiswa? (True/False)");
        inputKartu = sc.nextBoolean();
        System.out.println("Apakah anda sudah melakukan registrasi online? (True/False)");
        inputRegistrasi = sc.nextBoolean();

        if (inputKartu==true||inputRegistrasi==true) {
            System.out.println("Selamat anda dapat memasuki perpustakaan");
        } else {
            System.out.println("Mohon maaf anda belum memenuhi syarat untuk memasuki perpustakaan");
        }
        sc.close();
    }
}
