public class PengunjungCafe27 {
    
    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
    //     for (int i = 0; i < namaPengunjung.length; i++) {
    //         System.out.println("- " + namaPengunjung[i]);
    //     }
    // }

    // Modifikasi foreach
    for (String tmp : namaPengunjung) {
        System.out.println("- " + tmp);
        }
    }
     public static void main(String[] args) {
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
     }
    
}
