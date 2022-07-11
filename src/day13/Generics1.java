package day13;

class Generics1<T extends Comparable<T>> {
	T[] vals;
	/*
	 * constructor for initializing val as o;
	 */
	Generics1(T[] o) {
		vals = o;
	}
	/*
	 * Method to find the max of given data
	 */
	public T max() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) > 0)
				v = vals[i];
		return v;
	}
}