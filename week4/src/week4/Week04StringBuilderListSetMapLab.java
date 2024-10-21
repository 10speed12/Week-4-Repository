package week4;
import java.util.*;

public class Week04StringBuilderListSetMapLab {
	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<9;i++) {
			builder.append(i);
			builder.append('/');
		}
		builder.append(9);
		System.out.println(builder.toString());
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> listStr=new ArrayList<String>();
		listStr.add("Bob");
		listStr.add("Thane");
		listStr.add("Jobare");
		listStr.add("Kabooom");
		listStr.add("Ok");
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		String shortest=shortestString(listStr);
		System.out.println(shortest);
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		listStr=swapFirstLast(listStr);
		System.out.println(listStr.getFirst()+" "+listStr.getLast());
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(toStringL(listStr));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		listStr.add("Thawne");
		listStr.add("Bobby");
		listStr.add("Gppffadg");
		listStr.add("Zoom");
		List<String> oomSearch=search(listStr,"oom");
		System.out.println(toStringL(oomSearch));
		System.out.println(toStringL(search(listStr,"Tha")));
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> listNum=new ArrayList<Integer>();
		for(int i=0;i<20;i++) {
			listNum.add(i);
		}
		List<List<Integer>> divisorLists=sortDivisibleNumbers(listNum);
		for(int i=0;i<divisorLists.size();i++) {
			System.out.println(divisorLists.get(i).toString());
		}
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println(lengthList(listStr).toString());
		System.out.println(lengthList(oomSearch).toString());
		
		// 9. Create a set of strings and add 5 values
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add(shortest);
		set.add("Object");
		set.add("Force");
		set.add("JavaScript");
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println(startsWith(set,'O').toString());

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		List<String> setList = toList(set);
		System.out.println(setList.toString());
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> intSet=new HashSet<Integer>();
		intSet.add(4);
		intSet.add(6);
		intSet.add(3);
		intSet.add(7);
		intSet.add(514);
		Set<Integer> evens = evenSet(intSet);
		System.out.println(evens.toString());
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		HashMap<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("Game","An activity providing entertainment or amusement; a pastime.");
		dictionary.put("Hero","A person noted for feats of courage or nobility of purpose, especially one who has risked or sacrificed his or her life");
		dictionary.put("Definintion","A  statement of the meaning of a word, phrase, or term, as in a dictionary entry.");
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(mapGet(dictionary, "Game"));
		System.out.println(mapGet(dictionary,"Bob"));
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		Map<Character,Integer> freqMap=letterCount(listStr);
		for (Character i : freqMap.keySet()) {
			  System.out.println("key: " + i + " value: " + freqMap.get(i));
		}
	}
	
	
	// Method 15:
	private static Map<Character,Integer> letterCount(List<String> list){
		Map<Character,Integer> res = new HashMap<Character,Integer>();
		for(String str:list) {
			if(res.containsKey(str.charAt(0))) {
				res.put(str.charAt(0),res.get(str.charAt(0))+1);
			}else {
				res.put(str.charAt(0),1);
			}
		}
		return res;
	}
	
	
	// Method 14:
	private static String mapGet(Map<String,String> map,String str) {
		if(map.containsKey(str)) {
			return map.get(str);
		}else {
			return "No key in map matches entered string.";
		}
	}

	
	// Method 12:
	private static Set<Integer> evenSet(Set<Integer> set){
		Set<Integer> evens = new HashSet<Integer>();
		for(int i: set) {
			if(i%2==0) {
				evens.add(i);
			}
		}
		return evens;
	}
	// Method 11:
	private static List<String> toList(Set<String> set){
		List<String> res = new ArrayList<String>();
		for(String str: set) {
			res.add(str);
		}
		return res;
	}


	// Method 10:
	private static Set<String> startsWith(Set<String> strSet, char c){
		Set<String> res = new HashSet<String>();
		for(String i: strSet) {
			if(i.charAt(0)==c) {
				res.add(i);
			}
		}
		return res;
	}

	
	// Method 8:
	private static List<Integer> lengthList(List<String> listStr){
		List<Integer> res=new ArrayList<Integer>();
		for(String str:listStr) {
			res.add(str.length());
		}
		return res;
	}

	
	// Method 7:
	private static List<List<Integer>> sortDivisibleNumbers(List<Integer> listInt){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> divideBy3 = new ArrayList<Integer>();
		List<Integer> divideBy5 = new ArrayList<Integer>();
		List<Integer> other = new ArrayList<Integer>();
		for(int i:listInt){
			boolean flag=false;
			if(i%2==0) {
				even.add(i);
				flag=true;
			}
			if(i%3==0) {
				divideBy3.add(i);
				flag=true;
			}
			if(i%5==0) {
				divideBy5.add(i);
				flag=true;
			}
			if(!flag) {
				other.add(i);
			}
		}
		res.add(even);
		res.add(divideBy3);
		res.add(divideBy5);
		res.add(other);
		return res;
	}
	// Method 6:
	private static List<String> search(List<String>listStr, String str){
		List<String> res=new ArrayList<String>();
		for(String i: listStr) {
			if(i.contains(str)) {
				res.add(i);
			}
		}
		return res;
	}
	// Method 5:
	private static String toStringL(List<String> listStr) {
		String res="";
		for(int i=0; i < listStr.size()-1;i++) {
			res+=listStr.get(i)+",";
		}
		res+=listStr.getLast();
		return res;
	}
	
	
	// Method 4:
	private static List<String> swapFirstLast(List<String> listStr){
		if(listStr.size()<=1) {
			return listStr;
		}
		String first=listStr.getFirst();
		listStr.set(0, listStr.get(listStr.size()-1));
		listStr.set(listStr.size()-1, first);
		return listStr;
		
	}
	
	
	// Method 3:
	private static String shortestString(List<String> listA) {
		String res=listA.getFirst();
		if(listA.size()>1) {
			for(int i=1;i<listA.size();i++) {
				if(Math.min(listA.get(i).length(), res.length())!=res.length()) {
					res=listA.get(i);
				}
			}
		}
		return res;
	}
	
}
