import java.util.ArrayList;
public class Trial1
{
	public static void main(String[] args) 
	{
	  ArrayList al = new ArrayList();
	  al.add(10);
	  al.add(20);
	  al.add(30);
	  al.add(40);
	  al.add(50);
	  System.out.println(al);
	  al.add(2,25);
	  System.out.println(al);
	  ArrayList al2 = new ArrayList();
	  al2.add(60);
	  al2.add(70);
	  al2.add(80);
	  al2.addAll(al2);
	  System.out.println(al2);
	  al.addAll(3,al2);
	  System.out.println(al);



	  



	}
}
