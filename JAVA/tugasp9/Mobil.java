public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int tahun, int jumlahPintu) {
        super(merek, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
