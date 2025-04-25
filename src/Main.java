/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/
// Main.java
import java.util.*;

public class Main {
    public static void cariProduk(List<Produk> daftarProduk, String namaProdukDicari) {
        for (Produk produk : daftarProduk) {
            if (produk.getNama().equalsIgnoreCase(namaProdukDicari)) {
                System.out.println("\n\n=== Data Produk Ditemukan ===");
                produk.displayInfo(); // Info produk

                Perusahaan perusahaan = produk.getPerusahaanPembuat(); // Akses perusahaan pembuat
                if (perusahaan != null) {
                    System.out.println("\n=== Data Perusahaan Pembuat ===");
                    perusahaan.displayInfo(); // Info perusahaan

                    PemilikPerusahaan pemilik = perusahaan.getPemilik(); // Akses pemilik perusahaan
                    if (pemilik != null) {
                        System.out.println("\n=== Data Pemilik Perusahaan ===");
                        pemilik.displayInfo(); // Info pemilik
                    } else {
                        System.out.println("\nPemilik perusahaan tidak ditemukan.");
                    }
                } else {
                    System.out.println("\nPerusahaan pembuat tidak ditemukan.");
                }
                return; // Keluar dari loop setelah produk ditemukan
            }
        }
        System.out.println("Produk dengan nama '" + namaProdukDicari + "' tidak ditemukan.");
    }

    public static void main(String[] args) {
        // Pemilik Perusahaan
        PemilikPerusahaan pemilik1 = new PemilikPerusahaan("111", "Andi", "Jakarta");
        PemilikPerusahaan pemilik2 = new PemilikPerusahaan("112", "Budi", "Bandung");

        // Perusahaan
        Perusahaan perusahaan1 = new Perusahaan("P001", "PT Maju Jaya", pemilik1, "Jakarta", 2010, 50);
        Perusahaan perusahaan2 = new Perusahaan("P002", "PT Sukses Makmur", pemilik2, "Bandung", 2015, 30);
        pemilik1.tambahPerusahaan(perusahaan1);
        pemilik2.tambahPerusahaan(perusahaan2);

        // Karyawan
        Karyawan karyawan1 = new Karyawan("201", "Rina", "Depok", "PT Maju Jaya", 5000000);
        Karyawan karyawan2 = new Karyawan("202", "Tono", "Bekasi", "PT Sukses Makmur", 4500000);

        // Produk
        Produk produk1 = new Produk("PR01", "Laptop Andi", 2.5, perusahaan1);
        Produk produk2 = new Produk("PR02", "Printer Jaya", 4.0, perusahaan1);
        Produk produk3 = new Produk("PR03", "Tablet Sukses", 1.2, perusahaan2);
        Produk produk4 = new Produk("PR04", "Smartphone Makmur", 0.8, perusahaan2);
        perusahaan1.tambahProduk(produk1);
        perusahaan1.tambahProduk(produk2);
        perusahaan2.tambahProduk(produk3);
        perusahaan2.tambahProduk(produk4);

        // Perusahaan Pengiriman
        PerusahaanPengiriman ekspedisi1 = new PerusahaanPengiriman("EXP01", "JNE", perusahaan1, 2000, 500);
        PerusahaanPengiriman ekspedisi2 = new PerusahaanPengiriman("EXP02", "TIKI", perusahaan2, 2005, 400);

        // Paket Pengiriman
        PaketPengiriman paket1 = new PaketPengiriman("PKT001", "Jl. Merdeka No.1", "Ali", "Arie", "Jl. Jendral No.2", ekspedisi1);
        PaketPengiriman paket2 = new PaketPengiriman("PKT002", "Jl. Gatot Subroto No.3", "Siti", "John", "Jl. Sudirman No.4", ekspedisi2);
        ekspedisi1.tambahPaket(paket1);
        ekspedisi2.tambahPaket(paket2);

        // Marketplace
        Marketplace market1 = new Marketplace("M001", "Tokopaedi", perusahaan1, 2018, 80);
        Marketplace market2 = new Marketplace("M002", "Shopii", perusahaan2, 2020, 70);
        market1.tambahEkspedisi(ekspedisi1);
        market2.tambahEkspedisi(ekspedisi2);

        // Tampilkan semua data
        System.out.println("=== Data Pemilik ===");
        pemilik1.displayInfo();
        pemilik2.displayInfo();

        System.out.println("\n=== Data Perusahaan ===");
        perusahaan1.displayInfo();
        perusahaan2.displayInfo();

        System.out.println("\n=== Data Karyawan ===");
        karyawan1.displayInfo();
        karyawan2.displayInfo();

        System.out.println("\n=== Data Produk ===");
        produk1.displayInfo();
        produk2.displayInfo();
        produk3.displayInfo();
        produk4.displayInfo();

        System.out.println("\n=== Data Perusahaan Pengiriman ===");
        ekspedisi1.displayInfo();
        ekspedisi2.displayInfo();

        System.out.println("\n=== Data Paket Pengiriman ===");
        paket1.displayInfo();
        paket2.displayInfo();

        System.out.println("\n=== Data Marketplace ===");
        market1.displayInfo();
        market2.displayInfo();


        // Buat daftar semua produk
        List<Produk> semuaProduk = new ArrayList<>();
        semuaProduk.add(produk1);
        semuaProduk.add(produk2);
        semuaProduk.add(produk3);
        semuaProduk.add(produk4);
        cariProduk(semuaProduk, "Smartphone Makmur");
    }
}
