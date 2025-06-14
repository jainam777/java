package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnaryOperator {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>(List.of("cat","dog","elephant"));
		list.replaceAll(s->s.toUpperCase());
		System.out.println(list.toString());
		list.removeIf(s->s.contains("D"));
		System.out.println(list.toString());
		List<Integer> list2= new ArrayList<>(List.of(2,5,7,9,34));
		
		list2.stream().filter(x->x%2==0).forEach(System.out::println);
		System.out.println(list2.stream().filter(x->x%2==0).collect(Collectors.toList()));
		String a="Jainam";
		a="Hjhj";
		System.out.println(a);
	}
}
