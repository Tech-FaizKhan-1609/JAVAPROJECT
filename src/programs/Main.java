package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();
	      list.add("one");
	      list.add("two");
	      list.add("three");
	      
	      Iterator<String> iterator = list.iterator();
	      while (iterator.hasNext()) {
	         System.out.println(list.remove(iterator.next()));
	            
	         
	      }
	      System.out.println(list);
	}

}
