public class ArrayInputOutputDemo {
    public static void main(String[] args){
        // deklarasi dan ciptakan array
        double[] arrNilai = new arrNilai[10];
       
        // inputkan nilai pada setiap elemen array
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + arrNilai.length + " values: ");
        for (int i = 0; i < arrNilai.length; i++)
        arrNilai[i] = input.nextDouble();

       
        // outputkan setiap elemen array yang sudah diinputkan
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print(arrNilai[i] + " ");
           
            
        }
    } 
}
