public class percobaan {
    java
    try {
    int angka = 10 / 0; // Akan menyebabkan ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    } finally {
        System.out.println("Ini akan selalu dieksekusi");
    }

}
