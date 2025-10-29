package JOBSHEET8;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        for (int i = 1; i <= angka; i++) {
            //berada di dalam outer loop agar terus mengulang menjadi 0 sebelu memasuki inner loop
            int jumlah = 0;
            System.out.print("Jumlah kuadrat 1 s.d " + i + " = ");
            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
                System.out.print(j*j);
                //jika j = 1 maka 1 x 1 = 1
                //jika j = 2 maka 2 x 2 = 4, dst
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
        sc.close();
    }
    
}
