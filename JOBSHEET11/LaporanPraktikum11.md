# LAPORAN PRAKTIKUM JOBSHEET 7

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## 2.1 Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi

### **Pertanyaan**
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
2. Mengapa terdapat null pada daftar nama penonton?
3. Jelaskan fungsi dari penonton.length dan penonton[0].length! Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
4. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
5. Berapa indeks baris maksimal untuk array penonton?
6. Berapa indeks kolom maksimal untuk array penonton?
7. Apa fungsi dari String.join()?

### **Jawaban**
1. Pengisian elemen array tidak harus dilakukan urut mulai indeks ke-0, elemen array bisa diisi sesuai keinginan dengan contoh instansiasi *penonton[3][1] = "Hana";* hal ini berarti String Hana akan terisi pada baris 3 kolom 1, tidak harus selalu dari 0.
2. Terdapat null pada daftar penonton karena output mendeklarasikan untuk menampilkan penonton pada baris ke-3 dan kolom ke-1, sementara pada saat instasiasi pada baris dan kolom tersebut belum dimasukkan data apapun. Maka pada saat output program akan otomatis mengeluarkan output null.
3. Fungsi dari :
- penonton.length : kode program ini bertujuan untuk mendeklarasikan ukuran baris array penonton.
- penonton[0].length : kode program ini bertujuan untuk mendeklarasikan ukuran kolom array penonton. Pada konteks ini maka akan mendeklarasikan ukuran kolom pada baris indeks ke-0 array penonton.
- penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama karena dari awal sudah di instasiasi bahwa panjang kolom adalah 2. Sehingga output dari semua kode program tersebut adalah sama, yaitu 2.
4. Kekurangan dari foreach adalah struktur ini adalah kita tidak bisa menghapus atau menambah elemen, selain itu juga tidak bisa mengetahui posisi elemen juga melakukan operasi berdasarkan indeks tertentu. Kelebihan dari menggunakan foreach adalah lebih ringkas daripada struktur for, kelebihan lainnya yaitu kita tidak mengelola indeks secara manual sehingga menghindari error outofbounds.
5. Indeks baris maksimal untuk array penonton adalah 4.
6. Indeks kolom maksimal untuk array penonton adalah 2.
7. String.join() digunakan untuk menggabungkan elemen-elemen teks untuk dijadikan satu String dengan pemisah (delimeter) tertentu.

## 2.2 Percobaan 2: Memanfaatkan Scanner dan Perulangan untuk Input dan Output pada Array 2 Dimensi

### **Pertanyaan**
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
- Menu 1: Input data penonton
- Menu 2: Tampilkan daftar penonton
- Menu 3: Exit
3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali
5. Pada menu 2, jika kursi kosong, ganti null dengan ***

### **Jawaban**
1. Pengisian elemen array dari scanner tidak harus selalu dari indeks 0, dalam konteks kode program diatas, terdapat kode program 
```
penonton[baris-1][kolom-1] = nama;
```
yang dimana kita menginput nama sesuai dengan baris dan kolom yang kita inginkan.

2. Modifikasi dilakukan dengan cara menambahkan perulangan dengan opsi Menu 1, 2 dan 3. 
```
while (true) {
        System.out.println("\n============== PILIH MENU ==============");
        System.out.println("Menu 1 : Input data penonton");
        System.out.println("Menu 2 : Lihat data penonton");
        System.out.println("Menu 3 : Exit");
        System.out.print("Masukkan menu yang ingin dipilih : ");
        menu = sc.nextInt();
        sc.nextLine();
}
```
3. Modifikasi dilakukan dengan menambahkan if-else pada input baris dan kolom agar menginput yang ada pada rentang baris dan kolom saja.
```
while (true) {
            System.out.print("Masukkan baris (1-4) : ");
            baris = sc.nextInt();
            //Modifikasi 3
            if (baris < 1 || baris > 4) {
                System.out.println("Masukkan baris sesuai rentang yang ada!");
                continue;
            }
            System.out.print("Masukkan kolom (1-2) : ");
            kolom = sc.nextInt();
            //Modifikasi 3
            if (kolom < 1 || kolom > 2) {
                System.out.println("Masukkan kolom sesuai rentang yang ada!");
                continue;
            }
}
```
4. Modifikasi dilakukan dengan cara menambahkan if-else lagi setelah pengisian baris dan kolom. Jika pada baris dan kolom bernilai selain null maka kursi sudah terisi, lalu ditambahkan sintaks continue agar kembali ke perulangan yang meminta input baris dan kolom lainnya. Jika baris dan kolom bernilai null maka program agak menjalankan break dan lanjut ke perulangan selanjutnya.
```
if (penonton[baris-1][kolom-1] != null) {
                System.out.println("Kursi sudah terpenuhi. Pilih kursi lainnya!");
            } else {
                penonton[baris-1][kolom-1] = nama;
                break;
            }
```
5. Modifikasi ini dilakukan dengan menambah struktur if-else dan mengganti kondisinya jika penonton tidak sama dengan null akan memberi tahu bahwa kursi sudah terisi, dan else dengan *** yang berarti kursi belum terisi.
```
if (penonton[i][j] != null) {
                        System.out.println("Baris " + (i+1) + " dan Kolom " + (j+1) + " Sudah terisi.");
                    } else {
                        System.out.println("***");
                    }
```

## 2.3 Percobaan 3: Array 2 Dimensi dengan Length Baris Berbeda

### **Pertanyaan**
1. Apa fungsi dari Arrays.toString()?
2. Apa nilai default untuk elemen pada array dengan tipe data int?
3. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?

### **Jawaban**
1. Fungsi dari Arrays.toString() adalah agar program dapat mengubah sebuah array menjadi sebuah string yang dapat dibaca manusia. Karena pada saat output dari array 2D ke array 1D biasanya akan menghasilkan output seperti I@7ad041f3, untuk mencegah hal tersebut dapat menggunakan Arrays.toString().
2. Nilai default untuk elemen pada tipe data int adalah 0 jika array belum diisi dengan nilai apapun.
3. Setelah diintasiasi, panjang baris array tidak dapat diubah atau dimodifikasi. Tetapi, panjang kolom array masih dapat dimodifikasi setelah diinstasiasi.

## 2.4 Percobaan 4: Studi Kasus SIAKAD

### **Pertanyaan**
1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis.

### **Jawaban**
1. Modifikasi dilakukan dengan menambahkan input jumlah mahasiswa dan jumlah matkul lalu mengganti beberapa vartiabel menyesuaikan dengan kode yang diperlukan. Jika pda kode sebelumya diisi 4 atau 3 (jumlah mahasiswa dan matkul sebelumnya), maka pda modifikasi ini diganti dengan variabel jmlMahasiswa dan jmlMatkul.
```
System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = sc.nextInt();

        System.out.print("\nMasukkan jumlah mata kuliah : ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();
```


## TUGAS
1. Implementasikan flowchart yang telah dibuat pada latihan Dasar Pemrograman (Teori) ke dalam kode program Java. <br>
**Terdapat pada file *Tugas1.java* di folder yang sama.**

