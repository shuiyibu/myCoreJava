package chapter12.pair2;

import chapter12.Pair;

public class PairTest2 {
	public static void main(String[] args) {
		String[] words = { "Mary", "had", "a", "little", "lamb" };
		Pair<String> mm=ArrayAlg.minmax(words);
		System.out.println("min = "+mm.getFirst());
		System.out.println("max = "+mm.getSecond());

	}
}

class ArrayAlg {

	public static Pair<String> minmax(String[] a) {
		if (a == null || a.length == 0)
			return null;

		String min = a[0];
		String max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i].compareTo(min) < 0)
				min = a[i];
			if (a[i].compareTo(max) > 0)
				max = a[i];
		}
		return new Pair<>(min, max);

	}
}