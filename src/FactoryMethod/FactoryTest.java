package FactoryMethod;

public class FactoryTest {

	public static void main(String[] args) {
		// 一、普通工厂模式
//		SendFactory sf = new SendFactory();
//		Sender sender = sf.produce("sms");
//		sender.Send();
		// 二、工厂方法模式
//		SendFactory2 sf2 = new SendFactory2();
//		Sender sender2 = sf2.produceMail();
//		sender2.Send();
		// 三、静态工厂方法模式
		Sender sender3 = SendFactory3.produceSms();
		sender3.Send();
	}
}