import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int number = scanner.nextInt();
		
		int total = 0, count = 0;
		
		for(int i = 1; i <=number; i++ ) {
			
			if(i % 3 == 0 && i % 4 == 0) {
				
				total += i;
				count++;
			}
		}
		
		double average = total / count;
		System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması: " + average);
		

	}

}
