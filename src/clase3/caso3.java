package clase3;
import java.util.Scanner;
public class caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int c=1;
int multi=1;
int num=0;
System.out.println("ingrese numero: ");
num=sc.nextInt();
if (num<=7)
	while (c<=num) {
		multi*=c;
		c++;
System.out.println("el factorial de "+num +" es: "+multi);
	}
else 
		System.out.println("numero fuera de rango");
}
}