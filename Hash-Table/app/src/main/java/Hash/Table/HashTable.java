package Hash.Table;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable< K, V> {

    private ArrayList<HashNode<K, V>> bucketArray ;
    private int numBuckets; // size of the array private int size;
    private int size; // size of the array private int size;

    public HashTable() {
        this.bucketArray = new ArrayList<>();
        this.numBuckets = 10;
        this.size = 0;
        for (int i = 0 ; i< numBuckets; i++){ this.bucketArray.add(null); }
    }


    public int size() {

        return size;
    };
    boolean isEmpty(){

        return size()==0;
    }

// to get the hashCode of the key value :
private final int hashCode(K key){ return Objects.hashCode(key); }

    private int getBucketIndex(K key){

        int hashCode= hashCode(key);
        int index = hashCode% numBuckets;
// for negative hashCodes :
        index = index<0 ? index*-1 : index;
        return index;
    }

    public V remove (K key ){

        int bucketIdx= getBucketIndex(key);
        int hashCode= hashCode(key);
        HashNode<K,V> head = bucketArray.get(bucketIdx);
        HashNode<K,V > prev = null;
        while (head!=null){
            if (hashCode==head.hashCode && head.key.equals(key)) break;
            prev=head;
            head=head.getNext();
        }
        if (head == null)
            return null;
        size--;
        if (prev!=null){prev.setNext(head.getNext());}
        else  bucketArray.set(bucketIdx, head.getNext());
        return head.value;
    }

    public void add(K key , V value){

        int bucketIdx = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K , V> head= bucketArray.get(bucketIdx);
// in case the key was already added we check the key then add the value .
        while (head!=null)
        { if (head.key.equals(key) && key.hashCode()==hashCode){
            head.value=value;
            return;}
            head=head.getNext();
        }
        size++;
// in case the key was not inserted , then create new bucket to the new key :
        head=bucketArray.get(bucketIdx);
        HashNode<K , V > newNode = new HashNode<>(key,value,hashCode);
        newNode.next=head;
        bucketArray.set(bucketIdx,newNode);


        if ((1.0 * size) / numBuckets >= 0.7) {

            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {

                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;}}}
    }


    public V get(K key) {

// get the head of the linkedlist chain :
int bucketIndex = getBucketIndex(key); int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

// Search key in chain
        while (head != null) {

            if (head.key.equals(key) && head.hashCode == hashCode)
                return head.value;
            head = head.next;
        }
// in case there was no key found :
        return null;
    }

    public boolean contains(K key) throws Exception { try { get(key);
        return true; } catch (Exception e) { return false; }
    }

}