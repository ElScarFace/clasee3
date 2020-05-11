package clase3;

import java.util.Scanner;
//renzo delgado//
public class caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Ingrese numero: ");
		int numero=sc.nextInt();
		int i=1;
		while(i<=15) {
			System.out.println(numero+"*"+i+"="+numero*i);
			i++;
		}
	}

}
