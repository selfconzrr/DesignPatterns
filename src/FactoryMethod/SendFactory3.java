package FactoryMethod;

public class SendFactory3 {
	/*
	 * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可.
	 * 也方便扩展，增加新的功能
	 */
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
}
