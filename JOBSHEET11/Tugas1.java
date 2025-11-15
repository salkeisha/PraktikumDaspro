package JOBSHEET11;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Jadikan pertanyaan dalam satu array
        String[] pertanyaan = { 
            "1. Seberapa puaskah Anda dengan kualitas layanan kami secara keseluruhan?",
            "2. Bagaimana Anda menilai keramahan dan profesionalisme staf kami?",
            "3. Seberapa cepat dan tanggap kami dalam merespons pertanyaan Anda?",
            "4. Bagaimana Anda menilai kemudahan dalam mengakses layanan kami?",
            "5. Seberapa jelas informasi yang kami berikan terkait layanan?",
            "6. Seberapa besar kemungkinan Anda akan merekomendasikan kami?"
        };

        System.out.println("============== SURVEI KEPUASAN PELANGGAN ==============");

        System.out.println("\nBantu kami mengevaluasi dengan mengisi survei dengan ketentuan berikut");
        System.out.println("5 : Sangat Baik");
        System.out.println("4 : Baik");
        System.out.println("3 : Cukup");
        System.out.println("2 : Buruk");
        System.out.println("1 : Sangat Buruk");

        //Instansiasi array responden karena sudah pasti isinya berapa.
        double[][] responden = new double[10][6];

        //Buat nested loop untuk memasukkan nilai per pertanyaan dan per pengguna.
        for (int i = 0; i < responden.length; i++) {
            System.out.println("\nPengguna ke- " + (i+1));
            int j = 0;
            double totalPerResponden = 0;
            for (j = 0; j < responden[i].length; j++) {
                System.out.println("\n" + pertanyaan[j]);
                System.out.print("Nilai (1-5) : ");
                responden[i][j] = sc.nextInt();
                sc.nextLine();
                totalPerResponden += responden[i][j];

            }
            System.out.println("\nRata-rata nilai responden ke-" + (i + 1) + " : " + totalPerResponden/6);
            System.out.println();
        }

        //Nested loop untuk menghitung nilai per pertanyaan
        System.out.println("======================= REKAP SURVEI PELANGGAN =======================");
        System.out.println();
        for (int j = 0; j < responden[0].length; j++) {
            double totalPerPertanyaan = 0;

            for (int i = 0; i < responden.length; i++) {
                totalPerPertanyaan += responden[i][j];
            }
            System.out.println("Rata-rata nilai Pertanyaan ke-" + (j+1) + " : " + totalPerPertanyaan/10);
        }

        //Nested loop untuk menghitung seluruh nilai yang masuk.
        int jumlahNilai = 0;
        double totalNilai = 0;
        for (int i = 0; i < responden.length; i++) {
            for (int j = 0; j < responden[i].length; j++) {
                totalNilai += responden[i][j];
                jumlahNilai++;
            }
        }
        System.out.println("\nRata-rata nilai dari seluruh pelanggan adalah : " + totalNilai/jumlahNilai);
        System.out.println();

        sc.close();
    }
    
}
 