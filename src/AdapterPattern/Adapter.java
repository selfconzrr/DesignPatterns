package AdapterPattern;

public class Adapter extends Source implements Targetable{

	public void method2() {
		System.out.println("this is targetable method!");
	}
}