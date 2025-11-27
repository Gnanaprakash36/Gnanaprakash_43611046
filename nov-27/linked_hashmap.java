import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
public class linked_hashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1,"Apple");
		lhm.put(2,"Orange");
		lhm.put(3,"Grapes");
		lhm.put(4,"Mango");
		
	System.out.println("printing linkedhashmap value using for-each:");
	for(Map.Entry<Integer,String> entry:lhm.entrySet()){
		System.out.println("Key:"+entry.getKey()+"  value:"+entry.getValue());
	}
	
	System.out.println("printing linkedhashmap value using iterator");
	Iterator<Map.Entry<Integer,String>> iterator=lhm.entrySet().iterator();
	while(iterator.hasNext()){
		Map.Entry<Integer,String> entry=iterator.next();
		System.out.println("Key"+entry.getKey()+"  value:"+entry.getValue());
	}
	System.out.println("The value of key 3 is:"+lhm.get(3));
	
	System.out.println("After removing 2nd value");
	lhm.remove(2);
	for(Map.Entry<Integer,String> entry:lhm.entrySet()){
		System.out.println("Key:"+entry.getKey()+"  value:"+entry.getValue());
	}
	}

}
