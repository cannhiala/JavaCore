/**
 * 
 */
package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author CANTV
 *
 */
public class CreationStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Stream<String> stream = Stream.of("Java","C#", "C++", "PHP", "Javascript");
		   List<String> languages = stream.collect(Collectors.toList());
		   System.out.println(languages);
		   
		   languages.stream().filter(s -> s.startsWith("J")).forEach(s -> System.out.println(s));
	}

}
