package Hash.Table;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AppTest{
        @Test
        public void addTest() throws Exception {

                HashTable<String,Integer> hashTable= new HashTable<>();
                hashTable.add("13", 50);
                System.out.println( hashTable.contains("13"));
                assertTrue(hashTable.contains("13"));
        }

        }