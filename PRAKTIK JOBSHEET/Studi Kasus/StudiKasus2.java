public class StudiKasus2 {

    public static void main(String[] args) {
        
        int lebarTanah =50, panjangTanah =100, luasTanahAwal;
        double diameterLingkaran =2, sisiPersegi =2, luasKolamLingkaran, luasKolamPersegi, luasTanahRumput, jarijariLingkaran;

        luasTanahAwal = panjangTanah*lebarTanah;
        jarijariLingkaran = diameterLingkaran/2;
        luasKolamLingkaran = 2*(3.14*jarijariLingkaran*jarijariLingkaran);
        luasKolamPersegi = 2*(3.14*sisiPersegi*sisiPersegi);
        luasTanahRumput = luasTanahAwal-luasKolamLingkaran-luasKolamPersegi;

        System.out.println("Luas tanah anda adalah :"+luasTanahAwal);
        System.out.println("Luas 2 kolam lingkaran anda adalah :"+luasKolamLingkaran);
        System.out.println("Luas 2 kolam persegi anda adalah :"+luasKolamPersegi);
        System.out.println("Luas tanah yang dapat anda tanam rumput adalah :"+luasTanahRumput);

    }
}