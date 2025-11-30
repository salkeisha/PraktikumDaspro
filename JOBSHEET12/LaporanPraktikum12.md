# LAPORAN PRAKTIKUM JOBSHEET 7

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## 2.1 Percobaan 1: Membuat Fungsi Tanpa Parameter

### **Pertanyaan**
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).

### **Jawaban**
1. Tidak, karena fungsi parameter adalah berkaitan dengan input yang diberikan. Sebuah fungsi bisa saja tidak menggunakan parameter dan tidak bertipe void. Semua tergantung dibutuhkan atau tidaknya parameter tersebut dan juga perlu mengembalikan nilai atau tidak. Fungsi yang bertipe void tidak bisa mengembalikan nilai, sementara yang bertipe selain void dapat mengembalikan nilai. 
2. Daftar menu dapat ditampilkan tanpa menggunakan fungsi tetapi kodo program menjadi tidak efeisien. Modifikasi akan tampak seperti :
```
public static void main(String[] args) {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
}
```
Tampilan menu akan langsung dieksekusi di fungsi main dan tidak memanggil fungsi Menu();
3. Keuntungan menulis daftar menu pada fungsi Menu() adalah menjadi lebih tertata dan efisien daripada menulis langsung di fungsi main. Jika sudah membuat fungsi Menu() maka hanya perlu memanggil fungsinya jika diiperlukan, tidak perlu menulis ulang menu tersbeut. Kode yang tertulis di fungsi main juga terlihat lebih tertata.
4. Saat program dijalankan maka akan menjalanj=kan fungsi main terlebih dahulu. Didalam fungsi main, memeanggil fungsi Menu(), yang dimana program akan mengeksekusi kode program yang terdapat pada fungsi Menu(), dimana akan menampilkan output satu persatu yang terdapat pada fungsi Menu(). Setelah semua menu ditampilkan maka fungsi Menu() selesai serta tidak terdapat perintah lain di fungsi main maka program selesai dijalankan.

## 2.2 Percobaan 2: Membuat Fungsi Dengan Parameter

### **Pertanyaan**
1. Apakah kegunaan parameter di dalam fungsi?
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
3. Apakah parameter sama dengan variabel? Jelaskan.
4.  Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter Jelaskan alasan Anda.

### **Jawaban**
1. Kegunaan parameter didalam fungsi adalah untuk membuat fungsi bisa menerima input dari luar dan inoutan apa saja yang diperlukan didalam fungsi tersebut. Jika sebuah fungsi tidak menggunakan parameter maka fungsi tersebut tidak akan bisa menggunakan input dari luar fungsi tersebut.
2. Pada percobaan ini menggunakan parameter namaPelanggan dan isMember karena didalam fungsi tersebut memerlukan nama pelanggan dan keterangan member atau bukan. Nama pelanggan dan member atau bukannya pelanggan adalah input dari luar fungsi, maka perlu dijadikan parameter dalam fungsi Menu().
3. Pada dasarnya, memang parameter adalah variabel tetapi merupakan variabel yang khusus. Nilai dari parameter sendiri bukan diinput oleh pembuat program, melainkan didapatkan dari "pemanggil" yang memanggil fungsi tersebut. Parameter juga bertujuan sebagai penerima input dari luar sementara variabel untuk menyimpan suatu data.
4. Cara kerja parameter isMmeber adalah karena parameter bertipe data boolean maka parameter tersebut akan menerima input berupa true/false. Pada kode program tersebut dilakukan struktur pemilihan dimana jika isMember diinput true maka program akan menampilkan "Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!" dan jika isMember diinput false maka program tidak akan menampilkan apa-apa.
5. Maka kode program akan error dan tidak bisa dijalankan karena fungsi Menu() memerlukan input untuk parameter yang berada di dalam fungsi tersebut. Jika tidak diberikan input maka tidak parameter tidak ada isinya maka kode tidak dapat berjalan.
6. Modifikasi dilakukan dengan menambahkan struktur pemilihan didalam fungsi Menu() Seperti berikut :
```
if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%! dari kode promo anda");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Selamat anda mendapatkan diskon sebesar 30% dari kode promo anda");
        } else {
            System.out.println("Kode Invalid!");
        }
```
7. Modifikasi dilakukan dengan pemanggilan fungsi seperti berikut :
```
// Menu ("Budi", isMember, "DISKON30");
```
8. Menurut saya, iya. Penggunaan parameter didalam fungsi Menu() memudahkan saya dalam membuat sebuah kode program karena menjadi lebih efisien dan efektif. Saya hanya perlu membuat suatu fungsi dan memanggilnya saat diperlukan. Tidak perlu mendeklarasikannya secara berulang kali.

