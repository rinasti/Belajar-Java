public class SepedaMotor extends Kendaraan {
    private boolean adaRemTangan;

    public SepedaMotor(String merek, int tahun, boolean adaRemTangan) {
        super(merek, tahun);
        this.adaRemTangan = adaRemTangan;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ada Rem Tangan: " + adaRemTangan);
    }
}

