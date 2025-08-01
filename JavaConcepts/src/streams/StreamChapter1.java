package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamChapter1 {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "pineapple", "cherry", "dates");
		// Function
		Function<String, String> f1 = fruit -> fruit.toUpperCase();
		String res = f1.apply(fruits.get(0));
		System.out.println("Result of Function::" + res);

		// Predicate takes input and returns boolean
		Predicate<String> p1 = p -> p.startsWith("p");
		Boolean res2 = p1.test(fruits.get(0));
		System.out.println(res2);

		// Consume takes input but returns nothing
		Consumer<String> c1 = c -> System.out.println(c);
		c1.accept(fruits.get(0));

		// Supplier takes no input but returns
		Supplier<Double> s1 = () -> Math.random();
		Double res3 = s1.get();
		System.out.println("Supplier:- " + res3);

		// to reverse each character of fruits and filter only words with 6 characters

		Set<String> resultFinal = fruits.stream().map(fruit -> {
			char[] charArray = fruit.toCharArray();
			String result = "";
			for (int i = charArray.length - 1; i >= 0; i--) {
				result += charArray[i];
			}
			return result;
		}).filter(f -> f.length() == 6).collect(Collectors.toSet());
		System.out.println("Final List::" + resultFinal);

	}

}
