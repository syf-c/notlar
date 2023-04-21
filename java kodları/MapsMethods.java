package KonuOzetleri;

import java.util.HashMap;

public class MapsMethods {

	public static void main(String[] args) {
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		HashMap<Integer, String> m1 = new HashMap<>();
		m1.put(101, "Hakan");
		m1.put(102, "Yunus");
		m1.put(103, "Basri");
		m1.put(104, "Mehmet");
		m1.put(105, "Hasan");
		m1.put(106, "Alperen");

		System.out.println("Listenin ilk hali : " + m1); 
		// Listenin ilk hali : {101=Hakan, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Alperen}

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//1-put(key,value) methodu ayni key de bir elaman eklendiginde degisiklik yapar....
		m1.put(101, "Merve"); // key value su update edilir eski veri uzerine yeni girilen veri yazilir
		System.out.println("1-put(key,value) methodu : " + m1); 
		// 1-put(key,value) methodu : {101=Merve, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Alperen}

		// Ayný value farkli key'e atanabilir... Value'ler unique(benzersiz) olmak zorunda degil...
		m1.put(106, "Mehmet"); 
		System.out.println("1-put(key,value) methodu : " + m1); 
		// 1-put(key,value) methodu : {101=Merve, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet}
								
		// key degeri null alabilir
		m1.put(null, "Tahir"); 
		System.out.println("1-put(key,value) methodu : " + m1); 
		// 1-put(key,value) methodu : {null=sedef, 101=Merve, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet}

		// null key in e tekrardan bir value eklersek degistirir...
		m1.put(null, "sedef");
		System.out.println("1-put(key,value) methodu : " + m1); 
		// 1-put(key,value) methodu : {null=sedef, 101=Merve, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet}

		// Value degerleri coklu null olabilir
		m1.put(107, null); 
		m1.put(108, null); 
		System.out.println("1-put(key,value) methodu : " + m1); 
		// 1-put(key,value) methodu : {null=sedef, 101=Merve, 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet, 107=null, 108=null}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		HashMap<Integer, String> m2 = new HashMap<>();
		m2.put(1, "Birgun");
		m2.put(2, "Java");
		m2.put(3, "Ogrenecegiz");
		m2.put(4, "InsaAllah");

		System.out.println("Listenin ilk hali m2 : " + m2);
		// Listenin ilk hali m2 : {1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah}

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 2-putAll(map); verilen map’deki tum elemanlari bizim map’imize ekler, tekrarlanan eleman varsa uzerine yazar
		m1.putAll(m2);
		// m1 map'e m2 put edildi(eklendi)... Dolayisyle m1 update oldu ancak m2 ayni degerde.
		// Trick of day : putAll() methodu calismasi icin her iki map'in Data type'lari eslesmeli
		System.out.println("2-m1 e m2 put edildikten sonra : " + m1);
		// "m1 e m2 put edildikten sonra : {null=sedef, 1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah, 101=Merve, 102=Yunus, 
		// 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet, 107=null, 108=null}
		System.out.println("2-m1 e m2 put edildikten sonra : " + m2);
		// "m1 e m2 put edildikten sonra : {1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 3-get(key); istenen key degeri Map’de varsa o key’e ait value’yu, map’de yoksa null doner.
		System.out.println("3-get(key) methodu : " + m1.get(103));
		// 3-get(key) methodu : Basri

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 4-getOrDefault(key,defaultDeger); istenen key degeri Map’de varsa o key’e ait value’yu, Key map’te yoksa default degeri doner.
		System.out.println("4-getOrDefault(key,defaultDeger) : " + m1.getOrDefault(106, "Boyle bir eleman yoktur")); 
		// 4-getOrDefault(key,defaultDeger) : Mehmet
		System.out.println("4-getOrDefault(key,defaultDeger) : " + m1.getOrDefault(111, "Boyle bir eleman yoktur")); 
		// 4-getOrDefault(key,defaultDeger) : Boyle bir eleman yoktur
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 5-values() methodu ; map'deki tüm elemanlarin value'lerini return eder.
		System.out.println("5-values() methodu : " + m1.values()); 
		// 5-values() methodu : [sedef, Merve, Yunus, Basri, Mehmet, Hasan, Mehmet, null, null]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 6-keySet() methodu ; map'deki tüm elemanlarin key lerini return eder.
		System.out.println("6-keySet() methodu : " + m1.keySet()); 
		// 6-keySet() methodu : [null, 1, 2, 3, 4, 101, 102, 103, 104, 105, 106, 107, 108]
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//7-putIfAbsent(key, value); verilen key map’de varsa creat eder yoksa ekler.
		m1.putIfAbsent(109, "Haluk");
		System.out.println("7-putIfAbsent(key, value) methodu : " + m1.putIfAbsent(109, "Haluk"));
		// 7-putIfAbsent(key, value) : Haluk

		System.out.println("7-putIfAbsent(key, value) methodundan sonra : " + m1);
		// 7-putIfAbsent(key, value) methodundan sonra : {null=sedef, 1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah, 101=Merve, 
		// 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet, 107=null, 108=null, 109=Haluk}

		m1.putIfAbsent(105, "tahir");
		System.out.println("7-putIfAbsent(key, value) methodu : " + m1.putIfAbsent(105, "salih"));
		// 7-putIfAbsent(key, value) methodu : Hasan
		// 105 Key'de Ayse value oldg icin salih put edilmedi.. 105 key'deki value degeri Hasan return edildi
		
		System.out.println("7-putIfAbsent(key, value) methodundan sonra : " + m1);
		// 7-putIfAbsent(key, value) methodundan sonra : {null=sedef, 1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah, 101=Merve, 
		// 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet, 107=null, 108=null, 109=Haluk}

		m1.putIfAbsent(null, "Selam"); 
		System.out.println("7-putIfAbsent(key, value) methodu : " + m1.putIfAbsent(null, "Selam"));
		// 7-putIfAbsent(key, value) methodu : sedef
		// null Key'de sedef value olduugu icin selam put edilmedi...
		System.out.println("7-putIfAbsent(key, value) methodundan sonra : " + m1);
		// 7-putIfAbsent(key, value) methodundan sonra : {null=sedef, 1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah, 101=Merve, 
		// 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet, 107=null, 108=null, 109=Haluk}


		m1.putIfAbsent(107, "Merhaba");
		System.out.println("7-putIfAbsent(key, value) methodu : " + m1.putIfAbsent(107, "Merhaba"));
		// 7-putIfAbsent(key, value) methodu : Merhaba
		// 107 Key'de value null oldg icin Merhaba put edildi
		System.out.println("7-putIfAbsent(key, value) methodundan sonra : " + m1);
		// 7-putIfAbsent(key, value) methodundan sonra : {null=sedef, 1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah, 101=Merve, 
		// 102=Yunus, 103=Basri, 104=Mehmet, 105=Hasan, 106=Mehmet, 107=Merhaba, 108=null, 109=Haluk}

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		HashMap<Integer, String> m3 = new HashMap<>();
		
		m3.put(101, "Levent");
		m3.put(102, "Said");
		m3.put(103, "Huseyin");
		m3.put(104, "Fatma");
		m3.put(105, "Ayse");
		
		System.out.println("Listenin ilk hali m3 : " + m3);
		// Listenin ilk hali m3 : {101=Levent, 102=Said, 103=Huseyin, 104=Fatma, 105=Ayse}

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 8-remove(eleman) ; Entry : Map’de her bir elemani olusturan key value ikilisidir... Ikisi beraber silinir...
		m3.remove(101); 
		System.out.println("8-remove(eleman) methodundan sonra : " + m3); 
		// 8-remove(eleman) methodundan sonra : {102=Said, 103=Huseyin, 104=Fatma, 105=Ayse}

		m3.remove(102, "said"); 
		// key value eslesmsi olursa entry silinir eslesme olmazsa (said!=Said) herhangi bir islem yapilmaz.
		System.out.println("8-remove(eleman) methodundan sonra : " + m3); 
		// 8-remove(eleman) methodundan sonra : {102=Said, 103=Huseyin, 104=Fatma, 105=Ayse}
		
		m3.remove(102, "Said");
		System.out.println("8-remove(eleman) methodundan sonra : " + m3); 
		// 8-remove(eleman) methodundan sonra : {103=Huseyin, 104=Fatma, 105=Ayse}

		m3.remove(111, "salih"); 
		// Olmayan key'deki entry'i silme islemi yapilmaz
		System.out.println("8-remove(eleman) methodundan sonra : " + m3.remove(111, "salih"));
		// 8-remove(eleman) methodundan sonra : false
		
		System.out.println("8-remove(eleman) methodundan sonra : " + m3); 
		// 8-remove(eleman) methodundan sonra : {103=Huseyin, 104=Fatma, 105=Ayse}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		

		// 9-size(); map’teki entry sayisini verir..
		System.out.println("9-size() : " + m3.size());
		// 9-size() : 3

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		// 10-compute(key, (key,value)->yeniDeger); Verilen map’deki istenen key degerine sahip elemanin value’sunu gunceller 
		// key map’te yoksa ekler...
		m3.compute(103, (key, value) -> "Haluk");
		// 103 te ki Huseyin in yerine Haluk gelir...
		System.out.println("10-compute(key, (key,value)->yeniDeger) metodundan sonra : " + m3);
		// 10-compute(key, (key,value)->yeniDeger) metodundan sonra : {103=Haluk, 104=Fatma, 105=Ayse}

		m3.compute(106, (key, value) -> "Alperen");
		// 106 key olmadigi icin ekleme yapar...
		System.out.println("10-compute(key, (key,value)->yeniDeger) metodundan sonra : " + m3);
		// 10-compute(key, (key,value)->yeniDeger) metodundan sonra : {103=Haluk, 104=Fatma, 105=Ayse, 106=Alperen}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 11-ComputeIfAbsent(key, k->->yeniDeger); istenen key degeri map’de yoksa o key’i ve value’yu ekler, map’de varsa birsey yapmaz...
		m3.computeIfAbsent(107, value -> "Amine"); 
		// 107 key varsa islem yapilmaz; yoksa atama yapar...
		System.out.println("11-ComputeIfAbsent(key, k->->yeniDeger) methodundan sonra : " + m3);
		// 11-ComputeIfAbsent(key, k->->yeniDeger) methodundan sonra : {103=Haluk, 104=Fatma, 105=Ayse, 106=Alperen, 107=Amine}

		m3.computeIfAbsent(105, value -> "Abdullah"); 
		// map'de 105 key varligini kontrol eder. 105 key oldugu icin islem yapilmaz...
		System.out.println("11-ComputeIfAbsent(key, k->->yeniDeger) methodundan sonra : " + m3);
		// 11-ComputeIfAbsent(key, k->->yeniDeger) methodundan sonra : {103=Haluk, 104=Fatma, 105=Ayse, 106=Alperen, 107=Amine}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 12-ComputeIfPresent(key, (key,value)->yeniDeger); istenen key degeri Map’de varsa o key’e ait value’yu gunceller yoksa birsey yapmaz.
        m3.computeIfPresent(107,(key,value)-> "Halime");
        //map'de 109 key varligini kontrol eder. 109 key oldg icin rabi value ile update edildi
        System.out.println("12-ComputeIfPresent(key, k->->yeniDeger) methodundan sonra : " + m3);
        // 12-ComputeIfPresent(key, k->->yeniDeger) methodundan sonra : {103=Haluk, 104=Fatma, 105=Ayse, 106=Alperen, 107=Halime}

        m3.computeIfPresent(120,(key,value)-> "Hamza");
        // 120 key oldmadigi icin herhnagi bir islem yapilmaz..
        System.out.println("12-ComputeIfPresent(key, k->->yeniDeger) methodundan sonra : " + m3);
        // 12-ComputeIfPresent(key, k->->yeniDeger) methodundan sonra : {103=Haluk, 104=Fatma, 105=Ayse, 106=Alperen, 107=Halime}
        
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		// 13-containsKey(key); istenen key degeri Map’de varsa true, yoksa false doner .
        System.out.println("13-containsKey(key) methodu : " + m3.containsKey(105));
        // 13-containsKey(key) methodu : true
        System.out.println("13-containsKey(key) methodu : " + m3.containsKey(120));
        // 13-containsKey(key) methodu : false
        
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	    // 14-containsValue(value); istenen value degeri Map’de varsa true, yoksa false doner .
        System.out.println("14-containsValue(value) methodu : " + m3.containsValue("Halime"));
        // 14-containsValue(value) methodu : true
        System.out.println("14-containsValue(value) methodu : " + m3.containsValue("Hamza"));
        // 14-containsValue(value) methodu : false
        
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	    // 15-entrySet(); Map’deki entry’leri bir Set olarak verir. Entry : Map’de her bir elemani olusturan key value ikilisidir
        System.out.println("15-entrySet() methodu " + m2.entrySet());
        // 15-entrySet() methodu [1=Birgun, 2=Java, 3=Ogrenecegiz, 4=InsaAllah]
        System.out.println("15-entrySet() methodu " + m3.entrySet());
        // 15-entrySet() methodu [103=Haluk, 104=Fatma, 105=Ayse, 106=Alperen, 107=Halime]
        
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	    // 16-equals(map); Map’deki tum elemanlari karsilastirir. Hepsi ayni ise true farkli olan varsa false dondurur
        m2.equals(m3);
        System.out.println("16-equals(map) methodu : " + m2.equals(m3));
        // 16-equals(map) methodu : false
       
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 17-clone() methodu
        m3.clone();
        System.out.println("17-clone() methodu : " + m3.clone());
        // 17-clone() methodu : {104=Fatma, 105=Ayse, 106=Alperen, 107=Halime, 103=Haluk}
        
  
	
	}

}
