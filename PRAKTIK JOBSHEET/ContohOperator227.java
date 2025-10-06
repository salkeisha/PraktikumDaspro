public class ContohOperator227 {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = "+ x++);
        System.out.println("Setelah evaluasi, x = "+ x);

        x = 10;
        System.out.println("++x = "+ ++x);
        System.out.println("Setelah evaluasi, x = "+ x);

        int y = 12;
        System.out.println(x > y || y == x && y <= x);

        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah "+ z);
        //x = 11; 1011
        //y = 12; 1100
        //1011
        //1100
        //-----
        //0111 -> 7                                                                             `

        z %= 2;
        System.out.println("Hasil akhir "+ z);
        
    }
}