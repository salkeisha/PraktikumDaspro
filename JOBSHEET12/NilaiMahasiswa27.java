import java.util.Scanner;
public class NilaiMahasiswa27 {

    public static void isianArray (int[] nilaiMhs, Scanner sc) {
        for (int i = 1; i <= nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMhs[i-1] = sc.nextInt();
        }
    }

    public static void tampilArray (int nilaiMhs[]) {
        for (int j = 1; j <= nilaiMhs.length; j++) {
            System.out.println("Nilai mahasiswa ke-" + j + " : " + nilaiMhs[j-1]);
        }
    }

    public static int hitTot (int nilaiMhs[]) {
        int totalNilaiMhs = 0;
        for (int i = 1; i <= nilaiMhs.length; i++) {
            totalNilaiMhs += nilaiMhs[i-1];
        }
        return totalNilaiMhs;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        isianArray(nilaiMhs, sc);
        tampilArray(nilaiMhs);
        int jumlahNilaiMhs = hitTot(nilaiMhs);
        System.out.println("Jumlah nilai " + jumlahMhs + " mahasiswa adalah : " + jumlahNilaiMhs);


    }
}
