public class ArgumentVariabelDemo {
    public static void main(String[] args) {
        cetakMaks(34, 3, 3, 2, 56.5);
        cetakMaks(new double[]{1, 2, 3});
    }
    public static void cetakMaks(double... numbers) {
        if (numbers.length == 0) {
        System.out.println("tidak ada argumen.");
        return;
    }
    double result = numbers[0];
    for (int i = 1; i < numbers.length; i++)
        if (numbers[i] > result)
            result = numbers[i];
    System.out.println("Nilai maksimal: " + result);
    }  
}
