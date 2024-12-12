public class SingleObject {
    //buat static instance objek ini
    private static SingleObject instance = new SingleObject();
    
    //buat konstruktor secara private sehingga
    //tidak akan bisa di instance dengan cara biasa
    private SingleObject(){}
    
    //dapatkan instance
    public static SingleObject getInstance(){
        return instance;
    }

    //tampilkan pesan
    public void showMessage(){
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
