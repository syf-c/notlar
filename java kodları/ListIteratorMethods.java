package KonuOzetleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	/*
	 * Tricky --> hasPrevious() ve previous() method'larinin calimasi icin oncesinde
	 * MUTLAKA KESÝNLÝKLE hasNext() ve next(); method'lari calistirilarak cursor(pointer) en sona getirilmeli
	 
	 * "ITERATOR" ve "LISTITERATOR" arasi farklar :
	  
	 * 1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir
	 * "LISTITERATOR" ise hasNext(), next(),remove() hasPrevius(), Previus(), add() set() method'rini içerir.
	  
	 * 2) "LISTITERATOR" sadece list'ler cin kullanilir. 
	 * "ITERATOR" ise tum collection(list set map) elemanlari icin kullanilir
	  
	 * 3) "ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift yonlu gitmek icin kullanilir.
	 
	 */

	public static void main(String[] args) {

		// 1. ornek...
		List<String> list = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));

		System.out.println("ilk hali: " + list); // ilk hali: [t, a, r, i, k]

		ListIterator lt1 = list.listIterator();
		// listýterator interfaceden lt1 veriable creat edildi. Degeri listten assingn edildi...

		while (lt1.hasNext()) {
			String depo = (String) lt1.next();
			lt1.set(depo + ":-)");
		}
		System.out.println("Update hali : " + list); 
		// update hali : [t:-), a:-), r:-), i:-), k:-)]

		
		// 2. ornek...
		List<String> list1 = new ArrayList<>(Arrays.asList("s", "e", "l", "a", "m"));

		// son elemanina :-) ile update ediniz, elemanlarini sondan basa dogru yazdiriniz --> :-) m a l e s

		System.out.println("Listenin ilk hali list1 : " + list1); 
		// Listenin ilk hali list1 : [s, e, l, a, m]

		ListIterator lt2 = list1.listIterator();
		// Listýterator interfaceden lt1 veriable creat edildi. Degeri listten assingn edildi...

		while (lt2.hasNext()) {
			String depo = (String) lt2.next();

			if (!lt2.hasNext()) {
				lt2.set(":-)" + depo);
			}
		}
		
		// tersten yazdirirsak
		while (lt2.hasPrevious()) {
			String depo = (String) lt2.previous();
			// Cursorun(imleci) oncesi elemani return eder. Ve cursoru(imleci) oncesine getirir
			System.out.print(depo + " "); 
			// :-)m a l e s

		}
		System.out.println();
		System.out.println(list1); 
		// [m, e, l, i, h, :-)a]

		list1.add("e");
		list1.add("t");
		
		System.out.println(list1);
		
		

	}
}