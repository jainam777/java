package lambda;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperator {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>(List.of("cat","dog","elephant"));
		list.replaceAll(s->s.toUpperCase());
		System.out.println(list.toString());
		list.removeIf(s->s.contains("D"));
		System.out.println(list.toString());
	}
}
