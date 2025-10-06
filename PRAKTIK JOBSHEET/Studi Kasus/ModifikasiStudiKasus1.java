import java.util.Scanner;
public class ModifikasiStudiKasus1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gajiPokok, tunjanganAnak, jumlahAnak, jmlTunjanganAnak;
        double presentaseSimpananDana =0.05, jmlSimpananDana, gajiBersih;

        System.out.println("Masukkan gaji pokok anda : ");
        gajiPokok = input.nextInt();
        System.out.println("Masukkan tunjangan anak anda : ");
        tunjanganAnak = input.nextInt();
        System.out.println("Masukkan jumlah anak anda : ");
        jumlahAnak = input.nextInt();

        jmlTunjanganAnak = tunjanganAnak*jumlahAnak;
        jmlSimpananDana = gajiPokok*presentaseSimpananDana;
        gajiBersih = gajiPokok+jmlTunjanganAnak-jmlSimpananDana;

        System.out.println("Tunjangan anak anda adalah : "+jmlTunjanganAnak);
        System.out.println("Simpanan dana pensiun anda adalah : "+jmlSimpananDana);
        System.out.println("Gaji bersih anda adalah : "+gajiBersih);
        input.close();
    }
}