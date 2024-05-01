package oop_concept;
abstract class car
{
	String color;
	abstract double speed();
	abstract public String toString();
	public car(String color)
	{
		System.out.println("Car constructor called");
		this.color=color;
	}
	public String getcolor()
	{
		return color;
	}
	
}
class Audi extends car
{
	double speed;
	public Audi(String color,double speed) {
		super(color);
		System.out.println("Audi constructor called");
		this.speed=speed;
 	}
	double speed()
	{
		return speed;
	}
	public String toString()
	{
		return"Audi color: "+super.color+" Speed : "+speed();
	}
	
}
class Thar extends car
{
	double speed;
	public Thar(String color,double speed)
	{
	   super(color);
	   System.out.println("Thar constructor called");
       this.speed=speed;	
    }
    double speed()
    {
    	return speed;
    }
    public String toString()
    {
		return"Thar color: "+super.color +" Speed : "+speed();
    	
    }
	
	
}

public class Oops_combination_car {

	public static void main(String[] args) {
      car c1=new Audi("Black",545.0);
      car c2=new Thar("Black",490.0);
      System.out.println(c1.toString());
      System.out.println(c2.toString());
	}

}
