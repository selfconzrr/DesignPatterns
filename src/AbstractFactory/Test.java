package AbstractFactory;

public class Test {

	public static void main(String[] args) {
		Provider pro = new SendMailFactory();
		Sender sender = pro.produce();
		sender.Send();
	}
}
