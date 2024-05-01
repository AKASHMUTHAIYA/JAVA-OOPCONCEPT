package oop_concept;
 abstract class parent
{
	parent()
	{
		System.out.println("Parent Constructor");
	}
	void mod() {
		
	}		
	final void mod1()
	{
		System.out.println("FinalMethod Called");
	}
	
}
class child extends parent
{
	child()
	{
		System.out.println("I am in child Class");
	}
	void mod()
	{
		System.out.println("Abstract Method");
	}
}
class child2 extends child
{
	child2()
	{
		System.out.println("I am in second Child Class");
	}
	void mod()
	{
		System.out.println("Abastarct method 2");
	}
}

public class Abstarction_program {

	public static void main(String[] args) {
         child ch=new child();
         ch.mod();
         ch.mod1();
         child2 ch1=new child2();
       ch1.mod();
       ch1.mod1();
         
	}

}
