package java8_Concepts.AnonymousWithMethodArguments;

public class Runner {
	public void divide() {
		System.out.println(" this is the divide method added");
	}
	public void multiply() {
		IParent2 parent2=new IParent2() {

			@Override
			public void multiply(int num1, int num2) {
               System.out.println("multiply of two integers : "+ num1*num2);					
			}
			
		};
		parent2.multiply(2, 4);
	}
public static void main(String args[])
{
	IParent parent=new IParent() {

		@Override
		public void sum(int num1, int num2) {
			System.out.println("sum value of two integers: " + num1+num1);
			
		}
		
	};
	parent.sum(2, 5);
	Runner runner=new Runner();
	runner.divide();
	runner.multiply();
	
}
}
