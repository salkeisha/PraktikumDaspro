package JOBSHEET7;
import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka, hasilKali = 1;

        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();

        for (int i = 1; i <= angka; i++) {
           hasilKali = hasilKali*i;
        }
        System.out.println(hasilKali);
        sc.close();
    }

    
}
