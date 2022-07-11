package day13;


public class Generics_main {
	public static void main(String[] args) {
		/*
		 * creating object to implement different data types.
		 */
		Generics_func<Integer> g =  new Generics_func<Integer>(10,20,30);
		Generics_func<String> g1 =  new Generics_func<String>("Siva","siva2","parrot");
		g.compare();
		g1.compare();
		/*
		 * creating objects to accept multiple argumnets.
		 */
		Integer inums[]={10,2,5,4,6,1};
		Character chs[]={'v','p','s','a','n','h'}; 
		Double d[]={20.2,45.4,71.6,88.3,54.6,10.4};
		Generics1<Integer> iob = new Generics1<Integer>(inums);
		Generics1<Character> cob = new Generics1<Character>(chs);
		Generics1<Double>dob = new Generics1<Double>(d);
		System.out.println("Max value in inums: " + iob.max());
		System.out.println("Max value in chs: " + cob.max());
		System.out.println("Max value in chs: " + dob.max());
		
		

}
}
