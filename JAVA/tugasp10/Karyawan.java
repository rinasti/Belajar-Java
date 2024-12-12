public class Karyawan {
    private String namaKaryawan;
    private double komisi;

    public Karyawan(String nama) {
        this.namaKaryawan = nama;
    }

    public void lihatDataPembeli(Pembeli pembeli) {
        System.out.println("Data Pembeli: " + pembeli.getNamaPembeli());
    }

    public void tambahKomisi(double totalHarga) {
        komisi += totalHarga * 0.10;
    }

    public double getKomisi() {
        return komisi;
    }
}