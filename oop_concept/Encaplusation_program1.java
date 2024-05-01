package oop_concept;
class Model{
	String name="AKASH MUTHAIYA";
	String college="3rd Year Information Technology";
	void display()
	{
		System.out.println("I am "+name);
		System.out.println("Now currently pursing "+college);
	}
}

public class Encaplusation_program1 {

	public static void main(String[] args) {
		Model M1=new Model();
		M1.display();
		

	}

}
