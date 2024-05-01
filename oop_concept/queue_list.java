package oop_concept;
import java.util.*;
public class queue_list {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m =sc.nextInt();
		int sum=0;
	PriorityQueue<Integer> q=new PriorityQueue<Integer>();
       for(int i=m;i<=n;i++)
       {
    	   if(i%15==0)
    	   {
    	   q.add(i);
    	   sum=sum+i;
    	   i+=14;
    	   }
       }
       System.out.println(sum);
      System.out.println(q);
      System.out.println(q.peek());//Header value print
      System.out.println(q.poll());// used to delete the value
      System.out.println(q.peek());
       
      System.out.print(q);
      
       sc.close();
	}

}
