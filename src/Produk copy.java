/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/
class Produk {
    private String id;
    private String namaProduk;
    private double beratProduk;
    private Perusahaan perusahaanPembuat;

    public Produk(String id, String nama, double berat, Perusahaan perusahaan) {
        this.id = id;
        this.namaProduk = nama;
        this.beratProduk = berat;
        this.perusahaanPembuat = perusahaan;
    }

    public String getNama() {
        return namaProduk;
    }


    public void displayInfo() {
        System.out.println("Produk: " + namaProduk + " dibuat oleh " + perusahaanPembuat.getNama());
    }

    public Perusahaan getPerusahaanPembuat() {
        return perusahaanPembuat;
    }

}
