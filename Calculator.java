package week3.day1.Classactivity2;

public class Calculator {
	
	public void add(int a, int b,int c)
	{
		System.out.println("Additio of 3 value :"+(a+b+c));
	}
	
	public void add(int a, int b)
	{
		System.out.println("Additio of 2 value :"+(a+b));
	}
	
	public void sub(int a, int b)
	{
		System.out.println("Subtraction of 2 value :"+(a-b));
	}
	
	public void sub(double a, double b)
	{
		System.out.println("Subtraction  of 3 value :"+(a-b));
	}
	
	public void Mul(int a, double b)
	{
		System.out.println("Multiplication of 2 value :"+(a*b));
	}
	
	public void Mul(int a, double b,double c)
	{
		System.out.println("Multiplication of 3 value :"+(a*b*c));
	}
	
	
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.add(2, 3);
		cal.add(2, 22, 2);
		cal.sub(44, 11);
		cal.sub(10, 0);
		cal.Mul(7, 7);
		cal.Mul(99, 55, 88);
		
	}

}
