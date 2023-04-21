package KonuOzetleri;

import java.util.Hashtable;

public class HashtableMethods {

	public static void main(String[] args) {
		/*
		 *HashMap ve TreeMap synchronized ve thread-safe degildir. 
		  Map'ler arasindan synchronized ve thread-safe olan bir map'e ihtiyac vardir. 
		  Bu yuzden Hashtable olusturulmustur.
		 
		 *Hashtable TRICK'i :Hashtable ne key icin ne de value icin "null" kullanamaaaaaaaz.
		  
		 *Hashtable elemanlari rastgele siralar.
		*/

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		Hashtable<Integer, String> ht = new Hashtable<>(); 
		// Hashtable da ki "t" harfi kucuk olacak dikkat edelim...

		ht.put(101, "Hakan");
		ht.put(102, "Yunus");
		ht.put(103, "Basri");
		ht.put(104, "Mehmet");
		ht.put(105, "Hasan");
		ht.put(106, "Alperen");
	
		System.out.println("Listenin Ilk hali : " + ht);
		// Listenin Ilk hali : {106=Alperen, 105=Hasan, 104=Mehmet, 103=Basri, 102=Yunus, 101=Hakan}
		// Hashtable elemanlari rastgele siralar.
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 1-size() ; Bu karma tablodaki anahtar sayýsýný dondurur.
		System.out.println("1-size() methodu : " + ht.size());
		// 1-size() methodu : 6
		
		Hashtable<Integer, String> ht1 = new Hashtable<>(); 
		// Hashtable da ki "t" harfi kucuk olacak dikkat edelim...
		
		ht1.put(107, "Tahir");
		ht1.put(108, "Amine");
	
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 2-clone() ; Bu karma tablonun rastgele bir kopyasýný olusturur.
		System.out.println("2-clone() methodu : " + ht1.clone());
		// 2-clone() methodu : {108=Amine, 107=Tahir}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 3-clear() ; key icermemesi icin map i temizler.
		ht1.clear();
		System.out.println("3-clear() methodundan sonra : " + ht1);
		// 3-clear() methodundan sonra : {}
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 4-contains(Object value) ; Bazi key lerin map te belirtilen degerle eslesip eslesmedigini test eder.
		System.out.println("4-contains(Object value) methodu : " + ht.contains("Hakan"));
		// 4-contains(Object value) methodu : true
		System.out.println("4-contains(Object value) methodu : " + ht1.contains("Tahir"));
		// 4-contains(Object value) methodu : false
		// clear methoduyla silindigi icin olmadigindan false verdi....
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 5-containsKey(Object key) ; Belirtilen nesnenin bu karma tabloda bir key olup olmadigini test eder.
		System.out.println("5-contains(Object key) methodu : " + ht.contains(102));
		// 5-contains(Object key) methodu : false

		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// remove(Object key) ; Key (ve buna karsilik gelen degeri) kaldirdigini
		System.out.println("6-remove() methodu : " + ht.remove(102));
		// 6-remove() methodu : Yunus
		System.out.println("6-remove() methodundan sonra : " + ht);
		// 6-remove() methodundan sonra : {106=Alperen, 105=Hasan, 104=Mehmet, 103=Basri, 101=Hakan}
		// 102 de ki yunus value su silindi..
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				
		// 7-remove(Object key, Object value) ; Belirtilen key girisi, yalnizca o anda belirtilen degere eslenmisse kaldirir.
		System.out.println("7-remove(Object key, Object value) methodu : " + ht.remove(103, "Basri"));
		// 7-remove(Object key, Object value) methodu : true
		System.out.println("7-remove(Object key, Object value) methodu : " + ht);
		// 7-remove(Object key, Object value) methodu : {106=Alperen, 105=Hasan, 104=Mehmet, 101=Hakan}
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	    // get(Object key) ; Belirtilen anahtarin eselendigi degeri veya null bu eslesme key icin esleme icermiyorsa dondurur...
        System.out.println("8-get(Object key) methodu : " + ht.get(104));
        // 8-get(Object key) methodu : Mehmet
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 9-getOrDefault(Object key, V defaultValue) ; Belirtilen key in esitlendigi degeri veya 
        // defaultValue bu esleme key için esleme icermiyorsa dondurur...
        System.out.println("9-getOrDefault(Object key, defaultValue methodu : " + ht.getOrDefault(101, "Hakan"));
        // 9-getOrDefault(Object key, defaultValue methodu : Hakan
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 10-hashCode() ; Map arayuzundeki tanima gore map icin kod degerini dondurur..
        System.out.println("10-hashCode() methodu : " + ht);
        // 10-hashCode() methodu : {106=Alperen, 105=Hasan, 104=Mehmet, 101=Hakan}
	
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 11-isEmpty() ; Bu hashtable'ýn degerlerle key eslemedigini test eder bos ise true dolu ise false dondurur.
		System.out.println("11-isEmpty() methodu : " + ht1.isEmpty()); 
		// 11-isEmpty() methodu : true
		// clear methoduyla silindigi icin eleman olmadigindan true verdi....
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		ht.put(null,"ali");
		//NullPointerException firlatir
		
		ht.put(104,null);
		//NullPointerException firlatir

	}
}