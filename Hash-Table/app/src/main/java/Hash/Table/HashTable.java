package Hash.Table;

import java.util.ArrayList;

public class HashTable<K, V> {
    private static final double loadThreshold = 0.7;
    public ArrayList<Bucket> bucketArray;
    private int numBuckets;
    private int size;
    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }
    }

    public void add(K key, V value) {
        int bucketIndex = hash(key);
        Bucket head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                System.out.println(key+" value changed to "+ value);
                return;
            }
            head = head.next;
        }

        size++;
        head = bucketArray.get(bucketIndex);
        Bucket newNode = new Bucket(key, value);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);
        if ((1.0 * size) / numBuckets >= loadThreshold) {
            ArrayList<Bucket> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++) {
                bucketArray.add(null);
            }
            for (Bucket headNode : temp) {
                while (headNode != null) {
                    add((K) headNode.key,(V) headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public void getSize() {
        System.out.println( bucketArray.size());
    }

    public V get(K key) {
        int bucketIndex = hash(key);
        Bucket head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return (V) head.value;
            }
            head = head.next;
        }
        return null;
    }


    public boolean contain(K key) {
        int bucketIndex = hash(key);
        Bucket head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }


    public int hash(K key) {
        return (Math.abs(key.hashCode())) % bucketArray.size();
    }
}