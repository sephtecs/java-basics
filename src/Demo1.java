
public class Demo1 {
	
	public void printWelcomeMessage() {
		System.out.println("Hi, welcome to revature training");
	}

	public static void main(String[] args) { //entry point; JVM will call main and main will execute the programs
		System.out.println("Hello and welcome to day 2 training"); // find shortcut to write this line
		Demo1 d = new Demo1(); //creates instance of the class Demo1
		d.printWelcomeMessage();
	}

}
