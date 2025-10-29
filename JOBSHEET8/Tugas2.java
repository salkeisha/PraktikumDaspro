package JOBSHEET8; 
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();

        // jika angka dibawah 10
        if (n < 10) {
        for (int i = 1; i <= n; i++) {
            if (i==1||i==n) {
                for (int j = 1; j <= n; j++) {
                System.out.print(" " + n + " ");
                }
            System.out.println();
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j==1||j==n) {
                        System.out.print(" " + n + " ");
                    } else {
                        System.out.print(" " + " " + " ");
                    }
                }
                System.out.println();
                }
            }
            
        // jika angka diatas 10
        } else {
            for (int i = 1; i <= n; i++) {
                if (i==1||i==n) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(" " + n + " ");
                }
                        System.out.println();
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j==1||j==n) {
                        System.out.print(" " + n + " ");
                    } else {
                        System.out.print(" " + "  " + " ");
                    }
                }
                System.out.println();
                }
            }
        }
        sc.close();
    }
    
}
