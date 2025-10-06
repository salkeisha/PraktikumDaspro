import java.util.Scanner;
public class ModifikasiStudiKasus2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int lebarTanah, panjangTanah, luasTanahAwal;
        double diameterLingkaran, sisiPersegi, luasKolamLingkaran, luasKolamPersegi, luasTanahRumput, jarijariLingkaran;

        System.out.println("Masukkan lebar tanah anda :");
        lebarTanah = input.nextInt();
        System.out.println("Masukkan panjang tanah anda :");
        panjangTanah = input.nextInt();
        System.out.println("Masukkan diameter kolam lingkaran anda :");
        diameterLingkaran = input.nextInt();
        System.out.println("Masukkan panjang sisi kolam persegi anda :");
        sisiPersegi = input.nextInt();

        luasTanahAwal = panjangTanah*lebarTanah;
        jarijariLingkaran = diameterLingkaran/2;
        luasKolamLingkaran = 2*(3.14*jarijariLingkaran*jarijariLingkaran);
        luasKolamPersegi = 2*(sisiPersegi*sisiPersegi);
        luasTanahRumput = luasTanahAwal-luasKolamLingkaran-luasKolamPersegi;

        System.out.println("Luas tanah anda adalah :"+luasTanahAwal+" meter");
        System.out.println("Luas 2 kolam ikan lingkaran anda adalah :"+luasKolamLingkaran+" meter");
        System.out.println("Luas 2 kolam ikan persegi anda adalah :"+luasKolamPersegi+" meter");
        System.out.println("Luas tanah yang dapat anda tanam rumput adalah :"+luasTanahRumput+" meter");
        input.close();
    }
}