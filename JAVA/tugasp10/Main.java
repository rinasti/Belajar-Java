public class Main {
    public static void main(String[] args) {
        // Buat objek Karyawan
        Karyawan karyawan = new Karyawan("Andi");

        // Buat objek Mobil
        Mobil sedan = new Mobil("Sedan", 200000000);

        // Buat objek Pembeli
        Pembeli pembeliIndividu = new PembeliIndividu("Rina");

        // Proses Transaksi
        Transaksi transaksi = new Transaksi(pembeliIndividu, karyawan, sedan, 2);
        transaksi.prosesTransaksi();

        // Lihat komisi karyawan
        System.out.println("Total komisi karyawan: " + karyawan.getKomisi());
    }
}
