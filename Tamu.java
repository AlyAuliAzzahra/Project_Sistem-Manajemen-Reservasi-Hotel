// Kelas untuk Tamu
public class Tamu {
    private String nama;
    private String kontak;

    public Tamu(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getInfoTamu() {
        return "Nama: " + nama + ", Kontak: " + kontak;
    }
}