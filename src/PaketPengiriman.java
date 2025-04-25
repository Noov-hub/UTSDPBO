/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/
class PaketPengiriman {
    private String idBarcode;
    private String alamatTujuan;
    private String namaPenerima;
    private String namaPengirim;
    private String alamatPengirim;
    private PerusahaanPengiriman perusahaanPengirim;

    public PaketPengiriman(String id, String tujuan, String penerima, String pengirim, String alamatPengirim, PerusahaanPengiriman perusahaan) {
        this.idBarcode = id;
        this.alamatTujuan = tujuan;
        this.namaPenerima = penerima;
        this.namaPengirim = pengirim;
        this.alamatPengirim = alamatPengirim;
        this.perusahaanPengirim = perusahaan;
    }

    public String getIdPaket() {
        return idBarcode;
    }

    public void displayInfo() {
        System.out.println("Paket dikirim oleh: " + perusahaanPengirim.getNama() + " kepada " + namaPenerima);
    }
}