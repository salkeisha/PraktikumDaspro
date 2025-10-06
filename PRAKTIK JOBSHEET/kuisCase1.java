//Import library Scanner agar user dapat menginput nilai variabel yang dibutuhkan.
import java.util.Scanner;
public class kuisCase1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi scanner untuk menginput kecepatan, durasi, kapasitas mesin, dan target harian.

    //Deklarasi tipe data per variabel
    double kecepatan, durasi, kapasitasMesin; //inputan awal
    double totalKonsumsi, rataBahanBakar; //output awal
    double perkotaan=0.5, tol=0.3, pegunungan=0.7; //nilai setiap segmen
    double presentaseTargetHarian, faktorPerkotaan, faktorPegunungan, faktorTol, targetHarian; //variabel tambahan

    //Input data yang dibutuhkan
    System.out.print("Masukkan kecepatan motor anda selama perjalanan : "); //user menginput kecepatan selama berkendara
    kecepatan=sc.nextInt();
    System.out.print("Masukkan berapa lama anda telah berkendara : "); //user menginput durasi yang dihabiskan selama berkendara
    durasi=sc.nextInt();
    System.out.print("Masukkan kapasitas mesin motor anda : "); //user memasukkan besar kapasitas motor yang dimiliki
    kapasitasMesin=sc.nextInt();

    //Melakukan operasi hitung sesuai dengan output yang dibutuhkan
    //Segmen Perkotaan
    faktorPerkotaan=(kecepatan*durasi/100)*kapasitasMesin*perkotaan;
    System.out.println("Bahan bakar yang anda habiskan jika melalui kota adalah : "+faktorPerkotaan+" liter");
    //Segmen Tol
    faktorTol=(kecepatan*durasi/100)*kapasitasMesin*tol;
    System.out.println("Bahan bakar yang anda habiskan jika melalui tol adalah : "+faktorTol+" liter");
    //Segmen Pegunungan
    faktorPegunungan=(kecepatan*durasi/100)*kapasitasMesin*pegunungan;
    System.out.println("Bahan bakar yang anda habiskan jika melalui gunung adalah : "+faktorPegunungan+" liter");

    //Menghitung total konsumsi bahan bakar dari semua segmen
    totalKonsumsi=faktorPerkotaan+faktorTol+faktorPegunungan; //didapatkan dari menghitung total semua segmen
    System.out.println("Total bahan bakar yang akan anda keluarkan jika melewati semua segmen adalah : "+totalKonsumsi+" liter");

    //Rata-rata konsumsi bahan bakar per km 
    rataBahanBakar=totalKonsumsi/100; //menggunakan 100 karena pada rumus awal dibagi 100 km
    System.out.println("Rata-rata bahan bakar per-Km adalah : "+rataBahanBakar+" liter");

    //Presentase konsumsi bahan bakar
    System.out.print("Masukkan target konsumsi bahan bakar harian anda : "); //User menginput berapa banyak targetnya dalam sehari
    targetHarian=sc.nextInt();
    presentaseTargetHarian=totalKonsumsi/targetHarian*100;
    System.out.println("Presentase konsumsi bahan bakar anda jika dibandingkan target harian adalah : "+presentaseTargetHarian+"%");
    sc.close();


    }
}