package SingletonPattern;
public class FinalSingleton {
	/* 私有构造方法，防止被实例化 */
	private FinalSingleton() {
	}
	/* 此处使用一个内部类来维护单例
	 * JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的
	 */
	private static class SingletonFactory {
		public SingletonFactory(){
			System.out.println("静态内部类的构造函数");
		}
		private static FinalSingleton instance = new FinalSingleton();
	}
	public static FinalSingleton getInstance() {/* 获取实例 */
		return SingletonFactory.instance;
	}
	public static void main(String[] args) {
		SingletonFactory sf = new SingletonFactory();// 只有显示调用，才会创建多个实例
		// 直接SingletonFactory.instance并不会创建多个实例
		System.out.println("first : " + FinalSingleton.getInstance() + " " + sf);
		SingletonFactory sf1 = new SingletonFactory();
		System.out.println("second : " +FinalSingleton.getInstance() + " " + sf1);	
	}
}
