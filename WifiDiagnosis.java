/*
 * Class: CMSC203 CRN 36406 
 * Instructor: Farnaz Eivazi
 * Description: goes through a checklist to fix wifi not working
 * Due: 2/9/2022
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Kian Charkhabi
*/
import java.util.Scanner;

public class WiFiDiagnosis {
	public static void main(String[] args) {
		String input;
		Scanner in=new Scanner(System.in);
		//variables take in user input
		
		//reboot computer
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis"
				+ " might work.\n\nFirst step: reboot your computer\nAre you able to connect with"
				+ " the internet? (yes or no)");
		input=in.nextLine();
		if(input.toUpperCase().equals("YES")) {
			System.out.println("Rebooting your computer seemed to work");
			
		}else{
			//reboot router
			System.out.println("Second step: reboot your router\nNow are you able to connect with"
					+ " the internet? (yes or no)");
			input=in.nextLine();
			if(input.toUpperCase().equals("YES")) {
				System.out.print("Rebooting your router seemed to work");
				
			}else {
				//checks router cables
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your "
						+ "router is getting power\nNow are you able to connect with the internet? (yes or no)");
				input=in.nextLine();
				if(input.toUpperCase().equals("YES")) {
					System.out.println("Checking the router's cables seemed to work");
					
				}else {
					//checks distance from router
					System.out.println("Fourth step: move your computer closer to your router\n"
							+ "Now are you able to connect with the internet? (yes or no)");
					input=in.nextLine();
					if(input.toUpperCase().equals("YES")) {
						System.out.println("Moving your computer closer to the router seemed to work");
						
					}else {
						//final step contatcing ISP
						System.out.println("Fifth step: contact your ISP\n"
								+ "Make sure your ISP is hooked up to your router.");
					}
				}
			}
		}
		System.out.println("\nKian Charkhabi");
	}
}
