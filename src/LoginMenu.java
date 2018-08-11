import java.io.IOException;
import java.util.Scanner;

public class LoginMenu {

	public static Employee showLoginMenu() throws ClassNotFoundException, IOException {
		Scanner keyboard = new Scanner(System.in);
		String inpUser = "", inpPass = "";
		
		do {
			System.out.println("Username: ");
			inpUser = keyboard.nextLine();
			System.out.println("Passwort: ");
			inpPass = keyboard.nextLine();
		} while (SystemManager.loginIsValid(inpUser, inpPass) == null);

		return SystemManager.getEmployeeByFileName(SystemManager.loginIsValid(inpUser, inpPass));
	}
}
