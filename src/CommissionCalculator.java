import java.util.Scanner;
public class CommissionCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el monto de tu venta: ");
		
		Float sale=in.nextFloat();
		Float comission=0F;
		
		if (sale >= 10000) {
			comission = (sale *0.3F);
			
		} else if (sale >= 5001) {
			comission= (sale *0.2F);
			
		} else if (sale >= 1001) {
			comission = (sale *0.1F);
			
		} else if (sale <= 1000) {
			comission = 0F;
		} 
		System.out.println("Tu comisión es = $" + comission);
		in.close();

	}

}