## 2.3 Percobaan 3: Membuat Fungsi dengan Nilai Kembalian

### **Pertanyaan**
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?

### **Jawaban**
1. - Suatu fungsi membutuhkan suatu nilai kembalian (return value) adalah saat nilai didalam fungsi tersebut akan digunakan kembali pada fungsi lainnya. Contoh pada percobaan ketiga adalah :
```
public static double hitungTotalHarga27(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        double hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;

        return hargaTotal;
    }
```
Dari kode program diatas terlihat bahwa fungsi tersebut mengembalikan variabel hargaTotal, hal ini bertujuan agar yang memanggil fungsi tersebut dapat mendapatkan hasil dari hargaTotal tersebut untuk ditunjukkan atau digunakan kembali untuk operasi lainnya.
- Suatu fungsi tidak membutuhkan nilai kembalian (return valuie) adalah saat nilai dalam fungsi terseut tidak mengembalikan nilai yang perlu digunakan dilur fungsi tersebut daat fungsi tersebut dipanggil. Contoh fungsi yang tidak membutuhkan nilai kembalian pada Percobaan 3 adalah :
```
public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
```
Fungsi diatas tidak mengembalikan nilai apa-apa, melainkan hanya menjalankan apa yang terdapat pada fungsi tersebut.
2. Tipe data nilai kembalian dari fungsi tersebut adalah int begitu juga dengan kedua parameter yang digunakan juga bertipe data int. Tipe data berupa int menyesuaikan dengan output yang dihasilkan. Karena pilihanMenu berperan sebagai menu yang dipesan (berupa bilangan bulat) dan jumlahPesanan berperan sebagai berapa banyak yang ingin dipesan (bilangan bulat juga), maka tipe data kembalian harus sama yaitu bertipe int. 
3. Modifikasi dilakukan dengan cara menambahkan struktur pemilihan jika pengguna menginputkan kode promo DISKON50 dan DISKON 30, seperti berikut : 
```
    public static double hitungTotalHarga27(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        double hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;

        //Modifikasi menerapkan diskon
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal = hargaTotal - (hargaTotal * 0.5);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 0.3);
        } else {
        }
        return hargaTotal;
    }
```
4. Modifikasi dilakukan dengan cara menambahkan struktur perulangan pada saat menginput pesanan, seperti berikut :
```
        double totalSemua = 0;
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            double totalHarga = hitungTotalHarga27(pilihanMenu, banyakItem, kodePromo);
            totalSemua += totalHarga;

            System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
            
            System.out.print("Apakah anda ingin memesan kembali? (true/false) ");
            String kelanjutanPesanan = sc2.nextLine();

            if (kelanjutanPesanan.equalsIgnoreCase("false")) {
                break;
            }

        }
        System.out.println("\nTotal harga untuk seluruh pesanan anda adalah : Rp" + totalSemua);
```
Dalam kode program diatas, program akan berhenti saat pengguna memasukkan input false dan tidak melanjutkan menanyakan pesanan yang ingin dipesan.

## 2.4 Percobaan 4: Fungsi Varargs

### **Pertanyaan**
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...namaPengunjung!
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?

### **Jawaban**
1. Parameter ditulis menggunakan ... karena parameter tersebut belum tau pasti berapa banyak nilai yang ingin dimasukkan didalam paramater. Penggunaannya hampir sama dengan array 1 dimensi, tetapi dalam penggunaan variabel argumen ini, saat dipanggil jauh lebih fleksibel, karena tidak perlu membuat array secara manual.
2. Modifikasi dilakukan dengan cara :
```
for (String tmp : namaPengunjung) {
        System.out.println("- " + tmp);
        }
```
3. Tidak bisa. Varargs hanya bisa dipakai sekali dan diletakkan dalam akhir urutan di paramater. Jika terdapat dua varargs maka program akan bingung dimana harus berhenti saat pemanggilan fungsi terjadi.
4. Program akan tetap berjalan walau tidak terdapat argumen didalamnya. Output hanya akan menjalankan *"daftar nama pengunjung"* dan tidak ada lanjutannya karena tidak dterdapat input yang diberikan kepada parameter varargs.

## 2.5 Percobaan 5: Pembuatan Kode Program, dengan Fungsi versus Tanpa Fungsi

### **Pertanyaan**
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
```
public class programKu27 {
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }

    public static int Jumlah (int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void TampilJumlah (int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1,bil2));
    }

    public static void main(String[] args) {
        int temp = Jumlah(1,1);
        TampilJumlah (temp, 5);
    }
}
```
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.

