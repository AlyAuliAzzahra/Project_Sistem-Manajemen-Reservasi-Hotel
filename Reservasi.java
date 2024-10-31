// Kelas untuk Reservasi
public class Reservasi {
    private Tamu tamu;
    private Kamar kamar;
    private boolean fasilitasTambahan;

    public Reservasi(Tamu tamu, Kamar kamar, boolean fasilitasTambahan) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public boolean isFasilitasTambahan() {
        return fasilitasTambahan;
    }

    public void setFasilitasTambahan(boolean fasilitasTambahan) {
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public double hitungTotal() {
        double total = kamar.getHarga();
        if (fasilitasTambahan) {
            total += 100000; // Biaya tambahan untuk fasilitas ekstra
        }
        return total;
    }

    public void tampilkanStatusReservasi() {
        System.out.println("Detail Reservasi:");
        System.out.println("Nama Tamu: " + tamu.getNama());
        System.out.println("Info Kamar: " + kamar.getInfoKamar());
        System.out.println("Fasilitas Tambahan: " + (fasilitasTambahan ? "Ya" : "Tidak"));
        System.out.println("Total Biaya: " + hitungTotal());
    }
}