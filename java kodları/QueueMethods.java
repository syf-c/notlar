package KonuOzetleri;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {

	public static void main(String[] args) {
		/*
		 * Fifo : First in first out --> Elemanlar ilk eklenen ilk silinir eczane
		 * yemekhane vs sektorlerde zaman kaydý olam elemanlarin tutulmasinda kullanilir.
		  
		 * Queue intreface'nin iki subClass constructoru ile obj creat edileblir. LinkedList ve PriorityQueue....
		 
		 * LinkedList constructoru ile obj creat edilirse 
		 * elemanlar Queue icinde insertion order'e gore yani ekleme sirasina goresiralanir 
		 
		 * PriorityQueue constructoru ile obj creat edilirse elemanlar Queue icinde 
		 * java'nin kendine ozel algoritmasina gore siralanir.
		 */
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		Queue<String> q1 = new LinkedList<>();
		
		q1.add("basri");
		q1.add("hakan");
		q1.add("sedef");
		q1.add("mehmet");
		q1.add("yunus");
		q1.add("hasan");
		q1.add("merve");
		
		System.out.println("Listenin ilk Hali q1 : " + q1); 
		// Listenin ilk Hali q1 : [basri, hakan, sedef, mehmet, yunus, hasan, merve]
		// Not --> java LinkedList geregi insertion order'e gore yani eklenilen siraya sira olusturdu..

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		Queue<String> q2 = new PriorityQueue<>();
		
		q2.add("tahir");
		q2.add("alperen");
		q2.add("tayfun");
		q2.add("haluk");
		
		System.out.println("Listenin ilk Hali q2 : " + q2);
		// Listenin ilk Hali q2 : [alperen, haluk, tayfun, tahir]
		// --> java kendi PriorityQueue(oncelik sirasi)algoritmasini calistirdi. Kendine gore dizilim yapar...

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//1-peek() methodu ; ilk elemani silmeden bize return eder.
		System.out.println("1-peek() methodu  : " + q1.peek());
		// 1-peek() methodu  : basri
		System.out.println("1-peek() methodu PriorityQueue : " + q2.peek());
		// 1-peek() methodu  : alperen

		// q1 listesini tekrar yazdirmak istersek peek yaptigi ilk elaman silinmeden yazdirir...
		System.out.println("1-peek () methodundan sonra : " + q1); 
		// 1-peek () methodundan sonra : [basri, hakan, sedef, mehmet, yunus, hasan, merve]
		System.out.println("1-peek () methodundan sonra PriorityQueue : " + q2); 
		// 1-peek () methodundan sonra PriorityQueue : [alperen, haluk, tayfun, tahir]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 2-poll(); ilk elemani queue'dan siler ve bize return eder
		System.out.println("2-poll() methodu  : " + q1.poll()); 
		// 2-poll() methodu  : basri
		
		// q1 listesini tekrar yazdirmak istersek peek yaptigi ilk elaman olmadan yazdirir...
		System.out.println("2-poll () methodundan sonra : " + q1); 
		// 2-poll () methodundan sonra : [hakan, sedef, mehmet, yunus, hasan, merve]
		
		
		System.out.println("2-poll() methodu PriorityQueue : " + q2.poll()); 
		// 1-peek() methodu PriorityQueue : alperen
		
		// q2 listesini tekrar yazdirmak istersek peek yaptigi ilk elaman olmadan yazdirir...
		System.out.println("2-poll () methodundan sonra PriorityQueue : " + q2); 
		// 2-poll () methodundan sonra PriorityQueue : [haluk, tahir, tayfun]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 3-offer(); eleman eklemek icin kullanilir. Add gibidir ama queue ya hastir...
		// Ancak eleman siniri konulduysa add() metodu IllegalStateException firlatir.						
		// Ancak offer() method'unda bu durum olmadan kod calismaya devam eder...
		
		q1.offer("alperen");
		System.out.println("3-offer() methodu : " + q1);
		// 3-offer() methodu : [hakan, sedef, mehmet, yunus, hasan, merve, alperen]
		
		// Yazdirmak istedigimizde consol da bize varsa true yoksa false dondurur...
		System.out.println("3-offer() methodundan sonra : " + q1.offer("alperen"));
		// 3-offer() methodundan sonra : true
				
		q2.offer("sedef");
		System.out.println("3-offer() methodu PriorityQueue : " + q2);
		// 3-offer() methodu PriorityQueue : [haluk, sedef, tayfun, tahir]
		// PriorityQueue goruldugu uzere yine kafasina gore sedef ismini yerlestirdi...
		
		// Yazdirmak istedigimizde consol da bize varsa true yoksa false dondurur...
		System.out.println("3-offer() methodundan sonra PriorityQueue : " + q2.offer("sedef"));
		// 3-offer() methodundan sonra PriorityQueue : true
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// poll () methduyla ilgili ek bilgi : Hata gorecegimizden code acisindan asagiya almis olduk...
		// Listeyi bosaltip sordurursak ne olur ?
		
		q1.clear();
		System.out.println("clear() methodu ile : " + q1);
		//clear() methodu ile : []
		
		// poll () methodu listeden ilk elemani silerek return eder. biz ise boz listede bunu yaparsa ne olur diye yazdirdik...
	    System.out.println("clear() methodundan sonra poll() : " + q1.poll());
		// clear() methodundan sonra poll() : null

	    // Bir onceki islemi remove(indexsiz remove ilk elemani siler) methodu ile sil dersek ne olur?
		System.out.println("clear() methodundan sonra remove() : " + q1.remove()); 
		// clear() methodundan sonra remove() : NoSuchElementException
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// isEmpty bos ise true dolu ise false dondurur..
		// element() methodu ise bos ise NoSuchElementException dondudurur..	
		
		
}
}