### **Jawaban**
1. Program akan berjalan dengan meeksekusi fungsi main terlebih dahulu. Lalu memasukkan input p, l, serta t. Setelah itu memanggil fungsi hitungLuas dengan parameter p dan l untuk menghitung L. Didalam fungsi hitungLuas akan menghitung Luas dengan cara mengalikan parameter (p dan l), lalu mengembalikan nilai Luas ke variabel L. Lanjut didalam fungsi main memanggil fungsi hitungVolume dengan parameter t, p, dan l. Didalam fungsi hitungVolume akan menghitung volume dengan menggunakan parameter t. p. dan l. Dalam fungsi ini untuk menghitung p * l dipanggil kembali fungsi hitungluas dengan parameter p dan l serta prosesnya sama seperti sebelumnya, tetapi nilai Luas dikembalikan ke dalam fungsi hitungVolume. Setelah itu diberlakukan operasi hitung yang ada di dalam fungsi lalu mengembalikan nilai volume ke variabel vol.
2. Maka output yang dihasilkan adalah :
```
Luas persegi panjang adalah 12
Volume balok adalah 180
```
Hal tersebut terjadi sesuai dengan penjelasan di nomor satu hanya saja variabel p, l, serta t diganti dengan angka 4, 3 serta 5. Lebih singkatnyta :
- Setelah memasukkan input 4, 3 dan 5 maka akan memanggil fungsi hitungLuas.
- Didalam hitungLuas terjadi operasi 4 x 3 = 12, nilai yang dihasilkan dikembalikan lalu deklarasi output.
- Lalu dipanggil fungsi hitungVolume dengan memanggil fungsi hitungLuas dengan hasil 12, maka terjadi operasi 12 x 5 = 180.
- Nilai dikembalikan ke pemanggil (variabel vol) lalu deklarasi output.
3. Output dari kode program tersebut adalah angka 1-7. Alur dari program tersebut adalah :
- Menjalankan fungsi main yang dimana int temp = Jumlah dengan parameter 1, 1
- Fungsi Jumlah dijalankan dengan mengembalikan nilai 1 + 1 = 2
- Nilai 2 dikembalikan ke fungsi main sehingga temp = 2
- Fungsi TampilJumlah berjalan dengan parameter temp(2), dan 5.
- Dalam fungsi TampilJumlah dipanggil fungsi TampilHinggaKei dengan parameter Jumlah (yang ber parameter temp dan 5)
- Kembali menghitung temp dan 5 didalam fungsi Jumlah (totalnya 7) dan dikembalikan ke fungsi TampiJumlah
- Fungsi TampilHinggaKei berjalan dengan parameter 7
- Perulangan terjadi dengan kondisi j kurang dari 7
- Output merupakan j (yang dimulai dari 1 dan berhenti di angka 7)
- Fungsi TampilJumlah selesai. begitu juga dengan fungsi main.
4. Fungsi memerlukan parameter disaat kita memerlukan input didalam fungsinya. Sementara fungsi harus memeiliki kembalian disaat nilai didalam fungsi tersebut diperlukan kembali diluar fungsi.
5.  - Fungsi sebaiknya menggunakan parameter disaat membutuhkan input dari luar fungsi. 
    - Fungsi boleh tidak menggunakan parameter disaat yang didalam fungsi tersebut memang tidak memerlukan input dari luar fungsi. Biasanya fungsi tanpa parameter ini berfungsi untuk output sederhana saja, sehingga tidak memerlukan output.
6.  - Fungsi sebaiknya memiliki return value disaat nilai dari fungsi tersebut dibutuhkan kembali diluar fungsi. Semisal, saat kita memanggil fungsi tersebut untuk mengihtung dan berkekspektasi untuk mendapatkan nilai dari operasi hitungan tersebut maka pada saat itu fungsi memutuhkan return value.
    - Fungsi sebaiknya tidak memerlukan return value jika memang kita tidak berekspektasi mendapatkan sesuatu setelah memanggil fungsi tersebut. 

## TUGAS 
1. **Terdapat pada file *Kubus27.java* di folder yang sama.** <br>
   <img width="263" height="45" alt="Screenshot 2025-11-30 183902" src="https://github.com/user-attachments/assets/62b84b3f-eaf5-44c0-a84a-cc2cc5b59d4c" />

2. **Terdapat pada file *NilaiMahasiswa27.java* di folder yang sama.** <br>
   <img width="553" height="113" alt="Screenshot 2025-11-30 203900" src="https://github.com/user-attachments/assets/ef9e799d-87c4-4dc1-afb6-4adb9def449a" />

3. **Terdapat pada file *RekapPenjualanCafe27.java* di folder yang sama.** <br>
   <img width="888" height="850" alt="Screenshot 2025-11-30 204814" src="https://github.com/user-attachments/assets/a5637611-007e-4be0-bf34-c1547f604ba2" />

        
