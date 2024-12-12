import java.util.Scanner;
public class TestException
{
    public static void main(String[] args)
    {
        // buat objek scanner
        Scanner input = new Scanner(System.in);
        // kabari user untuk memasukkan angka sisi persegi
        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();
        System.out.print("Sisi: "+sisi);
    }
}