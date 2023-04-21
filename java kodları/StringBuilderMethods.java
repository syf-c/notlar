package KonuOzetleri;

public class StringBuilderMethods {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		//***************************STRING BUILDER METHODLARI***************************\\
		
		StringBuilder sb1=new StringBuilder("Rumeysa");
		System.out.println("ilk Durum : " + sb1); // Rumeysa
		
		//---------------------------------------------------------------------------------
		// 1.Method --> append(); String Builder a ekleme yapar...
		// Eklemeleri sona yapar..
		
		sb1.append(" Cetinturk"); // --> bu sekilde yazdiririz.
		// sb1.append(" ").append("Cetinturk");--> istersek te bu sekilde
		// Not ; yukarida yazilan iki sekilde aynisinii yazdirir.
		System.out.println("1.Method append : " +sb1); // Rumeysa Cetinturk
		
		// append(); in iki ozelligi var.
		// Bir tanesi direk birlestirme concat gibi...
		// Digeri de substring de oldugu gibi araligi alarak ekleme yapabiliriz...
		
		sb1.append("Javayi cok sever", 6, 10);
		// 6 7 8 ve 9. indexleri birlestirir. 10 u almaz..
		System.out.println("1.Method append : " +sb1); // Rumeysa Cetinturk cok
		
		//---------------------------------------------------------------------------------
		// 2.Method --> length(); SB nin uzunlugunu verir...
		
		System.out.println("2.Method length : " + sb1.length()); // 21
		
		//---------------------------------------------------------------------------------
		// 3.Method --> capacity ();
		
		System.out.println("3.Method capacity : " + sb1.capacity()); // 23 
		// ---> 16 defaulttan alir 7 yi de Rumeysa dan alir..
		// Formulu bu sekilde --> capacity belirlenmisse diyelim ki 5 olsun.
		// 5*2+2=12 olur.
		// Bos ise 16 yi gecen kapasite olursa 16*2+2=34 olur bu sekilde devam eder..
		
		//---------------------------------------------------------------------------------
		// 4.Method --> trimToSize(); capacity de ki bosluklari siler lengt e esitler
		
		System.out.println("2.Method length : " + sb1.length()); // 21
		System.out.println("3.Method capacity : " + sb1.capacity()); // 23 
		
		sb1.trimToSize();
		System.out.println("4.Method trimToSize : " + sb1.capacity());// 21
		
		//---------------------------------------------------------------------------------
		// 5.Method --> charAt(); SB de ki istene karakteri indexine gore almaya yarar.
		sb1.charAt(1);
		System.out.println("5.Method charAt : " + sb1.charAt(1)); // u Rumeysa'nin 1.indexi
		
		// Not ---> methodlardan bazilari bize sadece bilgi getirir. length ve charAt gibi..
		
		//---------------------------------------------------------------------------------
	    // 6.Method --> delete(int start, int end); Aralikli Silme Methodu
		
		sb1.delete(17,21);
		System.out.println("6.Method delete : " + sb1.delete(17, 21)); // Rumeysa Cetinturk
		// Son 4 karakter olan "_cok" 17 ile 21 arasini sildi...
		
		//---------------------------------------------------------------------------------
	    // 7.Method --> deleteCharAt(index); Belirlenen karakteri silme Methodu
		sb1.deleteCharAt(16);
		System.out.println("7.Method deleteCharAt : " + sb1); // Rumeysa Cetintur -->k silindi
		
		//---------------------------------------------------------------------------------
	    // 8.Method --> equals(); esitlik halinde true aksi halde false verir...
		
		String isim= "Rumeysa Cetintur";
		System.out.println("8.Method equals : " + sb1.equals(isim)); // false
		// Normal de esitligi saglayip true verir. Fakat ;
		// data turleri farkli oldugu icin kiyas mumkun degil ve hep false verir burda..
		// ayni obje olursa true verir...
		
		StringBuilder sb2=new StringBuilder("Rumeysa Cetintur");
		
		System.out.println("8.Method : " + (sb1==sb2)); // false... burda da gormus olduk...
		System.out.println("8.Method : " + sb1.equals(sb2)); // false
		System.out.println("8.Method : " + sb1.equals(sb1)); // true ancak burda true aliriz.
		
		//---------------------------------------------------------------------------------
	    // 9.Method --> indexOf(); SB de istenen karakterin indexini verir... 
		
		sb1.indexOf("Cetin");
		System.out.println("9.Method indexOf : " + sb1.indexOf("Cetin")); // 8
		// 8 nasil oldu... Rumeysa Cetintur dan "Rumeysa_C" den 8 olur.
		// Cetin diye sorguladigimiz 1 karakter olarak indexini verdi. // 8
		System.out.println("9.Method indexOf : " + sb1.indexOf("e", 6)); // 9
		// Bu da soyle bulunuyor.. 6. indexten sonraki e harfinin index i nedir ? // 9
		
		//---------------------------------------------------------------------------------
	    // 10.Method --> lastIndexOf(); SB de istenen karakterin son indexini verir.
		
