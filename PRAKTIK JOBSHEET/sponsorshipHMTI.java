import java.util.Scanner;
public class sponsorshipHMTI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPublikasi = 300000;
        int biayaDekorasi = 500000;
        int biayaKonsumsi = 500000;
        int biayaHadiah = 4000000;
        int biayaOperasional = 500000;
        int totalAnggaran;

        int konsumsiPeserta = 25000;
        int honorarium = 50000;
        int jumlahTim;
        int biayaPendaftaran = 50000;
        int jumlahKonsumPeserta;
        int jumlahBiayaPendaftaran;

        double totalDana = 0.6;
        double totalBiaya;
        int jumlahHonorarium;
        double biayaSponshorship;

        System.out.print("Jumlah tim yang mengikuti kompetisi : ");
        jumlahTim=sc.nextInt();

        totalAnggaran=biayaPublikasi+biayaDekorasi+biayaKonsumsi+biayaHadiah+biayaOperasional;
        jumlahKonsumPeserta=jumlahTim*3*konsumsiPeserta;
        jumlahHonorarium=jumlahTim*honorarium;
        jumlahBiayaPendaftaran=jumlahTim*biayaPendaftaran;
        totalBiaya=(totalAnggaran+jumlahKonsumPeserta+jumlahHonorarium)-jumlahBiayaPendaftaran;
        biayaSponshorship=(1-totalDana)*totalBiaya;

        System.out.println("Biaya sponsorship yang diperlukan adalah sebesar : Rp."+biayaSponshorship);
    }
}