package java8_Concepts.AnonymousWithIntefacePackage;

public class Runner{
public static void main(String args[])
{
	IParent parent=new IParent() {
		@Override
		public void study() {
			System.out.println("study well vasanth...");
			
		}
		public void listen() {
			System.out.println("listen the music well..");

			IParent2 parent2=new IParent2() {
				@Override
				public void play() {
					System.out.println("play well");
				}
			
			};
			parent2.play();
		}
		
		
	};

	
	parent.study();
	parent.listen();
	
}
}
