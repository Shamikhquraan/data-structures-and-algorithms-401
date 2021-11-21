## Hash Table :
- Data structure to handle/store key-value pairs.

## Challenge:
- Implement a Hashtable with the following methods:

* **add:** takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
* **get:** takes in the key and returns the value from the table.


## Approach & Efficiency (BigO)
* **add:** My approach was to check first if there will be a collision (same key) and handle appropriately the addition of the new key-value pair. Time complexity is O(1).

* **get:** My approach was to return the value of the given key after using the hash function to check the map. Time compexity is O(1).

* **hash:** Time complexity is O(1).

* **contains:** My approach is to first use the hash function to hash the given key and use it to check the map if it returns not null. Time complexity is O(1).

## API
- public void add(K key, V value)

- public String get(K key)

- publice remove(K key )
