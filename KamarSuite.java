// Kelas anak untuk Kamar Suite
public class KamarSuite extends Kamar {
    public KamarSuite(String nomorKamar) {
        super(nomorKamar, 500000); // Harga tetap untuk kamar suite
    }

    @Override
    public String getInfoKamar() {
        return "Suite " + super.getInfoKamar();
    }
}
