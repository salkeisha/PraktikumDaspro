import java.util.Scanner;
public class NilaiAkhir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        double nilaiUTS1, nilaiUAS1, nilaiTugas1, nilaiUTS2, nilaiUAS2, nilaiTugas2, nilaiAkhir, nilaiMatkul1, nilaiMatkul2;
        String statusKelulusan1, kelulusanSemester, statusKelulusan2;
        boolean kelulusanMatkul1, kelulusanMatkul2;
        String namaMahasiswa, NIM;
        String nilaiHuruf1, nilaiHuruf2;
        

        // input
        System.out.println("=================== INPUT DATA MAHASISWA ===================");
        System.out.print("Nama : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("NIM  : ");
        NIM = sc.nextLine();

        System.out.println("----- Mata kuliah 1: Algoritma dan Pemograman -----");
        System.out.print("Nilai UTS  : ");
        nilaiUTS1 = sc.nextDouble();
        System.out.print("Nilai UAS  : ");
        nilaiUAS1 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        nilaiTugas1 = sc.nextDouble();

        System.out.println("----- Mata kuliah 2: Struktur Data -----");
        System.out.print("Nilai UTS  : ");
        nilaiUTS2 = sc.nextDouble();
        System.out.print("Nilai UAS  : ");
        nilaiUAS2 = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        nilaiTugas2 = sc.nextDouble();

        // Penambahan variable kehadiran dan etika
        double nilaiEtika, nilaiKehadiran;
        System.out.println("----- Kehadiran dan Etika -----");
        System.out.print("Nilai Kehadiran  : ");
        nilaiKehadiran = sc.nextDouble();
        System.out.print("Nilai Etika      : ");
        nilaiEtika = sc.nextDouble();

        //Operasi hitung total nilai per matkul
        nilaiMatkul1 = (nilaiUTS1*0.3)+(nilaiUAS1*0.4)+(nilaiTugas1*0.3);
        nilaiMatkul2 = (nilaiUTS2*0.3)+(nilaiUAS2*0.4)+(nilaiTugas2*0.3);

        //Operasi nilai rerata matkul
        nilaiAkhir = (nilaiMatkul1+nilaiMatkul2)/2;


        //Konversi nilai akhir ke nilai huruf
        if (nilaiMatkul1 >= 80) {
            nilaiHuruf1="A";
        } else if (nilaiMatkul1 >= 73) {
            nilaiHuruf1="B+";
        } else if (nilaiMatkul1 >= 65) {
            nilaiHuruf1="B";
        } else if (nilaiMatkul1 >= 60) {
            nilaiHuruf1="C+";
        } else if (nilaiMatkul1 >= 50) {
            nilaiHuruf1="C";
        } else if (nilaiMatkul1 >= 39) {
            nilaiHuruf1="D";
        } else {
            nilaiHuruf1="E";
        }

        if (nilaiMatkul2 >= 80) {
            nilaiHuruf2="A";
        } else if (nilaiMatkul2 >= 73) {
            nilaiHuruf2="B+";
        } else if (nilaiMatkul2 >= 65) {
            nilaiHuruf2="B";
        } else if (nilaiMatkul2 >= 60) {
            nilaiHuruf2="C+";
        } else if (nilaiMatkul2 >= 50) {
            nilaiHuruf2="C";
        } else if (nilaiMatkul2 >= 39) {
            nilaiHuruf2="D";
        } else {
             nilaiHuruf2="E";
        }

        //Jika nilai per matkul < 60 maka tidak lulus
        if (nilaiMatkul1 < 60) {
            kelulusanMatkul1 = false;
            statusKelulusan1="Tidak Lulus";
        } else {
            kelulusanMatkul1 = true;
            statusKelulusan1="Lulus";
        }

        if (nilaiMatkul2 < 60) {
            kelulusanMatkul2 = false;
            statusKelulusan2="Tidak Lulus";
        } else {
            kelulusanMatkul2 = true;
            statusKelulusan2="Lulus";
        }

        //Jika nilai akhir < 70 maka tidak lulus
        if (kelulusanMatkul1==true && kelulusanMatkul2==true) {
            if (nilaiAkhir >= 70 && nilaiKehadiran >= 75 && nilaiEtika >= 70) {
                kelulusanSemester="LULUS";
            } else {
                kelulusanSemester="TIDAK LULUS";
            }
        } else {
            kelulusanSemester="TIDAK LULUS (Salah satu atau kedua mata kuliah tidak lulus)";
        }

        //Output akhir
        System.out.println("================================== HASIL PENILAIAN AKADEMIK ======================================");
        System.out.println("Nama : " + namaMahasiswa);
        System.out.println("NIM  : " + NIM);

        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t"+ "       " +nilaiUTS1+"     "+nilaiUAS1+"     "+nilaiTugas1+"      "+nilaiMatkul1+"             "+nilaiHuruf1+"            "+statusKelulusan1);
        System.out.println("Struktur Data\t\t"+ "       " +nilaiUTS2+"     "+nilaiUAS2+"     "+nilaiTugas2+"      "+nilaiMatkul2+"             "+nilaiHuruf2+"            "+statusKelulusan2);
        
        System.out.println("Nilai Kehadiran       : "+nilaiKehadiran);
        System.out.println("NIlai Etika           : "+nilaiEtika);
        System.out.println("Rata-rata nilai akhir : " + nilaiAkhir);
        System.out.println("Status Semester       : " + kelulusanSemester);
        sc.close();
    }
}