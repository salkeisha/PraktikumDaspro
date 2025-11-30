import java.util.Scanner;
public class Kafe27 {
     
    //Percobaan 2.1
    // public static void Menu() {
    //     System.out.println("===== MENU RESTO KAFE =====");
    //     System.out.println("1. Kopi Hitam - Rp 15,000");
    //     System.out.println("2. Cappuccino - Rp 20,000");
    //     System.out.println("3. Latte - Rp 22,000");
    //     System.out.println("4. Teh Tarik - Rp 12,000");
    //     System.out.println("5. Roti Bakar - Rp 10,000");
    //     System.out.println("6. Mie Goreng - Rp 18,000");
    //     System.out.println("=============================");
    //     System.out.println("Silahkan pilih menu yang Anda inginkan.");
    // }

    //Percobaan 2.2
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("\nSelamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        //Modifikasi
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%! dari kode promo anda");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 30% dari kode promo anda");
        } else {
            System.out.println("Kode Invalid!");
        }

        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static double hitungTotalHarga27(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        double hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;

        //Modifikasi menerapkan diskon
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal = hargaTotal - (hargaTotal * 0.5);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 0.3);
        } else {
        }
        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan : ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah anda terdaftar menjadi salah satu member kami? (true/false) ");
        boolean isMember = sc.nextBoolean();
        System.out.print("Masukkan kode promo yang anda punya : ");
        String kodePromo = sc2.nextLine();


        Menu (namaPelanggan, isMember, kodePromo);
        // Menu ("Budi", isMember, "DISKON30");

        //Percobaan 2.3
        double totalSemua = 0;
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            double totalHarga = hitungTotalHarga27(pilihanMenu, banyakItem, kodePromo);
            totalSemua += totalHarga;

            System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
            
            System.out.print("Apakah anda ingin memesan kembali? (true/false) ");
            String kelanjutanPesanan = sc2.nextLine();

            if (kelanjutanPesanan.equalsIgnoreCase("false")) {
                break;
            }

        }
        System.out.println("\nTotal harga untuk seluruh pesanan anda adalah : Rp" + totalSemua);
        sc.close();
        sc2.close();
    }
    
}
