package SingletonPattern;

public class Singleton {

	/* 创建私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 1、懒汉式：静态工程方法，创建实例 
	 * 像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题了*/
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
	public static void main(String[] args) {
		System.out.println("first : " + Singleton.getInstance());
		System.out.println("second : " +Singleton.getInstance());
	}
}
// first : SingletonPattern.Singleton@6d06d69c
// second : SingletonPattern.Singleton@6d06d69c