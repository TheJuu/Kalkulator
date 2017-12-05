

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Podaj liczbe a");
		
		Scanner scanner= new Scanner(System.in);
		double a = scanner.nextDouble();
		
		System.out.println("Podaj liczbe b");
		
		double b = scanner.nextDouble();
		
        System.out.println("Wartoœæ a wynosi: " + a + ", wartoœæ b wynosi " + b);
		
        System.out.println("Jakie dzia³anie chcesz wykonaæ? 1- dodawanie; 2- odejmowanie; 3- dzielenie; 4-mno¿enie");
        
        int numer = scanner.nextInt();
        
        //System.out.println("Wybra³es numer " + numer);
            
		switch (numer) {
		
		case 1:
		
			int ai = (int) a;
			int bi = (int) b;
			int c = ai+bi;
			System.out.println("Wybrales dodawanie. Wynik a+b wynosi " + c);
			break;
			
		case 2:
			int ai2 = (int) a;
			int bi2 = (int) b;
			int c2 = ai2-bi2;
            System.out.println("Wybrales odejmowanie. Wynik a-b wynosi " + c2);
            break;
			
		case 3:
			 if (b == 0) {
				 System.out.println("Nie dziel przez 0!");
			 }
			 else {
             System.out.println("Wybrales dzielenie. Wynik a/b wynosi " + a/b );
			 }
             break;
			
		case 4:
			System.out.println("Wybrales mnozenie. Wynik a*b wynosi " + a*b );
            break;
        default:
        	
        	System.out.println("Nic nie wybra³es! Nie troluj :((");
			
		}
		scanner.close();

	}

}