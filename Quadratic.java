/lab program-1(Quadratic Equation)
//S Rakhal (1BM22CS229)

import java.util.Scanner;
class quadratic
{
	int a,b,c;
	double r1,r2,d;
	void getd()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the coefficients of a,b,c");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	}
	void compute()
	{
		while(a==0)
		{
			System.out.println("not a quadratic equation");
			System.out.println("enter a non zero value for a : ");
			Scanner s = new Scanner(System.in);
			a=s.nextInt();
		}
		d=b*b-4*a*c;
		if(d==0)
		{
			r1=(-b)/(2*a);
			System.out.println("roots are real and equal");
			System.out.println("root1 = root2 ="+r1);
		}
		else if(d>0)
		{
			r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
			r1=((-b)-(Math.sqrt(d)))/(double)(2*a);
			System.out.println("roots are real and distinct");
			System.out.println("root 1 ="+r1+"root 2 ="+r2);
		}
		else if(d<0)
		{
			System.out.println("roots are imaginary");
			r1=(-b)/(2*a);
			r2=Math.sqrt(-d)/(2*a);
			System.out.println("root 1 ="+r1+"+i"+r2);
			System.out.println("root 1 ="+r1+"-i"+r2);
		}
	}
}
class quadraticMain
{
	public static void main(String args[])
	{
		quadratic q = new quadratic();
		q.getd();
		q.compute();
	}
}
