import java.text.ParseException;
import java.util.Scanner;

public class AddTeamConsole {
	public static Team addTeamQuery () throws ParseException {
	
			Scanner keyboard = new Scanner(System.in);
			System.out.println("\n\n\n______Add Team______");
			String nameInp = "";
			while (nameInp.equals("")) {
				System.out.println("Name: ");
				nameInp = keyboard.nextLine();
			}

			
			
			
			System.out.println("Your task was successfully added!");
			return new Team(0, nameInp);

		}
}
