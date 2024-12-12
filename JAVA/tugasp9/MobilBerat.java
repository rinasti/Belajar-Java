public class MobilBerat extends Mobil {
    private double kapasitasMuatan;

    public MobilBerat(String merek, int tahun, int jumlahPintu, double kapasitasMuatan) {
        super(merek, tahun, jumlahPintu);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan + " ton");
    }
}
