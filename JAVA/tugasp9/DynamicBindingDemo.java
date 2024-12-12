public class DynamicBindingDemo {
    public static void main(String[] args) {
        Kendaraan[] kendaraan = new Kendaraan[5];
        kendaraan[0] = new Mobil("Toyota", 2020, 4);
        kendaraan[1] = new SepedaMotor("Honda", 2019, true);
        kendaraan[2] = new Truk("Isuzu", 2021, 2, 5.0, 6);
        kendaraan[3] = new Bus("Mercedes", 2022, 2, 10.0, 30);
        kendaraan[4] = new MobilBerat("Mitsubishi", 2018, 4, 7.5);

        for (Kendaraan k : kendaraan) {
            k.info(); // Dynamic Binding
            System.out.println();
        }
    }
}
