import java.util.*;

public class CityLodgeSystem {
	public void display_menu() {
		System.out.println("****CITYLODGE SYSTEM MENU****\nAdd Room:			1\nRent Room:			2"
				+ "\nReturn Room			3\nRoom Maintenance:		4"
				+ "\nComplete Maintenance:		5\nDisplay All Rooms:		6\n Exit Program:			7");
		System.out.print("Enter your choice: ");
	}

	public CityLodgeSystem() {
		Scanner console = new Scanner(System.in);

		display_menu();
		switch (console.nextInt()) {
		case 1:
			System.out.println("Add Room Menu");
			break;
		case 2:
			System.out.println("Room Rental Menu");
			break;
		case 3:
			System.out.println("Return Room Menu");
			break;
		case 4:
			System.out.println("Room Maintenance Menu");
			break;
		case 5:
			System.out.println("Full Room Display List");
		case 6:
			System.out.println("Exiting Program");
			break;
		default:
			System.err.println("Unrecognized option");
			break;
		}
	}
}
