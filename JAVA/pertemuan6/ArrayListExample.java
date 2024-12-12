import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Deklarasi list dari objek Mobil
        ArrayList<Mobil> listMobil = new ArrayList<Mobil>();

        // Instance setiap member list dengan menambahkan kedalam list
        for (int i = 0; i < 10; i++) {
            listMobil.add(new Mobil("BE.3010.1" + (i + 1)));
        }

        // Print the plat numbers
        for (int i = 0; i < 10; i++) {
            System.out.println(listMobil.get(i).getPlat());
        }
    }
}