import java.util.Scanner;
public class RekapPenjualanCafe27 {

    //Fungsi untuk memasukkan rekap data penjualan
    public static void inputData(int[][] rekapData, Scanner sc) {
        System.out.println("============= INPUT REKAP DATA =============");
        for (int i = 0; i < rekapData.length; i++) {
            for (int j = 0; j < rekapData[0].length; j++) {
                System.out.print("Masukkan rekap penjualan " + namaMenu(i) + " hari ke-" + (j+1) + " : ");
                rekapData[i][j] = sc.nextInt();
            }
        }
    }

    //Fungsi untuk menampilan rekap data yang telah diinput
    public static void tampilRekap(int[][] rekapData) {
        System.out.println("\n============= HASIL REKAP DATA ==============");
        for (int i = 0; i < rekapData.length; i++) {
            for (int j = 0; j < rekapData[0].length; j++) {
                System.out.print(rekapData[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    //Fungsi untuk menghitung penjualan tertinggi
    public static void penjualanTertinggi (int[][] rekapData) {
        System.out.println("\n============= MENU DENGAN PENJUALAN TERTINGGI =============");
        int[] totalPenjualanPerMenu = new int[rekapData.length];

        //Menghitung total penjualan per menu
        for (int i = 0; i < rekapData.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < rekapData[0].length; j++) {
                totalPerMenu += rekapData[i][j];
            }
            totalPenjualanPerMenu[i] = totalPerMenu;
        }
        System.out.println();

        int tertinggi = totalPenjualanPerMenu[0]; //karena mulai dari 0
        int menuTertinggi = 0;
        for (int i = 0; i < totalPenjualanPerMenu.length; i++) {
            if (totalPenjualanPerMenu[i] > tertinggi) {
                tertinggi = totalPenjualanPerMenu[i];
                menuTertinggi = i;
            }
        }
        System.out.println("Total penjualan tertinggi sebesar : " + tertinggi + " penjualan");
        System.out.println("Menu dengan penjualan tertinggi adalah : " + namaMenu(menuTertinggi));

    }

    //Fungsi untuk mengkonversi angka ke nama menu
    public static String namaMenu (int menu) {
        String hasil = null;
        if (menu == 0) {
            hasil = "Kopi";
        } else if (menu == 1) {
            hasil = "Teh";
        } else if (menu == 2) {
            hasil = "Es Kelapa Muda";
        }else if (menu == 3) {
            hasil = "Roti Bakar";
        } else {
            hasil = "Gorengan";
        }
        return hasil;
    }

    //Fungsi untuk menghitung nilai rata per menu
    public static void rataTotalPenjualanPerMenu (int[][] rekapData) {
        System.out.println("\n============= RATA-RATA PER MENU  =============");
        int[] totalPenjualanPerMenu = new int[rekapData.length];

        int rataPerMenu = 0;
        for (int i = 0; i < rekapData.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < rekapData[0].length; j++) {
                totalPerMenu += rekapData[i][j];
            }
            totalPenjualanPerMenu[i] = totalPerMenu;
            rataPerMenu = totalPenjualanPerMenu[i] / 7;

            System.out.println("Rata-rata " + namaMenu(i) + " yang terjual selama seminggu adalah : " + rataPerMenu + " " + namaMenu(i));
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] rekapData = new int[5][7];

        inputData(rekapData, sc);
        tampilRekap(rekapData);
        penjualanTertinggi(rekapData);
        rataTotalPenjualanPerMenu(rekapData);
    }
}
