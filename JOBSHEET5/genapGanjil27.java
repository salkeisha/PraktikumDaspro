package JOBSHEET5;
import java.util.Scanner;

public class genapGanjil27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int angka;
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka genap");
        } else {
            System.out.println("Angka ganjil");
        }

        sc.close();
    }
}
