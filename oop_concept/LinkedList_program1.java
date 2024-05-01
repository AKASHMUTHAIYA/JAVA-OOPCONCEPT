package oop_concept;
import java.util.*;
public class LinkedList_program1 {

	public static void main(String[] args) {
         LinkedList<String> a=new LinkedList<String>();
         a.add("AKASH");
         a.add("MUTHAIYA");
         System.out.println(a);
         a.addFirst("PALANIVEL FAMILY");
         a.addLast("KANNAN FAMILY");
         System.out.println(a);
         LinkedList<String> b=new LinkedList<String>();
         b.add("kumbakonam");
         b.add("Tiruppur");
         System.out.println(b);
         a.addAll(b);
         System.out.println(a); 
	}

}
