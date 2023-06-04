package sdl_projek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ANTRIAN PEMBUATAN SIM");
        System.out.println("=====================");

        int input = 0;
        Program p = new Program();
        p.DataAwal();
        
        System.out.println("banyak antrain ");
        while (input != 6) {
            if (input >= 7) {
                System.out.println("Inputan tidak VALID");
            }
            System.out.println("Menu:");
            System.out.println("1. Melihat Antrian");
            System.out.println("2. Antrian Baru");
            System.out.println("3. Menghapus Antrian");
            System.out.println("4. Menghapus Semua Antrian");
            System.out.println("5. Mencari Antrian");
            System.out.println("6. keluar");
            System.out.print("Pilih Menu : ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    p.lihat();
                    break;
                case 2:
                    p.tambah();
                    break;
                case 3:
                    p.hapus();
                    break;
                case 4:
                    p.konfirmasi();
                    break;
                case 5:
                    p.cari();
                    break;
                default:
                    break;
            }
        }

    }

}