		sb1.lastIndexOf("t");
		System.out.println("10.Method lastIndexOf : " + sb1.lastIndexOf("t")); // 13
		// Nasil 13 buldu.. "Rumeysa Cetintur" "t" son olarak tur da geciyor.
		// Bastan baslayip son t ye kadar ki index sayilarak bulunur. // 13
		System.out.println("10.Method lastIndexOf : " + sb1.lastIndexOf("a", 12)); // 6 
		// --> 12. index den onceki a nin indexini verir.
		// "Rumeysa Cetintur" 12. index n harfi.. oradan geriye sayarak gelirsek
		// "a" karakterinin indexi 6 olur...
		
		//---------------------------------------------------------------------------------
	    // 11.Method --> insert (index, string); Yazilan index e istenen karakteri ekler..
		
		System.out.println("11.Method insert : " + sb1.insert(2, "*")); // Ru*meysa Cetintur
		// 2.indexin oldugu karakterin yerine silmeden ekleme yapar.
	    // System.out.println("11.Method insert : " + sb1.insert(4, 3.14));
		// Yukarida 4. indexe 3.14 ekledik.. //--> Ru*m3.14eysa Cetintur
		
		isim="Merhaba Dunya";
		
		// insert(0, isim, 0, 8) aciklamasi su sekilde
		// 0 --> SB nin 0 ince index ten baslar.
		// str --> hangi string den eklenecek
		// 0 --> cumlenin hangi indexinden baslanacak
		// 8 --> bitis index i
		System.out.println("11.Method insert : " + sb1.insert(0, isim, 0, 8)); 
		// Merhaba Ru*meysa Cetintur yazdirir...

		//---------------------------------------------------------------------------------
	    // 12.Method --> replace(); 3 virgullu bu methodun ilki indexi dahil eder
		// ikincisinin indexini haric tutar araya ucuncusune yerlestirir..
		
		System.out.println("12.Method replace : " + sb1.replace(8,14,"Seher"));  
		// 8 dahil 14 haric indexi siler yazar..
		// Merhaba Sehersa Cetintur --> Ru*meysa nin Ru*mey yerine Seher gelir.
		
		//---------------------------------------------------------------------------------
	    // 13.Method --> reverse(); SB yi tersine cevirir...
		
		System.out.println("13.Method reverse : " + sb1.reverse());
	    // rutniteC asreheS abahreM
		System.out.println("Duzenlenen reverse : " + sb1.reverse()); // Merhaba Sehersa Cetintur
		// tersine cevirdigimiz Stringi diger methodlarda kullanma adina tekrar basa dondurduk...
		
		//---------------------------------------------------------------------------------
	    // 14.Method --> setCharAt();  SB de verilen indexi karakter ile degistirir
		sb1.setCharAt(10,'k');
		System.out.println("14.Method setCharAt : " + sb1); // Merhaba Sekersa Cetintur

		//---------------------------------------------------------------------------------
	    // 15.Method --> subSequence(); sub parca demektir. ilk index dahil son index haric
		// olani alir yazdirir. istedigimiz parcayi indexlerle aliriz.
	
		System.out.println("15.Method subSequence : " + sb1.subSequence(8, 13)); // Seker
		
		// Aciklama
		System.out.println("SubString Methodu : " + sb1.substring(8)); // Sekersa Cetintur
		// 8 den sonrakileri getirir..
		
		// Bunu subSequence ile soyle yapariz.
		// Istedigim indexten sonraki parcanin tamamini almak icin dahil olan index yazilir.
		// Sonra virgulle sb1.length() yazilir.
		System.out.println("15.Method subSequence : " + sb1.subSequence(5, sb1.length()));
		// ba Sekersa Cetintur yazdirir.

		//---------------------------------------------------------------------------------
	    // 16.Method --> toString(); SB yi Stringe �evirir..
		
		StringBuilder sb3=new StringBuilder("Java cok guzel");
		StringBuilder sb4=new StringBuilder("Java cok guzel");
		
		System.out.println("Son Durum : " + sb3.equals(sb4)); // false
		
		sb3.toString(); // sb3 SB den stringe doner..
		sb4.toString(); // sb4 SB den stringe doner..
		
		System.out.println("16.Method toString : " + sb3.toString().equals(sb4.toString())); 
		// true
		
		//---------------------------------------------------------------------------------
	    // 17.Method --> compareTo(); compareTo soyle calisir..
		// Hakan ile hasan kiyaslar..
		// ilk index ler i kiyaslar esit ise 0 dir.
		// a lar esit ise 0 dir.
		// s ile k esit degil.. k dan s ye kadar olan harfleri sayar..
		// l m n o p r s ---> 7 sayisini dondurur...
		
		System.out.println("17:Method compareTo : " + sb3.compareTo(sb4)); // 0
		// sb3 ile sb4 esit oldugu icin sifir verir..
		System.out.println("17:Method compareTo : " + sb2.compareTo(sb3)); // 8
		
		
	}
}
