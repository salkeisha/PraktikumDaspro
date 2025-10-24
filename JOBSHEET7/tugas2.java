package JOBSHEET7;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

    //jika sesuai flowchart maka input aakan berada disini 
    /*  System.out.println("--- Masukkan Jenis Kendaraan ---");
        System.out.println("1. Mobil   2. Motor   0.Keluar");
        System.out.print("Input : ");*/
    // Tetapi jika input berada disini maka yang mengulang hanya input durasi saja dana akan terjadi logic error.

        //jika input jenis diletakkan didalam struktu do 
        do {
        System.out.println("--- Masukkan Jenis Kendaraan ---");
        System.out.println("1. Mobil   2. Motor   0.Keluar");
        System.out.print("Input : ");
        jenis = sc.nextInt();
            if (jenis ==1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir : ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                } else {
                    System.out.println("Durasi invalid");
                    continue;
                }
            }
        } while (jenis != 0);
        System.out.println("Total pembayaran parkir hari ini adalah : " + total);
        sc.close();
    }
}
