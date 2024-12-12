public abstract class Pembeli {
    protected String namaPembeli;

    public Pembeli(String nama) {
        this.namaPembeli = nama;
    }

    public abstract void beliMobil(Mobil mobil, int jumlah);

    public String getNamaPembeli() {
        return namaPembeli;
    }
}
