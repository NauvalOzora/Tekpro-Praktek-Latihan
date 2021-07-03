package Case3;

//****************************************************************
//MathUtils.java
//
//Provides static mathematical utility functions.
//
//****************************************************************
public class MathUtils{
	//-------------------------------------------------------------
	//Returns the factorial of the argument given
	//-------------------------------------------------------------
	public static int factorial(int n) throws IllegalArgumentException{
		//Semisal angka negatif
		if(n<0) {
			throw new IllegalArgumentException("Faktorial untuk bilangan negatif tak terdefinisi");
		}
		//input lebih dari 16
		if(n>16) {
			throw new IllegalArgumentException("Aritmetic Overflow");
		}
		int fac = 1;
		for (int i=n; i>0; i--)
			fac *= i;
		return fac;
	}
}
