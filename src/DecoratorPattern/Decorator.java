package DecoratorPattern;

public class Decorator implements Sourceable{
	private Sourceable source;  
    
    public Decorator(Sourceable source){  
        super();  
        this.source = source;  
    }  
	public void method() {
		// 在这可以动态的添加功能、删除功能
		System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
	}

}
