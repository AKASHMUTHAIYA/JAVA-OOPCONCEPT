package oop_concept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
      LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
      lh.add(20);
      lh.add(10);
      lh.add(30);
      System.out.println(lh);
      System.out.println("-------HASHSET----------");
      
      HashSet<Integer> hs=new HashSet<Integer>();
       hs.add(60);
       hs.add(70);
       hs.add(90);
       System.out.println(hs);
       
       
       LinkedList<Integer> ll=new LinkedList<Integer>();
       ll.add(56);
       ll.add(34);
       ll.add(34);
       ll.add(45);
       ll.add(45);
       ll.add(56);
       System.out.println("Before removin duplicate : "+ll);
       
       LinkedHashSet<Integer> hs1=new LinkedHashSet<Integer>(ll);
       System.out.println("Removed duplicate : "+hs1);
       
       TreeSet<Integer> ts=new TreeSet<Integer>(ll);
       System.out.println("The sorted order : "+ts);
       
	}

}
