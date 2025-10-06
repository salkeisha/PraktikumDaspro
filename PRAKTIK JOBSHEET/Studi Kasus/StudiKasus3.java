import java.util.Scanner;
public class StudiKasus3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaMotor, uangMuka, lamaCicilan;
        double presentaseBunga=0.01, jmlCicilan, sisaHargaMotor, bunga, cicilan;

        System.out.print("Masukkan harga motor anda : ");
        hargaMotor=sc.nextInt();
        System.out.print("Masukkan uang muka yang telah dibayar : ");
        uangMuka=sc.nextInt();
        System.out.print("Masukkan berapa bulan anda menyicil : ");
        lamaCicilan=sc.nextInt();

        sisaHargaMotor=hargaMotor-uangMuka;
        cicilan=sisaHargaMotor/lamaCicilan;
        bunga=sisaHargaMotor*presentaseBunga;
        jmlCicilan=cicilan+bunga;

        System.out.println("Total cicilan yang harus dibayarkan adalah : "+jmlCicilan);
        sc.close();
    }
}