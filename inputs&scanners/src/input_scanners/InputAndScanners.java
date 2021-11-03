package input_scanners;
// import scanner module
import java.util.Scanner;

public class InputAndScanners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner is a data type, its name is sc.. its value is equal to a new Scanner of system.in which takes input from the keyboard
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();
		
		System.out.println(scanned);

	}

}
