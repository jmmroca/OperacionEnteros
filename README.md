# OperacionEnteros
PEC1_2015/2016 Grafos y complejidad

28/03/2016

Pregunta 2 (30%).

Dados los enteros a, b y n ≠ 0, se dice que a y b son congruentes módulo n (y se escribe a ≡ b mod n), si y sólo si a−b es un múltiplo de n, es decir:  
a-b=kn
para algún k entero. Por ejemplo, 12 ≡ 5 mod 7, 101 ≡ 1 mod 10, pero 14 y 5 no son congruentes módulo 4, puesto que 14−5 = 9 no es un múltiplo de 4.

Consideremos a continuación el siguiente algoritmo:

1 función | OperacionEnteros | (a,x,m) 
2 	inicio 
3 		si m = 1 
4 			entonces retorno 0 
5 		ﬁnsi 
6 		c ← 1 
7 		para e ← 1 hasta x 
8 			c ← (c∗a) mód m 
9 		ﬁnpara 
10 		retorno c 
11 	ﬁn

a) Calcular el resultado de las siguientes llamadas: 
	OperacionEnteros(9,3,5),
