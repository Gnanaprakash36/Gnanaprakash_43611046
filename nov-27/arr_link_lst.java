import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class arr_link_lst {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist=new ArrayList<>();
		long startarray=System.nanoTime();
		for(int i=1;i<=10;i++){
			arraylist.add(i);
		}
		long endarray=System.nanoTime();
		System.out.println("printing arraylist values(using for each)");
		for(int value:arraylist){
			System.out.println(value+" ");
		}
		
		System.out.println("printing arraylist values(using iterator");
		Iterator<Integer> arrayiterator=arraylist.iterator();
		while(arrayiterator.hasNext()){
			System.out.println(arrayiterator.next()+" ");
			System.out.println("\n");
		}

		
		LinkedList<Integer> linkedlist=new LinkedList<>();
		long startlinked=System.nanoTime();
		for(int i=11;i<=20;i++){
			linkedlist.add(i);
		}
		long endlinked=System.nanoTime();
		
		System.out.println("Linked List values printing using for each");
		for(int value:linkedlist){
			System.out.println(value+" ");
		}
		
		System.out.println("Linked List values print using Iterator");
		Iterator<Integer> linkediterator=linkedlist.iterator();
		while(linkediterator.hasNext()){
			System.out.println(linkediterator.next()+" ");
			System.out.println("\n");
		}
		
	System.out.println("Time taken by ArrayList:"+(endarray-startarray)+"ns");
	System.out.println("Time taken by linkedList:"+(endlinked-startlinked)+"ns");
	}

}
