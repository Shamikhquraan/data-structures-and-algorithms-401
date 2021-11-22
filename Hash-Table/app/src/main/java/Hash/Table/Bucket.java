package Hash.Table;

public class Bucket<K, V> {
    public K key;
    public   V value;
    public Bucket next;

    Bucket(K key, V value) {
        this.key = key;
        this.value = value;
    }
}