import java.util.Scanner;

public class MenghitungTotalBayar27 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        harga=sc.nextInt();

        potongan=harga*diskon;
        jml_bayar=harga-potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. "+jml_bayar);
        sc.close();

    }
    
}