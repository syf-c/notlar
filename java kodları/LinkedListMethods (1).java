package KonuOzetleri;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMethods {

	@SuppressWarnings("unlikely-arg-type")
	
	public static void main(String[] args) {
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("erdem", "mehmet", "samet", "said", "yagmur"));
		
		System.out.println("0-Ilk Liste : " +ll1); 
		// 0-Ilk Liste : [erdem, mehmet, samet, said, yagmur]
		
		// Su sekilde de yapabilirdik...
		/*
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("erdem");
		ll1.add("mehmet");
		ll1.add("samet");
		ll1.add("said");
		ll1.add("yagmur");
		
		System.out.println(ll1); // [erdem, mehmet, samet, said, yagmur]
		
		*/
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 1-add(); yapilan node LinkedList'in en sonuna ekler..
		ll1.add("merve");
		System.out.println("1-add methodu : " + ll1); 
		// 1-add methodu : [erdem, mehmet, samet, said, yagmur, merve]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 2-add(1,”A”); istenen index’e istenen elemani ekler
		ll1.add(2, "sedef");
		System.out.println("2-add(Index,ekle) methodu : " + ll1); 
		// 2-add(Index,ekle) methodu : [erdem, mehmet, sedef, samet, said, yagmur, merve]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("X", "Y"));

		// 3-addAll(coll); istenen collection’in tum elemanlarini ekler
		ll1.addAll(ll2); // ll1 sonuna ll2 de ki X ve Y node larini ekler
		System.out.println("3-addAll methodu : " + ll1);
		// 3-addAll methodu : [erdem, mehmet, sedef, samet, said, yagmur, merve, X, Y]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 4-addAll(addAll(2, coll); istenen collection’in tum elemanlarini istenen index’e ekler
		ll1.addAll(3, ll2); // ll1 de ll2 de ki X ve Y node larini 3. index e ekler
		System.out.println("4-addAll(index, coll) methodu : " + ll1);
		// 4-addAll(index, coll) methodu : [erdem, mehmet, sedef, X, Y, samet, said, yagmur, merve, X, Y]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 5-addFirst(); istenen elemani, ilk eleman olarak ekler
		ll1.addFirst("hakan");
		System.out.println("5-addFirst methodu : " + ll1);
		// 5-addFirst methodu : [hakan, erdem, mehmet, sedef, X, Y, samet, said, yagmur, merve, X, Y]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 6-addLast(); istenen elemani, son eleman olarak ekler
		ll1.addLast("yunus");
		System.out.println("6-addLast methodu : " + ll1);
		// 6-addLast methodu : [hakan, erdem, mehmet, sedef, X, Y, samet, said, yagmur, merve, X, Y, yunus]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 7-remove(); ilk elemani siler
		ll1.remove();
		System.out.println("7-remove methodu : " + ll1);
		// 7-remove methodu : [erdem, mehmet, sedef, X, Y, samet, said, yagmur, merve, X, Y, yunus]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 8-removeFirst(); ilk elemani siler (daha hizlidir)
		ll1.removeFirst(); 
		System.out.println("8-removeFirst methodu : " + ll1); 
		// 8-removeFirst methodu : [mehmet, sedef, X, Y, samet, said, yagmur, merve, X, Y, yunus]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 9-remove(index); istenen indexdeki elemani siler ve silinen elemani dondurur
		ll1.remove("sedef");
		System.out.println("9-remove(index) methodu : " + ll1); 
		// 9-remove(index) methodu : [mehmet, X, Y, samet, said, yagmur, merve, X, Y, yunus]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 10-remove(eleman); istenen elemani siler sildi ise true, bulamadi ise false dondurur
		ll1.remove(2);
		System.out.println("10-remove(eleman) methodu : " + ll1);
		// 10-remove(eleman) methodu : [mehmet, X, samet, said, yagmur, merve, X, Y, yunus]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 11-removeFirstOccurrence("aaa"); istenen elemanin, ilkini siler.
		ll1.removeFirstOccurrence("X");// ilk gorulen node silinir
		System.out.println("11-removeFirstOccurrence(XXX) : " + ll1); 
		// 11-removeFirstOccurrence("aaa") : [mehmet, samet, said, yagmur, merve, X, Y, yunus]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		//Yeni eleman ekleyelim...
		ll1.add(3, "basri"); 
		System.out.println("Yeni eklenen 1. eleman : " + ll1);
		// Yeni eklenen 1. eleman : [mehmet, samet, said, basri, yagmur, merve, X, Y, yunus]
		
		ll1.add(8, "basri"); 
		System.out.println("Yeni eklenen 2. eleman : " + ll1);
		// Yeni eklenen 2. eleman : [mehmet, samet, said, basri, yagmur, merve, X, Y, basri, yunus]
		
		// 12-removeLastOccurrence("XXX") ; ayni olanlardan son gorulen node(eleman) silinir
		ll1.removeLastOccurrence("basri");
		System.out.println("12-removeFirstOccurrence(basri) : " + ll1);  
		// 12-removeFirstOccurrence(basri) : [mehmet, samet, said, basri, yagmur, merve, X, Y, yunus]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		LinkedList<Integer> ll3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		
		// 13-removeLast(); son nodu siler
		ll3.removeLast();
		System.out.println("13-removeLast : " + ll3);
		// 13-removeLast : [1, 2, 3, 4, 5]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 14-remove(coll.index); son nodu siler
		ll3.remove(ll3.indexOf(2));
		System.out.println("14-remove(coll.indexOf) meth0du : " + ll3); 
		// 14-remove(coll.indexOf) methodu : [1, 3, 4, 5]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 15-removeAll(list); istenen listedeki tum elemanlari siler
		ll1.removeAll(ll2); // ll1 den ll2 objesindeki X ve Y yi yani ll2 nin tum elemanlarini siler
		System.out.println("15-removeAll methodu : " + ll1); 
		// 15-removeAll methodu : [mehmet, samet, said, basri, yagmur, merve, yunus]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// Not: Olmayan bir index exception verir...
		// ll3.remove(33); olmayan bir index excepion verir...
		// System.out.println(ll3);//IndexOutOfBoundsException firlatir
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		// 16-get(index); istenen indexdeki elemani getirir
		ll1.get(4);
		System.out.println("16-get(index) methodu : " + ll1.get(4));
		// 16-get(index) methodu : yagmur
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		// 17-contains(eleman); istenen eleman listede var ise true, yoksa false dondurur
		ll1.contains("merve");
		System.out.println("17-contains(eleman) methodu : " + ll1.contains("merve"));
		// 17-contains(eleman) methodu : true
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//18-containsAll(liste); istenen listenin tumu aranan listede var ise true, yoksa false dondurur
		ll1.containsAll(ll3);
		System.out.println("18-containsAll(liste) methodu : " + ll1.containsAll(ll3));
		// 18-containsAll(liste) methodu : false

	}
}