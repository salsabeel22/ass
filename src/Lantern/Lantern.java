package Lantern;

import java.util.Arrays;
import java.util.Scanner;

public class Lantern {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner s= new Scanner(System.in);
		int n,l;
		n=s.nextInt();
		l=s.nextInt();
		
		double max=0;
		int[]a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0,j=1;i<n-1;i++,j++)
		{
		
		if (a[j]-a[i]>max)
		{
			
		max=(a[j]-a[i]);
	}}
		
max=max/2;
double y=a[0]-0.0;
double z=(double)l-a[n-1];

double ans=Math.max(y, z);

 ans=Math.max(ans, max);
	
String sf1=String.format(" %.10f", ans);
System.out.println(sf1);
	}	}

