# LAPORAN LATIHAN PEMILIHAN 

#### Nama  : Salasabila Keisha Ayu Setiadi
#### Kelas : TI-1C 
#### NIM   : 254107020048 

## SOAL 1
Sistem perpustakaan kampus memberikan izin masuk dengan dua syarat:
• Jika mahasiswa membawa kartu mahasiswa, atau sudah melakukan registrasi
online, maka boleh masuk.
• Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk.
Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

### **Flowchart**

### **Pseudocode**
```
START 
DECLARE boolean inputKartu, inputRegistrasi

INPUT inputKartu
INPUT inputRegistrasi

IF (inputKartu==true OR inputRegistrasi==true) THEN
	OUTPUT "Selamat anda dapat memasuki perpustakaan"
ELSE 
	OUTPUT "Mohon maaf anda belum memenuhi syarat untuk memasuki perpustakaan"
ENDIF

END
```

## SOAL  2
Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas
akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut:
• Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”.
• Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS
yang diambil:
o Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”.
o Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”.
• Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”.
Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!

### **Flowchart**

### **Pseudocode**
```
START
DECLARE String pengguna
DECLARE int sks

INPUT pengguna

IF (pengguna.equalsIgnoreCase("Dosen"))
	OUTPUT "Selamat Akses WiFi diberikan (dosen)"
ELSE IF (pengguna.equalsIgnoreCase("Mahasiswa"))
	OUTPUT "Masukkan jumlah SKS yang diambil : "
	INPUT sks

	IF sks >= 12
		OUTPUT "Akses WiFI diberikan"
	ELSE 
		OUTPUT "Akses ditolak, SKS kurang dari 12"
ELSE 
	OUTPUT "Akses ditolak"
ENDIF

END
```