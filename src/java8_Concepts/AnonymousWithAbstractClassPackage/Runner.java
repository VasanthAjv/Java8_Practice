package java8_Concepts.AnonymousWithAbstractClassPackage;

public class Runner {

	public static void main(String[] args) {

		Parent parent=new Parent() {

			@Override
			void study() {
				System.out.println("study well vasanth...");
				
			}

			@Override
			void play() {
				System.out.println("play as well vasanth");
				
			}

			@Override
			void listen() {
				System.out.println("listen the music as well vasanth");
				
			}
			
		};
		
		parent.study();
		parent.listen();
		parent.play();
	}

}
