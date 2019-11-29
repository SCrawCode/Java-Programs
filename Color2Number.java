import java.util.HashMap;
import java.util.Scanner;

/* Class that returns resistor value based off user input color code
 * 
 * @Scott Crawford Jr.
 * @Version 1.0
 */
public class Color2Number {
		
		private static HashMap<Integer, String> digits;
		private static HashMap<String, Integer> colorCode;
		private static HashMap<String, Integer> tolCode;
		// Main Method
	public static void main(String[] args) {
		System.out.println("Welcome to ResistoShack 1.0");
		System.out.println("----------------------------");
		System.out.println("");
		mainMenu();
		menuSel();
		
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("*ResistoShack Build 1.0 Published By: Scott Crawford Jr. Copyright November 2019*");
	}
		//Constructor Method of Main Menu
	public static void mainMenu() {
		System.out.println("Please Enter Choice: ");
		System.out.println("1. Get Resistace ->");
		System.out.println("2. Get Colorcode ->");
		System.out.println("3. Exit ->");
	}
		/*Menu Selection Method
		 * Both functions of program run through this method
		 */
	public static void menuSel() {
		Scanner choice = new Scanner(System.in);
		int menuSel = choice.nextInt();
		
		switch(menuSel) {
		case 1:
			System.out.println("Get Resistance:");
			System.out.println("----------------------------");
			getResist();
			break;
		case 2:
			System.out.println("Get Colorcode:");
			System.out.println("----------------------------");
			getCode();
			break;
		default:
			break;
			
		}
	}
			//Method that gets resistance from user inputed color codes
	public static void getResist() {
		System.out.println("Enter Colorcode: ");
		System.out.println("*Please Put First Letter In Caps");
		System.out.println("");
		System.out.println("First Band: ");
		Scanner color = new Scanner(System.in);
		String first = color.next();
		colorCodeDefinition();
		
		System.out.println("Second Band: ");
		String second = color.next();
		colorCodeDefinition();
		
		System.out.println("Third Band: ");
		String third = color.next();
		colorCodeDefinition();
		
		System.out.println("Last Band: ");
		String last = color.next();
		toleranceDefinition();
		
		System.out.println("Calculating...");
		System.out.println("");
		System.out.println("Resistance: " + colorCode.get(first) + "" + colorCode.get(second) + "x10^" + colorCode.get(third) + " Ohms" + " Tolerance: " + tolCode.get(last) + "%");
		
		}
		//HashMap that links colors to specific numerals
	private static void colorCodeDefinition() {
		
		colorCode = new HashMap<String, Integer>();
		
		colorCode.put("Black", 0);
		colorCode.put("Brown", 1);
		colorCode.put("Red", 2);
		colorCode.put("Orange", 3);
		colorCode.put("Yellow", 4);
		colorCode.put("Green", 5);
		colorCode.put("Blue", 6);
		colorCode.put("Purple", 7);
		colorCode.put("Gray", 8);
		colorCode.put("White", 9);
	}
		//HashMap that links tolerance colors to numerals
	private static void toleranceDefinition() {
		
		tolCode = new HashMap<String, Integer>();
		
		tolCode.put("Gold", 5);
		tolCode.put("Silver", 10);
		
	}
		//Method that gives user color code based off required resistance
	public static void getCode() {
		System.out.println("Enter Resistance Values: ");
		System.out.println("*Please Enter 1 Digit.*");
		System.out.println("");
		
		System.out.println("First Digit: ");
		Scanner number = new Scanner(System.in);
		int first = number.nextInt();
		digiOneTwoThree();
		
		System.out.println("Second Digit: ");
		int second = number.nextInt();
		digiOneTwoThree();
		
		System.out.println("Power: (Number Of Zeros Behind Digits 1 And 2)");
		int power = number.nextInt();
		digiOneTwoThree();
		
		System.out.println("Calculating...");
		System.out.println("");
		System.out.println("Required Resitance: " + first + "" + second + "x10^" + power + " Ohms");
		System.out.println("");
		System.out.println("Colorcode: ");
		System.out.println("Band 1: " + digits.get(first));
		System.out.println("Band 2: " + digits.get(second));
		System.out.println("Band 3: " + digits.get(power));
		

	}
		//HashMap that links numeral values to resistor colors.
	private static void digiOneTwoThree() {
		digits = new HashMap<Integer, String>();
		
		digits.put(0, "Black");
		digits.put(1, "Brown");
		digits.put(2, "Red");
		digits.put(3, "Orange");
		digits.put(4, "Yellow");
		digits.put(5, "Green");
		digits.put(6, "Blue");
		digits.put(7, "Purple");
		digits.put(8, "Gray");
		digits.put(9, "White");
	}
}
