package clase3;
import java.util.Scanner;
public class caso2 {
//renzo delgado//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
int num=0;
System.out.println("ingrese numero:");
num=sc.nextInt();
int nume=1;
int nu=0;
while (nume<=num) {
	nu+=nume;
	nume++;
}
System.out.println("la sumatoria de "+num +" es: "+nu);
	}

}
