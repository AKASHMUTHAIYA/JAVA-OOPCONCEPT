package oop_concept;
import java.util.*;
public class Gneric_program_3 {

	public static void main(String[] args) {
       Collection <String> c=new LinkedList<String>();
       c.add("AKASH MUTHAIYA");
       c.add("ARAVINDHAN");
       c.add("PALANINVEL");
       c.add("INDRA GANDHI");
       for(String name:c)
       {
    	   System.out.println(name+" ------> "+name.length());
       }
       
	}

}
