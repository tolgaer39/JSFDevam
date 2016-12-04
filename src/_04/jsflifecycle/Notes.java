package _04.jsflifecycle;

public class Notes {

	// JSF Lifecycle Fazlari
	// 1-Restore View
	// 2-Apply Request Values
	// 3-Process Validations 
	// 4-Update Model Values
	// 5-Ýnvoke Application
	// 6-Render Response
	
	// 1-Restore View(Yenilemek, yediden kurmak)
	// Bir jsf sayfasi icin istek/request geldiginde ilk olarak bu faz calisir.
	
	// Her JSF sayfasi serverda component tree veri yapisi olarak saklanir/tutulur.
	// JSF sayfasina ilk istek geldiginde component tree olusturulur.
	// Daha sonraki istekler icin hali hazirda bu component tree kullanilir.
	
	// restore view fazinda iki durum vardir.
	// -non postback/initial request
	// initial request, sayfaya yapilan yeni istek anlamina gelir. yeni bir UI Component tree olusturulur
	// current FacesContext objesinde bu UI Component tree saklanir.
	// initial case 'i sonrasinda direkt olarak render response fazina gecis olur.
	
	// -post back request
	// login.xhtml den forma veri girip submit ediyoruz. Ýstek postback request olacaktir. Diger adimlar gerceklesecektir.
	
	// 2-Apply Request Values
	// postback request sonrasinda yani forma veri girip submit edildiginde, restore view fazindan sonra apply request fazi calisir.
	// UI Component tree deki her bir dugum/node icin submit ettigimiz formdaki value/deger ler ile doldurulmasi/atanmasidir.
	
	// 3-Process Validation
	// Bu adimda conversion/donusum islemi validation/dogrulama islemi yapilir.
	
	// Component Tree de saklanan degerlere local value adi verilir.
	// xhtml sayfalarinda validation icin jsf validation componentleri kullanilabilir.
	// Eger Process Validation fazinda bir problem olursa direkt olarak Render Response fazina gidilir.
	
	// 4-Update Model Values
	// Process Validation fazinda her sey yolundaysa bu adima gelinir.
	// Component tree de yer alan local value degerleri managed beandeki instance veriable(property) degerlerine atanir/baglanir/binding.
	// managed beandeki instance veriable(property) alanlari UI Component Treedeki local value lari ile guncellenir.
	
	// 5-Invoke Application
	// Action kodlar calisir(commandButton). Ornegin navigation islemi yapilir.
	
	// 6-Render Response 
	// Encoding islemi yapilir. HTML formatina donusturulur.
	// Encode edilen sayfa browser/tarayiciya gonderilir ve browser/tarayici sayfayi gosterir.


}
