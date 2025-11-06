package JOBSHEET9;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        System.out.println("------------------------- OUR MENU ------------------------");
        System.out.println("============================================================");
        System.out.println("------------------------- MAKANAN -------------------------");
        System.out.println("1. Nasi Goreng   2. Mie Goreng  3. Roti Bakar  4. Kentang Goreng");
        System.out.println("------------------------  MINUMAN --------------------------");
        System.out.println("5. Teh Tarik     6. Cappucino   7. Chocolate Ice");

        System.out.print("Masukkan nama menu yang ingin anda pesan : ");
        String pesanan = sc.nextLine();

        for(String tmp:menu) {
            if (tmp.equalsIgnoreCase(pesanan)) {
                System.out.println("Menu " + pesanan + " tersedia!");
                break;
            } 
        }
        sc.close();
    }
    
}
