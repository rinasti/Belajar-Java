public class Transaksi {
    private Pembeli pembeli;
    private Karyawan karyawan;
    private Mobil mobil;
    private int jumlahMobil;
    private double totalHarga;

    public Transaksi(Pembeli pembeli, Karyawan karyawan, Mobil mobil, int jumlah) {
        this.pembeli = pembeli;
        this.karyawan = karyawan;
        this.mobil = mobil;
        this.jumlahMobil = jumlah;
        hitungTotalHarga();
    }

    public void prosesTransaksi() {
        pembeli.beliMobil(mobil, jumlahMobil);
        karyawan.tambahKomisi(totalHarga);
    }

    private void hitungTotalHarga() {
        totalHarga = mobil.getHargaMobil() * jumlahMobil;
    }
}
