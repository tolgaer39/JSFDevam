package _03.encodingAndDecoding;

public class Notes {

	// xhtml sayfalarinda h:inputText, h:inputSecret, h: commandButton gibi taglar kullandik.
	// bu taglarin her biri Tag Handler siniflar tarafinda control edilir/yonetilir.
	
	// JSF Component Tree dedigimiz bir veri yapisini olusturur.
	// Bu component tree de java objelerimiz yer alir.
	// h:inputText ->> UIInput objesi
	// h:commandButton ->> UICommand objesi yer alir.
	
	// RENDER
	// JSF taglarinin HTML taglarina donusum islemidir.
	// JSF in yaptigi render jsf tag ->> html tagina donusturme islemine Encoding denir.
	
	// Tarayicinin yaptigi render ise html taglarinin render islemidir.
	
	// Decoding
	// Kullanici input alanlarina veri girer submit eder. Tarayici ilgili formdatayi alir ve server a gonderir.
	// Bu form datasi hash table a yerlestirilir. Component tree ye eklenir.
	// Bu isleme decoding adi verilir.
	
	// JSF ->> HTML = ENCODING
	// HTML ->> JSF = DECODING
}
