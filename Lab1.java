import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "y";
		
		while(answer.equalsIgnoreCase("y"))
		{
				 
		float length;
		float width;
		float height;
		
		double pi = 3.14159265359;
		float piFloat = (float)pi;
						
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the length of the classroom");
		length = scanner.nextFloat();
				
		System.out.println("Please enter the width of the classroom");
		width = scanner.nextFloat();
		
		System.out.println("Please enter the height of the classroom");
		height = scanner.nextFloat();
		
		float area = length * width;
		System.out.println("The area of the classroom is "+area);
		
		float perimeter = 2 * (length+width);
		System.out.println("The perimeter of the classroom is "+perimeter);
		
		float volume = length * width * height;
		System.out.println("The volume of the classroom is "+volume);
		
		System.out.println("Do you want to continue Y/N?");
		answer = scanner.next();
		System.out.println(answer);
		
		}
		
	}
}


	
	