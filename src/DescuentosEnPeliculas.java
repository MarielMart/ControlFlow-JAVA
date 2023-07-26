import java.util.Scanner;

public class DescuentosEnPeliculas {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	System.out.print("Ingresa tu edad: ");
	int age = in.nextInt();
	float ticketPrice = 7F;
	
	if (age >= 60) {
		ticketPrice *= 0.45F;
		
	} else if (age <= 5) {
		ticketPrice *= 0.40F;	
	} 

System.out.println("El precio de tu ticket es: $" + ticketPrice);
in.close();
	}
}
