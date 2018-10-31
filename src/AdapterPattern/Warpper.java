package AdapterPattern;

public class Warpper implements Targetable{

	private Source source;
	
	public Warpper(Source source){  
        super();  
        this.source = source;  
    }  
	
	public void method1() {
		source.method1();
	}

	public void method2() {
		System.out.println("this is targetable method!");		
	}

}
