package clase3;

import java.util.Scanner;

public class case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = 0;
		int i = 1;
		int mayor= 0;
		int menor = 1;
		
		while(i<=5) {
			System.out.print("Ingrese el numero "+ i +": ");
			n=sc.nextInt();
			
			if (i == 1) {
				menor = n;
			}
			if(n<menor) {
				menor = n;
			}
			i++;
		}
		
		System.out.println("El numero menor es: "+ menor);
	}

}
