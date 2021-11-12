import java.util.Map;  
import java.util.HashMap;  
// java.lang.UnsupportedOperationException on adding new entry in map after getting immutable object of map
public class CollectionMethods{
public static void main(String[] args) {
	//Map<Integer,String> map = Map.of(101,"saurabh",102,"sagar",103,"mehul");
	//map.put(104,"xyz");
	Map.Entry m1 = Map.entry(101,"saurabh");
	Map.Entry m2 = Map.entry(102,"jignesh");
	Map<Integer,String> map = Map.ofEntries(m1,m2);
	for(Map.Entry<Integer,String> mapEntry : map.entrySet()){
		System.out.println(mapEntry);
	}
}
}