package calling;

public class calling {
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
		printThree();
	}
	public static void printOne() {
		System.out.println("Hello World");
	}
	public static void printTwo() {
		printOne();
		printOne();
	}
	public static void printThree() {
		System.out.println("Hello World");
		printOne();
		System.out.println("Hello World is printed for 6 times ");
	}
}
