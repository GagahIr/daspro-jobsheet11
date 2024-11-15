import java.util.Scanner;

public class UcapanTerimakasih_10 {
    public static void main(String[] args) {
        UcapanTerimakasih();
        UcapanTambahan("Terima kasih sudah ada");
    }

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang igin anda beri ucapan");
        String namaOrang = sc.next();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thankyou " + nama + " for being the best teacher in the world.\n" + "You insired in me a love for learning and mad me feel like i could ask you anything");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
}
