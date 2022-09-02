package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Pubsap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Inserting elements to ArrayList class object
		// Custom input integer numbers
		al.add(2);
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(20);
		
		List<String> countries = new ArrayList<String>();
			countries.add(null);
			countries.add("Albania");
			countries.add("Australia");
			countries.add("Singapore");
			countries.add("India");
			countries.add("iran");
			countries.add("Peru");

			
//List<String> output  = {"AustraliaAA","AlbaniaAA"};


		for(int a : al) {
			System.out.println("line20{}" + a);
		}
		
		List<Integer> l2 = al.stream().filter(i -> i%2==0).collect(Collectors.toList()); 
		System.out.println("line22:" + l2);
		
		System.out.println("line22:" + countries);
		List<String> l3 = countries.stream().filter(s -> (s != null) && ( s.startsWith("A"))).map(s -> s.concat("AA")).collect(Collectors.toList()); 
		System.out.println("line22:" + l3);

		
	}

}
