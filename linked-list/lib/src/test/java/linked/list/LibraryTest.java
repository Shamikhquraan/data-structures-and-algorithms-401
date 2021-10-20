/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest<string> {
    LinkedList testList = new LinkedList();

    @Test
    public void testEmptyLinkedList() {
        String output = testList.toString();
        assertEquals( "NULL", output,"Must be NULL");
    }
    @Test
    public void testInsertToList() {
        testList.insert(20);
        String output = testList.toString();
        assertEquals( " { 20 } --> NULL", output,"Must be { 20 } --> Null");
    }

    @Test
    public void testInsertMultipleToList() {
        testList.insert(7);
        testList.insert(6);
        testList.insert(5);
        testList.insert(4);
        String output = testList.toString();
        String expected = " { 4 } -->  { 5 } -->  { 6 } -->  { 7 } --> NULL";
        assertEquals( expected, output,"Must be  { 4 } -->  { 5 } -->  { 6 } -->  { 7 } --> NULL");
    }

    @Test
    public void testIncludeExistValue() {
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        boolean isFound = testList.includes(8);
        assertTrue( isFound,"Must be true");
    }

    @Test
    public void testNotIncludeValue() {
        testList.insert(7);
        testList.insert(8);
        testList.insert(9);
        boolean isNotFound = testList.includes(5);
        assertFalse( isNotFound,"Must be False");
    }
    @Test
    public void testRuternAllValueInList() {
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);
        String output = testList.toString();
        String expected = " { 4 } -->  { 3 } -->  { 2 } -->  { 1 } --> NULL";
        assertEquals( expected,output,"Must be   { 4 } -->  { 3 } -->  { 2 } -->  { 1 } --> NULL");
    }
    @Test public void testAddToTheEnd(){
        testList.insert(7);
        testList.append(10);
        testList.append(11);
        testList.append("im the final one");
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { im the final one } --> NULL";
        assertEquals(expected,output);
    }
    @Test public void testInsertBeforeTheMiddleValue(){
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertBefore(11,"im the middle value");
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { im the middle value } -->  { 11 } -->  { 12 } --> NULL";
        assertEquals(expected,output);
    }
    @Test public void testInsertBeforeTheFirstValue(){
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertBefore(7,"im the middle value");
        String output = testList.toString();
        String expected = " { im the middle value } -->  { 7 } -->  { 10 } -->  { 11 } -->  { 12 } --> NULL";
        assertEquals(expected,output);
    }
    @Test public void testInsertAfterTheMiddleValue(){
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertAfter(11,"after thr middle");
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { after thr middle } -->  { 12 } --> NULL";
        assertEquals(expected,output);
    }
    @Test public void testInsertAfterTheLastValue(){
        testList.insert(7);//the first element (head)
        testList.append(10);
        testList.append(11);
        testList.append(12);
        testList.insertAfter(12,"after thr lastValue");
        String output = testList.toString();
        String expected = " { 7 } -->  { 10 } -->  { 11 } -->  { 12 } -->  { after thr lastValue } --> NULL";
        assertEquals(expected,output);

    }

    public void testKth() {
        LinkedList list = new LinkedList();
        list.insert("emam");
        list.insert("ahmed");
        list.insert("ali");

        System.out.println(list.kth(2));
        String note = list.kth(2);
        assertEquals(" the elemnt is ali.", note);
    }
    @Test
    public void testKthGreaterThanTheList() {
        LinkedList list = new LinkedList();
        list.insert("emam");
        list.insert("ahmed");
        list.insert("ali");

        System.out.println(list.kth(4));
        String note = list.kth(4);
        assertEquals("number can't be higher than the length of the list", note);
    }
    @Test
    public void testKthSmallerThanTheList() {
        LinkedList list = new LinkedList();
        list.insert("emam");
        list.insert("ahmed");
        list.insert("ali");

        System.out.println(list.kth(-1));
        String note = list.kth(-1);
        assertEquals("K is negative number", note);
    }
    @Test
    public void testzipList() {
        LinkedList newList3 = new LinkedList();

        newList3.insert(5);
        newList3.insert(6);
        newList3.insert(9);
        newList3.insert(2);
        newList3.insert(2);
        System.out.println("first Linked List:");
        System.out.println(newList3.toString());
        LinkedList newList2 = new LinkedList();
        newList2.insert(4);
        newList2.insert(3);
        newList2.insert(2);
        newList2.insert(1);
        newList2.insert(0);
        newList2.push(8);
        newList2.push(7);
        newList2.push(6);
        newList2.push(5);
        newList2.push(4);
        System.out.println("second Linked List:");
        System.out.println(newList2.toString());

        System.out.println("merge Linked List:");
       newList2.merge(newList3);
       string output = (string) newList2.toString();
        String expected =" { 4 } -->  { 2 } -->  { 5 } -->  { 2 } -->  { 6 } -->  { 9 } -->  { 7 } -->  { 6 } -->  { 8 } -->  { 5 } -->  { 0 } -->  { 1 } -->  { 2 } -->  { 3 } -->  { 4 } --> NULL";
        assertEquals(expected, output);
    }
}


