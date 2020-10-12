package javacore22;

public class Application {

	public static void main(String[] args) {
		// first task
		voice cow = message -> System.out.println(message);
		cow.voice("i am a Cow - Myyyy-Myyy");

		// second task

		Frog frog = new Frog();
		frog.eat("eat");
		frog.swim("swim");
		frog.walk("walk");
		frog.sleep("sleap");
	}

}

@FunctionalInterface
interface voice {
	void voice(String msg);
}

interface eat {
	void eat(String string);
}

interface sleep {
	void sleep(String msg);
}

interface walk {
	void walk(String msg);
}

interface swim {
	void swim(String msg);
}
