
package main.java.dao.cm;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner scanner;
		try {
			scanner = new Scanner(System.in);
			
			int nombre = scanner.nextInt();
            System.out.println(nombre);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
