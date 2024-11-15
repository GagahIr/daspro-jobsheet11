public class Kubus10 {
    public static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume ;
    }

    public static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * (sisi * sisi);
        return luasPermukaan ;
    }

    public static void main(String[] args) {
        int sisi = 5; 

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}
