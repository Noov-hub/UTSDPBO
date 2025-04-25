/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/
import java.util.*;

class PerusahaanPengiriman {
    private String id;
    private String nama;
    private Perusahaan pemilik;
    private int tahunBerdiri;
    private int jumlahKaryawan;
    private List<PaketPengiriman> daftarPaket = new ArrayList<>();

    public PerusahaanPengiriman(String id, String nama, Perusahaan pemilik, int tahun, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.pemilik = pemilik;
        this.tahunBerdiri = tahun;
        this.jumlahKaryawan = jumlah;
    }

    public void tambahPaket(PaketPengiriman paket) {
        daftarPaket.add(paket);
    }

    public String getId() { return id; }
    public String getNama() { return nama; }

    public void displayInfo() {
        System.out.println("Ekspedisi: " + nama + ", Pemilik: " + pemilik.getNama());
        System.out.println("  Paket yang ditangani:");
        for (PaketPengiriman p : daftarPaket) {
            System.out.println("    - " + p.getIdPaket());
        }
    }
}