public class Penonton {
    // property
    private String nama;
    private Film[] listFilm = new Film[1000];
    private int jumlahFilm = 0;

    // konstruktor
    public Penonton(String nama) {
        this.nama = nama;
    }

    // method
    public String getNamaPenonton() {
        return nama;
    }

    public void nontonFilm(Film f) {
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
        Penonton p1 = new Penonton("Abas");
        Penonton p2 = new Penonton("Yogi");
        Penonton p3 = new Penonton("Anisa");

        p1.nontonFilm(new Film("Dilan 1991"));
        p1.nontonFilm(new Film("Avenger: Endgame"));
        p2.nontonFilm(new Film("Dilan 1991"));
        p2.nontonFilm(new Film("Avenger: Endgame"));
        p3.nontonFilm(new Film("Dilan 1991"));

        System.out.println("Jumlah film yang ditonton " + p1.getNamaPenonton() + " adalah " + p1.getJumlahFilm());
        Film[] f1 = p1.getListFilm();
        System.out.print("|| ");
        for (int i = 0; i < p1.getJumlahFilm(); i++) {
            System.out.print(f1[i].getNamaFilm() + " || ");
        }
        System.out.println("\n");

        System.out.println("Jumlah film yang ditonton " + p2.getNamaPenonton() + " adalah " + p2.getJumlahFilm());
        Film[] f2 = p2.getListFilm();
        System.out.print("|| ");
        for (int i = 0; i < p2.getJumlahFilm(); i++) {
            System.out.print(f2[i].getNamaFilm() + " || ");
        }
        System.out.println("\n");

        System.out.println("Jumlah film yang ditonton " + p3.getNamaPenonton() + " adalah " + p3.getJumlahFilm());
        Film[] f3 = p3.getListFilm();
        System.out.print("|| ");
        for (int i = 0; i < p3.getJumlahFilm(); i++) {
            System.out.print(f3[i].getNamaFilm() + " || ");
        }
    }
}

class Film {
    private String namaFilm;

    public Film(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public String getNamaFilm() {
        return namaFilm;
    }
}