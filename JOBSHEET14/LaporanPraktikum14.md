# LAPORAN PRAKTIKUM JOBSHEET 7

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## 2.1 Percobaan 1

### **Pertanyaan**
1. Apa yang dimaksud dengan fungsi rekursif?
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

### **Jawaban**
1. Fungsi rekursif adalah sebuah fungsi yang memanggil dirinya sendiri. Sehingga, proses fungsi ini terjadi secara berulang-ulang.
2. Ya, hasil yang diberikan oleh kedua fungsi sama. 
    - Pada fungsi rekursif proram berjalan dengan struktur pemilihan dimana jika n bernilai 0 maka akan mengembalikan nilai 1. Jika tidak, maka akan menjalankan perintah :
    ```
    return (n * faktorialRekursif(n - 1));
    ```
    dimana fungsi akan memanggil dirinya sendiri untuk menyelesaikan perintah/mengembalikan nilai. Semisal diberi angka 5, maka program akan menjalankan 
    ```
    5 * faktorialRekursif(4);
    ```
    Karena nilai faktorialRekursif belum diketahui maka akan kembali ke fungsinya sendiri yaitu :
    ```
    4 * faktorialRekursif(3) 
    ```
    Program akan terus berjalan seperti itu hingga n bernilai 0, karena jika n bernilai 0 akan mengembalikan nilai 1. Fungsi akan menjadi :
    ```
    1 * faktorialRekursif(0);
    = 1 * 1 = 1.

    //Lalu penghitungan dilakukan keatas, fungsi sebelumnya yaitu :
    2 * faktorialRekursif(1) 
    = 2 * 1 = 2
    // Maka nilai faktorialRekursif(2) adalah 2. Dan seterusnya keatas.
    ```
    -  Pada fungsi iteratif dideklarasikan terlebih dahulu nilai faktor yaitu 1. Lalu membuat struktur for yang memili nilai i = n dengan kondisi i lebih dari sama dengan 1, dan diberlakukan *increament*. Didalam perulangan diberi statement nilai :
    ```
    faktor = faktor * i;
    ```
    Perulangan akan terus dilakukan hingga nilai i lebih dari nilai n yang diinput. Lalu fungsi mengembalikan nilai dari variabel faktor.

### **Pertanyaan**
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32

### **Jawaban**
1. Pemanggilan fungsi akan terus berjalan hingga nilai y mencapai angka 0. Jika nilai variabel y sudah mencapai angka 0 maka fungsi akan mengembalikan angka 1 dan bisa lanjut menghitung fungsi-fungsi sebelumnya sehingga fungsi akan berhenti dipanggil kembali.
2. Program dimodifikasi dengan cara :
    ```
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return (1);
        } else {
            System.out.print(x + " x ");
            return (x * hitungPangkat(x, y - 1));
        }
    }

    int hasil = (hitungPangkat(bilangan, pangkat));
    System.out.println(" = " + hasil);
    ```
    Sehingga output yang dihasilkan akan beserta deretnya.

## 2.3 Percobaan 3

### **Pertanyaan**

1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)

### **Jawaban**
1. - Blok kode program base call :
    ```
    if (tahun == 0) {
            return (saldo);
        }
    ```
    - Blok kode program recursion call :
    ```
    else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    ```
2. Fase ekspansi pada percobaan ketiga :
    ```
    1.11 * hitungLaba(100000, 2); //Tahun ke-3
    1.11 * hitungLaba(100000, 1); //Tahun ke-2
    return 100000; //Tahun ke 1
    ```
    Fase subtitusi pada percobaan ketiga :
    ```
    1.11 * 100000; //Tahun ke-1
    1.11 * 111000; //Tahun ke-2
    1.11 * 123210; //Tahun ke-3
    = 136763,1
    ```

## TUGAS
1. **Terdapat pada file *Tugas1.java* di folder yang sama.** <br>
<img width="950" height="306" alt="Screenshot 2025-12-03 221538" src="https://github.com/user-attachments/assets/c50308fd-9f00-4b2e-9140-733b35cae112" />

