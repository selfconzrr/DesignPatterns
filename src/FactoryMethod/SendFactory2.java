package FactoryMethod;

public class SendFactory2 {
	/*
	 * 工厂方法模式是提供多个工厂方法，分别创建对象
	 * 工厂方法模式是定义一个用于创建对象的接口，让子类决定实例化哪一个类。
	 * 工厂方法使一个类的实例化延迟到其子类
	 * 可见，在同一等级结构中，支持增加任意产品。扩展性好
	 */
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
}
