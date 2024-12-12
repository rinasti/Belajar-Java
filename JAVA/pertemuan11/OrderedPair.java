public class OrderedPair<K, V> {
    private K key;
    private String value;
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = (String)value;
    }
    public K getKey() {
        return key;
    }
    public String getValue()
    {
        if(this.key == "aaa")
            return this.value;
        else 
            return "salah";
    }

    public static void main(String[] args)
    {
        OrderedPair<String, String> p2 = new OrderedPair<String, String>("aaa", "2");
        System.out.println(p2.getValue());
    }


    
}
