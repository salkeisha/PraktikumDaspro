# LAPORAN PRAKTIKUM JOBSHEET 7

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## 2.1 Percobaan 1: Review Perulangan 1

### **Pertanyaan**
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?
2. Jika pada perulangan for, kondisi i<=n diubah menjadi i < n bagaimana bentuk outputnya jika input n = 5? Mengapa hasilnya berbeda?
3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian? 
4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?
5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut?

### **Jawaban**
1. Jika inisialisasi i=1 diubah menjadi i=0 maka output yang keluar akan lebih satu dari input yang dimasukkan. Perulangan terjadi lebih dari input yang diberikan karena angka dimulai dari 0 bukan dari 1.
2. Jika kondisi diubah menjadi i <= n diubah menjadi i < n dan diberi n = 5 maka output yang dihasilkan akan berjumlah 4 (kurang 1 dari input yang diberikan), karena saat mencapai angka 5 perulangan berhenti, karena tidak sesuai dengan kondisi yang diberikan.
3. Jika kondisi i <= n diubah menjadi i > n maka perulangan akan terus berjalan hingga maksimal bit yang bisa tipe data tersebut tampung.
4. Jika pada kondisi step i++ diubah menjadi i--, maka perulangan tetap akan terus berjalan hingga maksimal bit yang bisa ditampung tipe data tersebut. Hal ini karena kondsi i <= n tetap dan nilai i terus berkurang dengan perintah i--, sehingga nilai i akan terus kurang dari n yang membuat kondisi terus benar dan perulangan terus berlanjut.
5. Jika step i++ diubah menjadi i += 2 maka output yang dhiasilkan hanya 3 (jika n = 6) karena jika i = 1 dtiambah 2 hasilnya menjadi 3, lalu 3 ditambah 2 menjadi 5, dan 5 ditambah 2 hasilnya 7 dan perulangan akan berhenti. Output hanya akan tercetak sebanyak 3 kali karena kondisi i < n sehingga i harus kurang dari 6. Maka saat hasil i menjadi 7, peerulangan akan berhenti dan output hanya terulang 3 kali.

## 2.2 Percobaan 2: Bintang Persegi

### **Pertanyaan**
1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian? 
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian? 
3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya? 
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?

### **Jawaban**
1. Jika inisialisasi iOuter=1 diubah menjadi iOuter=0, maka perulangan baris yang terjadi terjadi lebih 1 dari input yang diberikan dab perulangan kolom akan sesuai dengan input yang diberikan.
2. Jika inisialisasi i=1 diubah menjadi i=0 maka perulangan pada kolom akan bertambah 1 karena hitungan dimulai dari 0. Sementara perulangan pada baris akan tetap sesuai dengan input yang diberikan.
3. Perulangan luar akan mengulangan disaat perulangan yang berada di dalam sudah selesai dalam perulangannya (sudah sesuai dengan kondisinya), jika kondisi perulangan dalam selesai maka akan dilanjutkan dengan perulanganuar dan dimasukkan ke perulangan dalam lagi hingga kondisi perulangan luar terpenuhi.
4. Perlu ditambahkan sintaks System.out.println(); agar saat kondisi perulangan dalam sudah selesai, sebelum kembali ke perulangan luar akan ditambahkan di baris baru dan baru mengoperasikan perulangan luar.

## 2.3 Percobaan 3: Bintang Segitiga

### **Pertanyaan**
1. Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan berikut?
```
*
**
***
****
*****
```
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.
3. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?

### **Jawaban**
1. Tidak, output yang ditampilkan adalah satu garis lurus.
2. Perlu menambahkan sintaks ***System.out.println();*** agar dapat mengubah baris setiap perulangan yang dilakukan. Kode program menjadi :
```
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 0;
        while (i<=n) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        } 
        sc.close();
```
3.  Peran variabel i adalah sebagai outer loop yang mengatur berapa baris yang akan dioutputkan. Sementara variabel j berperan sebagi inner loop yang mengeluarkan berapa yang dikeluarkan pada setiap baris (sebagai output kolom). Dalam konteks kode program tersbeut, j berperan untuk output * setiap baris. Nilai j di reset kembali ke 0 setiap iterasi outer loop agar nilai j kembali ke 0 dan dapat mencetak jumlah * dengan sesuai. Jika j tidak di rest kembali menjadi 0, maka output yang keluar dapat berbeda dari yang diharapkan.

## 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

### **Pertanyaan**
1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar.
2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut.

### **Jawaban**
1. Varaiable totalNilai nilainya kembali menjadi 0 di setiap iterasi outer loop karena setiap memasuki inner loop, totalNilai harus bernilai 0 agar input nilai sebelumnya tidak ikut terhitung kedalam operasinya. Posisi variabel totalNilai berada di outer loop karena agar terus mengulang saat memasuki inner loop tetapi tetap menyimpan data nilai di semua tahap perulangan. Jika posisi variable totalNilai berada di luar maka saat menjumlah total nilai setelah kelompok 1 akan terus bertamabah bukan hanya menjumlah nilai yang berada di kelompoknya
2. Program dimodifikasi dengan menambahkan struktur : 
```
            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelompokTertinggi = i;
            }
```
Variabel tertinggi diinisialisasi dengan 0, sehingga jika rataNilai lebih dari 0 akan masuk ke variabel tertinggi, jika kondisi tersebut true juga akan memasukkan i (pada saat kondisi true dimana nilaiRata lebih besar daripada tertinggi) kedalam variabel kelompokTertinggi agar dapat menghasilkan output kelompok yang mendapat rata-rata nilai tertiggi.

## TUGAS 
1. Kode program terdapat pada file bernama Tugas1.java, output yang dihasilkan adalah sebagi berikut :
   <img width="996" height="148" alt="Screenshot 2025-10-29 121142" src="https://github.com/user-attachments/assets/edb90ed8-75be-4cc3-b9fa-df8e6020be3b" />

2. Kode program terdapat pada file bernama Tugas2.java, output yang dihasilkan adalah sebagi berikut : <br>
   <img width="827" height="299" alt="Screenshot 2025-10-29 121214" src="https://github.com/user-attachments/assets/74ed9eb9-dfab-4d8f-a588-f8279051b959" />


3. Kode program terdapat pada file bernama Tugas3.java, output yang dihasilkan adalah sebagi berikut : <br>
   <img width="632" height="437" alt="Screenshot 2025-10-29 121254" src="https://github.com/user-attachments/assets/18ca0554-d789-49f5-b150-ce3abe77dc54" />
