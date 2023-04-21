package KonuOzetleri;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionsSetMethods {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		
		Set<String> set1 = new HashSet<>();
		
		// Set kume mantigiyla calistigi icin tekrarli elaman kabul etmez..
		// Ayni elemani yeni elaman olarak eklediginizde ilkini siler ve yenisini kabul eder...
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 1-add() methodu ; Set弾 eleman ekler
		set1.add("F");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("X");
		set1.add("Y");
		System.out.println("1-add methodu : " + set1); 
		// 1-add methodu : [A, B, C, F, X, Y]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 2-addAll(coll); istenen collection段n tum elemanlarini ekler
		// Yeni bir collections oluturup set1 e ekleme yapalim...
		
		Set<String> set2 = new HashSet<>(Arrays.asList("1","2","3"));
		
		System.out.println("Set2 Collecion : " + set2);
		// Set2 Collecion : [1, 2, 3]
		
		set1.addAll(set2);
		System.out.println("2-addAll methodu : " + set1); 
		// 2-addAll methodu : [A, 1, B, 2, C, 3, F, X, Y]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 3-clear() methodu ; Tum elemanlari siler
		set2.clear();
		System.out.println("3-clear() methodu : " + set2);
		// 3-clear() methodu : []
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 4-contains(eleman) methodu ; istenen eleman sett稚e varsa true, yoksa false dondurur
		set1.contains("X");
		System.out.println("4-contains(eleman) methodu : " + set1.contains("X"));
		// 4-contains(eleman) methodu : true
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 5-containsAll(coll) methodu ; istenen coll段n tumu aranan sette var ise true, yoksa false dondurur
		
		System.out.println("5-containsAll(coll) methodu : " + set1.contains(set2));
		// 5-containsAll(coll) methodu : false

		Set<String> set3 = new HashSet<>(Arrays.asList("1","2","3"));
		Set<String> set4 = new HashSet<>(Arrays.asList("1","2","3"));
		
		System.out.println("5-containsAll(coll) methodu : " + set3.containsAll(set4));
		// 5-containsAll(coll) methodu : true
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 6-equals(set) methodu ; istenen set値e tum elemanlar ayni ise true, yoksa false dondurur
		System.out.println("6-equals(set) methodu : " + set3.equals(set4)); // true
		// 6-equals(set) methodu : true
		
		System.out.println("6-equals(set) methodu : " + set1.equals(set3)); 
		// 6-equals(set) methodu : false
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 7-isEmpty() methodu ; Sette hic eleman yoksa true, varsa false dondurur
		
		System.out.println("7-isEmpty() methodu : " + set2.isEmpty());
		// 7-isEmpty() methodu : true
		
		System.out.println("7-isEmpty() methodu : " + set4.isEmpty());
		// 7-isEmpty() methodu : false
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 8-remove(eleman) methodu ; istenen eleman bulursa siler ve true dondurur, bulamazsa false dondurur
		set3.remove("2");
		System.out.println("8-remove methodu : " + set3);
		// 8-remove methodu : [1, 3]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 9-removeAll(coll) methodu ; coll地in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false dondurur
		System.out.println("9-removeAll(coll) methodu : " + set3.removeAll(set4)); 
		// 9-removeAll(coll) methodu : true
		System.out.println("9-removeAll(coll) methodundan sonra : " + set3); // []
	
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 10-size() methodu ; set段n eleman sayisini verir
		
		System.out.println("10-size() methodu : " + set1.size());
		// 10-size() methodu : 9
		
		System.out.println("10-size() methodu : " + set2.size());
		// 10-size() methodu : 0
		
		System.out.println("10-size() methodu : " + set3.size());
		// 10-size() methodu : 0
		
		System.out.println("10-size() methodu : " + set4.size());
		// 10-size() methodu : 3
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 11-retainAll() methodu : ornegin set1 de calisir set2 deki elemanlari tutar ve  set2 de olmayanlari siler.
		set1.retainAll(set4); 
		System.out.println(set1); // [1, 2, 3]
		System.out.println(set4); // [1, 2, 3]
		// set1 ve set 4 u ayni elemanlar oldugu surece Ayni standarda getirir.
	
	}
		
		

		
	}


