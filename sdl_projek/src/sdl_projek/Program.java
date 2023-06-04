package sdl_projek;

import java.util.Scanner;

public class Program {

    Queue<sim> a = new Queue<sim>();
    Scanner sc = new Scanner(System.in);

    public void DataAwal() {
        sim r = new sim("raffi", "Jl. Paingan 5 no. 128", "Baru", "SIM A");
        sim s = new sim("bambang", "Jl. Paingan 1 no. 12", "Perpanjng", "SIM C");
        sim t = new sim("dimas", "Jl. Paingan 5 no. 113a", "Perpanjang", "SIM B");
        sim u = new sim("eka", "Jl. Paingan 4 no. 141", "Baru", "SIM C");
        sim v = new sim("putri", "Jl. Paingan 4 no. 99b", "Baru", "SIM A");
        sim w = new sim("putra", "Jl. Paingan 2 no. 129a", "Perpanjang", "SIM B");
        sim x = new sim("afus", "Jl. Paingan 2 no. 129a", "Baru", "SIM A");
        sim y = new sim("limbad", "Jl. Paingan 2 no. 31", "Baru", "SIM B");
        sim z = new sim("Sandro", "Jl. Paingan 2 no. 131", "Perpanjang", "SIM C");

        a.enqueue(r);
        a.enqueue(s);
        a.enqueue(t);
        a.enqueue(u);
        a.enqueue(v);
        a.enqueue(w);
        a.enqueue(x);
        a.enqueue(y);
        a.enqueue(z);
    }

    public void tambah() {
        if (a.Sise() >= 10) {
            System.out.println("Antrian sudah penuh. Tidak dapat menambahkan antrian baru.");
            return;
        }
        System.out.println("Jumlah antrian : " + a.Sise());
        System.out.println("INPUT DATA");
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = sc.nextLine();
        String status = statussim();
        String jenis = jenisSim();

        sim gas = new sim(nama, alamat, status, jenis); // Menambahkan nomor antrian ke konstruktor sim
        a.enqueue(gas);

        System.out.println("");

    }

    public String statussim() {
        System.out.println("Silahkan pilih Status Sim:");
        System.out.println("1. Baru");
        System.out.println("2. Perpanjang");
        System.out.print("Jenis yang dipilih : ");
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        if (pilih == 1) {
            return "Baru";
        } else {
            return "Perpanjang";
        }
    }

    public String jenisSim() {
        System.out.println("Silahkan pilih jenis Sim:");
        System.out.println("1. SIM A");
        System.out.println("2. SIM B");
        System.out.println("3. SIM C");
        System.out.print("Jenis yang dipilih : ");

        int pilih = sc.nextInt();
        if (pilih == 1) {
            return "SIM A";
        } else if (pilih == 2) {
            return "SIM B";
        } else {
            return "SIM C";
        }

    }

    public void lihat() {
        System.out.println("DATA ANTRIAN");
        System.out.println("===============================================================================");
        System.out.println("Nama" + "\t\t" + "Jenis SIM" + "\t\t" + "Status" + "\t\t" + "Alamat");
        System.out.println("-------------------------------------------------------------------------------");

        if (!a.isEmpty()) {
            System.out.println(a.cetak());
        } else {
            System.out.println("Antrian Kosong");
        }
        System.out.println("===============================================================================");
        System.out.println("");
    }

    public void hapus() {
        try {
            System.out.println("Antrian milik " + a.dequeue().getNama() + " berhasil dihapus");
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Antrian Kosong");
        }

    }

    public void hapusSeluruh() {
        System.out.println("Menghapus Antrian :");
        while (!a.isEmpty()) {
            System.out.println(a.dequeue().getNama());
        }
        System.out.println("Seluruh antrian dihapus");
        System.out.println("");
    }

    public void konfirmasi() {

        System.out.print("Apakah Yakin Untuk MENGHAPUS Semua Antrian ? ");
        String kon = sc.nextLine();

        if ("ya".equals(kon) || "ia".equals(kon)) {
            hapusSeluruh();
        } else {
            System.out.println("Terima Kasih");
        }
    }

    public void cari() {

        System.out.print("Masukkan Nama :");
        try {
            String nama = sc.nextLine();
            System.out.println("Mencari Antrian Milik " + nama);
            sim cari = new sim(nama, "", "", "");
            Object coba = a.Search(cari);
            if (coba == null) {
                System.out.println("Data TIDAK ADA");
            } else {
                System.out.println("DATA ANTRIAN");
                System.out.println("==============================================================================================");
                System.out.println("Nama \t\t" + "Jenis SIM \t\t" + " SIM \t\tAlamat\t\t\tStatus ");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(coba + "\tADA di Antrian");
            }
        } catch (Exception e) {
            System.out.println("Data TIDAK ADA");
        }

        System.out.println("");

    }
}
