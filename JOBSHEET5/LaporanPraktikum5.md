# LAPORAN PRAKTIKUM JOBSHEET 5

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## 2.1 Percobaan 1: Penerapan IF dan IF-ELSE untuk Mencetak KRS

### **Pertanyaan**
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi
program tersebut dengan menambahkan struktur ELSE!

### **Jawaban**
1. Karena dengan tipe data boolean saja sudah cukup untuk membuktikan bahwa data yang akan digunakan bisa bernilai true atau false. Sehingga tidak memerlukan menggunakan operasi relasi.
2. Maka program akan berhenti pada saat kita menginput jumlah KRS, karena tidak terdapat struktur *else* yang dapat digunakan untuk memberi informasi pada saat nilainya bernilai false.
3. Berikut merupakan kode program pada saat menambahkan struktur *ELSE*
   <img width="1483" height="998" alt="Screenshot 2025-10-07 140953" src="https://github.com/user-attachments/assets/099ad9c6-c54f-46ac-ab03-079f07b8b1a3" />


## 2.2. Percobaan 2: SWITCH-CASE untuk Mencetak KRS

### **Pertanyaan**
1. Apa fungsi dari sintaks break?
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil
transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah dibuat ke dalam bentuk IF-ELSE IF-ELSE.

### **Jawaban**
1. Sintaks ***break*** berguna untuk menghentikan program untuk lanjut ke *case* berikutnya setelah *case* yang diinginkan telah terpenuhi.
2. Sintaks ***default*** pada *switch-case* berperan sama dengan *else* pada *if-else*, dimana default berfungsi pada saat tidak ada kondisi yang sesuai dengan semua *case* yang ada.
3. File terdapat di folder yang sama (Folder Jobsheet 5 dengan nama file **ifElseCetakKRS27.java**)

## 2.3. Percobaan 3: Nested IF untuk Mengecek Syarat Ujian Skripsi

### **Pertanyaan**
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
2. Jelaskan maksud dari potongan kode berikut!
> if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {}
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir Jelaskan secara runtut untuk semua kondisi!

### **Jawaban**
1. Saat memasukkan kata "No" pada input bebasKompen maka program akan berjalan sama seperti kita memasukkan kata "Tidak" atau bisa dikatakan data menjadi bernilai false dan masuk kondisi else, karena tidak sesuai dengan kondisi yang ada di if.
2. Kode tersebut bermaksud jika nilai bimbingan Pembimbing 1 bernilai lebih dari sama dengan 8 dan bimbingan pembimbing 2 bernilai lebih dari sama dengan 4 maka nilai akan bernilai benar dan sebaliknya. Jika nilai tidak sesuai dengan kondisi yang baru saja dijabarkan maka nilai akan bernilai false dan lanjut ke kondisi selanjutnya hingga else.
3. Pertama, sistem memastikan bahwa mahasiswa sudah bebas kompen atau belum dengan cara mahasiswa dapat menginput antara ya dan tidak. Selanjutnya, mahasiswa memasukkan jumlah log bimbingan pada pembimbing 1 dan pembimbing 2. Lalu, digunakan struktur nested-if untuk menyeleksi data yang diinput oleh mahasiswa. Jika awalnya mahasiswa menginput "Tidak" pada variabel bebas kompen maka akan langsung dikategorikan false sehingga akan keluar tulisan "Gagal! Mahasiswa masih memiliki tanggungan kompen". Sementara jika mahasiswa menginput "Ya" pada variabel bebasKompen maka akan melanjutkan ke seleksi berikutnya yaitu jumlah log pembimbing 1 dan 2. Saat jumlah pembimbing 1 kurang dari 8 dan pembimbing 2 kurang dari 4 maka akan menampilkan tulisan "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali". Saat hanya jumlah pembimbing satu yang kurang dari 8 maka akan menampilkan tulisan "Gagal Log bimbingan P1 belum mencapai 8 kali". Dan yang terakhir, saat semua kondisi tidak memenuhi pada jumlah bimbingan maka akan menampilkan tulisan "Gagal Log bimbingan P2 belum mencapai 4 kali" karena hanya sisa pengkondisian untuk jika hanya memenuhi bimbingan pembimbing 2 saja. 

