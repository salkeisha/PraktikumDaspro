package JOBSHEET9;
import java.util.Scanner;

public class SearchNilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlahNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahNilai];
        int key = 0;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length;) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
                break;
            } else {
                System.out.println("Nilai tidak ditemukan");
                break;
            }
        }
        sc.close();
    }
    
}
