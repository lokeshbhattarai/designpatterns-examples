package iterator;

import java.util.function.Predicate;

public class MyFilter implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.equals("-");
	}

}
