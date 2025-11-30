import java.util.Scanner;
public class Kubus27 {
    
    public static int hitungVolume (int a) {
        int volume = a*a;
        return volume;
    }

    public static int hitungLuasPermukaan (int b) {
        int luasPermukaan = hitungVolume(b) * 6;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus : ");
        int angka = sc.nextInt();

        int volumeKubus = hitungVolume(angka);
        System.out.println("Volume kubus adalah : " + volumeKubus);

        int luasPermukaanKubus = hitungLuasPermukaan(angka);
        System.out.println("Luas permukaan kubus adalah : " + luasPermukaanKubus);

        sc.close();
    } 
}
