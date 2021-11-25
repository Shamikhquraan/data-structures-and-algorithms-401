package Hash.Table;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static Hash.Table.RepeatedWord.repeatedWord;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest{
        @Test
        public void addTest() throws Exception {

                HashTable<String,Integer> hashTable= new HashTable<>();
                hashTable.add("13", 50);
                System.out.println( hashTable.contain("13"));
                assertTrue(hashTable.contain("13"));
        }
        @Test void checkRepeatedTest() throws Exception {

                HashTable<String,Integer> hashTable= new HashTable<>();

                assertEquals("it", repeatedWord("It was the best of times, it was the worst of times, " +
                        "it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch " +
                        "of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, " +
                        "it was the winter of despair, we had everything before us, we had nothing before us, we were all going " +
                        "direct to Heaven, we were all going direct the other way – in short, the period was so far like the present " +
                        "period, that some of its noisiest authorities insisted on its being received, for good or for evil, " +
                        "in the superlative degree of comparison only..."));
        } @Test void checkSecond() throws Exception {

                String string = "A strawberry is a strawberry";
                HashTable<String,Integer> hashTable= new HashTable<>();
                assertEquals("a" ,repeatedWord(string));
        }
        @Test
        public void test_leftWithSomeJoins(){
                HashMap h1 = new HashMap();
                h1.put("Shamikh", "rami"); //
                h1.put("im", "angery"); //
                HashMap h2 = new HashMap();
                h2.put("Shamikh", "quraan");
                h2.put("ana", "what");
                h2.put("He", "sham");
                List<String> list = new ArrayList<>();
                list.add("guide: usher, null");
                list.add("shamikh: rami, quraan");
                assertEquals( list ,  HashLeftJoin.HashleftJoin(h1, h2));
        }


}