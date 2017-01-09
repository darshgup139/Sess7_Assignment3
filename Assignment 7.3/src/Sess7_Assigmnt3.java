import java.util.Scanner;

public class Sess7_Assigmnt3 {
	public static void main(String[] args) {
		boolean found = false;
		int i, j, len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main string:");
		String mainStr = sc.nextLine();
		System.out.println("Enter the sub-string to be searched:");
		String subStr = sc.nextLine();
		len = mainStr.length() - subStr.length();

		for (i = 0; i < len + 1; i++) {
			found = true;
			for (j = 0; j < subStr.length(); j++) {
				if (mainStr.charAt(i + j) != subStr.charAt(j)) {
					found = false;
					break;
				}
			}
			if (found) {
				System.out.println("Substring is found");
				break;
			}
		}
		if (found != true)
			System.out.println("Substring is not found");
	}
}
/*
******************************************************************************
Output:
Enter the main string:
Acadgild
Enter the sub-string to be searched:
cad
Substring is found
******************************************************************************
*/