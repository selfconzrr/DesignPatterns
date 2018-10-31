package PrototypePattern;

public class Prototype implements Cloneable{

	// 浅拷贝
	public Object clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
}
