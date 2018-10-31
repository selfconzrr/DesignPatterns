package SingletonPattern;

public class Singleton3 {
	/* 创建私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private volatile static Singleton3 instance = null;
	private Singleton3() {}/* 私有构造方法，防止被实例化 */
	/* static静态工程方法，通过类名调用，创建实例 */
	/* 加锁 synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
	 * 因为每次调用getInstance()，都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了。
	 * 将synchronized关键字加在了内部，也就是说当调用getInstance的时候是不需要加锁的，
	 * 只有在instance为null，并创建对象的时候才需要加锁，性能有一定的提升，以后就不需要加锁了
	 * 典型的双重检查模式
	 */
	public static Singleton3 getInstance() {
		if (instance == null){
			synchronized(Singleton3.class){
				if(instance == null)
					instance = new Singleton3();
			}
		}
		return instance;
	}
	public static void main(String[] args) {
		System.out.println("first : " + Singleton3.getInstance());
		System.out.println("second : " +Singleton3.getInstance());
	}
}
// first : SingletonPattern.Singleton3@6d06d69c
// second : SingletonPattern.Singleton3@6d06d69c