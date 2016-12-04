package _02.jsfservice;

public class Notes {
	
	// JSF katmanli mimari yapisinda sunum katmani(presentation) katmaninda calisir.
	// veri tabani, web service veya diger backend isleri jsf in scope u disindadir...
	
	// JSF MVC(model, view, contoller) mimarisine uygundur.
	// JSF; View ile modeli(property) birbirine bagliyor. <h:inputText value="#{helloAjaxBean.name}" id="nameId" />

	// JSF te controller olarak FacesServlet calisir. Herhangi bir istek/action geldiginde FacesServlet calisacaktir.
	/*	<h:commandButton value="Click Me!">
			<f:ajax execute="nameId" render="myOut"/>
		</h:commandButton>
	*/
	
	// validation saglar, error handling
	//  JSF ile formdaki verileri input alanlari icin validation saglanabilir.
	// error uyari mesaji cikmasini saglayabiliriz. 
	
	// data conversion 
	// Kullanici input alanlarina string deger girer, ilgili string degeri otomatik olarak integer a donusturur.
	
	// ajax support(ajax destegi)
	// JSF ajax ile calisabilir, bunun icin <f:ajax componentini kullanabiliriz.
	// server side da bir action invoke edilir ve client-side component update edilir.
	
	// internationalzation(dil destegi)
	// JSF resource bundle ile mesajlar icin farkli dil destegi saglar.
}
