package javacore22;

public class Application {

	public static void main(String[] args) {
		// first task
		voice cow = message -> System.out.println(message);
		cow.voice("i am a Cow - Myyyy-Myyy");

		// second task;
		doateble eat = message -> System.out.println(message);
		doateble walk = message -> System.out.println(message);
		
		
		Frog frog = new Frog();
		frog.eat(eat);
		frog.walk(walk);
		}

}

@FunctionalInterface
interface voice {
	void voice(String msg);
}

interface doateble {
	void somesthing(String msg);
}
