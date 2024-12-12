public class RumahProduksi {
    // property
    private String sutradara;
    private Film[] listFilm = new Film[1000];
    private int jumlahFilm = 0;

    // konstruktor
    public RumahProduksi(String sutradara) {
        this.sutradara = sutradara;
    }

    // method
    public String getNamaSutradara() {
        return sutradara;
    }

    public void buatFilm(Film f) {
        listFilm[jumlahFilm] = f;
        jumlahFilm++;
    }

    public Film[] getListFilm() {
        Film[] list = new Film[jumlahFilm];
        for (int i = 0; i < jumlahFilm; i++) {
            list[i] = listFilm[i];
        }
        return list;
    }

    public int getJumlahFilm() {
        return jumlahFilm;
    }

    public static void main(String[] args) {
        RumahProduksi rp1 = new RumahProduksi("Pidi Baiq");
        RumahProduksi rp2 = new RumahProduksi("Fajar Bustomi");
        RumahProduksi rp3 = new RumahProduksi("Anthony Russo");
        RumahProduksi rp4 = new RumahProduksi("Joe Russo");

        rp1.buatFilm(new Film("Dilan 1990"));
        rp1.buatFilm(new Film("Dilan 1991"));
        rp2.buatFilm(new Film("Dilan 1990"));
        rp2.buatFilm(new Film("Dilan 1991"));
        rp3.buatFilm(new Film("Avenger: Endgame"));
        rp4.buatFilm(new Film("Avenger: Endgame"));

        System.out.println("Jumlah film yang dibuat " + rp1.getNamaSutradara() + " adalah " + rp1.getJumlahFilm());
        Film[] f1 = rp1.getListFilm();
        System.out.print("|| ");
        for (int i = 0; i < rp1.getJumlahFilm(); i++) {
            System.out.print(f1[i].getNamaFilm() + " || ");
        }
        System.out.println("\n");

        System.out.println("Jumlah film yang dibuat " + rp2.getNamaSutradara() + " adalah " + rp2.getJumlahFilm());
        Film[] f2 = rp2.getListFilm();
        System.out.print("|| ");
        for (int i = 0; i < rp2.getJumlahFilm(); i++) {
            System.out.print(f2[i].getNamaFilm() + " || ");
        }
        System.out.println("\n");

        System.out.println("Jumlah film yang dibuat " + rp3.getNamaSutradara() + " adalah " + rp3.getJumlahFilm());
        Film[] f3 = rp3.getListFilm();
        System.out.print("|| ");
        for (int i = 0; i < rp3.getJumlahFilm(); i++) {
            System.out.print(f3[i].getNamaFilm() + " || ");
        }
        System.out.println("\n");

        System.out.println("Jumlah film yang dibuat " + rp4.getNamaSutradara() + " adalah " + rp4.getJumlahFilm());
        Film[] f4 = rp4.getListFilm();
        System.out.print("|| ");
        for (int i = 0; i < rp4.getJumlahFilm(); i++) {
            System.out.print(f4[i].getNamaFilm() + " || ");
        }
    }
}