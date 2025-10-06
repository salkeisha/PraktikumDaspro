import java.util.Scanner;
public class biayaSewaMobil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewaMobil=300000, biayaSupir=200000, biayaBahanBakar=1000;
        int banyakHari, jarakTempuh, totalBiayaSewa;

        System.out.print("Masukkan banyak hari mobil akan disewa : ");
        banyakHari=sc.nextInt();
        System.out.print("Jarak yang akan anda tempuh sejauh (KM) : ");
        jarakTempuh=sc.nextInt();

        totalBiayaSewa=(banyakHari*(biayaSupir+biayaSewaMobil)+(jarakTempuh*biayaBahanBakar));

        System.out.println("Biaya sewa mobil anda adalah sebesar : Rp."+totalBiayaSewa);
        sc.close();
    }
}