package fact;

public class factorial {

	public static void main(String[] args) {
				int num_facts = 10;
				for(int i = 0; i < num_facts; i++)
					System.out.println( i + "! is " + Factorial(i));
			}
			
			public static int Factorial(int n)
			{	int result = 1;
				for(int i = 2; i <= n; i++)
					result *= i;
				return result;
			}


}
