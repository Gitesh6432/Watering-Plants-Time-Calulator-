# All time (min)input and terms are in minutes.

import java.util.*;
class Water
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of plants");
		int plant=sc.nextInt();
		System.out.println("how much time (min)require for filling 1 mug(1 litre) by tap?");
		int mug_time=sc.nextInt();
		System.out.println("Enter how many no. of mugs required for 1 plant");
		int lit=sc.nextInt();
		System.out.println("Enter how much time (min)require to pour water to 1 plant");
		int time1=sc.nextInt();
		System.out.println("Enter time (min)for round trip");
		int time2=sc.nextInt();
		System.out.println("Enter time (min)for taking bucket to the plants");
		int time3=sc.nextInt();
		
		wat(mug_time,plant,lit,time1,time2,time3);
	}
	
	public static void wat(int mug_time,int plant,int lit,int time1,int time2,int time3)
	{	
		int water=plant*lit;
		int a=0,b=0,time=0;
		for(int i=mug_time;(a+b)<=water;i+=time2)
		{
			a=(i/mug_time)-b;
			b++;
			time=i;
		}
		System.out.println(a+" "+b+" "+time);
		int ne=water-(b-1);
		int rem=(ne*time1)+time3+time;
		System.out.println(rem);
	}
	
}
