import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {

		List<String> values = new ArrayList<String>();
		values.add("dog");
		values.add("cat");
		
		System.out.println(values);
		
		Collections.addAll(values, "egg", "apple", "ball");
		
		System.out.println(values); // [dog, cat, egg, apple, ball]
		
		Collections.sort(values);
		
		System.out.println(values); // [apple, ball, cat, dog, egg]
		
		System.out.println(Collections.binarySearch(values, "egg")); //4
		
		System.out.println(Collections.binarySearch(values, "cgg")); //-3
		
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
		
		System.out.println(dest_list); //[pig, pig2, pig3, pig4]
		
		System.out.println(Collections.disjoint(values, source_list)); //true
		
	}

}
