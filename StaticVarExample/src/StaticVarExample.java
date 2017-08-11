
public class StaticVarExample {
	public static String myClassVar = "rohith loves priya";
    String myInstanceVar = "instance variable";
    public void myMethod() {
    	String myInstanceVar = "inside method";
    	System.out.println(myInstanceVar);
    }
	public static void main(String[] args) {
		StaticVarExample obj1 = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();
		StaticVarExample obj = new StaticVarExample();
		
		System.out.println("calling method");
		obj.myMethod();
		System.out.println(obj.myInstanceVar);
		
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		
		obj2.myClassVar = "priya loves rohith";
		obj2.myInstanceVar = "it's true";
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);



	}

}
