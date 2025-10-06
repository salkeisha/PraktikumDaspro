public class StudiKasus1 {

    public static void main(String[] args) {
        
        int gajiPokok =3000000, tunjanganAnak =150000, jumlahAnak =3, jmlTunjanganAnak;
        double presentaseSimpananDana =0.05, jmlSimpananDana, gajiBersih;
        
        jmlTunjanganAnak = tunjanganAnak*jumlahAnak;
        jmlSimpananDana = gajiPokok*presentaseSimpananDana;
        gajiBersih = gajiPokok+jmlTunjanganAnak-jmlSimpananDana;

        System.out.println("Tunjangan anak anda adalah :"+jmlTunjanganAnak);
        System.out.println("Simpanan danan pensiun anda adalah :"+jmlSimpananDana);
        System.out.println("Gaji bersih anda adalah :"+gajiBersih);
        
    }
}