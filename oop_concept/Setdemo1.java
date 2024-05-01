package oop_concept;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Setdemo1 {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the NUmber of element : ");
       int n=sc.nextInt();
       LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
       System.out.print("enter the value of element:");
       for(int i=0;i<=n;i++)
       {
    	   int j=sc.nextInt();
    	   lh.add(j); 
    	  
       }
       
       System.out.println(lh);
       for(Integer h:lh)
       {
    	   System.out.print(h+" ");
    	  
       }
       System.out.println();
       TreeSet<Integer> M=new TreeSet<Integer>(lh);
       System.out.println(M);
       sc.close();
     
   }

}
