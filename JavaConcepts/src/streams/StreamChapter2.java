package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamChapter2 {
	public static void main(String[] args) {
		List<List<String>> newList = Arrays.asList(Arrays.asList("Jainam", "Shreya", "Bachu1"),
				Arrays.asList("Yogesh", "Varsha", "Jainam", "Kashvi"),
				Arrays.asList("Ratilal", "Zaver", "Julie", "Yogesh", "Bhavna"));
		Set<String> intermediateResult = new HashSet<>();
		LinkedHashSet<String> newSet= new LinkedHashSet<>();
		intermediateResult=newList.stream().flatMap(List::stream).collect(Collectors.toCollection(LinkedHashSet::new));
		intermediateResult.forEach(System.out::println);
		System.out.println("\nNew List::");
		intermediateResult.stream().map(x->x.toUpperCase()).filter(x->x.contains("J")).forEach(System.out::println);
		
		Optional<String> av=intermediateResult.stream()
	    .peek(name -> System.out.println("Before Map: " + name)) // Spy 1
	    .map(String::toUpperCase)
	    .peek(name -> System.out.println("After Map: " + name))  // Spy 2
	    .filter(x -> x.contains("J"))
	    .findFirst();
		System.out.println(av.get());
	}
}
