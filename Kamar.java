// Kelas induk untuk Kamar
public class Kamar {
    private String nomorKamar;
    private double harga;

    public Kamar(String nomorKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.harga = harga;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getInfoKamar() {
        return "Nomor Kamar: " + nomorKamar + ", Harga: " + harga;
    }
}
