package KonuOzetleri;

import java.util.TreeMap;

public class TreeMapsMethods {

	/*
	 * 1) TreeMap elemanlari natural order'a gore siralar
	 * 
	 * 2) TreeMap, Map'lerin en yavasidir.
	 * 
	 * 3) TreeMap'lerde key'ler icin "null" kullanilmaz.
	 * 
	 * 4) TreeMap'lerde value'lar icin "null" istenildigi kadar kullanilabilir.
	 * 
	 * 5) TreeMap'ler syncronized ve thread-safe degildirler.
	 */
	
	public static void main(String[] args) {
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(101, "Hakan");
		tm.put(102, "Yunus");
		tm.put(103, "Basri");
		tm.put(104, "Mehmet");
		tm.put(105, "Hasan");
		tm.put(106, "Alperen");
		
		System.out.println("Listenin ilk hali tm : " + tm);
		// Listenin ilk hali tm : {101=Hakan, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Alperen}
		
		// Not ---> tm.put(null,"topla");//NullPointerException firlatir
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 1-put() methodu ; ekleme yapar...
		tm.put(107, "Merve");
		System.out.println("1-put() methodu : " + tm);
		// 1-put() methodu : {101=Hakan, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Alperen, 107=Merve}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 2-ceilingKey() method'u ; istenen key degerini varsa return eder. 
		// Istenen key degeri(111) map'de yoksa kendisinden buyuk en kucuk(bir ustu) key olmadigi icin null return eder.
		System.out.println("2-ceilingKey() methodu : " + tm.ceilingKey(101));
		// 2-ceilingKey() method'u : 101

		System.out.println("2-ceilingKey() methodu : " + tm.ceilingKey(108));
		// 2-ceilingKey() method'u : null
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 3-ceilingEntry() method'u istenen key degeri(100) map'de yoksa 
		// kendisinden buyuk en kucuk(bir ustu) key return yani (101) eder. Entry hem key hem de value icerir...
		System.out.println("3-ceilingEntry() method'u : " + tm.ceilingEntry(100));
		// 3-ceilingEntry() method'u : 101=Hakan
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 4-floorKey() method'u istenen key degeri(108) map'de yoksa kendisinden kucuk en buyuk(bir altý) key 107 return eder.
		System.out.println("4-floorKey() method : " + tm.floorKey(108));
		// 4-floorKey() method : 107
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 5-floorEntry() method'u istenen key degeri(108) map'de yoksa kendisinden kucuk en buyuk(bir alti) key return 107=Merve eder.
		System.out.println("5-floorEntry() methodu : " + tm.floorEntry(108));
		// 5-floorEntry() methodu : 107=Merve

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 6-descendingKeySet()methodu key'leri azalan siralama ile return eder
		System.out.println("6-descendingKeySet() methodu : " + tm.descendingKeySet());
		// 6-descendingKeySet() : [107, 106, 105, 104, 103, 102, 101]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 7-KeySet()methodu key'leri artan siralama ile return eder
		System.out.println("7-KeySet() methodu : " + tm.keySet());
		// 7-KeySet() methodu : [101, 102, 103, 104, 105, 106, 107]

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		//8-headMap() methodu girilen key haric kendinden once verilen entryleri return eder...
		System.out.println("8-headMap() methodu : " + tm.headMap(108));
		// 8-headMap() methodu : {101=Hakan, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Alperen, 107=Merve}

		System.out.println("8-headMap() methodu : " + tm.headMap(104));
		// 8-headMap() methodu : {101=Hakan, 102=Yunus, 103=Basri}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 9-headMap(key, boolean) methodu key ile true oldugunda girilen key dahil onceki entry'leri return eder...
		// key ile false oldugunda girilen key dahil olmadan onceki entry'leri return eder...
		System.out.println("9-headMap(key, boolean) methodu : " + tm.headMap(104, true));
		// 9-headMap(key, boolean) methodu : {101=Hakan, 102=Yunus, 103=Basri, 104=Mehmet}
		
		System.out.println("9-headMap(key, boolean) methodu : " + tm.headMap(104, false));
		// 9-headMap(key, boolean) methodu : {101=Hakan, 102=Yunus, 103=Basri}
        
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 10-tailMap() methodu girilen key haric kendinden sonraki verilen entryleri return eder...
		System.out.println("10-tailMap() methodu : " + tm.tailMap(102));
		// 10-tailMap() methodu : {102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Alperen, 107=Merve}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 11-headMap(key, boolean) methodu key ile true oldugunda girilen key dahil sonraki entry'leri return eder...
		// key ile false oldugunda girilen key dahil olmadan sonraki entry'leri return eder...
		System.out.println("11-tailMap(key, boolean) methodu : " + tm.tailMap(102, true));
		// 11-tailMap(key, boolean) methodu : {102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Alperen, 107=Merve}
		
		System.out.println("11-tailMap(key, boolean) methodu : " + tm.tailMap(102, false));
		// 11-tailMap(key, boolean) methodu : {103=Basri, 104=Mehmet, 105=Hasan, 106=Alperen, 107=Merve}
		
	}
}