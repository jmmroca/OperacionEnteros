/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	private static int OperacionEnteros (int a,int x,int m){
		if (m == 1) return 0;
		int c = 1;
		for (int e=1;e<=x;e++){
			System.out.println("El bucle while de OperacionEnteros se ejecuta: " + e + " veces");
			System.out.println("Valor de e: " + e + " a: " + a + " x: " + x + " m: " + m + " c: " + c);
			c=(c*a) % m;
		}
		return c;
	}
	private static int OperacionEnteros2 (int a,int x,int m){
		System.out.println("inicio de Operación 2\n2 -- Valor de a: " + a + "         x: " + x + "       m: " + m);
		if (m == 1) return 0;
		int c = 1;
		int n = 1;
		a = a % m;
		while (x>0){
			System.out.println("El bucle while de OperacionEnteros2 se ejecuta: " + n + " veces");
			System.out.println("2 -- Valor de a: " + a + "         x: " + x + "       m: " + m + "      c: " + c);
			if (x%2==1) {c = (c*a)%m;};
			x=x/2;
			a=(a*a) % m;
			n++;
		}
		return c;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int Op1 = OperacionEnteros(9,13,5);
		int Op2 = OperacionEnteros2(9,13,5);
		System.out.println("Valor de la operacion: " + Op1);
		System.out.println("Valor de la operacion2: " + Op2);
		if (Op1 == Op2){
			System.out.println("El valor de ambas operaciones es IGUAL: " + Op1 + " - " + Op2);
		}else{
			System.out.println("El valor de ambas operaciones es DISTINTO: " + Op1 + " - " + Op2);
		}
		
	}
}
