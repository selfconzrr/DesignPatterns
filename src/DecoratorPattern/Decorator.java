package DecoratorPattern;

public class Decorator implements Sourceable{
	private Sourceable source;  
    
    public Decorator(Sourceable source){  
        super();  
        this.source = source;  
    }  
	public void method() {
		// ������Զ�̬����ӹ��ܡ�ɾ������
		System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
	}

}
