import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Demo<T extends Number> {
	
}

public class Generics1 {

	public static void main(String[] args) {

		Demo<Number> valuess = new Demo<Number>();
		
		List<String> values = new ArrayList<String>();
		values.add("dog");
		values.add("cat");
		
		System.out.println(values);
		
		Collections.addAll(values, "egg", "apple", "ball");
		
		System.out.println(values);
		
		Collections.sort(values);
		
		System.out.println(values);
		
		System.out.println(Collections.binarySearch(values, "egg"));
		
		List<String> dest_list = new ArrayList<String>();
		dest_list.add("pen");
		dest_list.add("book");
		dest_list.add("cat");
		dest_list.add("mouse");
		
		List<String> source_list = new ArrayList<String>();
		source_list.add("pig");
		source_list.add("pig2");
		source_list.add("pig3");
		source_list.add("pig4");
		
		Collections.copy(dest_list, source_list);
		
		System.out.println(source_list);
		System.out.println(dest_list);
		
		System.out.println(Collections.disjoint(values, source_list));
		
	}

}
