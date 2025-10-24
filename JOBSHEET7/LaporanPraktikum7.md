# LAPORAN PRAKTIKUM JOBSHEET 7

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR

### **Pertanyaan**
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
```
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
     terendah = nilai;
}
```
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!

### **Jawaban**
1. Komponen perulangan FOR pada kode program tersebut :
-  ***int i***   : inisialisasi, untuk menetapkan variabel pengontrol pada perulangan.
- ***i <= 10***  : kondisi, suatu syarat untuk menetapkan kapan perulangan harus berhenti.
- ***i++***      : update, perubahan nilai variabel counter pada setiap perulangan, dalam bentuk increament atau decreament.
- ***{ }***      : statements/blok eksekusi, sebagai perintah yang akan dijalankan selama perulangan berlangsung.
2. Variabel teringgi diinisialisasi sebagi 0 karena diasumsikan tidak ada nilai yang lebih kecil dari 0, sehingga jika menginput nilai yang diatas 0, inisialisasi 0 tadi akan teganti menjadi nilai yang diinput. Begitu juga dengan inisialisasi nilai terendah yaitu 100, karena tidak ada nilai yang ada diatas 100, sehinga nilai yang diinput akan langsung mengganti ke nilai yang ada dibawah 100. Jika inisialisasi terbalik, maka dapat menyebabkan tertinggi tetap pada angka 100 dan terendah tetap pada angka 0. Karena nilai yang diinput lebih kecil/besar daripada inisialisasi yang diberikan.
3. Fungsi dari kode tersebut adalah untuk menetapkan nilai terendah dan tertinggi dari semua inputan nilai. Alur kerja dari kode program tersebut adalah dengan memastikan kondisi variabel nilai, jika variabel nilai lebih besar dari variabel tertinggi maka akan mengganti nilai variabel tertinggi. Begitu juga dengan variabel terendah, jika variabel nilai lebih kecil dibanding variabel terendah maka akan otomatis mengganti nilai dari variabel terendah. 
4. Setelah dimodifikasi :
<img width="897" height="706" alt="Screenshot 2025-10-24 142744" src="https://github.com/user-attachments/assets/dc016184-4402-4f17-9bf7-8b3715ddbbc1" />

## 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan WHILE

### **Pertanyaan**
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
```
 if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
    continue; }
```
a. nilai < 0 || nilai > 100 <br>
b. continue <br>
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!

### **Jawaban**
1. a. Sintaks tersebut menggunakan operasi logika or (atau) sehingga jika nilai bernilai kurang dari 0 **atau** nilai lebih dari 100, program akan mengeksekusi statements didalamnya.
b. Sintaks continue berarti program akan melewatkan (skip) struktur program selanjutnya dan melanjutkan perulangan kembali pada kondisi tertentu.
2. Sintaks i++ dituliskan diakhir agar seluruh isi perulangan dijalanka terlebih dahulu sebelum akhirnya nilai i bertambah (untuk melakukan perulangan). Jika sintaks i++ diletakkan diawal maka dapat menyebabkan nilai awal terlewatkan karena nilai i sudah ditambah terlebih dahulu sebelum program menjalankan isi perulangan. <br>
3. Perulangan while yang akan terjadi adalah sebanyak 19 kali karena kondisi kode program diatas adalah i < jml, maka jika jumlah mahasiswa sebanyak 19 perulangan akan terjadi sebanyak 19 kali (denan adanya sintaks increament yang menambah i selama perulangan berlangsung), pada saat perulangan ke 19, while tidak akan berlanjut karena nilainya tidak dibawah jumlah mahasiswa. <br>
4. Setelah dimodifikasi :
<img width="547" height="280" alt="Screenshot 2025-10-24 145549" src="https://github.com/user-attachments/assets/a3bfec1a-1751-4f08-a477-e9c812ec8199" />

Output yang dihasilkan  : <br>
<img width="532" height="89" alt="Screenshot 2025-10-24 145540" src="https://github.com/user-attachments/assets/2c0c2681-5049-4f1b-8a2e-95f8f45c803e" />


## 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe – Perulangan DO-WHILE

### **Pertanyaan**
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?

### **Jawaban**
1. Jika nama pelanggan yang dimasukkan pertama kali adalah 'batal' maka perulangan akan tetap berjalan **sekali**, sebelum akhirnya mengeksekusi sintaks break yang menghentikan perulangan.
2. Kondisi berhenti yang digunakan adalah dengan menginput nama pelanggan dengan 'batal' yang akhirnya meneksekusi sintaks break dan menghentikan perulangan pada kode program.
3. Fungsi dari penggunaan nilai true adalah untuk melanjutkan perulangan secara terus menerus, sampai akhirnya berhenati dengan suatu sintaks yang terdapat di dalam blok do. Pada kode program ini, program akan berhenti pada saat menginput nama pelanggan dengan 'batal' dengan begitu akan menjalankan sintaks break dan menghentikan peruangan.
4. Program tetap berjalan karena komponen inisialisasi dan update merupakan hal yang opsional. Pada kode program ini sudah jelas bahwa jika kondisinya true maka kode program akan terus mengulang, sehingga tidak perlu menambahkan inisialisasi dan update kedalamnya. Program juga akan berhenti dengan sintaks break yang berada di dalam blok do.

## TUGAS 
1. Kode program terdapat pada file bernama tugas1.java, output yang dihasilkan adalah sebagi berikut :
<img width="559" height="140" alt="Screenshot 2025-10-24 224036" src="https://github.com/user-attachments/assets/5a4ea4a4-7d96-4b46-9fac-6d9885d54a57" />


2. Kode program terdapat pada file bernama tugas2.java, output yang dihasilkan adalah sebagi berikut :
<img width="742" height="247" alt="Screenshot 2025-10-24 161238" src="https://github.com/user-attachments/assets/625321b3-15ed-48c6-bb60-4e40c4d04a40" />

