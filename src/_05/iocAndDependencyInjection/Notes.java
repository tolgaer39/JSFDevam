package _05.iocAndDependencyInjection;

public class Notes {

	// JSF ten bagimsiz genel bir kavramdir.
	
	// IOC ->> Inversion of Control
	// Bagimliliklarin/dependency, olusturulmasi ve yonetim gorevini developerdan alma yaklasimidir.
	
	// Keyboard objesini biz new Keyboard yazarak olusturmuyoruz.
	// Bunun yerine bu objeyi JSF, Spring gibi IOC destegi olan frameworka birakilir..
	// Developerdan alinarak farkli bir teknik ile yapilir.
	// Ýlgili objeciyi(keyboard) bind/inject eder. Bu yaklasima IOC teknigi denir.
	
	// ioc kavrami ikiye ayrilir
	// 1-dependency lookup
	// 2-dependency injection(framework bu isi hallediyor)
	
	
	/*class Computer{
		private Keyboard keyborard;
		
	}
	
	class Keyboard{
		
	}
*/
}
