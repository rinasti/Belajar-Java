import java.util.Scanner;
public class AngkaError {
    public static void main(String[] args){
        // buat objek Scanner 
        System.out.print("Masukkan sembarang angka: ");
        Scanner input = new Scanner(System.in);
        int angka;
        try{
            angka = input.nextInt();
            System.out.print("Angka yang dimasukkan: " + angka);
        } catch (Exception  e) {
            System.out.print("Inputan salah!");

        }
    }
}
    
