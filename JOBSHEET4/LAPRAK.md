# LAPORAN PRAKTIKUM JOBSHEET 4

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## 2.1 Percobaan 1: Menggunakan Github
Setelah mengikuti langkah-langkah pada jobsheet 4 maka akan menghasilkan akun GitHub beserta repository seperti berikut :
<img width="937" height="589" alt="akun github" src="https://github.com/user-attachments/assets/af7905ad-0d95-4425-b94a-e84beae258e5" />

### Pertanyaan
1. Cek apakah file Test.txt ada di Github. Jika tidak, mengapa?
2. Jelaskan fungsi dari Add, Commit, dan Push

### Jawaban
1. Ya, terdapat file Test.txt pada GitHub setelah di *Add*, sama seperti jenis file lainnya saat di *Add* dan *Push*. File ini biasanya digunakan hanya untuk menguji fungsionalitas sebuah kode program.
2. Fungsi dari :
- **Add** : Berfungsi untuk menambahkan file yang akan di commit (staging) ke akun GitHub sebelum disimpan secara permanen (dengan commit).
- **Commit** : Commit berfungsi untuk menyimpan secara permanen perubahan yang telah diibuat pada kode program.
- **Push** : Push digunakan sebagai mengirimkan semua perubahan yang telah disimpan sebelumnya (dengan commit) di file lokal ke file/repository yang ada di akun GitHub. 

## 2.2 Percobaan 2 : Dasar Kolaborasi di Github
Saya melakukan kolaborasi di GitHub dengan teman saya dan menghasilkan sebuah kode program seperti berikut :
<img width="929" height="567" alt="KolaborasiKodeProgram" src="https://github.com/user-attachments/assets/6a36ed52-173d-453d-adbd-bbeaa6dcc170" />


Saya menambahkan kode program :
> System.out.println("Hai, ini baris kode pertama");

Lalu teman saya menambahkan kode program :
> System.out.println("Hallo kei, aku ayla");

Setelah mencoba berkolaborasi dengan kode program, saya dan teman saya mencoba jika terjadi merge conflict, dimana saat kita secara tidak sengana mengisi kode di baris yang sama saat pull kode program :
<img width="1920" height="1080" alt="MergeConflict1" src="https://github.com/user-attachments/assets/7bc7364f-8212-48be-a2d9-6b5c13614771" />

> Yang berwarna hijau adalah kode program yang ada sebelum melakukan pull request, sementara yang berwarna biru adalah kode program yang berada di GitHub saat kita sudah melakukan pull request.

<img width="1920" height="1080" alt="MergeConflict2" src="https://github.com/user-attachments/assets/5def93af-336d-4cfc-9f0b-a6a88b95bb91" />

> Saat ***Resolve Merge Editor*** dilakukan maka akan muncul kedua kode program dimana kita dapat memilih antara 
>> <p> Accept Incoming | Accept Combination (Incoming First) | Ignore <br>
> atau </p>
>> <p> Accept Current | Accept Combination (Current First) | Ignore <br>
> Pilihan dapat disesuaikan dengan kode program yang dibutuhkan saat digabungkan. </p>
