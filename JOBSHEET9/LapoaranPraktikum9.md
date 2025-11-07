# LAPORAN PRAKTIKUM JOBSHEET 7

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## 2.1 Percobaan 1: Mengisi Elemen Array

### **Pertanyaan**
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
2. Ubah statement pada langkah No 4 menjadi seperti berikut
```
for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
```
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
3. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

### **Jawaban**
1. Maka akan terjadi error karena bilangan yang terdapat di dalam array diluar jangkauan tipe data yag digunakan, dalam konteks ini adalah tipe data int yang digunakan.
2. Output dari kode program tersebut adalah bilangan yang berada di dalam array mulai awal hingga akhir. Statement yang diberikan adalah cara lebih efektf untuk mendeklarasikan output dari sebuah array dengan menggunakkan struktur for (perulangan).
3. Maka program tetap akan memberikan output hingga array ke 3 (karena dimulai dari 0) dan akan mendeklarasikan terjadi error *out of bounds* karena perulangan terjadi sebanyak 5 kali sementara bilangan di dalam array hanya ada 4.

## 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD - Meminta Inputan Pengguna untuk Mengisi Elemen Array

### **Pertanyaan**
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini :
```
        for (int i=0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+ i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
```
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
```
for (int i = 0; i < nilaiAkhir.length; i++) 
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            }
```

### Jawaban 
1. Tidak terjadi perubahan karena banyaknya nilai di dalam array nilaiAkhir adalah 10, sama seperti kondisi sebelumnya.
2. Kondisi tersebut berarti i lebih kecil daripada banyaknya nilai yang berada di dalam array nilaiAkhir. Disini berarti perulagan akan terus berlanjut hingga i tidak melebihi nilai array nilaiAkhir.
3. Program tersbeut akan mendeteksi mana saja nilai yang diatas 70 dan akan langsung mencetak output bahwa mahasiswa tersebut lulus.

## 2.3 Percobaan 3: Studi Kasus Nilai Mahasiswa di SIAKAD - Melakukan Operasi Aritmatika terhadap Elemen Array

### Pertanyaan 
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)sehingga program menerima jumlah elemen berdasarkan input dari pengguna

### Jawaban 
1. Kode program ditambahkan struktr if agar bisa memilahmahasiswa yang mendapat nilai mahasiswa yang lebih dari 70, seperti : 
```
if (nilaiMhs[i] > 70) {
                mhsLulus++;
        }
```
Setiap mahasiswa yang memiliki nilai diatas 70 akan menambah nilai pada variabel mhsLulus sehingga dapat menghasilkan banyaknya mahasiswa yang lulus.
2. Modifikasi terdapat pada kode program bagian :
```
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
```
Sehingga nanti inputan user akan masuk ke panjang elemen dari variabel nilaiMhs.

## 2.4 Percobaan 4: Searching

### Pertanyaan 
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari.
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array.

### Jawaban 
1. Staement *break* bermaksud untuk menghentikan perulangan (pencarian angka key) saat angka yang diinput (key) sudah sama dengan nilai dan ada di dalam array.
2. Untuk menerima input banyaknya elemen dilakukan modifikasi mode :
```
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlahNilai = sc.nextInt();
```
Untuk menerima input nilai dan nilai yang dicari adalah :
```
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
            System.out.println(arrNilai[i]);
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();
```
Tipe data variabel juga diberi inisialisasi = 0;.

## TUGAS
1. Kode program terdapat di folder yang sama dengan nama file ***Tugas1.java***. Output yang dihasilkan dari kode program ini adalah : 

2. Kode program terdapat di folder yang sama dengan nama file ***Tugas2.java***. Output yang dihasilkan dari kode program ini adalah :

3. Kode program terdapat di folder yang sama dengan nama file ***Tugas3.java***. Output yang dihasilkan dari kode program ini adalah :