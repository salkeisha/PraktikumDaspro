import java.util.Scanner;

public class StudiKasus4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jarak;
        int hargaBensin=10000;
        double bensinPerKm;
        double totBiaya;
        double rataBensin=0.5;

        System.out.print("Jarak yang ditempuh mobil (KM) : ");
        jarak=sc.nextInt();

        bensinPerKm=jarak*rataBensin;
        totBiaya=bensinPerKm*hargaBensin;

        System.out.print("Biaya yang diperlukan untuk perjalanan adalah sebesar : Rp"+totBiaya);
        sc.close();

    }

}