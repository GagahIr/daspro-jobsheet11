import java.util.Scanner;

public class NilaiMahasiswa {
    static String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static int[][] nilai = new int[5][7];

    public static void inputNilai() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan nilai untuk " + mahasiswa[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanNilai() {
        System.out.println("\nNilai Mahasiswa:");
        System.out.println("Minggu ke\t1\t2\t3\t4\t5\t6\t7");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void cariMingguTertinggi() {
        int mingguTertinggi = -1;
        int nilaiTertinggi = -1;
        
        for (int j = 0; j < 7; j++) {
            int totalNilaiMinggu = 0;
            for (int i = 0; i < mahasiswa.length; i++) {
                totalNilaiMinggu += nilai[i][j];
            }
            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                mingguTertinggi = j + 1;
            }
        }
        
        System.out.println("\nMinggu dengan nilai tertinggi secara keseluruhan adalah Minggu ke-" + mingguTertinggi + " dengan total nilai " + nilaiTertinggi);
    }

    public static void cariMahasiswaTertinggi() {
        String namaMahasiswa = "";
        int nilaiTertinggi = -1;
        int mingguKe = -1;
        
        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    namaMahasiswa = mahasiswa[i];
                    mingguKe = j + 1;
                }
            }
        }
        
        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + namaMahasiswa + " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + mingguKe);
    }

    public static void main(String[] args) {
        inputNilai();            
        tampilkanNilai();         
        cariMingguTertinggi();    
        cariMahasiswaTertinggi();
    }
}
