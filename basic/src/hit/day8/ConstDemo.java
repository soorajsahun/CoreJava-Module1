package hit.day8;
//Constructor overloading..
public class ConstDemo {
	int s1;
	String str1;
	
	public ConstDemo() {
		System.out.println("cons called...");
	}
	
	public ConstDemo(int i) {
		System.out.println("overloaded cons called...");
	}
	
	public ConstDemo(String s) {
		System.out.println("string constructor called...");
		String s2=s;
		System.out.println(s2);
	}
	
	public ConstDemo(int s,String str) {
		System.out.println("multi parameter constructor called...");
		s1=s;
		str1=str;
//		this.s=s;
//		this.str=str;
		System.out.println(s1+" "+str1);
	}
	public static void main(String[] args) {
		ConstDemo obj1=new ConstDemo(100,"hello");
		ConstDemo obj2=new ConstDemo();
		
		obj1.met();
		obj2.met(1);
		//the name of the concept is - Virtual Method Invocation (VMI)/DMI(Dynamic method invocation)
		//only one constructor can be called when one object is created...
	}
	
	void met() {
		System.out.println("method without parameter called...");
	}
	void met(int i) {
		System.out.println("method with parameter called...");
	}
}