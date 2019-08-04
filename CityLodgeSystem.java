import java.util.*;

public class CityLodgeSystem {
	public void display_menu() {
		System.out.println("****CITYLODGE SYSTEM MENU****\nAdd Property:			1\nRent Property:			2"
				+ "\nReturn Property			3\nProperty Maintenance:		4"
				+ "\nComplete Maintenance:		5\nDisplay All Properties:		6\n Exit Program:			7");
		System.out.print("Enter your choice: ");
	}

	public CityLodgeSystem() {
		Scanner console = new Scanner(System.in);

		display_menu();
		switch (console.nextInt()) {
		case 1:
			System.out.println("You picked option 1");
			break;
		case 2:
			System.out.println("You picked option 2");
			break;
		case 3:
			System.out.println("You picked option 3");
			break;
		default:
			System.err.println("Unrecognized option");
			break;
		}
	}
}
