package java8_Concepts.AnonymousInnerClassPackage;

public class AnonymousWithConcreteClass {
public static void main(String args[])
{
	Parent parent=new Parent() {
		@Override
		public void listen() {
			System.out.println("Finally achieve vasanth using anonymous class");
		}
	};
	
	parent.listen();//from anonymous inner class listen method it came
	//if you want parent class listen method
	Parent parent1=new Parent();
	parent1.listen();
	
}
}
