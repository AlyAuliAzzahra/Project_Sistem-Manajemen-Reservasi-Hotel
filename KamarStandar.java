// Kelas anak untuk Kamar Standar
public class KamarStandar extends Kamar {
    public KamarStandar(String nomorKamar) {
        super(nomorKamar, 300000); // Harga tetap untuk kamar standar
    }

    @Override
    public String getInfoKamar() {
        return "Standar " + super.getInfoKamar();
    }
}