import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean longCheck = false;
		boolean numCheck = false;
		boolean upperCheck = false;
		boolean lowerCheck = false;
		do {
			System.out.println("Please enter your password: ");
			String word = in.nextLine();
			if (isCorrectLength(word) == true) {
				System.out.println("The password is at least 8 characters long - Pass!");
				longCheck = true;
			}
			else {
				System.out.print("Error! Your password is less than 8 characters long!");
			}
			if (containsDigit(word) == true) {
					System.out.println("The password has at least one digit - Pass!");
					numCheck = true;
			}
			else {
				System.out.println("Error! Your password should have at least one digit!");
			}
			if (containsUpper(word) == true) {
				System.out.println("The password has at least one uppercase letter - Pass!");
				upperCheck = true;
			}
			else {
				System.out.println("Error! Your password should have at least one uppercase letter!");
			}
			if (containsLower(word) == true) {
				System.out.println("The password has at least one lowercase letter - Pass!");
				lowerCheck = true;
			}
			else {
				System.out.println("Error! Your password should have at least one lowercase letter!");
			}
		} while (longCheck == false || numCheck == false || upperCheck == false || lowerCheck == false);
		System.out.println("Your password is valid!");
	}
	public static boolean isCorrectLength(String word) {
		if (word.length() >= 8) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean containsDigit(String word) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
		int charCode = Character.codePointAt(word,i);
                	if (charCode >= 48 && charCode <= 57) {
                        	count++;
                        }
            }
            if (count > 0) {
                return true;
            }
            else {
                return false;
            }
    }
	public static boolean containsUpper(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			int charCode = Character.codePointAt(word,i);
			if (charCode >= 65 && charCode <= 90) {
				count++;
			}
		}
		if (count > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean containsLower(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			int charCode = Character.codePointAt(word,i);
			if ( charCode >= 97 && charCode <= 122 ) {
				count++;
			}
		}
		if (count > 0) {
			return true;
		}
		else {
			return false;
		}
        }
}