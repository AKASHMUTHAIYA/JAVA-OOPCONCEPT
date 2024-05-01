package oop_concept;
class Model1
{
	private String Name;
	private int exp;
	void setName(String Name)
	{
		this.Name=Name;
	}
     String getName()
	{
		return Name;
	}
     void setexp(int exp)
     {
    	 this.exp=exp;
     }
     public int getexp()
     {
    	return exp; 
     }
}

public class Getter_Setters {

	public static void main(String[] args) {
      Model1 M1=new Model1();
      M1.setName("AKASH MUTHAIYA");
      System.out.println("I am "+M1.getName());
      M1.setexp(4);
      System.out.println("and have experinece "+M1.getexp()+" Years in Hand Ball");
	}

}
