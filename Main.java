import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas Utama
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manajemen manage = new Manajemen();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Tamu");
            System.out.println("2. Tambah Kamar");
            System.out.println("3. Tambah Reservasi");
            System.out.println("4. Tampilkan Semua Tamu");
            System.out.println("5. Tampilkan Semua Kamar");
            System.out.println("6. Tampilkan Semua Reservasi");
            System.out.println("7. Perbarui Kontak Tamu");
            System.out.println("8. Perbarui Harga Kamar");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Tamu: ");
                    input.nextLine(); // Clear buffer
                    String namaTamu = input.nextLine();
                    System.out.print("No. HP: ");
                    String kontakTamu = input.next();
                    Tamu tamu = new Tamu(namaTamu, kontakTamu);
                    manage.tambahTamu(tamu);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Nomor Kamar: ");
                    String nomorKamar = input.next();
                    System.out.print("Tipe Kamar (Standar/Suite): ");
                    String tipeKamar = input.next();
                    Kamar kamar;
                    if (tipeKamar.equalsIgnoreCase("Standar")) {
                        kamar = new KamarStandar(nomorKamar);
                    } else {
                        kamar = new KamarSuite(nomorKamar);
                    }
                    manage.tambahKamar(kamar);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.print("Nama Tamu: ");
                    input.nextLine(); // Clear buffer
                    String namaTamuReservasi = input.nextLine();
                    Tamu tamuReservasi = manage.cariTamu(namaTamuReservasi);
                    if (tamuReservasi == null) {
                        System.out.println("Tamu tidak ditemukan.");
                        break;
                    }
                    System.out.print("Nomor Kamar: ");
                    String nomorKamarReservasi = input.next();
                    Kamar kamarReservasi = manage.cariKamar(nomorKamarReservasi);
                    if (kamarReservasi == null) {
                        System.out.println("Kamar tidak ditemukan.");
                        break;
                    }
                    System.out.print("Fasilitas Tambahan (Yes/No): ");
                    boolean fasilitasTambahan = input.next().equalsIgnoreCase("Yes");
                    Reservasi reservasi = new Reservasi(tamuReservasi, kamarReservasi, fasilitasTambahan);
                    manage.tambahReservasi(reservasi);
                    System.out.println("Reservasi berhasil dibuat.");
                    System.out.println(" ");
                    break;
                case 4:
                    manage.tampilkanSemuaTamu();
                    System.out.println(" ");
                    break;
                case 5:
                    manage.tampilkanSemuaKamar();
                    System.out.println(" ");
                    break;
                case 6:
                    manage.tampilkanSemuaReservasi();
                    System.out.println(" ");
                    break;
                case 7:
                    System.out.print("Nama Tamu yang ingin diupdate: ");
                    input.nextLine(); // Clear buffer
                    String namaTamuUpdate = input.nextLine();
                    Tamu tamuUpdate = manage.cariTamu(namaTamuUpdate);
                    if (tamuUpdate != null) {
                        System.out.print("Kontak baru: ");
                        String kontakBaru = input.next();
                        tamuUpdate.setKontak(kontakBaru);
                        System.out.println("Kontak berhasil diupdate.");
                    } else {
                        System.out.println("Tamu tidak ditemukan.");
                    }
                    System.out.println(" ");
                    break;
                case 8:
                    System.out.print("Nomor Kamar yang ingin diupdate: ");
                    String nomorKamarUpdate = input.next();
                    Kamar kamarUpdate = manage.cariKamar(nomorKamarUpdate);
                    if (kamarUpdate != null) {
                        System.out.print("Harga baru: ");
                        double hargaBaru = input.nextDouble();
                        kamarUpdate.setHarga(hargaBaru);
                        System.out.println("Harga berhasil diupdate.");
                    } else {
                        System.out.println("Kamar tidak ditemukan.");
                    }
                    System.out.println(" ");
                    break;
                case 9:
                    System.out.println ("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
    }
}