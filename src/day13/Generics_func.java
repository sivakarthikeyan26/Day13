package day13;

public class Generics_func<T extends Comparable<T>> {
	private T a;
	private T b;
	private T c;
	
	public Generics_func(T a, T b, T c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void compare() {
		if(a.compareTo(b)>0) {
			if(a.compareTo(c)>0) {
				System.out.println(a+" is greater");
			}
			else {
				System.out.println(c+" is greater");
			}
		}
		else if(b.compareTo(c)>0) {
			System.out.println(b+" is greater");
		}
	}
	


}
