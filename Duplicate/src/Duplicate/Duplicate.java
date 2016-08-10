package Duplicate;
import java.util.Scanner;

public class Duplicate {
	int []a=new int[5];
	static int m;
	Scanner scan=new Scanner(System.in);
	public void check(int num)
	{
		
		if(num>100||num<10){
			System.out.println("Enter the corect number ");
			return;
		}
		else if(m==0){
			System.out.print(num);
			a[m++]=num;
			return;
		}
		else{
			for(int j=0;j<m;j++){
				if(a[j]==num){
					System.out.println("This number is already read");
					return;
				}
		}
		System.out.println(num);
		a[m++]=num;
		}
	}
	public void acceptElements()
	{
		int l;
		for(int i=0;i<5;i++){
			System.out.printf("\nEnter element %d: ",i+1);
			l=scan.nextInt();
			check(l);
	}
		
	}
	public void display()
	{
		System.out.println("NEW ARRAY :");
		for(int k=0;k<m;k++)
			System.out.println(a[k]);
	}
	
}
