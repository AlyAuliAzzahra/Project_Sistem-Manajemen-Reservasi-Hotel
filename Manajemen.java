import java.util.ArrayList;
import java.util.List;

// Kelas untuk mengelola data tamu, reservasi, dan kamar
public class Manajemen {
    private List<Tamu> daftarTamu;
    private List<Reservasi> daftarReservasi;
    private List<Kamar> daftarKamar;

    public Manajemen() {
        daftarTamu = new ArrayList<>();
        daftarReservasi = new ArrayList<>();
        daftarKamar = new ArrayList<>();
    }


    // Metode untuk mengelola tamu
    public void tambahTamu(Tamu tamu) {
        daftarTamu.add(tamu);
    }

    public Tamu cariTamu(String nama) {
        for (Tamu tamu : daftarTamu) {
            if (tamu.getNama().equalsIgnoreCase(nama)) {
                return tamu;
            }
        }
        return null;
    }

    public void tampilkanSemuaTamu() {
        if (daftarTamu.isEmpty()) {
            System.out.println("Tidak ada tamu.");
            System.out.println(" ");
        } else {
            for (Tamu tamu : daftarTamu) {
                System.out.println("--------------------------");
                System.out.println(tamu.getInfoTamu());
                System.out.println("--------------------------");
                System.out.println(" ");
            }
        }
    }


    // Metode untuk mengelola reservasi
    public void tambahReservasi(Reservasi reservasi) {
        daftarReservasi.add(reservasi);
    }

    public void tampilkanSemuaReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Tidak ada reservasi yang tersedia.");
            System.out.println(" ");
        } else {
            for (Reservasi reservasi : daftarReservasi) {
                System.out.println("--------------------------");
                reservasi.tampilkanStatusReservasi();
                System.out.println("--------------------------");
                System.out.println(" ");
            }
        }
    }


    // Metode untuk mengelola kamar
    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }

    public Kamar cariKamar(String nomorKamar) {
        for (Kamar kamar : daftarKamar) {
            if (kamar.getNomorKamar().equals(nomorKamar)) {
                return kamar;
            }
        }
        return null;
    }

    public List<Kamar> cariKamarByType(String type) {
        List<Kamar> result = new ArrayList<>();
        for (Kamar kamar : daftarKamar) {
            if (kamar.getInfoKamar().contains(type)) {
                result.add(kamar);
            }
        }
        return result;
    }

    public void tampilkanSemuaKamar() {
        if (daftarKamar.isEmpty()) {
            System.out.println("Tidak ada kamar yang tersedia.");
            System.out.println(" ");
        } else {
            for (Kamar kamar : daftarKamar) {
                System.out.println("--------------------------");
                System.out.println(kamar.getInfoKamar());
                System.out.println("--------------------------");
                System.out.println(" ");
            }
        }
    }
}