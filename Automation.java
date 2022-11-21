package Abstraction;

public class Automation extends MultipleLanguage implements TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation auto = new Automation();
auto.java();
auto.Selenium();
auto.ruby();
auto.python();
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void python() {
		// TODO Auto-generated method stub
		System.out.println("Python");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
	System.out.println("ruby");	
	}

}
