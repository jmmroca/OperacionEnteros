/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	private static int OperacionEnteros (int a,int x,int m){
		if (m==1) return 0;
		int c=1;
		for (int e=1;e<=x;e++){
			System.out.println("Valor de e: " + e + " a: " + a + " x: " + x + " m: " + m + " c: " + c);
			c=(c*a) % m;
		}
		return c;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("Valor de la operacion: " + OperacionEnteros(11,9,7));
	}
}
