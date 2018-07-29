import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		int tnombre [] = new int[5];
		for (int i = 0; i < tnombre.length; i++) {
			System.out.println("Remplisez la case numero "+(i+1));
			tnombre [i] = sc.nextInt();
		}
		for (int j = 0; j < tnombre.length; j++) {
			System.out.println("la case numero "+(j+1)+" contien "+(tnombre[j]));
		}
		

	}

}
