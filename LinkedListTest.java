import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

/**LinkedListTest uses Junit tester
 * @author mehja22r
 */
public class LinkedListTest {
	
	
	/**test1 checks insertFirst method**/
	@Test
	public void test1() {
		//create new list
		LinkedList<String> list =  new LinkedList<String>();
		//put node with a in list
		list.insertFirst("a");
		//check if a is in list
		assertEquals("a", list.toString());
	}
	
	/**test2 checks getFirst method**/
	@Test
	public void test2() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("a");
		list.insertFirst("b");
		list.getFirst();
		//check if "b" is the first node
		assertEquals("b", list.getFirst());
	}
	
	/**test3 checks getFirstNode**/
	@Test
	public void test3() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("a");
		list.getFirstNode();
	}
	
	/**test4 checks getLast method**/
	@Test
	public void test4() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("a");	 //a is the first node
		list.insertLast("b");   //b is in the 2nd
		list.insertLast("c");	//c is third
		assertEquals("c", list.getLast());          //check getLast
	}
	
	/**test5 checks getLastNode method**/
	@Test
	public void test5() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("a");
		list.insertLast("b");
		list.getLastNode();
	}
	
	/**test6 checks insertAfter method**/
	@Test
	public void test6() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("a");
		list.insertAfter(list.getFirstNode(), "cs");
		assertEquals("a -> cs", list.toString());
	}
	
	/**test7 checks deleteFirst method**/
	@Test
	public void test7() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("a");    //inserting a node
		list.insertFirst("b");
		list.deleteFirst();       //making the node null
		assertEquals("a", list.toString());  //there should be no data
	}
	
	/**test8 checks deleteLast method**/
	@Test
	public void test8() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("a");
		list.insertFirst("d");
		list.insertFirst("e");
		list.insertAfter(list.getFirstNode(),"b");
		list.insertLast("c");
		list.deleteLast();
		//System.out.println(list.toString());
		//"c" shouldn't be in the list
		assertEquals("e -> b -> d -> a", list.toString());  
	}
	
	/**test9 checks insertLast method**/
	@Test
	public void test9() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("da");
		list.insertAfter(list.getFirstNode(), "ja");
		list.insertLast("cs"); 
		assertEquals("da -> ja -> cs", list.toString());  //"cs" should be in the last node
	}
	
	/**test10 checks deleteNext method**/
	@Test
	public void test10() {
		LinkedList<String> list =  new LinkedList<String>();
		list.insertFirst("a");
		list.insertAfter(list.getFirstNode(), "b");
		//delete the node after a
		list.deleteNext(list.getFirstNode());
		//a is the only item since be has been deleted
		assertEquals("a", list.toString());
	}
	
	/**test11 checks size method**/
	@Test
	public void test11() {
		LinkedList<String> list =  new LinkedList<String>();
		
		//inserting 2 nodes
		list.insertFirst("a");  
		list.insertLast("b");
		
		//size is 2
		assertEquals(2, list.size());
	}
	
	/**test12 checks isEmpty method**/
	@Test
	public void test12() {
		LinkedList<String> list =  new LinkedList<String>();
		assertEquals(true, list.isEmpty());		//return true because list is empty
	}
	
	/**mainTest creates a list full of strings**/
	@Test
	public void mainTest() {
		
		//created a new LinkedList called List**/
		LinkedList<String> list =  new LinkedList<String>();
		assertEquals("", list.toString());
		System.out.println(list.toString());
		
		//inserting data "a" in the first node
		list.insertFirst("a");
		assertEquals("a", list.toString());
		System.out.println(list.toString());
		
		//inserting node with data "v" in first place
		list.insertFirst("v");
		assertEquals("v -> a", list.toString());
		System.out.println(list.toString());
		
		//inserting node with data "a" in first position, and pushing nodes with "v", "a" in 2nd and 2rd space
		list.insertFirst("a");
		assertEquals("a -> v -> a", list.toString());
		System.out.println(list.toString());
		
		list.insertFirst("l");
		assertEquals("l -> a -> v -> a", list.toString());
		System.out.println(list.toString());
		
		list.insertFirst("o");
		assertEquals("o -> l -> a -> v -> a", list.toString());
		System.out.println(list.toString());
		
		list.insertFirst("i");
		assertEquals("i -> o -> l -> a -> v -> a", list.toString());
		System.out.println(list.toString());
		
		//insert node with data "j" in 3rd place
		list.insertAfter(list.getFirstNode().getNext(), "j");
		assertEquals("i -> o -> j -> l -> a -> v -> a", list.toString());
		System.out.println(list.toString());
		
		//insert node with "e" in 3rd place
		list.insertAfter(list.getFirstNode().getNext(), "e");
		assertEquals("i -> o -> e -> j -> l -> a -> v -> a", list.toString());
		System.out.println(list.toString());
		
		list.insertAfter(list.getFirstNode().getNext(), "v");
		assertEquals("i -> o -> v -> e -> j -> l -> a -> v -> a", list.toString());
		System.out.println(list.toString());
		
		//insert "l" in 2nd place
		list.insertAfter(list.getFirstNode(), "l");
		assertEquals("i -> l -> o -> v -> e -> j -> l -> a -> v -> a", list.toString());
		System.out.println(list.toString());
		
		//delete the 6th node
		list.deleteNext(list.getFirstNode().getNext().getNext().getNext().getNext());
		assertEquals("i -> l -> o -> v -> e -> l -> a -> v -> a", list.toString());
		System.out.println(list.toString());
	}

}
