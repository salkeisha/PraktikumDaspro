package JOBSHEET13;

import java.util.Scanner;

public class caseMethod27 {

    //Inisialisasi jumlah pendaftar dengan 0 karena akan bertambah setiap input yang dilakukan. Merupakan variabel global agar bisa digunakan di fungsi manapun
    static int jumlahPendaftar = 0;

    //Inisialisasi array rekap data untuk wadah menyimpan nilai inputan
    // Diinisialisasi 500 karena kemungkinan jumlah mahasiswa bisa mencapai 500 (tidak disebutkan di soal bahwa input mahasiswa dinamis)
    static String[][] rekapDataMhs = new String[500][6];

    //Fungsi 1 bertipe void karena tidak mengembalikan nilai
    //Fungsi ini digunakan untuk menginput data mahasiswa
    static void inputDataMhs() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa : ");
        String namaMhs = sc.nextLine();
        rekapDataMhs[jumlahPendaftar][0] = namaMhs;
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        rekapDataMhs[jumlahPendaftar][1] = nim;
        System.out.print("Program Studi : ");
        String programStudi = sc.nextLine();
        rekapDataMhs[jumlahPendaftar][2] = programStudi;
        System.out.print("Perusahaan Tujuan Magang : ");
        String perusahaanMagang = sc.nextLine();
        rekapDataMhs[jumlahPendaftar][3] = perusahaanMagang;

        //Validasi input semester
        while (true) {
            System.out.print("Semester Pengambilan Magang (6 atau 7): ");
            String semesterMagang = sc.nextLine();
                if (semesterMagang.equals("6") || semesterMagang.equals("7")) {
                    break;
                } else {
                    System.out.println("Semester yang dapat mendaftar hanya Semester 6 dan 7!");
                }
            rekapDataMhs[jumlahPendaftar][4] = semesterMagang;
        }

        //Validasi input Status
        while (true) {
            System.out.print("Status Magang (Diterima/Menunggu/Ditolak): ");
            String statusMagang = sc.nextLine();
                if (statusMagang.equalsIgnoreCase("Diterima") || statusMagang.equalsIgnoreCase("Menunggu") || statusMagang.equalsIgnoreCase("Ditolak")) {
                    break;
                } else {
                }
            rekapDataMhs[jumlahPendaftar][5] = statusMagang;
        }

        //Jumlah pendaftar increament yang berarti input mahasiswa bertambah satu
        jumlahPendaftar++;
        sc.close();
    }

    //Fungsi 2 juga menggunakan void karena tidak mengembalikan data apapun
    //Fungsi ini digunakan untuk menampilkan data yang sudah diinput sebelumnya
    static void tampilData() {
        //Variabel string formatMenu digunakan agar format lebih rapi saat digunakan kembali, danmengunakan print format agar tabel terlihat rapi.
        String formatMenu = "%-5s %-30s %-15s %-25s %-30s %-20s %-20s%n";
        System.out.printf(formatMenu, "NO", "NAMA", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

        //Perulangan untuk menampilkan data mahasiswa sesuai urutan hingga jumlah mahasiswa yang mendaftar
        for (int i = 0; i < jumlahPendaftar; i++) {
            System.out.printf(formatMenu, (i + 1), rekapDataMhs[i][0], rekapDataMhs[i][1], rekapDataMhs[i][2], rekapDataMhs[i][3], rekapDataMhs[i][4], rekapDataMhs[i][5]);
        }
    }

    //Fungsi 3 juga bertipe void karena tidak mengembalikan data apapun
    //Fungsi ini digunakan untuk mencari daftar mahasiswa yang sudah mendaftar berdasarkan prodi
    static void cariProdi() {
        Scanner sc = new Scanner(System.in);
        //Agar nomor urut berurutan dan tidak mengikuti perulangan
        int nomorUrut = 1;

        System.out.print("Masukkan Program Studi : ");
        String programStudi = sc.nextLine();

        String formatMenu = "%-5s %-30s %-15s %-25s %-30s %-20s %-20s%n";
        System.out.printf(formatMenu, "NO", "NAMA", "NIM", "Prodi", "Perusahaan", "Semester", "Status");

        for (int i = 0; i < jumlahPendaftar; i++) {
            if (rekapDataMhs[i][2].equalsIgnoreCase(programStudi)) {
                System.out.printf(formatMenu, nomorUrut, rekapDataMhs[i][0], rekapDataMhs[i][1], rekapDataMhs[i][2], rekapDataMhs[i][3], rekapDataMhs[i][4], rekapDataMhs[i][5]);
                nomorUrut++;
            }
        }
        sc.close();

    }

    //Fungsi 4 juga bertipe void karena tidak mengembalikan nilai
    //Fungsi ini digunakan untuk menghitung total status mahasiswa yang mendaftar magang
    static void hasilStatus() {
        int jmlDiterima = 0;
        int jmlMenunggu = 0;
        int jmlDitolak = 0;

        for (int i = 0; i < jumlahPendaftar; i++) {
            //Menggunakan kolom 5 karena di fungsi 1, input status berada di kolom 5
            if (rekapDataMhs[i][5].equalsIgnoreCase("Diterima")) {
                jmlDiterima++;
            } else if (rekapDataMhs[i][5].equalsIgnoreCase("Menunggu")) {
                jmlMenunggu++;
            } else {
                jmlDitolak++;
            }
        }

        System.out.println("Diterima : " + jmlDiterima);
        System.out.println("Menunggu : " + jmlMenunggu);
        System.out.println("Ditolak  : " + jmlDitolak);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Perulangan menu
        while (true) {
        System.out.println("\n=== Sistem Pendaftaran Magang Mahasiswa ===");
        System.out.println("1. Tambah Data Magang");
        System.out.println("2. Tampilkan Semua Pendaftar Magang");
        System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
        System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5) : ");
        int menuDipilih = sc.nextInt();

        if (menuDipilih == 1) {
            inputDataMhs();
            System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar : " + jumlahPendaftar);
        }
        else if (menuDipilih == 2) {
            tampilData();
        }
        else if (menuDipilih == 3) {
            cariProdi();
        }
        else if (menuDipilih == 4) {
            hasilStatus();
        }
        //Jika memilih menu 5 maka akan keluar dari perulangan menu
        else if (menuDipilih == 5) {
            System.out.println("Terimakasih sudah menggunakan layanan kami!");
            break;
        } 
        else {
            System.out.println("Masukkan nomor yang ada di dalam daftar!");
            continue;
        }

        }
        sc.close();
        
    }
    
}
