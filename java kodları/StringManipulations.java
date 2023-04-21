package KonuOzetleri;
public class StringManipulations {
	public static void main(String[] args) {

		//***************************STRING Manipulations METHODLARI***************************\\

		// str adinda bir degiskene "Merhaba Arkadaslar" yazisini atmis olalim...
		String str = "Merhaba Arkadaslar";

		// 1. si concatination(); birlestirme

		String str1 = "Hosgeldiniz";

		// concatination methodu 2 sekilde yapilir.
		// Birincisi toplama isaretiyle
		// ikincisi ise concat methodu

		System.out.println("1-Concat 1. methodu ; " + str + " " + str1);
		// 1.method--> Merhaba Arkadaslar Hosgeldiniz
		System.out.println(str.concat(str1)); // Merhaba ArkadaslarHosgeldiniz
		System.out.println("1-Concat 2. methodu ; " + str.concat(" ").concat(str1));
		// 2.method--> Merhaba Arkadaslar Hosgeldiniz

		// 2. si charAt(); karakter

		System.out.println("2-Char methodu ile : " + str.charAt(5)); // b

		// 3. su toUpperCase(); buyuk harf

		System.out.println("3-toUpperCase methodu ile : " + str.toUpperCase() + " " + str1.toUpperCase());
		// 3-toUpperCase methodu ile : MERHABA ARKADASLAR HOSGELDINIZ

		// 4. su toLowerCase(); kucuk harf

		System.out.println("4-toLowerCase methodu ile : " + str.toLowerCase() + " " + str1.toLowerCase());
		// 4-toLowerCase methodu ile : merhaba arkadaslar hosgeldiniz

		// 5. si equals(); string e esit olup olmadigini true ve false olarak dondurur.

		System.out.println("5-equals methodu ile : " + str.equals(str1)); // false

		// 6. si equalsIgnoreCase(); buyuk kucuk harf bakmaksizin esitligini true ve false
		// olarak dondurur.

		System.out.println("6-equalsIgnorecase methodu ile : " + str.equalsIgnoreCase(str1)); // false

		String str2 = "HosGELdiniz";
		System.out.println("6-equalsIgnorecase methodu ile : " + str1.equalsIgnoreCase(str2)); // true

		// 7. si length(); uzunlugu belirler
		
		System.out.println("7-length methodu ile : " + str.length()); // 18

		// 8. si indexOf(); 0 dan baslar ve bize string in indexini verir

		System.out.println("8-indexof methodu ile : " + str1.indexOf('g')); // 3

		// olmayan bir karakter girersem cevap ne olur ?

		System.out.println("8-indexof methodu ile : " + str1.indexOf('b')); // -1 olur

		// 9. su lastIndexOf(); bize string in son indexini dondurur

		System.out.println("9-lastIndexof methodu ile : " + str1.lastIndexOf('z')); // 10

		// olmayan bir karakter girersem cevap ne olur ?

		System.out.println("9-lastIndexof methodu ile : " + str1.lastIndexOf('t')); // -1

		// belirli bir indexten oncesi de sorgulanabilir

		System.out.println("9-lastIndexof methodu ile : " + str.lastIndexOf('a', 5)); // 4

		// kelime de sorgulanabilir

		System.out.println("9-lastIndexof methodu ile : " + str.lastIndexOf("Arkadaslar")); // 8

		// 10. su contains(); icerip icermedigini true ve false olarak dondurur.

		System.out.println("10-contains methodu ile : " + str1.contains("d")); // true

		// 11. si endsWith(); istenen karakterler ile bitip bitmedigini kontrol eder..

		String str3 = "java09 ile bir kere yaz hep calistir";

		System.out.println("11-endsWith methodu ile : " + str3.endsWith("cal")); // false

		System.out.println("11-endsWith methodu ile : " + str3.endsWith("tir")); // true

		// 12. si startsWith(); istenen karakterler ile baslayip baslmadigini kontrol eder..

		System.out.println("12-startsWith methodu ile : " + str3.startsWith("ja")); // true

		System.out.println("12-startsWith methodu ile : " + str3.startsWith("a", 3)); // true

		System.out.println("12-startsWith methodu ile : " + str3.startsWith("t", 3)); // false

		// 13. su isEmpty(); String in uzunlugu "0" ise true yoksa false dondurur.

		System.out.println("13-isEmpty methodu ile : " + str3.isEmpty()); // false

		String str4 = "";
		System.out.println("13-isEmpty methodu ile : " + str4.isEmpty()); // true
		// --> null yazarsak hata verir..

		// 14. su replace(); istenen karakterleri yenileri ile degistirir...

		System.out.println("14-replace methodu ile : " + str3.replace("a", "xxxxxx"));
		// jxxxxxxvxxxxxx09 ile bir kere yxxxxxxz hep cxxxxxxlistir

		System.out.println("14-replace methodu ile : " + str3.replace('a', 'x'));
		// jxvx09 ile bir kere yxz hep cxlistir

		// 15. si replaceAll(); replace den tek farki char kullanamaz
		// ama regular expression kullanabilir.

		System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("a", "xxxxxx"));
		// jxxxxxxvxxxxxx09 ile bir kere yxxxxxxz hep cxxxxxxlistir

		// System.out.println("15-replaceAll methodu ile : " + str3.replaceAll('a' ,'x'));
		// hata verir

		System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\s", "")); 
		// s sadece space---java09ilebirkereyazhepcalistir
		System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\s", "*")); 
		// s sadece space---java09*ile*bir*kere*yaz*hep*calistir
		System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\S", "*")); 
		// S space olmayan hersey---****** *** *** **** *** *** ********
		System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\w", "-")); 
		// harf veya rakamlarin hepsi--------- --- --- ---- --- --- --------
		System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\W", "#")); 
		// harf veya rakamlarin disindaki hersey---java09#ile#bir#kere#yaz#hep#calistir
		System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\d", "*")); 
		// digit(rakamlar)in hepsi---java** ile bir kere yaz hep calistir
		System.out.println("15-replaceAll methodu ile : " + str3.replaceAll("\\D", "a")); 
		// digit(rakamlar)in disindaki hersey---aaaa09aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

		// not ; syso icinde yapilan manipulation'lar asil String'i degistirmez

		// 16. si replaceFirst(); istenen karakterlerin ilkini yenileriyle degistirir.

		System.out.println("16-replaceFirst methodu ile : " + str3.replaceFirst("a", "***"));
		// j***va09 ile bir kere yaz hep calistir

		System.out.println("16-replaceFirst methodu ile : " + str3.replaceFirst("\\s", "*"));
		// java09*ile bir kere yaz hep calistir

		// 17.si substring(); index kullanarak String deki istedigimiz parcayi almaya
		// yardimci olur.

		System.out.println("17-substring methodu ile : " + str3.substring(0, 7)); // java09 
		// 0.index dahil alir 7.indexi dahil etmeden karakter bosluk ne varsa keser alir

		System.out.println("17-substring methodu ile : " + str3.substring(6, str3.length()));
		// _ ile bir kere yaz hep calistir

		// 18. si trim(); istedigimiz String in basinda veya sonunda var olan
		// bosluk/space leri temizler.

		String str5 = "    ahhh java ahhh     ";
		System.out.println("18-trim methodu ile : " + str5.trim()); // ahhh java ahhh
	}
}
