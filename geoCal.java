import java.util.Scanner;

public class geoCal {

	public static void main(String[] args) {
		
		greet();
		System.out.println("------------");
		menu();
		choice();
		System.out.println("");
		System.out.println("*GeoCal 2.0 By: Scott Crawford Jr. Copyright 2019*");
		

	}
	
	public static void greet() {
		System.out.println("Welcome to GeoCal 2.0");
	}
	public static void menu() {
		
		System.out.println("Please Make a Selection:");
		System.out.println("1: Area of Circle");
		System.out.println("2: Area of Square");
		System.out.println("3: Area of Triangle");
		System.out.println("4: Area of Rectangle");
		System.out.println("5: Quit");
	}

	public static void choice() {
		
		Scanner scan = new Scanner(System.in);
		int sel = scan.nextInt();
		
		
		switch(sel) {
		case 1:
			System.out.println("Circle Geometry:");
			System.out.println("------------");
			circle();
			break;
			
		case 2:
			System.out.println("Square Geometry:");
			System.out.println("------------");
			square();
			break;
			
		case 3:
			System.out.println("Triangle Geometry:");
			System.out.println("------------");
			triangle();
			break;
			
		case 4:
			System.out.println("Rectangle Geometry:");
			System.out.println("------------");
			rectangle();
			break;
			
		default:
			break;
		}
	}
	public static void circle() {
		System.out.print("Enter Circle Radius:");
		
		Scanner circ = new Scanner(System.in);
		int rad = circ.nextInt();
		
		System.out.println("Calcuating...");
		System.out.println("");
		
		System.out.println("Circle Radius: " + rad);
		System.out.println("Circle Area: " + Math.pow(rad, 2) *  Math.PI);	
	}
	
	public static void square() {
		System.out.print("Enter Square Side Length:");
		
		Scanner sqr = new Scanner(System.in);
		int side = sqr.nextInt();
		
		System.out.println("Square Length: " + side);
		System.out.println("Square Area: " + Math.pow(side, 2));	
	}
	
	public static void triangle() {
		System.out.print("Enter Triangle Base: ");
		
		Scanner tri = new Scanner(System.in);
		int base = tri.nextInt();
		
		System.out.println("Triangle Base: " + base);
		System.out.println("Triangle Area: " + Math.pow(base, 2) / 2);
	}
	public static void rectangle() {
		System.out.print("Enter Rectangle Base and Height:");
		
		Scanner rec = new Scanner(System.in);
		int base = rec.nextInt();
		int height = rec.nextInt();
		
		System.out.println("Rectangle Base: " + base);
		System.out.println("Rectangle Height: " + height);
		System.out.println("Rectangle Area: " + base * height);
	}
}
