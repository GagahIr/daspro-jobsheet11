import java.util.Scanner;

public class Ucapan_10 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thankyou " + nama + "\nMay the force be with you");
    }

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang igin anda beri ucapan");
        String namaOrang = sc.next();
        sc.close();
        return namaOrang;
    }
}
