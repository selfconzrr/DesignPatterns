package BuilderPattern;

import java.util.ArrayList;
import java.util.List;
public class Builder {
	List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
		for (int i = 0; i < list.size(); i++)
			list.get(i).Send();
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
