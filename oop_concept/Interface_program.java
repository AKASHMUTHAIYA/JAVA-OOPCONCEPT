package oop_concept;
interface parent1
{
	void mod1();
	void mod2();
}
class child3 implements parent1
{
	child3()
	{
		System.out.println("I am in child class");
	}
	public void mod1()
	{
		System.out.println("I am in Method 1");
	}
	public void mod2()
	{
		System.out.println("I am in Method 2");
	}
}
public class Interface_program {

	public static void main(String[] args) {
        child3 ch= new child3();
        ch.mod1();
        ch.mod2();
        parent1 pa= (parent1)new child3();
        pa.mod1();
        pa.mod2();
	}

}
