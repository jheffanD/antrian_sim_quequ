package sdl_projek;

public class sim implements Comparable {

    String nama;
    String pesan;
    String status;
    String alamat;

    public sim(String nama, String pesan, String status, String alamat) {
        this.nama = nama;
        this.pesan = pesan;
        this.status = status;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return nama + "\t\t" + pesan + "\t\t\t" + status + "\t\t" + alamat;
    }

    @Override
    public int compareTo(Object o) {
        return nama.compareTo(((sim) o).getNama());

    }
}
