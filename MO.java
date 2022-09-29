class  Calculator
{
	void add ( int x,float y)
	{
		float c = x+y ;
		System.out.println(c);
	}
	double add ( float x,int y)
	{
		float c = x+y ;
		return c ;
	}
}
class LaunchCalculator

{
	public static void main(String args[])
	{
		Calculator calc = new Calculator();
	    calc.add ( 10,20);
	}
}