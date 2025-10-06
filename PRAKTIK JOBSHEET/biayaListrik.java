import java.util.Scanner;
public class biayaListrik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaTetap=50000, tarifListrik=1500;
        double kwhListrik, ppn=0.1, jumlahBiaya, pajak, totalBiaya;

        System.out.print("Masukkan daya Listrik anda (kwh) : ");
        kwhListrik=sc.nextInt();

        jumlahBiaya=biayaTetap+tarifListrik*kwhListrik;
        pajak=jumlahBiaya*ppn;
        totalBiaya=jumlahBiaya+pajak;

        System.out.println("Biaya listrik anda adalah : Rp."+totalBiaya);
        sc.close();
    }
}