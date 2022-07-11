package day13;

import java.util.Scanner;

public class Generics_main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Generics_func<Integer> g =  new Generics_func<Integer>(10,20,30);
		Generics_func<String> g1 =  new Generics_func<String>("Siva","siva2","parrot");
		g.compare();
		g1.compare();
		

}
}
