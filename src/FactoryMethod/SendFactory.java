package FactoryMethod;

public class SendFactory {
	/*
	 * 比如要新增一种ems，（不修改代码的话，是无法扩展的）
	 */
	public Sender produce(String type){
		if("mail".equals(type))
			return new MailSender();
		else if("sms".equals(type))
			return new SmsSender();
		else {
			System.out.println("请输入正确的类型!");
			return null;
		}		
	}
}
