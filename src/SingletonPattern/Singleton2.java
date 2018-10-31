package SingletonPattern;

public class Singleton2 {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton2 instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton2() {
	}

	/* static静态工程方法，通过类名调用 */
	/* 加锁 synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
	 * 因为每次调用getInstance()，都要对对象上锁，
	 * 事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，
	 */
	public static synchronized Singleton2 getInstance() {
		if (instance == null)
			instance = new Singleton2();
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println("first : " + Singleton2.getInstance());
		System.out.println("second : " +Singleton2.getInstance());
	}
}
// first : SingletonPattern.Singleton2@6d06d69c
// second : SingletonPattern.Singleton2@6d06d69c